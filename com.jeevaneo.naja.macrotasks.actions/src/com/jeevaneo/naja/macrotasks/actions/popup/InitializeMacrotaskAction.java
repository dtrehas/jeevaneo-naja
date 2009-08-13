package com.jeevaneo.naja.macrotasks.actions.popup;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.macrotasks.Macrotask;
import com.jeevaneo.naja.macrotasks.MacrotasksPackage;

public class InitializeMacrotaskAction implements IObjectActionDelegate {

	private Shell shell;
	
	private Macrotask macrotask = null;
	
	/**
	 * Constructor for Action1.
	 */
	public InitializeMacrotaskAction() {
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
		if(null!=macrotask)
		{
			
			System.out.println("" + macrotask.getTasks().size());

			CompoundCommand cc = new CompoundCommand();
			EditingDomain domain = ((IEditingDomainProvider)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()).getEditingDomain();
			for(Task task : macrotask.getTasks())
			{
				if(task.getUnimputedPlanifiedLoad()<=0)
				{
					//remove that task!
					Command cmd = new RemoveCommand(domain, macrotask, MacrotasksPackage.eINSTANCE.getMacrotask_Tasks(), task);
					cc.append(cmd);
					
				}
			}
			domain.getCommandStack().execute(cc);
			System.out.println("" + macrotask.getTasks().size());
		}
		MessageDialog.openInformation(
			shell,
			"Actions",
			"Initialize was executed.");
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		macrotask=null;
		if(!selection.isEmpty() && selection instanceof IStructuredSelection)
		{
			IStructuredSelection sselection = (IStructuredSelection) selection;
			Object osel = sselection.getFirstElement();
			if(osel instanceof Macrotask)
			{
				macrotask = (Macrotask) osel;
			}
		}
	}

}
