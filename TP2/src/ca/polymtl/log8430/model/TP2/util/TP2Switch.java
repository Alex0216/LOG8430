/**
 */
package ca.polymtl.log8430.model.TP2.util;

import ca.polymtl.log8430.model.TP2.*;

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
 * @see ca.polymtl.log8430.model.TP2.TP2Package
 * @generated
 */
public class TP2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TP2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2Switch() {
		if (modelPackage == null) {
			modelPackage = TP2Package.eINSTANCE;
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
			case TP2Package.DOSSIER: {
				Dossier dossier = (Dossier)theEObject;
				T result = caseDossier(dossier);
				if (result == null) result = caseRessourcesLocale(dossier);
				if (result == null) result = caseRessource(dossier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.FICHIER: {
				Fichier fichier = (Fichier)theEObject;
				T result = caseFichier(fichier);
				if (result == null) result = caseRessourcesLocale(fichier);
				if (result == null) result = caseRessource(fichier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.RESSOURCES_DISTANTE: {
				RessourcesDistante ressourcesDistante = (RessourcesDistante)theEObject;
				T result = caseRessourcesDistante(ressourcesDistante);
				if (result == null) result = caseRessource(ressourcesDistante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseRessourcesDistante(page);
				if (result == null) result = caseRessource(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.RESSOURCES_LOCALE: {
				RessourcesLocale ressourcesLocale = (RessourcesLocale)theEObject;
				T result = caseRessourcesLocale(ressourcesLocale);
				if (result == null) result = caseRessource(ressourcesLocale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.RESSOURCE: {
				Ressource ressource = (Ressource)theEObject;
				T result = caseRessource(ressource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.ABSTRACT_COMMAND: {
				AbstractCommand abstractCommand = (AbstractCommand)theEObject;
				T result = caseAbstractCommand(abstractCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.MASTER: {
				Master master = (Master)theEObject;
				T result = caseMaster(master);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.FILE_NAME_COMMAND: {
				FileNameCommand fileNameCommand = (FileNameCommand)theEObject;
				T result = caseFileNameCommand(fileNameCommand);
				if (result == null) result = caseAbstractCommand(fileNameCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.FOLDER_NAME_COMMAND: {
				FolderNameCommand folderNameCommand = (FolderNameCommand)theEObject;
				T result = caseFolderNameCommand(folderNameCommand);
				if (result == null) result = caseAbstractCommand(folderNameCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.ABSOLUTE_PATH_COMMAND: {
				AbsolutePathCommand absolutePathCommand = (AbsolutePathCommand)theEObject;
				T result = caseAbsolutePathCommand(absolutePathCommand);
				if (result == null) result = caseAbstractCommand(absolutePathCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.TAILLE_COMMAND: {
				TailleCommand tailleCommand = (TailleCommand)theEObject;
				T result = caseTailleCommand(tailleCommand);
				if (result == null) result = caseAbstractCommand(tailleCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.PERMISSION_COMMAND: {
				PermissionCommand permissionCommand = (PermissionCommand)theEObject;
				T result = casePermissionCommand(permissionCommand);
				if (result == null) result = caseAbstractCommand(permissionCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TP2Package.NB_ENFANT_COMMAND: {
				NbEnfantCommand nbEnfantCommand = (NbEnfantCommand)theEObject;
				T result = caseNbEnfantCommand(nbEnfantCommand);
				if (result == null) result = caseAbstractCommand(nbEnfantCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Ressources Distante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressources Distante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourcesDistante(RessourcesDistante object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ressources Locale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressources Locale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourcesLocale(RessourcesLocale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCommand(AbstractCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaster(Master object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Name Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Name Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNameCommand(FileNameCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Name Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Name Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderNameCommand(FolderNameCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Path Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Path Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsolutePathCommand(AbsolutePathCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taille Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taille Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTailleCommand(TailleCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionCommand(PermissionCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nb Enfant Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nb Enfant Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNbEnfantCommand(NbEnfantCommand object) {
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

} //TP2Switch
