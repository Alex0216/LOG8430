/**
 */
package lOG8430_TP2.util;

import java.util.Map;
import lOG8430_TP2.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lOG8430_TP2.LOG8430_TP2Package
 * @generated
 */
public class LOG8430_TP2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LOG8430_TP2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOG8430_TP2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LOG8430_TP2Package.eINSTANCE;
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
	protected LOG8430_TP2Switch<Adapter> modelSwitch =
		new LOG8430_TP2Switch<Adapter>() {
			@Override
			public Adapter caseFichier(Fichier object) {
				return createFichierAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseDossier(Dossier object) {
				return createDossierAdapter();
			}
			@Override
			public Adapter caseRessources(Ressources object) {
				return createRessourcesAdapter();
			}
			@Override
			public Adapter caseRessourcesDistantes(RessourcesDistantes object) {
				return createRessourcesDistantesAdapter();
			}
			@Override
			public Adapter casepermissionMap(Map.Entry<String, PermissionType> object) {
				return createpermissionMapAdapter();
			}
			@Override
			public Adapter caseRessourcesLocales(RessourcesLocales object) {
				return createRessourcesLocalesAdapter();
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
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.Fichier
	 * @generated
	 */
	public Adapter createFichierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.Dossier
	 * @generated
	 */
	public Adapter createDossierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.Ressources
	 * @generated
	 */
	public Adapter createRessourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.RessourcesDistantes <em>Ressources Distantes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.RessourcesDistantes
	 * @generated
	 */
	public Adapter createRessourcesDistantesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>permission Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createpermissionMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lOG8430_TP2.RessourcesLocales <em>Ressources Locales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lOG8430_TP2.RessourcesLocales
	 * @generated
	 */
	public Adapter createRessourcesLocalesAdapter() {
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

} //LOG8430_TP2AdapterFactory
