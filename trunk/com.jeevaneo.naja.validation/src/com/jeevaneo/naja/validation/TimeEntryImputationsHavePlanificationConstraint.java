package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.timeentries.TimeEntry;

public class TimeEntryImputationsHavePlanificationConstraint extends
		AbstractModelConstraint {

	public TimeEntryImputationsHavePlanificationConstraint() {
	}

	public IStatus validate(IValidationContext ctx, TimeEntry timeEntry) {
		if (null == timeEntry.getImputation()
				|| null == timeEntry.getImputation().getPlanification()) {
			// ctx.addResult(timeEntry);
			return ctx.createFailureStatus(timeEntry);
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
