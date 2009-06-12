package com.jeevaneo.naja.validation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;

public class TestMultiConstraint extends AbstractModelConstraint {

	public TestMultiConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (!(ctx.getTarget() instanceof Person)) {
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Person person = (Person) ctx.getTarget();

		Collection<Imputation> removeUsImputations = new ArrayList<Imputation>();
		for (Imputation imputation : person.getImputations()) {
			if (null == imputation.getDate()) {
				removeUsImputations.add(imputation);
				// return ctx.createFailureStatus(imputation);
			}
		}

		for (Imputation removeMeImputation : removeUsImputations) {
			person.getImputations().remove(removeMeImputation);
		}

		return ctx.createSuccessStatus();
	}

}
