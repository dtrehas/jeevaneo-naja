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
import com.jeevaneo.naja.Task;

public class CsvExportAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public CsvExportAction() {
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
		List<Category> cats = new ArrayList<Category>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Category) {
				cats.add((Category) o);
			}
		}
		exportCategories(cats);

	}

	private void exportCategories(List<Category> cats) {

		FileDialog fd = new FileDialog(new Shell());
		String filename = fd.open();
		if (null == filename)
			return;

		PrintStream out;
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			out = new PrintStream(fos);
			out
					.println("Name;Total Load in hours;Resources;First date;Last date;");
			for (Category cat : cats) {

				// List<Task> tsks = cat.getTasks();
				// Set<String> nameListe = new HashSet<String>();
				// for (Task tsk : tsks) {
				// List<Planification> plns = tsk.getPlanifications();
				// for (Planification pln : plns) {
				// nameListe.add(pln.getResource().getName());
				// }
				// }

				Set<String> nameListe = resourceList(cat);
				String stringNameList = "";
				for (String name : nameListe) {
					stringNameList = stringNameList + name + " - ";
				}

				out.printf("%s;%s;%s;%4$tY-%4$tm-%4$td;%5$tY-%5$tm-%5$td;\n",
						cat.getName(), cat.getTotalLoad(), stringNameList, cat
								.getFirstDate(), cat.getLastDate());
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

	private Set<String> resourceList(Category cat) {
		List<Task> tsks = cat.getTasks();
		Set<String> nameListe = new HashSet<String>();
		for (Task tsk : tsks) {
			List<Planification> plns = tsk.getPlanifications();
			for (Planification pln : plns) {
				nameListe.add(pln.getResource().getName());
			}
		}
		for (Category ctg : cat.getSubcategories()){
			nameListe.addAll(resourceList(ctg));
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

	public static void main(String[] args) {
		System.out.printf("%2$tY-%2$tm-%2$td\n", "john", new Date());
	}

}