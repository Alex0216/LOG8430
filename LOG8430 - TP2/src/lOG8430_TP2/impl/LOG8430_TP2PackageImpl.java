/**
 */
package lOG8430_TP2.impl;

import java.util.Map;
import lOG8430_TP2.Dossier;
import lOG8430_TP2.Fichier;
import lOG8430_TP2.LOG8430_TP2Factory;
import lOG8430_TP2.LOG8430_TP2Package;
import lOG8430_TP2.Page;
import lOG8430_TP2.PermissionType;
import lOG8430_TP2.Ressources;
import lOG8430_TP2.RessourcesDistantes;
import lOG8430_TP2.RessourcesLocales;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LOG8430_TP2PackageImpl extends EPackageImpl implements LOG8430_TP2Package {
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
	private EClass pageEClass = null;

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
	private EClass ressourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourcesDistantesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourcesLocalesEClass = null;

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
	 * @see lOG8430_TP2.LOG8430_TP2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LOG8430_TP2PackageImpl() {
		super(eNS_URI, LOG8430_TP2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LOG8430_TP2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LOG8430_TP2Package init() {
		if (isInited) return (LOG8430_TP2Package)EPackage.Registry.INSTANCE.getEPackage(LOG8430_TP2Package.eNS_URI);

		// Obtain or create and register package
		LOG8430_TP2PackageImpl theLOG8430_TP2Package = (LOG8430_TP2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LOG8430_TP2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LOG8430_TP2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLOG8430_TP2Package.createPackageContents();

		// Initialize created meta-data
		theLOG8430_TP2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLOG8430_TP2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LOG8430_TP2Package.eNS_URI, theLOG8430_TP2Package);
		return theLOG8430_TP2Package;
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
	public EAttribute getFichier_NomFichier() {
		return (EAttribute)fichierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichier_TailleFichierOctet() {
		return (EAttribute)fichierEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPage_NomPage() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TitrePage() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TaillePage() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDossier_NomDossier() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessources() {
		return ressourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourcesDistantes() {
		return ressourcesDistantesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpermissionMap() {
		return permissionMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpermissionMap_Key() {
		return (EAttribute)permissionMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpermissionMap_Value() {
		return (EAttribute)permissionMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourcesLocales() {
		return ressourcesLocalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessourcesLocales_MyPermissionMap() {
		return (EReference)ressourcesLocalesEClass.getEStructuralFeatures().get(0);
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
	public LOG8430_TP2Factory getLOG8430_TP2Factory() {
		return (LOG8430_TP2Factory)getEFactoryInstance();
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
		fichierEClass = createEClass(FICHIER);
		createEAttribute(fichierEClass, FICHIER__NOM_FICHIER);
		createEAttribute(fichierEClass, FICHIER__TAILLE_FICHIER_OCTET);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NOM_PAGE);
		createEAttribute(pageEClass, PAGE__TITRE_PAGE);
		createEAttribute(pageEClass, PAGE__TAILLE_PAGE);

		dossierEClass = createEClass(DOSSIER);
		createEAttribute(dossierEClass, DOSSIER__NOM_DOSSIER);

		ressourcesEClass = createEClass(RESSOURCES);

		ressourcesDistantesEClass = createEClass(RESSOURCES_DISTANTES);

		permissionMapEClass = createEClass(PERMISSION_MAP);
		createEAttribute(permissionMapEClass, PERMISSION_MAP__KEY);
		createEAttribute(permissionMapEClass, PERMISSION_MAP__VALUE);

		ressourcesLocalesEClass = createEClass(RESSOURCES_LOCALES);
		createEReference(ressourcesLocalesEClass, RESSOURCES_LOCALES__MY_PERMISSION_MAP);

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
		fichierEClass.getESuperTypes().add(this.getRessourcesLocales());
		pageEClass.getESuperTypes().add(this.getRessourcesDistantes());
		dossierEClass.getESuperTypes().add(this.getRessourcesLocales());
		ressourcesDistantesEClass.getESuperTypes().add(this.getRessources());
		ressourcesLocalesEClass.getESuperTypes().add(this.getRessources());

		// Initialize classes, features, and operations; add parameters
		initEClass(fichierEClass, Fichier.class, "Fichier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichier_NomFichier(), ecorePackage.getEString(), "nomFichier", null, 0, 1, Fichier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichier_TailleFichierOctet(), ecorePackage.getEInt(), "tailleFichierOctet", null, 0, 1, Fichier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_NomPage(), ecorePackage.getEString(), "nomPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TitrePage(), ecorePackage.getEString(), "titrePage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TaillePage(), ecorePackage.getEInt(), "taillePage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dossierEClass, Dossier.class, "Dossier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDossier_NomDossier(), ecorePackage.getEString(), "nomDossier", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourcesEClass, Ressources.class, "Ressources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ressourcesDistantesEClass, RessourcesDistantes.class, "RessourcesDistantes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permissionMapEClass, Map.Entry.class, "permissionMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpermissionMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getpermissionMap_Value(), this.getPermissionType(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourcesLocalesEClass, RessourcesLocales.class, "RessourcesLocales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRessourcesLocales_MyPermissionMap(), this.getpermissionMap(), null, "myPermissionMap", null, 0, -1, RessourcesLocales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ_AND_WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //LOG8430_TP2PackageImpl
