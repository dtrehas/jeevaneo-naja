package com.jeevaneo.naja.validation.startup;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;

import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;
import com.jeevaneo.naja.validation.Activator;

public class ValidatorRegisterer implements IStartup {

	@Override
	public void earlyStartup() {
//		EValidator.Registry.INSTANCE.put(TimeentriesPackage.eINSTANCE,
//				new MyTestValidator());
//		EValidator.Registry.INSTANCE.put(NajaPackage.eINSTANCE,
//				new MyTestValidator());
		EValidator eValidator = new EValidatorAdapter(); 
		EValidator.Registry.INSTANCE.put(TimeentriesPackage.eINSTANCE,
				eValidator);
		EValidator.Registry.INSTANCE.put(NajaPackage.eINSTANCE,
				eValidator);

	}

}

class MyTestValidator extends EObjectValidator {

	
	
	@Override
	public boolean validate(EClass class1, EObject object,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		super.validate(class1, object, diagnostics, context);
		System.out.println("Validate " + object);
		if (object instanceof TimeEntries) {
			TimeEntries ties = (TimeEntries) object;
			diagnostics.add(new BasicDiagnostic("" + ties,
					BasicDiagnostic.WARNING, "TimeEntries has "
							+ ties.getEntries().size() + " entries ({1})",
					new Object[] { ties, "test" }));
			context.put(ties, new Status(IStatus.INFO, Activator.PLUGIN_ID, "yo"));
		}
		return true;
	}
}
