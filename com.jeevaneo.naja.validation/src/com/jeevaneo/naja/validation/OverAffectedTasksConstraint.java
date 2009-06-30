package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;

public class OverAffectedTasksConstraint extends AbstractModelConstraint {

	public OverAffectedTasksConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Task)) {
			return ctx.createSuccessStatus();
		}
		Task task = (Task) ctx.getTarget();

		if (task.getImputedLoad() > task.getTotalLoad()
				|| task.getTotalPlanifiedLoad() > task.getTotalLoad()) {
			// that case is already checked by the overimputed and/or
			// overplanified constraints
			return ctx.createSuccessStatus();
		}
		if (task.getUnaffectedLoad()<0) {
			return ctx.createFailureStatus(task.getLabel(), 
					-1*task
					.getUnaffectedLoad(), 
					task
					.getImputedLoad(),
					task.getUnimputedPlanifiedLoad(), 
					task
					.getImputedLoad()
					+ task.getUnimputedPlanifiedLoad(), 
					task.getTotalLoad());
		}
		return ctx.createSuccessStatus();
	}

}
