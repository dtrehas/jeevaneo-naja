package com.jeevaneo.naja.validation.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.naja.validation.Activator;
import com.jeevaneo.naja.validation.ClientSelector;

public class ValidationAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
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

		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		validator.setReportSuccesses(true);

		List<EObject> eObjects = new ArrayList<EObject>();
		for (Object o : selection.toList()) {
			if (o instanceof EObject) {
				eObjects.add((EObject)o);
//				if(o instanceof TimeEntries)
//				{
//					for(TimeEntry ty : ((TimeEntries)o).getEntries())
//					{
//						eObjects.add(ty);
//					}
//				}
			}
		}
			
		for(EObject eo : eObjects)
		{
				IStatus status = validator.validate(eo);
				try {
					MarkerUtil.createMarkers(status);
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(e.getStatus());
				}
		}
		ClientSelector.running = false;
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
