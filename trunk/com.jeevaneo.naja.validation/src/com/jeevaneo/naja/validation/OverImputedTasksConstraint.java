package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;

public class OverImputedTasksConstraint extends AbstractModelConstraint {

	public OverImputedTasksConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Task)) {
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Task task = (Task) ctx.getTarget();
		if (task.getImputedLoad() > task.getTotalLoad()) {
			return ctx.createFailureStatus(task.getLabel(), task
					.getImputedLoad(), task.getTotalLoad());
		}
		return ctx.createSuccessStatus();
	}

}
