/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.AbsolutePathCommand;
import ca.polymtl.log8430.model.TP2.AbstractCommand;
import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.FileNameCommand;
import ca.polymtl.log8430.model.TP2.FolderNameCommand;
import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.NbEnfantCommand;
import ca.polymtl.log8430.model.TP2.Page;
import ca.polymtl.log8430.model.TP2.PermissionCommand;
import ca.polymtl.log8430.model.TP2.PermissionType;
import ca.polymtl.log8430.model.TP2.Ressource;
import ca.polymtl.log8430.model.TP2.RessourcesDistante;
import ca.polymtl.log8430.model.TP2.RessourcesLocale;
import ca.polymtl.log8430.model.TP2.TP2Factory;
import ca.polymtl.log8430.model.TP2.TP2Package;
import ca.polymtl.log8430.model.TP2.TailleURLCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TP2PackageImpl extends EPackageImpl implements TP2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourcesDistanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourcesLocaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNameCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderNameCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absolutePathCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nbEnfantCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tailleURLCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TP2PackageImpl() {
		super(eNS_URI, TP2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TP2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TP2Package init() {
		if (isInited) return (TP2Package)EPackage.Registry.INSTANCE.getEPackage(TP2Package.eNS_URI);

		// Obtain or create and register package
		TP2PackageImpl theTP2Package = (TP2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TP2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TP2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTP2Package.createPackageContents();

		// Initialize created meta-data
		theTP2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTP2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TP2Package.eNS_URI, theTP2Package);
		return theTP2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossier() {
		return dossierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_NombreEnfant() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossier_ListEnfants() {
		return (EReference)dossierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichier() {
		return fichierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourcesDistante() {
		return ressourcesDistanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TitrePage() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TaillePage() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_URL() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourcesLocale() {
		return ressourcesLocaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessourcesLocale_Permission() {
		return (EAttribute)ressourcesLocaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessourcesLocale_CheminAbsolu() {
		return (EAttribute)ressourcesLocaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Nom() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_TailleOctet() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__Accept__AbstractCommand() {
		return ressourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCommand() {
		return abstractCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCommand_CommandName() {
		return (EAttribute)abstractCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCommand_Result() {
		return (EAttribute)abstractCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCommand_Ressource() {
		return (EReference)abstractCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__Execute() {
		return abstractCommandEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__Clear() {
		return abstractCommandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__CanExecute() {
		return abstractCommandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__Visit__Fichier() {
		return abstractCommandEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__Visit__Dossier() {
		return abstractCommandEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCommand__Visit__Page() {
		return abstractCommandEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaster() {
		return masterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaster_Commands() {
		return (EReference)masterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaster_AutoRun() {
		return (EAttribute)masterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaster_Ressource() {
		return (EReference)masterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaster__Clear() {
		return masterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaster__ExecuteAll() {
		return masterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaster__ExecuteCommand__AbstractCommand() {
		return masterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaster__UpdateRessource__Ressource() {
		return masterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileNameCommand() {
		return fileNameCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderNameCommand() {
		return folderNameCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsolutePathCommand() {
		return absolutePathCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissionCommand() {
		return permissionCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNbEnfantCommand() {
		return nbEnfantCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTailleURLCommand() {
		return tailleURLCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissionType() {
		return permissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP2Factory getTP2Factory() {
		return (TP2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dossierEClass = createEClass(DOSSIER);
		createEAttribute(dossierEClass, DOSSIER__NOMBRE_ENFANT);
		createEReference(dossierEClass, DOSSIER__LIST_ENFANTS);

		fichierEClass = createEClass(FICHIER);

		ressourcesDistanteEClass = createEClass(RESSOURCES_DISTANTE);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TITRE_PAGE);
		createEAttribute(pageEClass, PAGE__TAILLE_PAGE);
		createEAttribute(pageEClass, PAGE__URL);

		ressourcesLocaleEClass = createEClass(RESSOURCES_LOCALE);
		createEAttribute(ressourcesLocaleEClass, RESSOURCES_LOCALE__PERMISSION);
		createEAttribute(ressourcesLocaleEClass, RESSOURCES_LOCALE__CHEMIN_ABSOLU);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__NOM);
		createEAttribute(ressourceEClass, RESSOURCE__TAILLE_OCTET);
		createEOperation(ressourceEClass, RESSOURCE___ACCEPT__ABSTRACTCOMMAND);

		abstractCommandEClass = createEClass(ABSTRACT_COMMAND);
		createEAttribute(abstractCommandEClass, ABSTRACT_COMMAND__COMMAND_NAME);
		createEAttribute(abstractCommandEClass, ABSTRACT_COMMAND__RESULT);
		createEReference(abstractCommandEClass, ABSTRACT_COMMAND__RESSOURCE);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___CLEAR);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___CAN_EXECUTE);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___VISIT__FICHIER);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___VISIT__DOSSIER);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___VISIT__PAGE);
		createEOperation(abstractCommandEClass, ABSTRACT_COMMAND___EXECUTE);

		masterEClass = createEClass(MASTER);
		createEReference(masterEClass, MASTER__COMMANDS);
		createEAttribute(masterEClass, MASTER__AUTO_RUN);
		createEReference(masterEClass, MASTER__RESSOURCE);
		createEOperation(masterEClass, MASTER___CLEAR);
		createEOperation(masterEClass, MASTER___EXECUTE_ALL);
		createEOperation(masterEClass, MASTER___EXECUTE_COMMAND__ABSTRACTCOMMAND);
		createEOperation(masterEClass, MASTER___UPDATE_RESSOURCE__RESSOURCE);

		fileNameCommandEClass = createEClass(FILE_NAME_COMMAND);

		folderNameCommandEClass = createEClass(FOLDER_NAME_COMMAND);

		absolutePathCommandEClass = createEClass(ABSOLUTE_PATH_COMMAND);

		tailleURLCommandEClass = createEClass(TAILLE_URL_COMMAND);

		permissionCommandEClass = createEClass(PERMISSION_COMMAND);

		nbEnfantCommandEClass = createEClass(NB_ENFANT_COMMAND);

		// Create enums
		permissionTypeEEnum = createEEnum(PERMISSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dossierEClass.getESuperTypes().add(this.getRessourcesLocale());
		fichierEClass.getESuperTypes().add(this.getRessourcesLocale());
		ressourcesDistanteEClass.getESuperTypes().add(this.getRessource());
		pageEClass.getESuperTypes().add(this.getRessourcesDistante());
		ressourcesLocaleEClass.getESuperTypes().add(this.getRessource());
		fileNameCommandEClass.getESuperTypes().add(this.getAbstractCommand());
		folderNameCommandEClass.getESuperTypes().add(this.getAbstractCommand());
		absolutePathCommandEClass.getESuperTypes().add(this.getAbstractCommand());
		tailleURLCommandEClass.getESuperTypes().add(this.getAbstractCommand());
		permissionCommandEClass.getESuperTypes().add(this.getAbstractCommand());
		nbEnfantCommandEClass.getESuperTypes().add(this.getAbstractCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(dossierEClass, Dossier.class, "Dossier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDossier_NombreEnfant(), ecorePackage.getEInt(), "nombreEnfant", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDossier_ListEnfants(), this.getRessourcesLocale(), null, "ListEnfants", null, 0, -1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fichierEClass, Fichier.class, "Fichier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ressourcesDistanteEClass, RessourcesDistante.class, "RessourcesDistante", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_TitrePage(), ecorePackage.getEString(), "titrePage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TaillePage(), ecorePackage.getEInt(), "taillePage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_URL(), ecorePackage.getEString(), "URL", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourcesLocaleEClass, RessourcesLocale.class, "RessourcesLocale", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessourcesLocale_Permission(), this.getPermissionType(), "permission", null, 0, 1, RessourcesLocale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessourcesLocale_CheminAbsolu(), ecorePackage.getEString(), "cheminAbsolu", null, 0, 1, RessourcesLocale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_TailleOctet(), ecorePackage.getELong(), "tailleOctet", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRessource__Accept__AbstractCommand(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractCommand(), "commandVisitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractCommandEClass, AbstractCommand.class, "AbstractCommand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCommand_CommandName(), ecorePackage.getEString(), "commandName", null, 0, 1, AbstractCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCommand_Result(), ecorePackage.getEString(), "result", null, 0, 1, AbstractCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCommand_Ressource(), this.getRessource(), null, "ressource", null, 0, 1, AbstractCommand.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractCommand__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractCommand__CanExecute(), ecorePackage.getEBoolean(), "canExecute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractCommand__Visit__Fichier(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFichier(), "fichier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractCommand__Visit__Dossier(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDossier(), "dossier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractCommand__Visit__Page(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPage(), "page", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractCommand__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(masterEClass, Master.class, "Master", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaster_Commands(), this.getAbstractCommand(), null, "commands", null, 0, -1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaster_AutoRun(), ecorePackage.getEBoolean(), "AutoRun", null, 0, 1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaster_Ressource(), this.getRessource(), null, "ressource", null, 0, 1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMaster__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMaster__ExecuteAll(), null, "executeAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMaster__ExecuteCommand__AbstractCommand(), null, "executeCommand", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAbstractCommand(), "command", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMaster__UpdateRessource__Ressource(), null, "updateRessource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRessource(), "ressource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileNameCommandEClass, FileNameCommand.class, "FileNameCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(folderNameCommandEClass, FolderNameCommand.class, "FolderNameCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absolutePathCommandEClass, AbsolutePathCommand.class, "AbsolutePathCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tailleURLCommandEClass, TailleURLCommand.class, "TailleURLCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permissionCommandEClass, PermissionCommand.class, "PermissionCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nbEnfantCommandEClass, NbEnfantCommand.class, "NbEnfantCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ_AND_WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.NONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (getDossier_ListEnfants(), 
		   source, 
		   new String[] {
			 "name", "ListEnfants",
			 "kind", "attribute"
		   });																										
	}

} //TP2PackageImpl
