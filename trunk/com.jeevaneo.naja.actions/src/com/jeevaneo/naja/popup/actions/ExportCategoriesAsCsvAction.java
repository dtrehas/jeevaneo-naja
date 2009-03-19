package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Task;

public class ExportCategoriesAsCsvAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportCategoriesAsCsvAction() {
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
			}
			else if (o instanceof Project) {
				cats.addAll(((Project) o).getCategories());
				cats.addAll(((Project) o).getTasks());
			}
		}
		exportCategories(cats);

	}

	private void exportCategories(final List<EObject> cats) {
		
		
				FileDialog fd = new FileDialog(shell);
				final String filename =  fd.open();
		
		
		Job job = new Job("Export Categories as CSV"){
		
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Export categories to CSV file", (cats.size()+1)*1000);
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
					int totalLoad = 0;
					int totalUnimputedLoad = 0;
					int totalUnaffectedLoad = 0;
					Date veryFirstDate = null;
					Date veryLastDate = null;
					
					out
							.println("Name;Resources;Total Load in days;Total Load in hours;Unimputed Planification in days;Unimputed Planification in hours; Unaffected Load in days; Unaffected Load in hours;First date;Last date;");
					for (EObject o : cats) {
						
						int load = 0;
						int unimputedLoad = 0;
						int unaffectedLoad = 0;
						Date firstDate = null;
						Date lastDate = null;

						// List<Task> tsks = cat.getTasks();
						// Set<String> nameListe = new HashSet<String>();
						// for (Task tsk : tsks) {
						// List<Planification> plns = tsk.getPlanifications();
						// for (Planification pln : plns) {
						// nameListe.add(pln.getResource().getName());
						// }
						// }
						if (o instanceof Category) {
							Category cat = (Category) o;
							load = cat.getTotalLoad();
							unimputedLoad = cat.getUnimputedPlanifiedLoad();
							unaffectedLoad = cat.getUnaffectedLoad();
							firstDate = cat.getFirstDate();
							lastDate = cat.getLastDate();

							monitor.subTask("Category " + cat.getName());
							
							String stringNameList = Utils.csl(resourceList(cat));

							print(out,
									Utils.fullname(cat), stringNameList, cat.getTotalLoad(), cat.getUnimputedPlanifiedLoad(), cat.getUnaffectedLoad(),
									cat.getFirstDate(), cat.getLastDate());						

							monitor.worked(900);
						} else if (o instanceof Task) {
							Task task = (Task) o;
							monitor.subTask("Task " + task.getName());
							String stringNameList = Utils.csl(resourceList(task));
							String name = Utils.fullname(task);
							load = task.getTotalLoad();
							unimputedLoad = task.getUnimputedPlanifiedLoad();
							unaffectedLoad = task.getUnaffectedLoad();
							firstDate = task.getFirstDate();
							lastDate = task.getLastDate();
							print(out, name, stringNameList, load,
									unimputedLoad, unaffectedLoad,
									firstDate, lastDate);

							monitor.worked(900);
						}
						totalLoad += load;
						totalUnaffectedLoad += unaffectedLoad;
						totalUnimputedLoad += unimputedLoad;
						if(null!=firstDate)
						{
							if(null==veryFirstDate || veryFirstDate.after(firstDate))
							{
								veryFirstDate = firstDate;
							}
						}
						if(null!=lastDate)
						{
							if(null==veryLastDate || veryLastDate.after(lastDate))
							{
								veryLastDate = lastDate;
							}
						}
						monitor.worked(100);
						
					}
					
					print(out, "", "TOTAL", totalLoad, totalUnimputedLoad, totalUnaffectedLoad, veryFirstDate, veryLastDate);
					
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
					return new Status(IStatus.ERROR, "naja", "Error during export", e);
				}
				return Status.OK_STATUS;
			}

			private void print(PrintStream out, String stringNameList,
					String name, int totalLoad, int unimputedPlanifiedLoad,
					int unaffectedLoad, Date firstDate, Date lastDate) {
				out.printf(
						"%s;%s;%s;%s;%s;%s;%s;%s;%9$tY-%9$tm-%9$td;%10$tY-%10$tm-%10$td;\n",
						name, stringNameList, Utils.daysAndHours(totalLoad), totalLoad, Utils.daysAndHours(unimputedPlanifiedLoad),unimputedPlanifiedLoad,Utils.daysAndHours(unaffectedLoad),unaffectedLoad,
						firstDate, lastDate);
			}
		};
		
		job.schedule();
		
	}

	private Set<String> resourceList(Category cat) {
		List<Task> tsks = cat.getTasks();
		Set<String> nameListe = new HashSet<String>();
		for (Task tsk : tsks) {
			List<Planification> plns = tsk.getPlanifications();
			for (Planification pln : plns) {
				nameListe.add(pln.getResource().getName());
			}
		}
		for (Category ctg : cat.getSubcategories()) {
			nameListe.addAll(resourceList(ctg));
		}
		return nameListe;
	}

	private Set<String> resourceList(Task tsk) {
		Set<String> nameListe = new HashSet<String>();
		List<Planification> plns = tsk.getPlanifications();
		for (Planification pln : plns) {
			nameListe.add(pln.getResource().getName());
		}
		return nameListe;
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
