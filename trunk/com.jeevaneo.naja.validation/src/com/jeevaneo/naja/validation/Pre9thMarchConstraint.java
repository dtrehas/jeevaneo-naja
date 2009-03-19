package com.jeevaneo.naja.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;

public class Pre9thMarchConstraint extends AbstractModelConstraint {

	private static Date march14;
	static 
	{
		try {
			march14 = new SimpleDateFormat("yyyyMMdd").parse("20090314");
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Pre9thMarchConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Imputation))
		{
			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Imputation imputation = (Imputation) ctx.getTarget();
		if(null!=imputation.getDate() && imputation.getDate().after(march14))
		{
			return ctx.createFailureStatus(imputation.getDate(), imputation.getResource().getName(), imputation.getLoad(), imputation.getComment());
		}
		return ctx.createSuccessStatus();
	}

}
