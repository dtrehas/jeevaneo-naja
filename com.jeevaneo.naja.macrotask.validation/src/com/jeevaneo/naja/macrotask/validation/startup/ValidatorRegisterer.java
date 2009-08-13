package com.jeevaneo.naja.macrotask.validation.startup;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import com.jeevaneo.naja.macrotasks.MacrotasksPackage;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;
import com.jeevaneo.naja.validation.startup.EValidatorAdapter;

public class ValidatorRegisterer implements IStartup {

	@Override
	public void earlyStartup() {
		EValidator eValidator = new EValidatorAdapter();
		EValidator.Registry.INSTANCE.put(MacrotasksPackage.eINSTANCE,
				eValidator);
		EValidator.Registry.INSTANCE.put(TimeentriesPackage .eINSTANCE,
				eValidator);
		EValidator.Registry.INSTANCE.put(MacrotasksPackage.eINSTANCE,
				eValidator);

	}

}
