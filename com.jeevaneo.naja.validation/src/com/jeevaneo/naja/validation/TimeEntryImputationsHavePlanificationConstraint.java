package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;

public class TimeEntryImputationsHavePlanificationConstraint extends
		AbstractModelConstraint {

	public TimeEntryImputationsHavePlanificationConstraint() {
	}

	public IStatus validate(IValidationContext ctx, TimeEntry timeEntry) {
		if(timeEntry.eIsSet(TimeentriesPackage.Literals.TIME_ENTRY__WAS_PLANIFIED) && !timeEntry.getWasPlanified())
		{
			//was not planified : should not have a planification
			//TODO maybe should warn if it has one though?
			return ctx.createSuccessStatus();
		}
		if (null == timeEntry.getImputation()
				|| null == timeEntry.getImputation().getPlanification()) {
			// ctx.addResult(timeEntry);
			return ctx.createFailureStatus(timeEntry, timeEntry.getLoad(), timeEntry.getResource()!=null?timeEntry.getResource().getName():"somebody(!)", timeEntry.getDay());
		}
		return ctx.createSuccessStatus();
	}

	@Override
	public IStatus validate(IValidationContext ctx) {

		Object o = ctx.getTarget();

		if (o instanceof TimeEntry) {
			return validate(ctx, (TimeEntry) o);
		} else {
			return ctx.createSuccessStatus();
		}
	}
}
