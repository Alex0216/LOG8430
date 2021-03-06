/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.polymtl.log8430.model.TP2.TP2Factory
 * @model kind="package"
 * @generated
 */
public interface TP2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TP2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TP2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TP2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TP2Package eINSTANCE = ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.Ressource <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.Ressource
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TAILLE_OCTET = 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___ACCEPT__ABSTRACTCOMMAND = 0;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale <em>Ressources Locale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessourcesLocale()
	 * @generated
	 */
	int RESSOURCES_LOCALE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE__NOM = RESSOURCE__NOM;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE__TAILLE_OCTET = RESSOURCE__TAILLE_OCTET;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE__PERMISSION = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chemin Absolu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE__CHEMIN_ABSOLU = RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ressources Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE___ACCEPT__ABSTRACTCOMMAND = RESSOURCE___ACCEPT__ABSTRACTCOMMAND;

	/**
	 * The number of operations of the '<em>Ressources Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.DossierImpl <em>Dossier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.DossierImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getDossier()
	 * @generated
	 */
	int DOSSIER = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__NOM = RESSOURCES_LOCALE__NOM;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__TAILLE_OCTET = RESSOURCES_LOCALE__TAILLE_OCTET;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__PERMISSION = RESSOURCES_LOCALE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Chemin Absolu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__CHEMIN_ABSOLU = RESSOURCES_LOCALE__CHEMIN_ABSOLU;

	/**
	 * The feature id for the '<em><b>Nombre Enfant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__NOMBRE_ENFANT = RESSOURCES_LOCALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Enfants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__LIST_ENFANTS = RESSOURCES_LOCALE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_FEATURE_COUNT = RESSOURCES_LOCALE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER___ACCEPT__ABSTRACTCOMMAND = RESSOURCES_LOCALE___ACCEPT__ABSTRACTCOMMAND;

	/**
	 * The number of operations of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_OPERATION_COUNT = RESSOURCES_LOCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl <em>Fichier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.FichierImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFichier()
	 * @generated
	 */
	int FICHIER = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__NOM = RESSOURCES_LOCALE__NOM;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__TAILLE_OCTET = RESSOURCES_LOCALE__TAILLE_OCTET;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__PERMISSION = RESSOURCES_LOCALE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Chemin Absolu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__CHEMIN_ABSOLU = RESSOURCES_LOCALE__CHEMIN_ABSOLU;

	/**
	 * The number of structural features of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_FEATURE_COUNT = RESSOURCES_LOCALE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER___ACCEPT__ABSTRACTCOMMAND = RESSOURCES_LOCALE___ACCEPT__ABSTRACTCOMMAND;

	/**
	 * The number of operations of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_OPERATION_COUNT = RESSOURCES_LOCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.RessourcesDistante <em>Ressources Distante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.RessourcesDistante
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessourcesDistante()
	 * @generated
	 */
	int RESSOURCES_DISTANTE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTE__NOM = RESSOURCE__NOM;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTE__TAILLE_OCTET = RESSOURCE__TAILLE_OCTET;

	/**
	 * The number of structural features of the '<em>Ressources Distante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTE___ACCEPT__ABSTRACTCOMMAND = RESSOURCE___ACCEPT__ABSTRACTCOMMAND;

	/**
	 * The number of operations of the '<em>Ressources Distante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.PageImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NOM = RESSOURCES_DISTANTE__NOM;

	/**
	 * The feature id for the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TAILLE_OCTET = RESSOURCES_DISTANTE__TAILLE_OCTET;

	/**
	 * The feature id for the '<em><b>Titre Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITRE_PAGE = RESSOURCES_DISTANTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Taille Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TAILLE_PAGE = RESSOURCES_DISTANTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URL = RESSOURCES_DISTANTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = RESSOURCES_DISTANTE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___ACCEPT__ABSTRACTCOMMAND = RESSOURCES_DISTANTE___ACCEPT__ABSTRACTCOMMAND;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = RESSOURCES_DISTANTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand <em>Abstract Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getAbstractCommand()
	 * @generated
	 */
	int ABSTRACT_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND__COMMAND_NAME = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND__RESSOURCE = 2;

	/**
	 * The number of structural features of the '<em>Abstract Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___CLEAR = 0;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___CAN_EXECUTE = 1;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___VISIT__FICHIER = 2;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___VISIT__DOSSIER = 3;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___VISIT__PAGE = 4;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND___EXECUTE = 5;

	/**
	 * The number of operations of the '<em>Abstract Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMAND_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.MasterImpl <em>Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.MasterImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getMaster()
	 * @generated
	 */
	int MASTER = 7;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Auto Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__AUTO_RUN = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__RESSOURCE = 2;

	/**
	 * The number of structural features of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER___CLEAR = 0;

	/**
	 * The operation id for the '<em>Execute All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER___EXECUTE_ALL = 1;

	/**
	 * The operation id for the '<em>Execute Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER___EXECUTE_COMMAND__ABSTRACTCOMMAND = 2;

	/**
	 * The operation id for the '<em>Update Ressource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER___UPDATE_RESSOURCE__RESSOURCE = 3;

	/**
	 * The number of operations of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.FileNameCommandImpl <em>File Name Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.FileNameCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFileNameCommand()
	 * @generated
	 */
	int FILE_NAME_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>File Name Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>File Name Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl <em>Folder Name Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFolderNameCommand()
	 * @generated
	 */
	int FOLDER_NAME_COMMAND = 9;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>Folder Name Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Folder Name Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.AbsolutePathCommandImpl <em>Absolute Path Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.AbsolutePathCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getAbsolutePathCommand()
	 * @generated
	 */
	int ABSOLUTE_PATH_COMMAND = 10;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>Absolute Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Absolute Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_PATH_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.PermissionCommandImpl <em>Permission Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.PermissionCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPermissionCommand()
	 * @generated
	 */
	int PERMISSION_COMMAND = 12;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.NbEnfantCommandImpl <em>Nb Enfant Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.NbEnfantCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getNbEnfantCommand()
	 * @generated
	 */
	int NB_ENFANT_COMMAND = 13;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.impl.TailleURLCommandImpl <em>Taille URL Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.impl.TailleURLCommandImpl
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getTailleURLCommand()
	 * @generated
	 */
	int TAILLE_URL_COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>Taille URL Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Taille URL Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAILLE_URL_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>Permission Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Permission Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND__COMMAND_NAME = ABSTRACT_COMMAND__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND__RESULT = ABSTRACT_COMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND__RESSOURCE = ABSTRACT_COMMAND__RESSOURCE;

	/**
	 * The number of structural features of the '<em>Nb Enfant Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND_FEATURE_COUNT = ABSTRACT_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___CLEAR = ABSTRACT_COMMAND___CLEAR;

	/**
	 * The operation id for the '<em>Can Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___CAN_EXECUTE = ABSTRACT_COMMAND___CAN_EXECUTE;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___VISIT__FICHIER = ABSTRACT_COMMAND___VISIT__FICHIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___VISIT__DOSSIER = ABSTRACT_COMMAND___VISIT__DOSSIER;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___VISIT__PAGE = ABSTRACT_COMMAND___VISIT__PAGE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND___EXECUTE = ABSTRACT_COMMAND___EXECUTE;

	/**
	 * The number of operations of the '<em>Nb Enfant Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ENFANT_COMMAND_OPERATION_COUNT = ABSTRACT_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.polymtl.log8430.model.TP2.PermissionType <em>Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.polymtl.log8430.model.TP2.PermissionType
	 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Dossier
	 * @generated
	 */
	EClass getDossier();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Dossier#getNombreEnfant <em>Nombre Enfant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Enfant</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Dossier#getNombreEnfant()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_NombreEnfant();

	/**
	 * Returns the meta object for the reference list '{@link ca.polymtl.log8430.model.TP2.Dossier#getListEnfants <em>List Enfants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Enfants</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Dossier#getListEnfants()
	 * @see #getDossier()
	 * @generated
	 */
	EReference getDossier_ListEnfants();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Fichier
	 * @generated
	 */
	EClass getFichier();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.RessourcesDistante <em>Ressources Distante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources Distante</em>'.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesDistante
	 * @generated
	 */
	EClass getRessourcesDistante();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Page#getTitrePage <em>Titre Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre Page</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Page#getTitrePage()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TitrePage();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Page#getTaillePage <em>Taille Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Page</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Page#getTaillePage()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TaillePage();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Page#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Page#getURL()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_URL();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale <em>Ressources Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources Locale</em>'.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale
	 * @generated
	 */
	EClass getRessourcesLocale();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale#getPermission()
	 * @see #getRessourcesLocale()
	 * @generated
	 */
	EAttribute getRessourcesLocale_Permission();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale#getCheminAbsolu <em>Chemin Absolu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin Absolu</em>'.
	 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale#getCheminAbsolu()
	 * @see #getRessourcesLocale()
	 * @generated
	 */
	EAttribute getRessourcesLocale_CheminAbsolu();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Ressource#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Ressource#getNom()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Ressource#getTailleOctet <em>Taille Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Octet</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Ressource#getTailleOctet()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_TailleOctet();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.Ressource#accept(ca.polymtl.log8430.model.TP2.AbstractCommand) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.Ressource#accept(ca.polymtl.log8430.model.TP2.AbstractCommand)
	 * @generated
	 */
	EOperation getRessource__Accept__AbstractCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.AbstractCommand <em>Abstract Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand
	 * @generated
	 */
	EClass getAbstractCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getCommandName <em>Command Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Name</em>'.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#getCommandName()
	 * @see #getAbstractCommand()
	 * @generated
	 */
	EAttribute getAbstractCommand_CommandName();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#getResult()
	 * @see #getAbstractCommand()
	 * @generated
	 */
	EAttribute getAbstractCommand_Result();

	/**
	 * Returns the meta object for the reference '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ressource</em>'.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#getRessource()
	 * @see #getAbstractCommand()
	 * @generated
	 */
	EReference getAbstractCommand_Ressource();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#execute()
	 * @generated
	 */
	EOperation getAbstractCommand__Execute();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#clear()
	 * @generated
	 */
	EOperation getAbstractCommand__Clear();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#canExecute() <em>Can Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Execute</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#canExecute()
	 * @generated
	 */
	EOperation getAbstractCommand__CanExecute();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Fichier) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Fichier)
	 * @generated
	 */
	EOperation getAbstractCommand__Visit__Fichier();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Dossier) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Dossier)
	 * @generated
	 */
	EOperation getAbstractCommand__Visit__Dossier();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Page) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.AbstractCommand#visit(ca.polymtl.log8430.model.TP2.Page)
	 * @generated
	 */
	EOperation getAbstractCommand__Visit__Page();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Master
	 * @generated
	 */
	EClass getMaster();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.polymtl.log8430.model.TP2.Master#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Master#getCommands()
	 * @see #getMaster()
	 * @generated
	 */
	EReference getMaster_Commands();

	/**
	 * Returns the meta object for the attribute '{@link ca.polymtl.log8430.model.TP2.Master#isAutoRun <em>Auto Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Run</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Master#isAutoRun()
	 * @see #getMaster()
	 * @generated
	 */
	EAttribute getMaster_AutoRun();

	/**
	 * Returns the meta object for the containment reference '{@link ca.polymtl.log8430.model.TP2.Master#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see ca.polymtl.log8430.model.TP2.Master#getRessource()
	 * @see #getMaster()
	 * @generated
	 */
	EReference getMaster_Ressource();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.Master#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.Master#clear()
	 * @generated
	 */
	EOperation getMaster__Clear();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.Master#executeAll() <em>Execute All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute All</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.Master#executeAll()
	 * @generated
	 */
	EOperation getMaster__ExecuteAll();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.Master#executeCommand(ca.polymtl.log8430.model.TP2.AbstractCommand) <em>Execute Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Command</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.Master#executeCommand(ca.polymtl.log8430.model.TP2.AbstractCommand)
	 * @generated
	 */
	EOperation getMaster__ExecuteCommand__AbstractCommand();

	/**
	 * Returns the meta object for the '{@link ca.polymtl.log8430.model.TP2.Master#updateRessource(ca.polymtl.log8430.model.TP2.Ressource) <em>Update Ressource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Ressource</em>' operation.
	 * @see ca.polymtl.log8430.model.TP2.Master#updateRessource(ca.polymtl.log8430.model.TP2.Ressource)
	 * @generated
	 */
	EOperation getMaster__UpdateRessource__Ressource();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.FileNameCommand <em>File Name Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Name Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.FileNameCommand
	 * @generated
	 */
	EClass getFileNameCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.FolderNameCommand <em>Folder Name Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Name Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.FolderNameCommand
	 * @generated
	 */
	EClass getFolderNameCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.AbsolutePathCommand <em>Absolute Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Path Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.AbsolutePathCommand
	 * @generated
	 */
	EClass getAbsolutePathCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.PermissionCommand <em>Permission Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.PermissionCommand
	 * @generated
	 */
	EClass getPermissionCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.NbEnfantCommand <em>Nb Enfant Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nb Enfant Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.NbEnfantCommand
	 * @generated
	 */
	EClass getNbEnfantCommand();

	/**
	 * Returns the meta object for class '{@link ca.polymtl.log8430.model.TP2.TailleURLCommand <em>Taille URL Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taille URL Command</em>'.
	 * @see ca.polymtl.log8430.model.TP2.TailleURLCommand
	 * @generated
	 */
	EClass getTailleURLCommand();

	/**
	 * Returns the meta object for enum '{@link ca.polymtl.log8430.model.TP2.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Type</em>'.
	 * @see ca.polymtl.log8430.model.TP2.PermissionType
	 * @generated
	 */
	EEnum getPermissionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TP2Factory getTP2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.DossierImpl <em>Dossier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.DossierImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getDossier()
		 * @generated
		 */
		EClass DOSSIER = eINSTANCE.getDossier();

		/**
		 * The meta object literal for the '<em><b>Nombre Enfant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__NOMBRE_ENFANT = eINSTANCE.getDossier_NombreEnfant();

		/**
		 * The meta object literal for the '<em><b>List Enfants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER__LIST_ENFANTS = eINSTANCE.getDossier_ListEnfants();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl <em>Fichier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.FichierImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFichier()
		 * @generated
		 */
		EClass FICHIER = eINSTANCE.getFichier();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.RessourcesDistante <em>Ressources Distante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.RessourcesDistante
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessourcesDistante()
		 * @generated
		 */
		EClass RESSOURCES_DISTANTE = eINSTANCE.getRessourcesDistante();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.PageImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Titre Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITRE_PAGE = eINSTANCE.getPage_TitrePage();

		/**
		 * The meta object literal for the '<em><b>Taille Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TAILLE_PAGE = eINSTANCE.getPage_TaillePage();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URL = eINSTANCE.getPage_URL();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale <em>Ressources Locale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.RessourcesLocale
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessourcesLocale()
		 * @generated
		 */
		EClass RESSOURCES_LOCALE = eINSTANCE.getRessourcesLocale();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCES_LOCALE__PERMISSION = eINSTANCE.getRessourcesLocale_Permission();

		/**
		 * The meta object literal for the '<em><b>Chemin Absolu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCES_LOCALE__CHEMIN_ABSOLU = eINSTANCE.getRessourcesLocale_CheminAbsolu();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.Ressource <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.Ressource
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NOM = eINSTANCE.getRessource_Nom();

		/**
		 * The meta object literal for the '<em><b>Taille Octet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__TAILLE_OCTET = eINSTANCE.getRessource_TailleOctet();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___ACCEPT__ABSTRACTCOMMAND = eINSTANCE.getRessource__Accept__AbstractCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand <em>Abstract Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.AbstractCommand
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getAbstractCommand()
		 * @generated
		 */
		EClass ABSTRACT_COMMAND = eINSTANCE.getAbstractCommand();

		/**
		 * The meta object literal for the '<em><b>Command Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMAND__COMMAND_NAME = eINSTANCE.getAbstractCommand_CommandName();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMAND__RESULT = eINSTANCE.getAbstractCommand_Result();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMAND__RESSOURCE = eINSTANCE.getAbstractCommand_Ressource();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___EXECUTE = eINSTANCE.getAbstractCommand__Execute();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___CLEAR = eINSTANCE.getAbstractCommand__Clear();

		/**
		 * The meta object literal for the '<em><b>Can Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___CAN_EXECUTE = eINSTANCE.getAbstractCommand__CanExecute();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___VISIT__FICHIER = eINSTANCE.getAbstractCommand__Visit__Fichier();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___VISIT__DOSSIER = eINSTANCE.getAbstractCommand__Visit__Dossier();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_COMMAND___VISIT__PAGE = eINSTANCE.getAbstractCommand__Visit__Page();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.MasterImpl <em>Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.MasterImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getMaster()
		 * @generated
		 */
		EClass MASTER = eINSTANCE.getMaster();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER__COMMANDS = eINSTANCE.getMaster_Commands();

		/**
		 * The meta object literal for the '<em><b>Auto Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER__AUTO_RUN = eINSTANCE.getMaster_AutoRun();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER__RESSOURCE = eINSTANCE.getMaster_Ressource();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTER___CLEAR = eINSTANCE.getMaster__Clear();

		/**
		 * The meta object literal for the '<em><b>Execute All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTER___EXECUTE_ALL = eINSTANCE.getMaster__ExecuteAll();

		/**
		 * The meta object literal for the '<em><b>Execute Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTER___EXECUTE_COMMAND__ABSTRACTCOMMAND = eINSTANCE.getMaster__ExecuteCommand__AbstractCommand();

		/**
		 * The meta object literal for the '<em><b>Update Ressource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASTER___UPDATE_RESSOURCE__RESSOURCE = eINSTANCE.getMaster__UpdateRessource__Ressource();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.FileNameCommandImpl <em>File Name Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.FileNameCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFileNameCommand()
		 * @generated
		 */
		EClass FILE_NAME_COMMAND = eINSTANCE.getFileNameCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl <em>Folder Name Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getFolderNameCommand()
		 * @generated
		 */
		EClass FOLDER_NAME_COMMAND = eINSTANCE.getFolderNameCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.AbsolutePathCommandImpl <em>Absolute Path Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.AbsolutePathCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getAbsolutePathCommand()
		 * @generated
		 */
		EClass ABSOLUTE_PATH_COMMAND = eINSTANCE.getAbsolutePathCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.PermissionCommandImpl <em>Permission Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.PermissionCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPermissionCommand()
		 * @generated
		 */
		EClass PERMISSION_COMMAND = eINSTANCE.getPermissionCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.NbEnfantCommandImpl <em>Nb Enfant Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.NbEnfantCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getNbEnfantCommand()
		 * @generated
		 */
		EClass NB_ENFANT_COMMAND = eINSTANCE.getNbEnfantCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.impl.TailleURLCommandImpl <em>Taille URL Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.impl.TailleURLCommandImpl
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getTailleURLCommand()
		 * @generated
		 */
		EClass TAILLE_URL_COMMAND = eINSTANCE.getTailleURLCommand();

		/**
		 * The meta object literal for the '{@link ca.polymtl.log8430.model.TP2.PermissionType <em>Permission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.polymtl.log8430.model.TP2.PermissionType
		 * @see ca.polymtl.log8430.model.TP2.impl.TP2PackageImpl#getPermissionType()
		 * @generated
		 */
		EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

	}

} //TP2Package
