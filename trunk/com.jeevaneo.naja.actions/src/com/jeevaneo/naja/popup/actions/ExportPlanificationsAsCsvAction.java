package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;

public class ExportPlanificationsAsCsvAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportPlanificationsAsCsvAction() {
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
		List<Planification> planifs = new ArrayList<Planification>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Planification) {
				planifs.add((Planification) o);
			} else if (o instanceof Project) {
				planifs.addAll(((Project) o).getPlanifications());
				check((Project) o);
			}
		}
		export(planifs);
	}

	private void check(Project p) {
		for (Imputation imputation : p.getImputations()) {
			if (imputation.getDate() == null) {
				System.err.println("ERROR: imputation with null date : "
						+ imputation);
			} else {
				Date impDate = imputation.getDate();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date start;
				try {
					start = sdf.parse("20090215");
					if (start.after(impDate)
							&& imputation.getPlanification() != null) {
						System.err
								.println("ERROR: imputation before 20090215 with planification : "
										+ imputation);
					}
				} catch (ParseException e) {
					// will not happen
					e.printStackTrace(System.err);
				}
			}
		}
	}

	private void export(List<Planification> planifs) {

		FileDialog fd = new FileDialog(new Shell());
		String filename = fd.open();
		if (null == filename)
			return;

		PrintStream out;
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			out = new PrintStream(fos);
			out
					.println("Task;Resource;Load in days; Load in hours; Unimputed load in days; Unimputed load in hours; Max load per day;First date;Last date;");
			int totalLoad = 0;
			int totalUnimputedLoad = 0;
			Date firstDate = null;
			Date lastDate = null;
			for (Planification o : planifs) {

				if (o.getFirstDate() == null) {
					if (o.getUnimputedLoad() <= 0) {
						// there are already more (or as much) imputations than
						// planned - ignore
						continue;
					}
				} else {
					if (null == firstDate || firstDate.after(o.getFirstDate())) {
						firstDate = o.getFirstDate();
					}
				}

				if (null != o.getLastDate()) {
					if (null == lastDate || lastDate.before(o.getLastDate())) {
						lastDate = o.getLastDate();
					}
				}
				totalLoad += o.getLoad();
				totalUnimputedLoad += o.getUnimputedLoad();

				print(Utils.fullname(o.getTask()), o.getResource().getName(), o
						.getLoad(), o.getUnimputedLoad(), ""
						+ Math.min(o.getMaxLoadPerDay(), o.getResource()
								.getMaxLoadPerDay()), out, o.getFirstDate(), o.getLastDate(),
						"" + o.getUnimputedLoad());
			}

			print("TOTAL", "", totalLoad, totalUnimputedLoad, "", out,
					firstDate, lastDate, "");
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

	private String print(String task, String res, int load, int unimputedLoad,
			String perDay, PrintStream out, Date firstDate, Date lastDate,
			String unimputed) {
		String format = "%s;%s;%s;%s;%s;%s;%s;";
		format += null == firstDate ? "N/A;" : "%8$tY-%8$tm-%8$td;";
		format += null == lastDate ? "N/A;" : "%9$tY-%9$tm-%9$td;";
		format += null == firstDate ? "WARNING: %10$d hours could not be assigned to %2$s who is overwhelmed..."
				: "";
		format += "\n";
		out.printf(format, task, res, Utils.daysAndHours(load), load, Utils
				.daysAndHours(unimputedLoad), unimputedLoad, perDay, firstDate,
				lastDate, unimputed);
		return format;
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
