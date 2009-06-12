package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Planification;

public class PositiveUnimputedLoadsConstraint extends AbstractModelConstraint {

	public PositiveUnimputedLoadsConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Planification)) {
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Planification planif = (Planification) ctx.getTarget();
		if (planif.getUnimputedLoad() < 0) {
			return ctx.createFailureStatus(planif.getLabel(), planif
					.getUnimputedLoad());
		}
		return ctx.createSuccessStatus();
	}

}
