/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TP2FactoryImpl extends EFactoryImpl implements TP2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TP2Factory init() {
		try {
			TP2Factory theTP2Factory = (TP2Factory)EPackage.Registry.INSTANCE.getEFactory(TP2Package.eNS_URI);
			if (theTP2Factory != null) {
				return theTP2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TP2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TP2Package.DOSSIER: return createDossier();
			case TP2Package.FICHIER: return createFichier();
			case TP2Package.PAGE: return createPage();
			case TP2Package.MASTER: return createMaster();
			case TP2Package.FILE_NAME_COMMAND: return createFileNameCommand();
			case TP2Package.FOLDER_NAME_COMMAND: return createFolderNameCommand();
			case TP2Package.ABSOLUTE_PATH_COMMAND: return createAbsolutePathCommand();
			case TP2Package.TAILLE_URL_COMMAND: return createTailleURLCommand();
			case TP2Package.PERMISSION_COMMAND: return createPermissionCommand();
			case TP2Package.NB_ENFANT_COMMAND: return createNbEnfantCommand();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TP2Package.PERMISSION_TYPE:
				return createPermissionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TP2Package.PERMISSION_TYPE:
				return convertPermissionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier createDossier() {
		DossierImpl dossier = new DossierImpl();
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichier createFichier() {
		FichierImpl fichier = new FichierImpl();
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Master createMaster() {
		MasterImpl master = new MasterImpl();
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameCommand createFileNameCommand() {
		FileNameCommandImpl fileNameCommand = new FileNameCommandImpl();
		return fileNameCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderNameCommand createFolderNameCommand() {
		FolderNameCommandImpl folderNameCommand = new FolderNameCommandImpl();
		return folderNameCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsolutePathCommand createAbsolutePathCommand() {
		AbsolutePathCommandImpl absolutePathCommand = new AbsolutePathCommandImpl();
		return absolutePathCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionCommand createPermissionCommand() {
		PermissionCommandImpl permissionCommand = new PermissionCommandImpl();
		return permissionCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NbEnfantCommand createNbEnfantCommand() {
		NbEnfantCommandImpl nbEnfantCommand = new NbEnfantCommandImpl();
		return nbEnfantCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TailleURLCommand createTailleURLCommand() {
		TailleURLCommandImpl tailleURLCommand = new TailleURLCommandImpl();
		return tailleURLCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType createPermissionTypeFromString(EDataType eDataType, String initialValue) {
		PermissionType result = PermissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2Package getTP2Package() {
		return (TP2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TP2Package getPackage() {
		return TP2Package.eINSTANCE;
	}

} //TP2FactoryImpl
