/**
 */
package lOG8430_TP2.impl;

import java.util.Map;
import lOG8430_TP2.*;
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
public class LOG8430_TP2FactoryImpl extends EFactoryImpl implements LOG8430_TP2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LOG8430_TP2Factory init() {
		try {
			LOG8430_TP2Factory theLOG8430_TP2Factory = (LOG8430_TP2Factory)EPackage.Registry.INSTANCE.getEFactory(LOG8430_TP2Package.eNS_URI);
			if (theLOG8430_TP2Factory != null) {
				return theLOG8430_TP2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LOG8430_TP2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOG8430_TP2FactoryImpl() {
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
			case LOG8430_TP2Package.FICHIER: return createFichier();
			case LOG8430_TP2Package.PAGE: return createPage();
			case LOG8430_TP2Package.DOSSIER: return createDossier();
			case LOG8430_TP2Package.RESSOURCES: return createRessources();
			case LOG8430_TP2Package.RESSOURCES_DISTANTES: return createRessourcesDistantes();
			case LOG8430_TP2Package.PERMISSION_MAP: return (EObject)createpermissionMap();
			case LOG8430_TP2Package.RESSOURCES_LOCALES: return createRessourcesLocales();
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
			case LOG8430_TP2Package.PERMISSION_TYPE:
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
			case LOG8430_TP2Package.PERMISSION_TYPE:
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
	public Dossier createDossier() {
		DossierImpl dossier = new DossierImpl();
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressources createRessources() {
		RessourcesImpl ressources = new RessourcesImpl();
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcesDistantes createRessourcesDistantes() {
		RessourcesDistantesImpl ressourcesDistantes = new RessourcesDistantesImpl();
		return ressourcesDistantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, PermissionType> createpermissionMap() {
		permissionMapImpl permissionMap = new permissionMapImpl();
		return permissionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcesLocales createRessourcesLocales() {
		RessourcesLocalesImpl ressourcesLocales = new RessourcesLocalesImpl();
		return ressourcesLocales;
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
	public LOG8430_TP2Package getLOG8430_TP2Package() {
		return (LOG8430_TP2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LOG8430_TP2Package getPackage() {
		return LOG8430_TP2Package.eINSTANCE;
	}

} //LOG8430_TP2FactoryImpl
