/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.NajaPackage;


/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getUnaffectedLoad <em>Unaffected Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getImputedLoad <em>Imputed Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getTotalPlanifiedLoad <em>Total Planified Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.TaskImpl#getUnimputedPlanifiedLoad <em>Unimputed Planified Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getTotalLoad() <em>Total Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_LOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalLoad() <em>Total Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalLoad()
	 * @generated
	 * @ordered
	 */
	protected int totalLoad = TOTAL_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImputations() <em>Imputations</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImputations()
	 * @generated
	 * @ordered
	 */
	protected EList<Imputation> imputations;

	/**
	 * The cached value of the '{@link #getPlanifications() <em>Planifications</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPlanifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Planification> planifications;

	/**
	 * The default value of the '{@link #getUnaffectedLoad() <em>Unaffected Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUnaffectedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int UNAFFECTED_LOAD_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstDate() <em>First Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastDate() <em>Last Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImputedLoad() <em>Imputed Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImputedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int IMPUTED_LOAD_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTotalPlanifiedLoad() <em>Total Planified Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPlanifiedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PLANIFIED_LOAD_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getUnimputedPlanifiedLoad() <em>Unimputed Planified Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnimputedPlanifiedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int UNIMPUTED_PLANIFIED_LOAD_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalLoad() {
		return totalLoad;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLoad(int newTotalLoad) {
		int oldTotalLoad = totalLoad;
		totalLoad = newTotalLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.TASK__TOTAL_LOAD, oldTotalLoad, totalLoad));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Imputation> getImputations() {
		if (imputations == null) {
			imputations = new EObjectWithInverseResolvingEList<Imputation>(Imputation.class, this, NajaPackage.TASK__IMPUTATIONS, NajaPackage.IMPUTATION__TASK);
		}
		return imputations;
	}

	public int getUnaffectedLoad() {
		int ret = getTotalLoad();
		for (Planification p : getPlanifications()) {
			ret -= p.getUnimputedLoad();
		}
		for (Imputation p : getImputations()) {
			ret -= p.getLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetUnaffectedLoad() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getLabel() {
		if (null == label) {
			if (eIsSet(NajaPackage.TASK__CATEGORY)) {
				return getCategory().getName() + "/" + getName();
			}
			return getName();
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.TASK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID != NajaPackage.TASK__CATEGORY) return null;
		return (Category)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategory, NajaPackage.TASK__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eInternalContainer() || (eContainerFeatureID != NajaPackage.TASK__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, NajaPackage.CATEGORY__TASKS, Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.TASK__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date getFirstDate() {
		Date ret = null;
		for(Imputation imp : getImputations())
		{
			if(null==ret)
			{
				ret = imp.getDate();
			}
			else
			{
				if(null!=imp.getDate() && ret.after(imp.getDate()))
				{
					ret = imp.getDate();
				}
			}
		}
		for(Planification p : getPlanifications())
		{
			if(null==ret)
			{
				ret = p.getFirstDate();
			}
			else
			{
				if(null!=p.getFirstDate() && ret.after(p.getFirstDate()))
				{
					ret = p.getFirstDate();
				}
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date getLastDate() {
		Date ret = null;
		for(Imputation imp : getImputations())
		{
			if(null==ret)
			{
				ret = imp.getDate();
			}
			else
			{
				if(null!=imp.getDate() && ret.before(imp.getDate()))
				{
					ret = imp.getDate();
				}
			}
		}
		for(Planification p : getPlanifications())
		{
			if(null==ret)
			{
				ret = p.getLastDate();
			}
			else
			{
				if(null!=p.getLastDate() && ret.before(p.getLastDate()))
				{
					ret = p.getLastDate();
				}
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getImputedLoad() {
		int ret = 0;
		for(Imputation imputation : getImputations())
		{
			ret += imputation.getLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getTotalPlanifiedLoad() {
		int ret = 0;
		for(Planification planification : getPlanifications())
		{
			ret += planification.getLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUnimputedPlanifiedLoad() {
		int ret = 0;
		for(Planification planification : getPlanifications())
		{
			ret += planification.getUnimputedLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planification> getPlanifications() {
		if (planifications == null) {
			planifications = new EObjectWithInverseResolvingEList<Planification>(Planification.class, this, NajaPackage.TASK__PLANIFICATIONS, NajaPackage.PLANIFICATION__TASK);
		}
		return planifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.TASK__IMPUTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImputations()).basicAdd(otherEnd, msgs);
			case NajaPackage.TASK__PLANIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlanifications()).basicAdd(otherEnd, msgs);
			case NajaPackage.TASK__CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategory((Category)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.TASK__IMPUTATIONS:
				return ((InternalEList<?>)getImputations()).basicRemove(otherEnd, msgs);
			case NajaPackage.TASK__PLANIFICATIONS:
				return ((InternalEList<?>)getPlanifications()).basicRemove(otherEnd, msgs);
			case NajaPackage.TASK__CATEGORY:
				return basicSetCategory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case NajaPackage.TASK__CATEGORY:
				return eInternalContainer().eInverseRemove(this, NajaPackage.CATEGORY__TASKS, Category.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.TASK__TOTAL_LOAD:
				return new Integer(getTotalLoad());
			case NajaPackage.TASK__NAME:
				return getName();
			case NajaPackage.TASK__IMPUTATIONS:
				return getImputations();
			case NajaPackage.TASK__PLANIFICATIONS:
				return getPlanifications();
			case NajaPackage.TASK__UNAFFECTED_LOAD:
				return new Integer(getUnaffectedLoad());
			case NajaPackage.TASK__PRIORITY:
				return new Integer(getPriority());
			case NajaPackage.TASK__LABEL:
				return getLabel();
			case NajaPackage.TASK__CATEGORY:
				return getCategory();
			case NajaPackage.TASK__FIRST_DATE:
				return getFirstDate();
			case NajaPackage.TASK__LAST_DATE:
				return getLastDate();
			case NajaPackage.TASK__IMPUTED_LOAD:
				return new Integer(getImputedLoad());
			case NajaPackage.TASK__TOTAL_PLANIFIED_LOAD:
				return new Integer(getTotalPlanifiedLoad());
			case NajaPackage.TASK__UNIMPUTED_PLANIFIED_LOAD:
				return new Integer(getUnimputedPlanifiedLoad());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NajaPackage.TASK__TOTAL_LOAD:
				setTotalLoad(((Integer)newValue).intValue());
				return;
			case NajaPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case NajaPackage.TASK__IMPUTATIONS:
				getImputations().clear();
				getImputations().addAll((Collection<? extends Imputation>)newValue);
				return;
			case NajaPackage.TASK__PLANIFICATIONS:
				getPlanifications().clear();
				getPlanifications().addAll((Collection<? extends Planification>)newValue);
				return;
			case NajaPackage.TASK__PRIORITY:
				setPriority(((Integer)newValue).intValue());
				return;
			case NajaPackage.TASK__LABEL:
				setLabel((String)newValue);
				return;
			case NajaPackage.TASK__CATEGORY:
				setCategory((Category)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NajaPackage.TASK__TOTAL_LOAD:
				setTotalLoad(TOTAL_LOAD_EDEFAULT);
				return;
			case NajaPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NajaPackage.TASK__IMPUTATIONS:
				getImputations().clear();
				return;
			case NajaPackage.TASK__PLANIFICATIONS:
				getPlanifications().clear();
				return;
			case NajaPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case NajaPackage.TASK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case NajaPackage.TASK__CATEGORY:
				setCategory((Category)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NajaPackage.TASK__TOTAL_LOAD:
				return totalLoad != TOTAL_LOAD_EDEFAULT;
			case NajaPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NajaPackage.TASK__IMPUTATIONS:
				return imputations != null && !imputations.isEmpty();
			case NajaPackage.TASK__PLANIFICATIONS:
				return planifications != null && !planifications.isEmpty();
			case NajaPackage.TASK__UNAFFECTED_LOAD:
				return isSetUnaffectedLoad();
			case NajaPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case NajaPackage.TASK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case NajaPackage.TASK__CATEGORY:
				return getCategory() != null;
			case NajaPackage.TASK__FIRST_DATE:
				return FIRST_DATE_EDEFAULT == null ? getFirstDate() != null : !FIRST_DATE_EDEFAULT.equals(getFirstDate());
			case NajaPackage.TASK__LAST_DATE:
				return LAST_DATE_EDEFAULT == null ? getLastDate() != null : !LAST_DATE_EDEFAULT.equals(getLastDate());
			case NajaPackage.TASK__IMPUTED_LOAD:
				return getImputedLoad() != IMPUTED_LOAD_EDEFAULT;
			case NajaPackage.TASK__TOTAL_PLANIFIED_LOAD:
				return getTotalPlanifiedLoad() != TOTAL_PLANIFIED_LOAD_EDEFAULT;
			case NajaPackage.TASK__UNIMPUTED_PLANIFIED_LOAD:
				return getUnimputedPlanifiedLoad() != UNIMPUTED_PLANIFIED_LOAD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (totalLoad: ");
		result.append(totalLoad);
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // TaskImpl
