package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;

public class NonNullDateOfImputationConstraint extends AbstractModelConstraint {

	public NonNullDateOfImputationConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Imputation))
		{
			return ctx.createSuccessStatus();
		}
		Imputation imputation = (Imputation) ctx.getTarget();
		if(imputation.getDate()==null)
		{
			return ctx.createFailureStatus(imputation);
		}
		return ctx.createSuccessStatus();
	}

}
