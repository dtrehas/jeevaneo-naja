/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries.impl;

import com.jeevaneo.naja.timeentries.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeentriesFactoryImpl extends EFactoryImpl implements TimeentriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeentriesFactory init() {
		try {
			TimeentriesFactory theTimeentriesFactory = (TimeentriesFactory)EPackage.Registry.INSTANCE.getEFactory("http://naja.jeevaneo.com/timeentries/1.0"); 
			if (theTimeentriesFactory != null) {
				return theTimeentriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeentriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeentriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimeentriesPackage.TIME_ENTRIES: return createTimeEntries();
			case TimeentriesPackage.TIME_ENTRY: return createTimeEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntries createTimeEntries() {
		TimeEntriesImpl timeEntries = new TimeEntriesImpl();
		return timeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntry createTimeEntry() {
		TimeEntryImpl timeEntry = new TimeEntryImpl();
		return timeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeentriesPackage getTimeentriesPackage() {
		return (TimeentriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeentriesPackage getPackage() {
		return TimeentriesPackage.eINSTANCE;
	}

} //TimeentriesFactoryImpl
