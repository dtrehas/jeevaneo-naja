package com.jeevaneo.naja.validation.constraints.test;

import java.util.Date;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Project;

public class TestContraint extends AbstractModelConstraint {

	public TestContraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Project))
		{
			return ctx.createSuccessStatus();
		}
		return ctx.createFailureStatus(ctx.getTarget(), new Date());
	}

}
