package com.jeevaneo.naja.validation;

import org.eclipse.emf.validation.model.IClientSelector;

public class ClientSelector implements IClientSelector {

	public static boolean running = false;

	public boolean selects(Object object) {
		return running;
	}
}
