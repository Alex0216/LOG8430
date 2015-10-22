/**
 */
package lOG8430_TP2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see lOG8430_TP2.LOG8430_TP2Factory
 * @model kind="package"
 * @generated
 */
public interface LOG8430_TP2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lOG8430_TP2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lOG8430_TP2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lOG8430_TP2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LOG8430_TP2Package eINSTANCE = lOG8430_TP2.impl.LOG8430_TP2PackageImpl.init();

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.RessourcesImpl <em>Ressources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.RessourcesImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessources()
	 * @generated
	 */
	int RESSOURCES = 3;

	/**
	 * The number of structural features of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.RessourcesLocalesImpl <em>Ressources Locales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.RessourcesLocalesImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessourcesLocales()
	 * @generated
	 */
	int RESSOURCES_LOCALES = 6;

	/**
	 * The feature id for the '<em><b>My Permission Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALES__MY_PERMISSION_MAP = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ressources Locales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALES_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ressources Locales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_LOCALES_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.FichierImpl <em>Fichier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.FichierImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getFichier()
	 * @generated
	 */
	int FICHIER = 0;

	/**
	 * The feature id for the '<em><b>My Permission Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__MY_PERMISSION_MAP = RESSOURCES_LOCALES__MY_PERMISSION_MAP;

	/**
	 * The feature id for the '<em><b>Nom Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__NOM_FICHIER = RESSOURCES_LOCALES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Taille Fichier Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__TAILLE_FICHIER_OCTET = RESSOURCES_LOCALES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_FEATURE_COUNT = RESSOURCES_LOCALES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_OPERATION_COUNT = RESSOURCES_LOCALES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.RessourcesDistantesImpl <em>Ressources Distantes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.RessourcesDistantesImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessourcesDistantes()
	 * @generated
	 */
	int RESSOURCES_DISTANTES = 4;

	/**
	 * The number of structural features of the '<em>Ressources Distantes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTES_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ressources Distantes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_DISTANTES_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.PageImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Nom Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NOM_PAGE = RESSOURCES_DISTANTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Titre Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITRE_PAGE = RESSOURCES_DISTANTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Taille Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TAILLE_PAGE = RESSOURCES_DISTANTES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = RESSOURCES_DISTANTES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = RESSOURCES_DISTANTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.DossierImpl <em>Dossier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.DossierImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getDossier()
	 * @generated
	 */
	int DOSSIER = 2;

	/**
	 * The feature id for the '<em><b>My Permission Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__MY_PERMISSION_MAP = RESSOURCES_LOCALES__MY_PERMISSION_MAP;

	/**
	 * The feature id for the '<em><b>Nom Dossier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__NOM_DOSSIER = RESSOURCES_LOCALES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_FEATURE_COUNT = RESSOURCES_LOCALES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_OPERATION_COUNT = RESSOURCES_LOCALES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.impl.permissionMapImpl <em>permission Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.impl.permissionMapImpl
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getpermissionMap()
	 * @generated
	 */
	int PERMISSION_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>permission Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>permission Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lOG8430_TP2.PermissionType <em>Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lOG8430_TP2.PermissionType
	 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier</em>'.
	 * @see lOG8430_TP2.Fichier
	 * @generated
	 */
	EClass getFichier();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Fichier#getNomFichier <em>Nom Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Fichier</em>'.
	 * @see lOG8430_TP2.Fichier#getNomFichier()
	 * @see #getFichier()
	 * @generated
	 */
	EAttribute getFichier_NomFichier();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Fichier#getTailleFichierOctet <em>Taille Fichier Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Fichier Octet</em>'.
	 * @see lOG8430_TP2.Fichier#getTailleFichierOctet()
	 * @see #getFichier()
	 * @generated
	 */
	EAttribute getFichier_TailleFichierOctet();

	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see lOG8430_TP2.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Page#getNomPage <em>Nom Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Page</em>'.
	 * @see lOG8430_TP2.Page#getNomPage()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_NomPage();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Page#getTitrePage <em>Titre Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre Page</em>'.
	 * @see lOG8430_TP2.Page#getTitrePage()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TitrePage();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Page#getTaillePage <em>Taille Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Page</em>'.
	 * @see lOG8430_TP2.Page#getTaillePage()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TaillePage();

	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier</em>'.
	 * @see lOG8430_TP2.Dossier
	 * @generated
	 */
	EClass getDossier();

	/**
	 * Returns the meta object for the attribute '{@link lOG8430_TP2.Dossier#getNomDossier <em>Nom Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Dossier</em>'.
	 * @see lOG8430_TP2.Dossier#getNomDossier()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_NomDossier();

	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources</em>'.
	 * @see lOG8430_TP2.Ressources
	 * @generated
	 */
	EClass getRessources();

	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.RessourcesDistantes <em>Ressources Distantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources Distantes</em>'.
	 * @see lOG8430_TP2.RessourcesDistantes
	 * @generated
	 */
	EClass getRessourcesDistantes();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>permission Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>permission Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="lOG8430_TP2.PermissionType"
	 * @generated
	 */
	EClass getpermissionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getpermissionMap()
	 * @generated
	 */
	EAttribute getpermissionMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getpermissionMap()
	 * @generated
	 */
	EAttribute getpermissionMap_Value();

	/**
	 * Returns the meta object for class '{@link lOG8430_TP2.RessourcesLocales <em>Ressources Locales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources Locales</em>'.
	 * @see lOG8430_TP2.RessourcesLocales
	 * @generated
	 */
	EClass getRessourcesLocales();

	/**
	 * Returns the meta object for the map '{@link lOG8430_TP2.RessourcesLocales#getMyPermissionMap <em>My Permission Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>My Permission Map</em>'.
	 * @see lOG8430_TP2.RessourcesLocales#getMyPermissionMap()
	 * @see #getRessourcesLocales()
	 * @generated
	 */
	EReference getRessourcesLocales_MyPermissionMap();

	/**
	 * Returns the meta object for enum '{@link lOG8430_TP2.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Type</em>'.
	 * @see lOG8430_TP2.PermissionType
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
	LOG8430_TP2Factory getLOG8430_TP2Factory();

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
		 * The meta object literal for the '{@link lOG8430_TP2.impl.FichierImpl <em>Fichier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.FichierImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getFichier()
		 * @generated
		 */
		EClass FICHIER = eINSTANCE.getFichier();

		/**
		 * The meta object literal for the '<em><b>Nom Fichier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER__NOM_FICHIER = eINSTANCE.getFichier_NomFichier();

		/**
		 * The meta object literal for the '<em><b>Taille Fichier Octet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER__TAILLE_FICHIER_OCTET = eINSTANCE.getFichier_TailleFichierOctet();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.PageImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Nom Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NOM_PAGE = eINSTANCE.getPage_NomPage();

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
		 * The meta object literal for the '{@link lOG8430_TP2.impl.DossierImpl <em>Dossier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.DossierImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getDossier()
		 * @generated
		 */
		EClass DOSSIER = eINSTANCE.getDossier();

		/**
		 * The meta object literal for the '<em><b>Nom Dossier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__NOM_DOSSIER = eINSTANCE.getDossier_NomDossier();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.impl.RessourcesImpl <em>Ressources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.RessourcesImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessources()
		 * @generated
		 */
		EClass RESSOURCES = eINSTANCE.getRessources();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.impl.RessourcesDistantesImpl <em>Ressources Distantes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.RessourcesDistantesImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessourcesDistantes()
		 * @generated
		 */
		EClass RESSOURCES_DISTANTES = eINSTANCE.getRessourcesDistantes();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.impl.permissionMapImpl <em>permission Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.permissionMapImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getpermissionMap()
		 * @generated
		 */
		EClass PERMISSION_MAP = eINSTANCE.getpermissionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_MAP__KEY = eINSTANCE.getpermissionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_MAP__VALUE = eINSTANCE.getpermissionMap_Value();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.impl.RessourcesLocalesImpl <em>Ressources Locales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.impl.RessourcesLocalesImpl
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getRessourcesLocales()
		 * @generated
		 */
		EClass RESSOURCES_LOCALES = eINSTANCE.getRessourcesLocales();

		/**
		 * The meta object literal for the '<em><b>My Permission Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCES_LOCALES__MY_PERMISSION_MAP = eINSTANCE.getRessourcesLocales_MyPermissionMap();

		/**
		 * The meta object literal for the '{@link lOG8430_TP2.PermissionType <em>Permission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lOG8430_TP2.PermissionType
		 * @see lOG8430_TP2.impl.LOG8430_TP2PackageImpl#getPermissionType()
		 * @generated
		 */
		EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

	}

} //LOG8430_TP2Package
