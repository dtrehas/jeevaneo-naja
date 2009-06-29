package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Task;

public class OverLoadedTasksConstraint extends AbstractModelConstraint {

	public OverLoadedTasksConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		System.out.print("OverLoadedTasksConstraint.validate() ");
		if (!(ctx.getTarget() instanceof Task)) {

			System.out.println();
			return ctx.createSuccessStatus();
		}
		Task task = (Task) ctx.getTarget();
		System.out.println(task);				
		if(task.getImputedLoad()>task.getTotalLoad())
		{
			//that case is already checked by the overimputed constraint
			return ctx.createSuccessStatus();
		}
			if (task.getImputedLoad()+task.getUnimputedPlanifiedLoad() > task.getTotalLoad()) {
				return ctx.createFailureStatus(task.getLabel(), task
						.getImputedLoad(),task
						.getUnimputedPlanifiedLoad(),task
						.getImputedLoad()+task
						.getUnimputedPlanifiedLoad(), task.getTotalLoad());
			}
		return ctx.createSuccessStatus();
	}

}
