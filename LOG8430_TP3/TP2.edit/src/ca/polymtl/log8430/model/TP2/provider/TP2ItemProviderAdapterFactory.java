/**
 */
package ca.polymtl.log8430.model.TP2.provider;

import ca.polymtl.log8430.model.TP2.util.TP2AdapterFactory;

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
public class TP2ItemProviderAdapterFactory extends TP2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TP2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.Dossier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DossierItemProvider dossierItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.Dossier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDossierAdapter() {
		if (dossierItemProvider == null) {
			dossierItemProvider = new DossierItemProvider(this);
		}

		return dossierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.Fichier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichierItemProvider fichierItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.Fichier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFichierAdapter() {
		if (fichierItemProvider == null) {
			fichierItemProvider = new FichierItemProvider(this);
		}

		return fichierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.Master} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterItemProvider masterItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.Master}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMasterAdapter() {
		if (masterItemProvider == null) {
			masterItemProvider = new MasterItemProvider(this);
		}

		return masterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.FileNameCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileNameCommandItemProvider fileNameCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.FileNameCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileNameCommandAdapter() {
		if (fileNameCommandItemProvider == null) {
			fileNameCommandItemProvider = new FileNameCommandItemProvider(this);
		}

		return fileNameCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.FolderNameCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderNameCommandItemProvider folderNameCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.FolderNameCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFolderNameCommandAdapter() {
		if (folderNameCommandItemProvider == null) {
			folderNameCommandItemProvider = new FolderNameCommandItemProvider(this);
		}

		return folderNameCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.AbsolutePathCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsolutePathCommandItemProvider absolutePathCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.AbsolutePathCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbsolutePathCommandAdapter() {
		if (absolutePathCommandItemProvider == null) {
			absolutePathCommandItemProvider = new AbsolutePathCommandItemProvider(this);
		}

		return absolutePathCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.TailleURLCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TailleURLCommandItemProvider tailleURLCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.TailleURLCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTailleURLCommandAdapter() {
		if (tailleURLCommandItemProvider == null) {
			tailleURLCommandItemProvider = new TailleURLCommandItemProvider(this);
		}

		return tailleURLCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.PermissionCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionCommandItemProvider permissionCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.PermissionCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPermissionCommandAdapter() {
		if (permissionCommandItemProvider == null) {
			permissionCommandItemProvider = new PermissionCommandItemProvider(this);
		}

		return permissionCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.polymtl.log8430.model.TP2.NbEnfantCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NbEnfantCommandItemProvider nbEnfantCommandItemProvider;

	/**
	 * This creates an adapter for a {@link ca.polymtl.log8430.model.TP2.NbEnfantCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNbEnfantCommandAdapter() {
		if (nbEnfantCommandItemProvider == null) {
			nbEnfantCommandItemProvider = new NbEnfantCommandItemProvider(this);
		}

		return nbEnfantCommandItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
		if (dossierItemProvider != null) dossierItemProvider.dispose();
		if (fichierItemProvider != null) fichierItemProvider.dispose();
		if (pageItemProvider != null) pageItemProvider.dispose();
		if (masterItemProvider != null) masterItemProvider.dispose();
		if (fileNameCommandItemProvider != null) fileNameCommandItemProvider.dispose();
		if (folderNameCommandItemProvider != null) folderNameCommandItemProvider.dispose();
		if (absolutePathCommandItemProvider != null) absolutePathCommandItemProvider.dispose();
		if (tailleURLCommandItemProvider != null) tailleURLCommandItemProvider.dispose();
		if (permissionCommandItemProvider != null) permissionCommandItemProvider.dispose();
		if (nbEnfantCommandItemProvider != null) nbEnfantCommandItemProvider.dispose();
	}

}
