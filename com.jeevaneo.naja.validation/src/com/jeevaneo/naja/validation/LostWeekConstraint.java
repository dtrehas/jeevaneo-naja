package com.jeevaneo.naja.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;

public class LostWeekConstraint extends AbstractModelConstraint {
	private static Date start;
	static 
	{
		try {
			start = new SimpleDateFormat("yyyyMMdd").parse("20090201");
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	private static Date end;
	static 
	{
		try {
			end = new SimpleDateFormat("yyyyMMdd").parse("20090207");
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	public LostWeekConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		if(!(ctx.getTarget() instanceof Imputation))
		{
//			System.out.println("IGNORED: " + ctx.getTarget());
			return ctx.createSuccessStatus();
		}
		Imputation imputation = (Imputation) ctx.getTarget();
		if(null!=imputation.getDate() && imputation.getDate().after(start) && imputation.getDate().before(end))
		{
			return ctx.createFailureStatus(imputation.getDate(), imputation.getResource().getName(), imputation.getLoad(), imputation.getComment());
		}
		return ctx.createSuccessStatus();
	}

}
