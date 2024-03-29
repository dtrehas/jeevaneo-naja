/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Imputation;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.naja.NajaPackage
 * @generated
 */
public class NajaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NajaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NajaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NajaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NajaSwitch<Adapter> modelSwitch =
		new NajaSwitch<Adapter>() {
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseImputation(Imputation object) {
				return createImputationAdapter();
			}
			@Override
			public Adapter casePlanification(Planification object) {
				return createPlanificationAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseVirtualImputation(VirtualImputation object) {
				return createVirtualImputationAdapter();
			}
			@Override
			public Adapter caseTaskMapping(TaskMapping object) {
				return createTaskMappingAdapter();
			}
			@Override
			public Adapter caseTaskMappings(TaskMappings object) {
				return createTaskMappingsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Imputation <em>Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Imputation
	 * @generated
	 */
	public Adapter createImputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Planification <em>Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Planification
	 * @generated
	 */
	public Adapter createPlanificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.VirtualImputation <em>Virtual Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.VirtualImputation
	 * @generated
	 */
	public Adapter createVirtualImputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.TaskMapping <em>Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.TaskMapping
	 * @generated
	 */
	public Adapter createTaskMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.naja.TaskMappings <em>Task Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.naja.TaskMappings
	 * @generated
	 */
	public Adapter createTaskMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NajaAdapterFactory
