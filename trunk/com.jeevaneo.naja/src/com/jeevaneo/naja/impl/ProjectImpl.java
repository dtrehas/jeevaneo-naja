/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Project;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.NajaPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getUnaffectedLoad <em>Unaffected Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.ProjectImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlanifications() <em>Planifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Planification> planifications;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> resources;

	/**
	 * The cached value of the '{@link #getImputations() <em>Imputations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImputations()
	 * @generated
	 * @ordered
	 */
	protected EList<Imputation> imputations;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The default value of the '{@link #getTotalLoad() <em>Total Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_LOAD_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getUnaffectedLoad() <em>Unaffected Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaffectedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int UNAFFECTED_LOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planification> getPlanifications() {
		if (planifications == null) {
			planifications = new EObjectContainmentEList<Planification>(Planification.class, this, NajaPackage.PROJECT__PLANIFICATIONS);
		}
		return planifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Person>(Person.class, this, NajaPackage.PROJECT__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Imputation> getImputations() {
		if (imputations == null) {
			imputations = new EObjectContainmentEList<Imputation>(Imputation.class, this, NajaPackage.PROJECT__IMPUTATIONS);
		}
		return imputations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, NajaPackage.PROJECT__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getTotalLoad() {
		int ret = 0;
		for(Task task : getTasks())
		{
			ret += task.getTotalLoad();
		}
		for(Category category : getCategories())
		{
			ret += category.getTotalLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetTotalLoad() {
		//TODO find a way not to generate that one!
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUnaffectedLoad() {

		int ret = 0;
		for(Task task : getTasks())
		{
			ret += task.getUnaffectedLoad();
		}
		for(Category category : getCategories())
		{
			ret += category.getUnaffectedLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetUnaffectedLoad() {
		//TODO find a way not to generate that one!
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, NajaPackage.PROJECT__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.PROJECT__PLANIFICATIONS:
				return ((InternalEList<?>)getPlanifications()).basicRemove(otherEnd, msgs);
			case NajaPackage.PROJECT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case NajaPackage.PROJECT__IMPUTATIONS:
				return ((InternalEList<?>)getImputations()).basicRemove(otherEnd, msgs);
			case NajaPackage.PROJECT__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case NajaPackage.PROJECT__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.PROJECT__NAME:
				return getName();
			case NajaPackage.PROJECT__PLANIFICATIONS:
				return getPlanifications();
			case NajaPackage.PROJECT__RESOURCES:
				return getResources();
			case NajaPackage.PROJECT__IMPUTATIONS:
				return getImputations();
			case NajaPackage.PROJECT__CATEGORIES:
				return getCategories();
			case NajaPackage.PROJECT__TOTAL_LOAD:
				return new Integer(getTotalLoad());
			case NajaPackage.PROJECT__UNAFFECTED_LOAD:
				return new Integer(getUnaffectedLoad());
			case NajaPackage.PROJECT__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NajaPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case NajaPackage.PROJECT__PLANIFICATIONS:
				getPlanifications().clear();
				getPlanifications().addAll((Collection<? extends Planification>)newValue);
				return;
			case NajaPackage.PROJECT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Person>)newValue);
				return;
			case NajaPackage.PROJECT__IMPUTATIONS:
				getImputations().clear();
				getImputations().addAll((Collection<? extends Imputation>)newValue);
				return;
			case NajaPackage.PROJECT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case NajaPackage.PROJECT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NajaPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NajaPackage.PROJECT__PLANIFICATIONS:
				getPlanifications().clear();
				return;
			case NajaPackage.PROJECT__RESOURCES:
				getResources().clear();
				return;
			case NajaPackage.PROJECT__IMPUTATIONS:
				getImputations().clear();
				return;
			case NajaPackage.PROJECT__CATEGORIES:
				getCategories().clear();
				return;
			case NajaPackage.PROJECT__TASKS:
				getTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NajaPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NajaPackage.PROJECT__PLANIFICATIONS:
				return planifications != null && !planifications.isEmpty();
			case NajaPackage.PROJECT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case NajaPackage.PROJECT__IMPUTATIONS:
				return imputations != null && !imputations.isEmpty();
			case NajaPackage.PROJECT__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case NajaPackage.PROJECT__TOTAL_LOAD:
				return isSetTotalLoad();
			case NajaPackage.PROJECT__UNAFFECTED_LOAD:
				return isSetUnaffectedLoad();
			case NajaPackage.PROJECT__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
