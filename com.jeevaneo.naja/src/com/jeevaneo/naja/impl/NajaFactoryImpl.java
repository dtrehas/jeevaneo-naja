/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaFactory;
import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Schedule;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.TaskMapping;
import com.jeevaneo.naja.TaskMappings;
import com.jeevaneo.naja.VirtualImputation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NajaFactoryImpl extends EFactoryImpl implements NajaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NajaFactory init() {
		try {
			NajaFactory theNajaFactory = (NajaFactory)EPackage.Registry.INSTANCE.getEFactory("http://naja.jeevaneo.com/1.0"); 
			if (theNajaFactory != null) {
				return theNajaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NajaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NajaFactoryImpl() {
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
			case NajaPackage.PERSON: return createPerson();
			case NajaPackage.TASK: return createTask();
			case NajaPackage.IMPUTATION: return createImputation();
			case NajaPackage.PLANIFICATION: return createPlanification();
			case NajaPackage.PROJECT: return createProject();
			case NajaPackage.CATEGORY: return createCategory();
			case NajaPackage.SCHEDULE: return createSchedule();
			case NajaPackage.VIRTUAL_IMPUTATION: return createVirtualImputation();
			case NajaPackage.TASK_MAPPING: return createTaskMapping();
			case NajaPackage.TASK_MAPPINGS: return createTaskMappings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imputation createImputation() {
		ImputationImpl imputation = new ImputationImpl();
		return imputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planification createPlanification() {
		PlanificationImpl planification = new PlanificationImpl();
		return planification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualImputation createVirtualImputation() {
		VirtualImputationImpl virtualImputation = new VirtualImputationImpl();
		return virtualImputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMapping createTaskMapping() {
		TaskMappingImpl taskMapping = new TaskMappingImpl();
		return taskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMappings createTaskMappings() {
		TaskMappingsImpl taskMappings = new TaskMappingsImpl();
		return taskMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NajaPackage getNajaPackage() {
		return (NajaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NajaPackage getPackage() {
		return NajaPackage.eINSTANCE;
	}

} //NajaFactoryImpl
