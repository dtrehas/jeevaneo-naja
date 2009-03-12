package com.jeevaneo.naja.timeentries.popup.actions;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaFactory;
import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;

public class GenerateImputationsAction implements IObjectActionDelegate {

	private StructuredSelection selection = null;
	private EditingDomain editingDomain;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetEditor) {
		if (!(targetEditor instanceof IEditingDomainProvider)) {
			this.editingDomain = null;
			return;
		}
		this.editingDomain = ((IEditingDomainProvider) targetEditor)
				.getEditingDomain();
	}

	@Override
	public void run(IAction action) {
		for (Object o : selection.toList()) {
			if (o instanceof TimeEntries) {
				TimeEntries ties = (TimeEntries) o;
				for (TimeEntry ty : ties.getEntries()) {
					recompute(ty);
				}
			} else if (o instanceof TimeEntry) {
				recompute((TimeEntry) o);
			}
		}
	}

	private static Date computeDate(int date) {
		int year = date / 10000;
		int month = date / 100 % 100 - 1;
		int day = date % 100;
		Date d = new GregorianCalendar(year, month, day).getTime();
		return d;
	}

	private void recompute(TimeEntry ty) {
		if (null == editingDomain) {
			return;
		}
		
		if (null != ty.getImputation()) {
			ty.getImputation().setPlanification(null);
			ty.getImputation().setResource(null);
			ty.getImputation().setTask(null);
			ty.setImputation(null);
		}
		
		
		Command command = new CreateChildCommand(editingDomain, ty,
				TimeentriesPackage.Literals.TIME_ENTRY__IMPUTATION, NajaFactory.eINSTANCE.createImputation(),
				Collections.emptyList()) {

			@Override
			public void execute() {
				super.execute();
				Imputation imputation = (Imputation) this.child;
				TimeEntry ty = (TimeEntry) this.owner;
				
				
				imputation
						.setComment(ty.getComment());
				imputation.setDate(computeDate(ty.getDay()));
				imputation.setLoad(ty.getLoad());
				imputation.setResource(ty.getResource());
				imputation.setTask(ty.getExternalId().getTask());
				ty.setImputation(imputation);
//				inferPlanification(imputation);
			}

		};
		editingDomain.getCommandStack().execute(command);
		
		Planification planification = inferPlanification(ty.getImputation());
		if(null!=planification)
		{
			System.out.println("YES" + ty);
		command = new SetCommand(editingDomain, ty.getImputation(),
				NajaPackage.Literals.IMPUTATION__PLANIFICATION, planification);
		editingDomain.getCommandStack().execute(command);
		}
		else
		{
			//TODO report better
			System.err.println("No planif found for TimeEntry " + ty);
		}
	}

	protected Planification inferPlanification(Imputation imputation) {
		for(Resource resource : imputation.eResource().getResourceSet().getResources())
		{
			TreeIterator<EObject> it = resource.getAllContents();
			for(EObject o=null;it.hasNext();o=it.next())
			{
				if(o instanceof Planification)
				{
					Planification planification = (Planification)o;
					Person planifResource = planification.getResource();
					if(null==planifResource)
					{
						continue;
					}
					Task planifTask = planification.getTask();
					if(null==planifTask)
					{
						continue;
					}
					if(planifTask.equals(imputation.getTask()) && planifResource.equals(imputation.getResource()))
					{
						return planification;
					}
				}
			}
		}
		return null;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (StructuredSelection) selection;
	}

}

