package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;

public class NonNullDateOfImputationConstraint extends AbstractModelConstraint {

	public NonNullDateOfImputationConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Imputation))
		{
			System.out.println("IGNORED: " + ctx.getTarget());
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
