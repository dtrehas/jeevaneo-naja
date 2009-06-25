package com.jeevaneo.naja.validation;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Task;

public class ReverseImputFoireuseConstraint extends AbstractModelConstraint {

	public ReverseImputFoireuseConstraint() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		System.out.println("ReverseImputFoireuseConstraint.validate()");
		if ((ctx.getTarget() instanceof Task)) {
			Task task = (Task) ctx.getTarget();
			Iterator<Imputation> imputs = task.getImputations().iterator();
			// for(Imputation imputation : task.getImputations())
			while (imputs.hasNext()) {
				Imputation imputation = imputs.next();
				if (imputation.getTask() == null
						|| !imputation.getTask().equals(task)) {
					IStatus ret = ctx.createFailureStatus(task.getName(),
							imputation.getTask(), imputation);
					// try to clean
					if (imputation.getTask() != null) {
						imputs.remove();
					} else {
						imputation.setTask(task);
					}
					return ret;
				}

			}

		}
		return ctx.createSuccessStatus();
	}

}
