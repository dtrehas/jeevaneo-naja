package com.jeevaneo.naja.timeentries.editor;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaFactory;
import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;
import com.jeevaneo.naja.timeentries.presentation.TimeentriesEditor;

public class EditorActionDelegate1 implements IEditorActionDelegate {

	TimeentriesEditor editor = null;

	StructuredSelection selection = null;

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = (TimeentriesEditor) targetEditor;
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
		if (null != ty.getImputation()) {
			ty.getImputation().setPlanification(null);
			ty.getImputation().setResource(null);
			ty.getImputation().setTask(null);
			ty.setImputation(null);
		}
		Imputation imputation = NajaFactory.eINSTANCE.createImputation();
		imputation
				.setComment(ty.getComment() + " | generated at " + new Date());
		imputation.setDate(computeDate(ty.getDay()));
		imputation.setLoad(ty.getLoad());
		imputation.setResource(ty.getResource());
		imputation.setTask(ty.getExternalId().getTask());
		Command command = new CreateChildCommand(editor.getEditingDomain(), ty,
				TimeentriesPackage.Literals.TIME_ENTRY__IMPUTATION, imputation,
				Collections.emptyList()) {

			@Override
			public void execute() {
				super.execute();
				Imputation imput = (Imputation) this.child;
				TimeEntry ty = (TimeEntry) this.owner;
				ty.setImputation(imput);
			}

		};
		editor.getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (StructuredSelection) selection;
	}

}
