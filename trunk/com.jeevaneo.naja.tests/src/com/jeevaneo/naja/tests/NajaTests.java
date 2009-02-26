/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>naja</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NajaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new NajaTests("naja Tests");
		suite.addTestSuite(PersonTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(PlanificationTest.class);
		suite.addTestSuite(ProjectTest.class);
		suite.addTestSuite(CategoryTest.class);
		suite.addTestSuite(ScheduleTest.class);
		suite.addTestSuite(VirtualImputationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NajaTests(String name) {
		super(name);
	}

} //NajaTests
