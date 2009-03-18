package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeEntry;

public class ExportImputationsAsCsvAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportImputationsAsCsvAction() {
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

		Iterator<?> i = selection.iterator();
		Set<Imputation> imputations = new HashSet<Imputation>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Imputation) {
				imputations.add((Imputation) o);
			} else if (o instanceof Project) {
				imputations.addAll(((Project) o).getImputations());
			} else if (o instanceof TimeEntry) {
				TimeEntry ty = (TimeEntry) o;
				imputations.add(ty.getImputation());
			} else if (o instanceof TimeEntries) {
				TimeEntries ties = (TimeEntries) o;
				for (TimeEntry ty : ties.getEntries()) {
					imputations.add(ty.getImputation());
				}
			}
		}
		export(imputations);
	}

	private void export(final Set<Imputation> imputations) {

		FileDialog fd = new FileDialog(new Shell());
		String filename = fd.open();
		if (null == filename)
			return;

		try {

			FileOutputStream fos = new FileOutputStream(filename);
			final PrintStream out = new PrintStream(fos);
			out
					.println("Task;Resource;Load in days; Load in hours; Max load per day;First date;Last date;");

			Job exportJob = new Job("Export imputations") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Export imputations",
							imputations.size() * 1000);
					int totalLoad = 0;
					Date firstDate = null;
					Date lastDate = null;
					for (Imputation imputation : imputations) {
						if (monitor.isCanceled()) {
							break;
						}
						if(null==imputation.getResource())
						{
							System.err.println("ERROR: Imputation with no resource! " + imputation);
							continue;
						}
						if(null==imputation.getTask())
						{
							System.err.println("ERROR: Imputation with no task! " + imputation);
							continue;
						}
						print(imputation.getTask().getName(), imputation
								.getResource().getName(), imputation.getLoad(),
								imputation.getDate(), out);
						totalLoad += imputation.getLoad();
						if (null != imputation.getDate()) {
							if (null == firstDate
									|| firstDate.after(imputation.getDate())) {
								firstDate = imputation.getDate();
							}
							if (null == lastDate
									|| lastDate.before(imputation.getDate())) {
								lastDate = imputation.getDate();
							}
						}
						monitor.worked(1000);
					}
					DateFormat df = DateFormat.getDateInstance();
					print("TOTAL", firstDate == null ? ""
							: "from " + firstDate == null ? "never(!)" : df
									.format(firstDate)
									+ " to " + lastDate == null ? "never(!)"
									: df.format(lastDate), totalLoad, null, out);

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

	private String print(String task, String res, int load, Date date,
			PrintStream out) {
		String format = "%s;%s;%s;";
		format += null == date ? "N/A;" : "%5$tY-%5$tm-%5$td;";
		format += "\n";
		out.printf(format, task, res, daysAndHours(load), load, date);
		return format;
	}

	private String fullname(Task task) {
		String ret = task.getName();
		if (null != task.getCategory()) {
			ret = fullname(task.getCategory()) + "/" + ret;
		}
		return ret;
	}

	private String fullname(Category cat) {
		String ret = cat.getName();
		if (null != cat.getParentCategory()) {
			ret = fullname(cat.getParentCategory()) + "/" + ret;
		}
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

	private static String daysAndHours(int hours) {
		int days = hours / 8;
		int hrs = hours % 8;
		String day = "";
		if (days > 0) {
			day = String.format("%dj", days);
			if (hrs > 0) {
				day += " ";
			}
		}
		String hour = "";
		if (hrs > 0) {
			hour = String.format("%dh", hrs);
		}
		return day + hour;
	}

	public static void main(String[] args) {
		System.out.printf("%2$tY-%2$tm-%2$td\n", "john", new Date());
	}

}
