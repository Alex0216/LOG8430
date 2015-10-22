/**
 */
package lOG8430_TP2.impl;

import lOG8430_TP2.LOG8430_TP2Package;
import lOG8430_TP2.PermissionType;
import lOG8430_TP2.RessourcesLocales;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressources Locales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lOG8430_TP2.impl.RessourcesLocalesImpl#getMyPermissionMap <em>My Permission Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RessourcesLocalesImpl extends RessourcesImpl implements RessourcesLocales {
	/**
	 * The cached value of the '{@link #getMyPermissionMap() <em>My Permission Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyPermissionMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, PermissionType> myPermissionMap;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourcesLocalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LOG8430_TP2Package.Literals.RESSOURCES_LOCALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, PermissionType> getMyPermissionMap() {
		if (myPermissionMap == null) {
			myPermissionMap = new EcoreEMap<String,PermissionType>(LOG8430_TP2Package.Literals.PERMISSION_MAP, permissionMapImpl.class, this, LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP);
		}
		return myPermissionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP:
				return ((InternalEList<?>)getMyPermissionMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP:
				if (coreType) return getMyPermissionMap();
				else return getMyPermissionMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP:
				((EStructuralFeature.Setting)getMyPermissionMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP:
				getMyPermissionMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LOG8430_TP2Package.RESSOURCES_LOCALES__MY_PERMISSION_MAP:
				return myPermissionMap != null && !myPermissionMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RessourcesLocalesImpl
