/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.polymtl.log8430.model.TP2.TP2Package
 * @generated
 */
public interface TP2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TP2Factory eINSTANCE = ca.polymtl.log8430.model.TP2.impl.TP2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier</em>'.
	 * @generated
	 */
	Dossier createDossier();

	/**
	 * Returns a new object of class '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier</em>'.
	 * @generated
	 */
	Fichier createFichier();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master</em>'.
	 * @generated
	 */
	Master createMaster();

	/**
	 * Returns a new object of class '<em>File Name Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Name Command</em>'.
	 * @generated
	 */
	FileNameCommand createFileNameCommand();

	/**
	 * Returns a new object of class '<em>Folder Name Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Name Command</em>'.
	 * @generated
	 */
	FolderNameCommand createFolderNameCommand();

	/**
	 * Returns a new object of class '<em>Absolute Path Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Path Command</em>'.
	 * @generated
	 */
	AbsolutePathCommand createAbsolutePathCommand();

	/**
	 * Returns a new object of class '<em>Taille Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Taille Command</em>'.
	 * @generated
	 */
	TailleCommand createTailleCommand();

	/**
	 * Returns a new object of class '<em>Permission Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission Command</em>'.
	 * @generated
	 */
	PermissionCommand createPermissionCommand();

	/**
	 * Returns a new object of class '<em>Nb Enfant Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nb Enfant Command</em>'.
	 * @generated
	 */
	NbEnfantCommand createNbEnfantCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TP2Package getTP2Package();

} //TP2Factory
