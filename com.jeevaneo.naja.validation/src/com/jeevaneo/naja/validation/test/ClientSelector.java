package com.jeevaneo.naja.validation.test;

import org.eclipse.emf.validation.model.IClientSelector;

public class ClientSelector implements IClientSelector {

	@Override
	public boolean selects(Object object) {
		System.out.println("Selecting " + object);
		return true;
	}

}
