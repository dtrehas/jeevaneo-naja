/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.provider;

import com.jeevaneo.naja.util.NajaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NajaItemProviderAdapterFactory extends NajaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NajaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Person} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonItemProvider personItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonAdapter() {
		if (personItemProvider == null) {
			personItemProvider = new PersonItemProvider(this);
		}

		return personItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Imputation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImputationItemProvider imputationItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Imputation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImputationAdapter() {
		if (imputationItemProvider == null) {
			imputationItemProvider = new ImputationItemProvider(this);
		}

		return imputationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Planification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanificationItemProvider planificationItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Planification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanificationAdapter() {
		if (planificationItemProvider == null) {
			planificationItemProvider = new PlanificationItemProvider(this);
		}

		return planificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Category} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if (categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.naja.Schedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleItemProvider scheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.naja.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleAdapter() {
		if (scheduleItemProvider == null) {
			scheduleItemProvider = new ScheduleItemProvider(this);
		}

		return scheduleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (personItemProvider != null) personItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (imputationItemProvider != null) imputationItemProvider.dispose();
		if (planificationItemProvider != null) planificationItemProvider.dispose();
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (categoryItemProvider != null) categoryItemProvider.dispose();
		if (scheduleItemProvider != null) scheduleItemProvider.dispose();
	}

}
