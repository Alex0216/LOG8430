/**
 */
package ca.polymtl.log8430.model.TP2.util;

import ca.polymtl.log8430.model.TP2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.polymtl.log8430.model.TP2.TP2Package
 * @generated
 */
public class TP2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TP2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TP2Package.eINSTANCE;
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
	protected TP2Switch<Adapter> modelSwitch =
		new TP2Switch<Adapter>() {
			@Override
			public Adapter caseDossier(Dossier object) {
				return createDossierAdapter();
			}
			@Override
			public Adapter caseFichier(Fichier object) {
				return createFichierAdapter();
			}
			@Override
			public Adapter caseRessourcesDistante(RessourcesDistante object) {
				return createRessourcesDistanteAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseRessourcesLocale(RessourcesLocale object) {
				return createRessourcesLocaleAdapter();
			}
			@Override
			public Adapter caseRessource(Ressource object) {
				return createRessourceAdapter();
			}
			@Override
			public Adapter caseAbstractCommand(AbstractCommand object) {
				return createAbstractCommandAdapter();
			}
			@Override
			public Adapter caseMaster(Master object) {
				return createMasterAdapter();
			}
			@Override
			public Adapter caseFileNameCommand(FileNameCommand object) {
				return createFileNameCommandAdapter();
			}
			@Override
			public Adapter caseFolderNameCommand(FolderNameCommand object) {
				return createFolderNameCommandAdapter();
			}
			@Override
			public Adapter caseAbsolutePathCommand(AbsolutePathCommand object) {
				return createAbsolutePathCommandAdapter();
			}
			@Override
			public Adapter caseTailleCommand(TailleCommand object) {
				return createTailleCommandAdapter();
			}
			@Override
			public Adapter casePermissionCommand(PermissionCommand object) {
				return createPermissionCommandAdapter();
			}
			@Override
			public Adapter caseTailleURLCommand(TailleURLCommand object) {
				return createTailleURLCommandAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.Dossier
	 * @generated
	 */
	public Adapter createDossierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.Fichier
	 * @generated
	 */
	public Adapter createFichierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.RessourcesDistante <em>Ressources Distante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesDistante
	 * @generated
	 */
	public Adapter createRessourcesDistanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale <em>Ressources Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale
	 * @generated
	 */
	public Adapter createRessourcesLocaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.Ressource
	 * @generated
	 */
	public Adapter createRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.AbstractCommand <em>Abstract Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand
	 * @generated
	 */
	public Adapter createAbstractCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.Master
	 * @generated
	 */
	public Adapter createMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.FileNameCommand <em>File Name Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.FileNameCommand
	 * @generated
	 */
	public Adapter createFileNameCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.FolderNameCommand <em>Folder Name Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.FolderNameCommand
	 * @generated
	 */
	public Adapter createFolderNameCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.AbsolutePathCommand <em>Absolute Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.AbsolutePathCommand
	 * @generated
	 */
	public Adapter createAbsolutePathCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.TailleCommand <em>Taille Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.TailleCommand
	 * @generated
	 */
	public Adapter createTailleCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.PermissionCommand <em>Permission Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.PermissionCommand
	 * @generated
	 */
	public Adapter createPermissionCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.polymtl.log8430.model.TP2.TailleURLCommand <em>Taille URL Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.polymtl.log8430.model.TP2.TailleURLCommand
	 * @generated
	 */
	public Adapter createTailleURLCommandAdapter() {
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

} //TP2AdapterFactory
