package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Schedule;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.impl.Utils;

public class ExportActivityTableAsCsvAction implements IObjectActionDelegate {

	class TaskOrCategory {
		private boolean isCategory = false;
		private Category category = null;
		private Task task = null;

		public TaskOrCategory(Task task) {
			super();
			if (null == task) {
				throw new IllegalArgumentException("Null category");
			}
			this.task = task;
			isCategory = false;
		}

		public TaskOrCategory(Category category) {
			super();
			if (null == category) {
				throw new IllegalArgumentException("Null category");
			}
			this.category = category;
			isCategory = true;
		}

		public String getLabel() {
			if (isCategory) {
				return category.getName();
			} else {
				return task.getLabel();
			}
		}

		public Map<Date /* day */, Integer /* load */> getLoads() {
			Set<Task> tasks = new HashSet<Task>();

			Map<Date, Integer> ret = new HashMap<Date, Integer>();
			if (isCategory) {
				tasks.addAll(Utils.recursiveFindTasks(category));
			} else {
				tasks.add(task);
			}

			for (Task vTask : tasks) {
				for (Imputation imputation : vTask.getImputations()) {
					Date day = imputation.getDate();
					int load = imputation.getLoad();
					if (!ret.containsKey(day)) {
						ret.put(day, 0);
					}
					ret.put(day, ret.get(day) + load);
				}
				for (Planification planification : vTask.getPlanifications()) {
					if (null == planification.getVirtualImputation()) {
						System.err
								.println("IGNORED Planif with null VirtualImputation : "
										+ planification);
						continue;
					}
					for (Schedule schedule : planification
							.getVirtualImputation().getSchedules()) {
						Date day = schedule.getDate();
						int load = schedule.getLoad();
						if (!ret.containsKey(day)) {
							ret.put(day, 0);
						}
						ret.put(day, ret.get(day) + load);
					}
				}
			}
			return ret;
		}

	}

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportActivityTableAsCsvAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (null == selection)
			return;

		;

		Map<TaskOrCategory, Map<String /* month in yyyy-mm */, Integer /*
																		 * load
																		 * in
																		 * hours
																		 */>> matrix = new HashMap<TaskOrCategory, Map<String, Integer>>();

		Iterator<?> i = selection.iterator();
		Set<TaskOrCategory> taskOrCategories = new HashSet<TaskOrCategory>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Task) {
				taskOrCategories.add(new TaskOrCategory((Task) o));
			} else if (o instanceof Category) {
				taskOrCategories.add(new TaskOrCategory((Category) o));
			} else if (o instanceof Project) {
				Project project = (Project) o;
				for (Category category : project.getCategories()) {
					taskOrCategories.add(new TaskOrCategory(category));
				}
				for (Task task : project.getTasks()) {
					taskOrCategories.add(new TaskOrCategory(task));
				}
			}
		}

		for (TaskOrCategory taskOrCategory : taskOrCategories) {
			Map<Date, Integer> loads = taskOrCategory.getLoads();

			// dispatch by month
			Map<String /* month */, Integer /* load */> loadPerMonth = new HashMap<String, Integer>();
			for (Date day : loads.keySet()) {
				int load = loads.get(day);
				String month = month(day);
				if (!loadPerMonth.containsKey(month)) {
					loadPerMonth.put(month, 0);
				}
				loadPerMonth.put(month, loadPerMonth.get(month) + load);
			}
			matrix.put(taskOrCategory, loadPerMonth);
		}

		export(matrix);
	}

	private static final DateFormat df = new SimpleDateFormat("yyyy-MM");

	private String month(Date day) {
		return df.format(day);
	}

	private void export(
			final Map<TaskOrCategory, Map<String /* month in yyyy-mm */, Integer /*
																				 * load
																				 * in
																				 * hours
																				 */>> matrix) {

		FileDialog fd = new FileDialog(new Shell());
		String filename = fd.open();
		if (null == filename)
			return;

		final SortedSet<String> monthes = new TreeSet<String>();
		for (Map<String, ?> loadPerMonth : matrix.values()) {
			monthes.addAll(loadPerMonth.keySet());
		}

		try {

			FileOutputStream fos = new FileOutputStream(filename);
			final PrintStream out = new PrintStream(fos);
			out.print(";");
			for (String month : monthes) {
				out.print(month + ";");
			}
			out.println("Total;");

			Job exportJob = new Job("Export Activity table") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Export Activity table", matrix.size()
							* monthes.size() * 1000 + 1000);

					Map<String /* month */, Integer /* totalLoad */> totalLoadPerMonth = new HashMap<String, Integer>();

					for (TaskOrCategory taskOrCategory : matrix.keySet()) {
						if (monitor.isCanceled()) {
							break;
						}
						Map<String, Integer> loadPerMonth = matrix
								.get(taskOrCategory);
						int totalLoad = 0;
						out.print(taskOrCategory.getLabel() + ";");
						for (String month : monthes) {
							Integer load = loadPerMonth.get(month);
							if (null != load) {
								totalLoad += load;
								if (!totalLoadPerMonth.containsKey(month)) {
									totalLoadPerMonth.put(month, 0);
								}
								totalLoadPerMonth.put(month, totalLoadPerMonth
										.get(month)
										+ load);
								out.printf("%s;", formatToDays(load));
							} else {
								out.print(";");
							}
							monitor.worked(1000);
						}
						out.printf("%s;", formatToDays(totalLoad));
						out.println();

					}

					// add a last line for column sums
					out.print("TOTAL;");
					int totalTotalLoad = 0;
					for (String month : monthes) {
						int totalLoad = totalLoadPerMonth.get(month);
						totalTotalLoad += totalLoad;
						out.printf("%s;", formatToDays(totalLoad));
					}
					out.printf("%s;", formatToDays(totalTotalLoad));
					out.println();
					monitor.worked(1000);
					monitor.done();

					return Status.OK_STATUS;
				}
			};
			exportJob.schedule();
			String message = "Export successfull to " + filename + ".";
			try {
				exportJob.join();
			} catch (InterruptedException e) {
				message = "Export has been cancelled.";
			}

			fos.flush();
			fos.close();
			fos = null;
			System.gc();
			out.flush();
			out.close();

			MessageDialog.openInformation(shell, "Naja Export", message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static String formatToDays(int hours)
	{
		String ret = String.format("%.2f\n", (float) hours/8).replaceAll("\\,0?+$", "");
		return ret;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			this.selection = (StructuredSelection) selection;
		}
	}

	public static void main(String[] args) {
		for(int i=80;i<90;i++)
		{
			System.out.println(formatToDays(i));
		}
	}

}
