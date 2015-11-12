/**
 */
package ca.polymtl.log8430.model.TP2.provider;


import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.TP2Factory;
import ca.polymtl.log8430.model.TP2.TP2Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.polymtl.log8430.model.TP2.Master} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAutoRunPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Master_AutoRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Master_AutoRun_feature", "_UI_Master_type"),
				 TP2Package.Literals.MASTER__AUTO_RUN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TP2Package.Literals.MASTER__COMMANDS);
			childrenFeatures.add(TP2Package.Literals.MASTER__CURRENT_RESSOURCE);
			childrenFeatures.add(TP2Package.Literals.MASTER__RESSOURCES_AVAILABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Master.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Master"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Master master = (Master)object;
		return getString("_UI_Master_type") + " " + master.isAutoRun();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Master.class)) {
			case TP2Package.MASTER__AUTO_RUN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TP2Package.MASTER__COMMANDS:
			case TP2Package.MASTER__CURRENT_RESSOURCE:
			case TP2Package.MASTER__RESSOURCES_AVAILABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createFileNameCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createFolderNameCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createAbsolutePathCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createTailleURLCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createPermissionCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__COMMANDS,
				 TP2Factory.eINSTANCE.createNbEnfantCommand()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__CURRENT_RESSOURCE,
				 TP2Factory.eINSTANCE.createDossier()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__CURRENT_RESSOURCE,
				 TP2Factory.eINSTANCE.createFichier()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__CURRENT_RESSOURCE,
				 TP2Factory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__RESSOURCES_AVAILABLE,
				 TP2Factory.eINSTANCE.createDossier()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__RESSOURCES_AVAILABLE,
				 TP2Factory.eINSTANCE.createFichier()));

		newChildDescriptors.add
			(createChildParameter
				(TP2Package.Literals.MASTER__RESSOURCES_AVAILABLE,
				 TP2Factory.eINSTANCE.createPage()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TP2Package.Literals.MASTER__CURRENT_RESSOURCE ||
			childFeature == TP2Package.Literals.MASTER__RESSOURCES_AVAILABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TP2EditPlugin.INSTANCE;
	}

}
