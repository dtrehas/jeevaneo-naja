package com.jeevaneo.naja.validation.popup.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.naja.validation.Activator;
import com.jeevaneo.naja.validation.ClientSelector;

public class ValidationAction implements IObjectActionDelegate {

	private Shell shell;
	private StructuredSelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public ValidationAction() {
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
		
		ClientSelector.running = true;

		IBatchValidator validator = (IBatchValidator)ModelValidationService.getInstance()
			.newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);

		IStatus status = validator.validate(selection.toList());
		try {
			MarkerUtil.createMarkers(status);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
		}
		ClientSelector.running = false;

		
		MessageDialog.openInformation(
			shell,
			"Validation Plug-in",
			"Validate! was executed : " + status);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof StructuredSelection)
		{
			this.selection= (StructuredSelection) selection;
		}
	}

}
