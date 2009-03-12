package com.jeevaneo.naja.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Person;

public class PositiveLoadsConstraint extends AbstractModelConstraint {

	public PositiveLoadsConstraint() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		Person person = (Person) ctx.getTarget();
		if(person.getLeftAvailability()<0)
		{
			return ctx.createFailureStatus(person.getName(), person.getLeftAvailability());
		}
		return ctx.createSuccessStatus();
	}

}
