package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Task;

public class ReverseTaskFoireuseConstraint extends AbstractModelConstraint {

	public ReverseTaskFoireuseConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if ((ctx.getTarget() instanceof Imputation)) {
			Imputation imputation = (Imputation) ctx.getTarget();
			if (imputation == null) {
				return ctx.createSuccessStatus();
			}
			if (imputation.getPlanification() != null) {
				Task planifTask = imputation.getPlanification().getTask();
				Task task = imputation.getTask();

				if (null != task) {
					if (null != planifTask) {
						if (task.equals(planifTask)) {
							return ctx.createSuccessStatus();
						} else {
							return ctx.createFailureStatus(imputation, task
									.getLabel(), planifTask.getLabel());
						}

					} else {
						return ctx.createFailureStatus(imputation, task
								.getLabel(), "no task");
					}
				} else if (null != planifTask) {
					return ctx.createFailureStatus(imputation, "no task",
							planifTask.getLabel());
				}
			}
		}
		return ctx.createSuccessStatus();
	}
}
