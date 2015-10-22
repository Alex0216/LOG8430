/**
 */
package lOG8430_TP2.util;

import java.util.Map;
import lOG8430_TP2.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lOG8430_TP2.LOG8430_TP2Package
 * @generated
 */
public class LOG8430_TP2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LOG8430_TP2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOG8430_TP2Switch() {
		if (modelPackage == null) {
			modelPackage = LOG8430_TP2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LOG8430_TP2Package.FICHIER: {
				Fichier fichier = (Fichier)theEObject;
				T result = caseFichier(fichier);
				if (result == null) result = caseRessourcesLocales(fichier);
				if (result == null) result = caseRessources(fichier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseRessourcesDistantes(page);
				if (result == null) result = caseRessources(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.DOSSIER: {
				Dossier dossier = (Dossier)theEObject;
				T result = caseDossier(dossier);
				if (result == null) result = caseRessourcesLocales(dossier);
				if (result == null) result = caseRessources(dossier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.RESSOURCES: {
				Ressources ressources = (Ressources)theEObject;
				T result = caseRessources(ressources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.RESSOURCES_DISTANTES: {
				RessourcesDistantes ressourcesDistantes = (RessourcesDistantes)theEObject;
				T result = caseRessourcesDistantes(ressourcesDistantes);
				if (result == null) result = caseRessources(ressourcesDistantes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.PERMISSION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, PermissionType> permissionMap = (Map.Entry<String, PermissionType>)theEObject;
				T result = casepermissionMap(permissionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LOG8430_TP2Package.RESSOURCES_LOCALES: {
				RessourcesLocales ressourcesLocales = (RessourcesLocales)theEObject;
				T result = caseRessourcesLocales(ressourcesLocales);
				if (result == null) result = caseRessources(ressourcesLocales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fichier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFichier(Fichier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossier(Dossier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessources(Ressources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressources Distantes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressources Distantes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourcesDistantes(RessourcesDistantes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>permission Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>permission Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepermissionMap(Map.Entry<String, PermissionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressources Locales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressources Locales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourcesLocales(RessourcesLocales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LOG8430_TP2Switch
