package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
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
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Task;

public class ExportRAFsAsCsvAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportRAFsAsCsvAction() {
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
		List<EObject> cats = new ArrayList<EObject>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Category || o instanceof Task) {
				cats.add((EObject) o);
			} else if (o instanceof Project) {
				cats.addAll(((Project) o).getCategories());
				cats.addAll(((Project) o).getTasks());
			}
		}
		exportCategories(cats);

	}

	private void exportCategories(final List<EObject> cats) {

		FileDialog fd = new FileDialog(shell);
		final String filename = fd.open();

		Job job = new Job("Export Categories as CSV") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Export RAFs to CSV file",
						(cats.size() + 1) * 1000);
				monitor.subTask("Ask for file");

				if (null == filename)
					return Status.CANCEL_STATUS;

				monitor.worked(500);

				PrintStream out;
				try {
					monitor.subTask("Open file");
					FileOutputStream fos = new FileOutputStream(filename);
					out = new PrintStream(fos);

					monitor.worked(500);
					int totalTotalLoad = 0;

					out
							.println("Name;Total;Resource;Unimputed Planification in hourss;Unimputed Planification in days;");
					for (EObject o : cats) {

						Set<Planification> planifications = new HashSet<Planification>();

						int totalLoad = 0;
						Map<Person, Integer/* unimputedplanified */> loadPerResource = new TreeMap<Person, Integer>(
								new Comparator<Person>() {

									@Override
									public int compare(Person o1, Person o2) {
										if (null == o1)
											return -1;
										if (null == o2)
											return 1;
										if (null == o1.getName()) {
											return -1;
											// throw new
											// IllegalStateException("null name in resource "
											// + o1);
										}
										if (null == o2.getName()) {
											return 1;
											// throw new
											// IllegalStateException("null name in resource "
											// + o2);
										}
										return o1.getName().compareTo(
												o2.getName());
									}
								});

						String name = null;
						if (o instanceof Task) {
							Task task = (Task) o;
							name = task.getName();
							monitor.subTask("Task " + name);
							planifications.addAll(task.getPlanifications());
						} else {
							Category category = (Category) o;
							name = category.getName();
							monitor.subTask("Category " + name);
							for (Task task : com.jeevaneo.naja.impl.Utils
									.recursiveFindTasks(category)) {
								planifications.addAll(task.getPlanifications());
							}
						}

						for (Planification planification : planifications) {
							Person p = planification.getResource();
							int load = planification.getUnimputedLoad();
							totalLoad += load;
							totalTotalLoad += load;
							if (!loadPerResource.containsKey(p)) {
								loadPerResource.put(p, 0);
							}
							loadPerResource.put(p, loadPerResource.get(p)
									+ load);
						}
						monitor.worked(900);
						for (Person p : loadPerResource.keySet()) {
							print(out, name, totalLoad, p.getName(), loadPerResource
									.get(p));
						}
						monitor.worked(100);

					}

					out.printf(";TOTAL;%s;;\n", totalTotalLoad);

					fos.flush();
					fos.close();
					fos = null;
					System.gc();
					out.flush();
					out.close();

					shell.getDisplay().syncExec(new Runnable() {
						public void run() {
							String message = "Export successfull to "
									+ filename + ".";
							if (monitor.isCanceled()) {
								message = "Export was cancelled!";
							}
							MessageDialog.openInformation(shell, "Naja Export",
									message);
						}
					});
					monitor.done();

				} catch (IOException e) {
					return new Status(IStatus.ERROR, "naja",
							"Error during export", e);
				}
				return Status.OK_STATUS;
			}

			private void print(PrintStream out, String what, int total, String who,
					int loadInHours) {
				if(loadInHours>0) out.printf("%s;%d;%s;%d;%s;\n", what, Utils
						.daysAndHours(total), who, loadInHours, Utils
						.daysAndHours(loadInHours));
			}
		};

		job.schedule();

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			this.selection = (StructuredSelection) selection;
		}
	}
}
