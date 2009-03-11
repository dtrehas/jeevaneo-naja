package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

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
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.TaskMapping;
import com.jeevaneo.naja.TaskMappings;

public class ExportTasksWithoutMappingAsCsvAction implements
		IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportTasksWithoutMappingAsCsvAction() {
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
		List<Project> projs = new ArrayList<Project>();
		List<TaskMappings> mappingss = new ArrayList<TaskMappings>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Project) {
				projs.add((Project) o);
			} else if (o instanceof TaskMappings) {
				mappingss.add((TaskMappings) o);
			}
		}
		exportTasksWithoutMapping(projs, mappingss);

	}

	private void exportTasksWithoutMapping(List<Project> projs,
			List<TaskMappings> mappingss) {

		FileDialog fd = new FileDialog(new Shell());
		String filename = fd.open();
		if (null == filename)
			return;

		PrintStream out;
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			out = new PrintStream(fos);
			out.println("Task;Comment;");

			Set<Task> tasks = new HashSet<Task>();

			for (Project proj : projs) {

				// List<Task> tsks = cat.getTasks();
				// Set<String> nameListe = new HashSet<String>();
				// for (Task tsk : tsks) {
				// List<Planification> plns = tsk.getPlanifications();
				// for (Planification pln : plns) {
				// nameListe.add(pln.getResource().getName());
				// }
				// }

				tasks.addAll(proj.getTasks());
				for (Category cat : proj.getCategories()) {
					tasks.addAll(listTasks(cat));
				}
			}

			Map<Task, String /* comment */> commentByTask = new HashMap<Task, String>();
			for (Task task : tasks) {
				boolean found = false;
				for (TaskMappings mappings : mappingss) {
					for (TaskMapping mapping : mappings.getMappings()) {
						Task tmpTask = mapping.getTask();
						if (null != tmpTask && tmpTask.equals(task)) {
							found = true;
							if (null == mapping.getExternalId()
									|| mapping.getExternalId().trim()
											.equals("")) {
								commentByTask.put(task, "empty external id");
							}
							break;
						}
						if (found) {
							break;
						}
					}

					if (found) {
						break;
					}
				}
				// out.printf("%s;%s;%s;%4$tY-%4$tm-%4$td;%5$tY-%5$tm-%5$td;\n",
				// cat.getName(), cat.getTotalLoad(), stringNameList, cat
				// .getFirstDate(), cat.getLastDate());
				if(!found)
				{
					commentByTask.put(task, "no external id");
				}
			}

			 for(Entry<Task, String> entry : commentByTask.entrySet())
			 {
				 out.printf("%s;%s;\n", entry.getKey().getLabel(), entry.getValue());
			 }
			fos.flush();
			fos.close();
			fos = null;
			System.gc();
			out.flush();
			out.close();

			MessageDialog.openInformation(shell, "Naja Export",
					"Export successfull to " + filename + ".");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private Set<Task> listTasks(Category cat) {
		Set<Task> ret = new HashSet<Task>();
		ret.addAll(cat.getTasks());
		for (Category ctg : cat.getSubcategories()) {
			ret.addAll(listTasks(ctg));
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
}
