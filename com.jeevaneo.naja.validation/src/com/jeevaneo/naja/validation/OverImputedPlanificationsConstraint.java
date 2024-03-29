package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;

public class OverImputedPlanificationsConstraint extends AbstractModelConstraint {

	public OverImputedPlanificationsConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Task)) {
			return ctx.createSuccessStatus();
		}
		Task task = (Task) ctx.getTarget();
		if (task.getUnaffectedLoad() > task.getTotalLoad()) {
			return ctx.createFailureStatus(task.getLabel(), task
					.getUnaffectedLoad(), task.getTotalLoad());
		}
		return ctx.createSuccessStatus();
	} 

}
