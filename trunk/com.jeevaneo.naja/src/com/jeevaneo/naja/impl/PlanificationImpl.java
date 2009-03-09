/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.VirtualImputation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Planification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getVirtualImputation <em>Virtual Imputation</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getMaxLoadPerDay <em>Max Load Per Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanificationImpl extends EObjectImpl implements Planification {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Person resource;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected int load = LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVirtualImputation() <em>Virtual Imputation</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getVirtualImputation()
	 * @generated
	 * @ordered
	 */
	protected VirtualImputation virtualImputation;

	/**
	 * The default value of the '{@link #getFirstDate() <em>First Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFirstDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstDate() <em>First Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFirstDate()
	 * @generated
	 * @ordered
	 */
	protected Date firstDate = FIRST_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastDate() <em>Last Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDate() <em>Last Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastDate = LAST_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLoadPerDay() <em>Max Load Per Day</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxLoadPerDay()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LOAD_PER_DAY_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getMaxLoadPerDay() <em>Max Load Per Day</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxLoadPerDay()
	 * @generated
	 * @ordered
	 */
	protected int maxLoadPerDay = MAX_LOAD_PER_DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected PlanificationImpl() {
		super();

		eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				switch (msg.getFeatureID(Planification.class)) {
				case NajaPackage.PLANIFICATION__LOAD:
				case NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY:
					if (null != getResource()) {
						((PersonImpl) getResource())
								.recomputeAvailableSchedules();
					}
					break;
				}
			}

		});
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.PLANIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Person)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NajaPackage.PLANIFICATION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Person newResource,
			NotificationChain msgs) {
		Person oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Person newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NajaPackage.PLANIFICATION__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(int newLoad) {
		int oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualImputation getVirtualImputation() {
		return virtualImputation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualImputation(
			VirtualImputation newVirtualImputation, NotificationChain msgs) {
		VirtualImputation oldVirtualImputation = virtualImputation;
		virtualImputation = newVirtualImputation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION, oldVirtualImputation, newVirtualImputation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualImputation(VirtualImputation newVirtualImputation) {
		if (newVirtualImputation != virtualImputation) {
			NotificationChain msgs = null;
			if (virtualImputation != null)
				msgs = ((InternalEObject)virtualImputation).eInverseRemove(this, NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION, VirtualImputation.class, msgs);
			if (newVirtualImputation != null)
				msgs = ((InternalEObject)newVirtualImputation).eInverseAdd(this, NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION, VirtualImputation.class, msgs);
			msgs = basicSetVirtualImputation(newVirtualImputation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION, newVirtualImputation, newVirtualImputation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getFirstDate() {
		if (null != getVirtualImputation()) {
			return getVirtualImputation().getFirstDate();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getLastDate() {
		if (null != getVirtualImputation()) {
			return getVirtualImputation().getLastDate();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLoadPerDay() {
		return maxLoadPerDay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLoadPerDay(int newMaxLoadPerDay) {
		int oldMaxLoadPerDay = maxLoadPerDay;
		maxLoadPerDay = newMaxLoadPerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY, oldMaxLoadPerDay, maxLoadPerDay));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getLabel() {
		if (null != getVirtualImputation()) {
			return getVirtualImputation().getLabel();
		}
		return String.format(/* "%s: "+ */"%d on %s"/*
													 * ,
													 * getResource()==null?"nobody!"
													 * :getResource().getName()
													 */, load,
				getTask() == null ? "nothing!" : getTask().getName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetLabel() {
		return true;
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
			case NajaPackage.PLANIFICATION__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
				return basicSetResource((Person)otherEnd, msgs);
			case NajaPackage.PLANIFICATION__TASK:
				if (task != null)
					msgs = ((InternalEObject)task).eInverseRemove(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
				return basicSetTask((Task)otherEnd, msgs);
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				if (virtualImputation != null)
					msgs = ((InternalEObject)virtualImputation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION, null, msgs);
				return basicSetVirtualImputation((VirtualImputation)otherEnd, msgs);
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
			case NajaPackage.PLANIFICATION__RESOURCE:
				return basicSetResource(null, msgs);
			case NajaPackage.PLANIFICATION__TASK:
				return basicSetTask(null, msgs);
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				return basicSetVirtualImputation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__LABEL:
				return getLabel();
			case NajaPackage.PLANIFICATION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case NajaPackage.PLANIFICATION__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case NajaPackage.PLANIFICATION__LOAD:
				return new Integer(getLoad());
			case NajaPackage.PLANIFICATION__COMMENT:
				return getComment();
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				return getVirtualImputation();
			case NajaPackage.PLANIFICATION__FIRST_DATE:
				return getFirstDate();
			case NajaPackage.PLANIFICATION__LAST_DATE:
				return getLastDate();
			case NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY:
				return new Integer(getMaxLoadPerDay());
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
			case NajaPackage.PLANIFICATION__RESOURCE:
				setResource((Person)newValue);
				return;
			case NajaPackage.PLANIFICATION__TASK:
				setTask((Task)newValue);
				return;
			case NajaPackage.PLANIFICATION__LOAD:
				setLoad(((Integer)newValue).intValue());
				return;
			case NajaPackage.PLANIFICATION__COMMENT:
				setComment((String)newValue);
				return;
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				setVirtualImputation((VirtualImputation)newValue);
				return;
			case NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY:
				setMaxLoadPerDay(((Integer)newValue).intValue());
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
			case NajaPackage.PLANIFICATION__RESOURCE:
				setResource((Person)null);
				return;
			case NajaPackage.PLANIFICATION__TASK:
				setTask((Task)null);
				return;
			case NajaPackage.PLANIFICATION__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case NajaPackage.PLANIFICATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				setVirtualImputation((VirtualImputation)null);
				return;
			case NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY:
				setMaxLoadPerDay(MAX_LOAD_PER_DAY_EDEFAULT);
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
			case NajaPackage.PLANIFICATION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case NajaPackage.PLANIFICATION__RESOURCE:
				return resource != null;
			case NajaPackage.PLANIFICATION__TASK:
				return task != null;
			case NajaPackage.PLANIFICATION__LOAD:
				return load != LOAD_EDEFAULT;
			case NajaPackage.PLANIFICATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION:
				return virtualImputation != null;
			case NajaPackage.PLANIFICATION__FIRST_DATE:
				return FIRST_DATE_EDEFAULT == null ? firstDate != null : !FIRST_DATE_EDEFAULT.equals(firstDate);
			case NajaPackage.PLANIFICATION__LAST_DATE:
				return LAST_DATE_EDEFAULT == null ? lastDate != null : !LAST_DATE_EDEFAULT.equals(lastDate);
			case NajaPackage.PLANIFICATION__MAX_LOAD_PER_DAY:
				return maxLoadPerDay != MAX_LOAD_PER_DAY_EDEFAULT;
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
		result.append(" (load: ");
		result.append(load);
		result.append(", comment: ");
		result.append(comment);
		result.append(", firstDate: ");
		result.append(firstDate);
		result.append(", lastDate: ");
		result.append(lastDate);
		result.append(", maxLoadPerDay: ");
		result.append(maxLoadPerDay);
		result.append(')');
		return result.toString();
	}

} // PlanificationImpl
