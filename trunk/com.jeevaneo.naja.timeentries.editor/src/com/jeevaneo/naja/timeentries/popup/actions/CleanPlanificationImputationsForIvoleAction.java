package com.jeevaneo.naja.timeentries.popup.actions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.progress.UIJob;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;

public class CleanPlanificationImputationsForIvoleAction implements
		IObjectActionDelegate {

	private StructuredSelection selection = null;
	private EditingDomain editingDomain;
	private IWorkbenchPart part;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetEditor) {
		if (!(targetEditor instanceof IEditingDomainProvider)) {
			this.editingDomain = null;
			return;
		}
		this.editingDomain = ((IEditingDomainProvider) targetEditor)
				.getEditingDomain();
		this.part = targetEditor;
	}

	@Override
	public void run(IAction action) {

		final Shell shell = part.getSite()
		.getShell();
		final boolean performClean = MessageDialog.openQuestion(shell, "Naja for Ïvô|€",
				"Perform the cleaning or report only? Yes to clean.");

		FileDialog fd = new FileDialog(shell);
		final String filename = fd.open();
		if (null == filename)
			return;

		final Set<Planification> planifications = new HashSet<Planification>();
		for (Object o : selection.toList()) {
			if (o instanceof Project) {
				Project ties = (Project) o;
				for (Planification ty : ties.getPlanifications()) {
					planifications.add(ty);
				}
			} else if (o instanceof Planification) {
				planifications.add((Planification) o);
			}
		}

		Job job = new Job("Clean planifications") {

			@Override
			public IStatus run(IProgressMonitor monitor) {
				long start = System.currentTimeMillis();
				monitor.beginTask("Clean planifications",
						planifications.size() * 1000);

				Set<String> cleaned = new HashSet<String>();
				for (Planification planification : planifications) {
					if (monitor.isCanceled()) {
						break;
					}

					clean(planification, cleaned, performClean,
							new SubProgressMonitor(monitor, 1000));
					monitor.worked(1000);
				}
				monitor.done();

				PrintStream out;
				FileOutputStream fos;
				try {
					fos = new FileOutputStream(filename);
					out = new PrintStream(fos);

					try {
						out.println("#Log " + new Date());
						out.println("#Report only: " + !performClean);
						for (String log : cleaned) {
							out.println(log);
						}
						
						shell.getDisplay().asyncExec(new Runnable() {
							public void run() {
								MessageDialog.openInformation(shell,
										"Naja for Ïvô|€",
										"Log exported successfull to "
												+ filename + ".");
							}
						});
					} finally {
						fos.flush();
						fos.close();
						out.close();
					}
				} catch (IOException e) {
					e.printStackTrace(System.err);
				}

				long end = System.currentTimeMillis();
				String message = "Done in " + (end - start) + "ms.";
				System.out.println(message);
				monitor.setTaskName(message);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private void clean(Planification planification, Set<String> cleaned,
			final boolean performClean, IProgressMonitor monitor) {
		if (null == editingDomain) {
			return;
		}

		Iterator<Imputation> iImputations = planification.getImputations()
				.iterator();
		// for(Imputation imputation:planification.getImputations())
		Set<Command> commands = new HashSet<Command>();
		while (iImputations.hasNext()) {
			Imputation imputation = iImputations.next();
			assert imputation != null : "null imputation in planification.imputations!";

			boolean clean = false;
			if (null == imputation.getPlanification()) {
				String log = String
						.format(
								"planification.imputation.planification==null! planification=%s imputation=%s",
								planification, imputation);
				cleaned.add(log);
				clean = true;
			} else if (!planification.equals(imputation.getPlanification())) {
				String log = String
						.format(
								"planification.imputation.planification!=planification! planification=%s planification.imputation=%s planification.imputation.planification=%s",
								planification, imputation, imputation
										.getPlanification());
				cleaned.add(log);
				clean = true;
			}

			if (clean && performClean) {
				Command command = new RemoveCommand(editingDomain,
//						planification.getImputations(),
						planification,
						NajaPackage.Literals.PLANIFICATION__IMPUTATIONS,
						imputation)
				{

					@Override
					protected boolean prepare() {
						return true;
					}
					
				};
				commands.add(command);
			}
		}
		
		for(Command command : commands)
		{
			editingDomain.getCommandStack().execute(command);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (StructuredSelection) selection;
	}

}
