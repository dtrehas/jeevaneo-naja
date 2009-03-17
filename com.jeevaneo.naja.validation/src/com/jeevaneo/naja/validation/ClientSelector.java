package com.jeevaneo.naja.validation;

import org.eclipse.emf.validation.model.IClientSelector;

import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.impl.NajaPackageImpl;

public class ClientSelector implements IClientSelector {

	public static boolean running = false;

	public boolean selects(Object object) {
		return true;
	}
}
