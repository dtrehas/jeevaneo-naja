/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.macrotasks.tests;

import com.jeevaneo.naja.macrotasks.Macrotask;
import com.jeevaneo.naja.macrotasks.MacrotasksFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Macrotask</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacrotaskTest extends TestCase {

	/**
	 * The fixture for this Macrotask test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Macrotask fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MacrotaskTest.class);
	}

	/**
	 * Constructs a new Macrotask test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacrotaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Macrotask test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Macrotask fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Macrotask test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Macrotask getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MacrotasksFactory.eINSTANCE.createMacrotask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MacrotaskTest
