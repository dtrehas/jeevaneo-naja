package com.jeevaneo.naja.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

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

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Schedule;

public class ExportOccupationAsHtmlAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public ExportOccupationAsHtmlAction() {
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
		List<Person> people = new ArrayList<Person>();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Person) {
				people.add((Person) o);
			} else if (o instanceof Project) {
				people.addAll(((Project) o).getResources());
			}
		}
		export(people);

	}

	private void export(final List<Person> people) {

		FileDialog fd = new FileDialog(shell);
		fd.setFilterExtensions(new String[] { "*.html", "*.htm" });
		fd.setFileName("exportOccupation" + System.currentTimeMillis()
				+ ".html");
		final String filename = fd.open();

		Job job = new Job("Export Occupations as HTML") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Export occupations to HTML file", (people
						.size() + 1) * 1000);
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
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					Date start = null;
					Date end = null;
					try {
						start = sdf.parse("20090101");
						end = sdf.parse("20091231");
					} catch (ParseException e) {
						e.printStackTrace();
					}

					// clean imputations doublons
					for (Person person : people) {
						Set<Imputation> imputs = new HashSet<Imputation>();
						imputs.addAll(person.getImputations());
						person.getImputations().clear();
						person.getImputations().addAll(imputs);
					}

					SortedSet<Date> dates = com.jeevaneo.naja.impl.Utils
							.findOpenedDates(start, end);

					Map<Person, Map<Date, Integer>> loads = new HashMap<Person, Map<Date, Integer>>();

					for (Person person : people) {
						Map<Date, Integer> loadsPerDay = new HashMap<Date, Integer>();
						loads.put(person, loadsPerDay);

						for (Date day : dates) {
							loadsPerDay.put(day, 0);
						}

						int monitorIncrement = 0;
						if (!person.getImputations().isEmpty()
								&& !person.getPlanifications().isEmpty()) {
							monitorIncrement = 900 / (person.getImputations()
									.size() + person.getPlanifications().size());
						}

						int monitorLeft = 900;

						for (Imputation imputation : person.getImputations()) {
							monitor.worked(monitorIncrement);
							monitorLeft -= monitorIncrement;
							if (null != imputation.getPlanification()) {
								continue;
							}
							int load = imputation.getLoad();
							Date date = imputation.getDate();
							if (null == date) {
								System.err
										.println("IGNORED imputation with null date!!! "
												+ imputation);
							}
							if (null != date && date.after(start)
									&& date.before(end)) {
								loadsPerDay.put(date, load
										+ loadsPerDay.get(date));
							}

							if (!imputation.getResource().equals(person)) {
								System.err
										.println("WARNING choucroute - imputation is in wrong resource :"
												+ imputation
												+ " : "
												+ imputation.getResource());
							}
						}

						for (Planification planification : person
								.getPlanifications()) {
							if (null == planification.getVirtualImputation()) {
								System.err
										.println("IGNORED: planification with null VirtualImputation "
												+ planification);
								continue;
							}
							for (Schedule schedule : planification
									.getVirtualImputation().getSchedules()) {

								int load = schedule.getLoad();
								Date date = schedule.getDate();
								if (null == date) {
									System.err
											.println("IGNORED schedule with null date!!! "
													+ schedule);
								}
								if (date.after(start) && date.before(end)) {
									loadsPerDay.put(date, load
											+ loadsPerDay.get(date));
								}
								monitor.worked(monitorIncrement);
								monitorLeft -= monitorIncrement;
							}
						}
						monitor.worked(monitorLeft);

					}

					out.println("<html><head><style type=\"text/css\">");
					out.println(".ok {color:green;}");
					out.println(".under {color:navy;}");
					out.println(".over {color:red;}");
					out.println("</style></head><body>");

					out.println("<table border=\"1\"><tr><td>&nbsp;</td>");
					for (Date day : dates) {
						out.printf("<td>%1$tY-%1$tm-%1$td</td>", day);
					}
					out.println("</tr>");

					for (Person person : people) {
						int maxLoad = person.getMaxLoadPerDay();
						Map<Date, Integer> loadsPerDay = loads.get(person);

						out.printf("<tr><th>%s (%dh/day)</th>\n", person
								.getName(), maxLoad);
						for (Date day : dates) {
							int load = loadsPerDay.get(day);
							out.printf("<td class=\"%s\">%d</td>", htmlClass(
									load, maxLoad), load);
						}
						out.println("</tr>");
						monitor.worked(100);
					}
					out.println("</table></body></html>");

					/*********************
					 * DEBUG
					 */

					for (Person person : people) {
						System.out.println(person.getName());
						for (Date day : dates) {
							System.out.println("\t" + day);
							for (Imputation imputation : person
									.getImputations()) {
								Date date = imputation.getDate();
								if (null == date) {
									System.err
											.println("IGNORED imputation with null date!!! "
													+ imputation);
									continue;
								}
								if (null!=date && imputation.getDate().equals(day)) {
									System.out.println("\t\t" + imputation);
								}
							}
						}
					}
					/*********************
					 * FIN DEBUG
					 */

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

			private String htmlClass(int load, int maxLoad) {
				if (load == maxLoad) {
					return "ok";
				} else if (load < maxLoad) {
					return "under";
				} else if (load > maxLoad) {
					return "over";
				}
				return null;
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
