package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;

public class OverPlanifiedTasksConstraint extends AbstractModelConstraint {

	public OverPlanifiedTasksConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Task)) {
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Task task = (Task) ctx.getTarget();
		if (task.getTotalPlanifiedLoad() > task.getTotalLoad()) {
			return ctx.createFailureStatus(task.getLabel(), task
					.getTotalPlanifiedLoad(), task.getTotalLoad());
		}
		return ctx.createSuccessStatus();
	}

}
