package com.jeevaneo.naja.validation;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;

public class ResourceOwnsItsImputationsConstraint extends AbstractModelConstraint {

	public ResourceOwnsItsImputationsConstraint() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		System.out.println("ResourceOwnsItsImputationsConstraint.validate()");
		if((ctx.getTarget() instanceof Person))
		{
			Person person = (Person) ctx.getTarget();
		Iterator<Imputation> imputs = person.getImputations().iterator();
//		for(Imputation imputation : task.getImputations())
		MultiStatus ret = null;
		while(imputs.hasNext())
		{
			Imputation imputation = imputs.next();
			if(imputation.getResource()==null || !imputation.getResource().equals(person))
			{
				if(null==ret)
				{
					ret = new MultiStatus("test", IStatus.ERROR, "test2", null);
				}
				ret.add(ctx.createFailureStatus(person.getName(), imputation.getResource(), imputation));
				//try to clean
				if(imputation.getResource()!=null)
				{
					Person other = imputation.getResource();
					imputs.remove();
					
					System.err.println("Imputation pointing to " + other.getName() + " but found in " + person.getName());
					
					imputation.setResource(null);
					imputation.setResource(other);
				}
				else
				{
					//should I really do that??
					imputation.setResource(person);
				}
			}
				
		}
		if(null!=ret)
		{
			return ret;
		}
		return ctx.createSuccessStatus();

		
		} else {
		System.out.println("IGNORED: " + ctx.getTarget());		
		}
		return ctx.createSuccessStatus();
	}

}
