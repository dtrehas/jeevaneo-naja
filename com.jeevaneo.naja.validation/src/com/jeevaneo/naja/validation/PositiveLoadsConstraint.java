package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Person;

public class PositiveLoadsConstraint extends AbstractModelConstraint {

	public PositiveLoadsConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Person))
		{
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Person person = (Person) ctx.getTarget();
		if(person.getLeftAvailability()<0)
		{
			return ctx.createFailureStatus(person.getName(), person.getLeftAvailability());
		}
		return ctx.createSuccessStatus();
	}

}
