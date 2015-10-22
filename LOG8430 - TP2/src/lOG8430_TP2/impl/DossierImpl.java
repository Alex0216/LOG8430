/**
 */
package lOG8430_TP2.impl;

import lOG8430_TP2.Dossier;
import lOG8430_TP2.LOG8430_TP2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lOG8430_TP2.impl.DossierImpl#getNomDossier <em>Nom Dossier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierImpl extends RessourcesLocalesImpl implements Dossier {
	/**
	 * The default value of the '{@link #getNomDossier() <em>Nom Dossier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDossier()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_DOSSIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomDossier() <em>Nom Dossier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDossier()
	 * @generated
	 * @ordered
	 */
	protected String nomDossier = NOM_DOSSIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DossierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LOG8430_TP2Package.Literals.DOSSIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomDossier() {
		return nomDossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomDossier(String newNomDossier) {
		String oldNomDossier = nomDossier;
		nomDossier = newNomDossier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.DOSSIER__NOM_DOSSIER, oldNomDossier, nomDossier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LOG8430_TP2Package.DOSSIER__NOM_DOSSIER:
				return getNomDossier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LOG8430_TP2Package.DOSSIER__NOM_DOSSIER:
				setNomDossier((String)newValue);
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
			case LOG8430_TP2Package.DOSSIER__NOM_DOSSIER:
				setNomDossier(NOM_DOSSIER_EDEFAULT);
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
			case LOG8430_TP2Package.DOSSIER__NOM_DOSSIER:
				return NOM_DOSSIER_EDEFAULT == null ? nomDossier != null : !NOM_DOSSIER_EDEFAULT.equals(nomDossier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nomDossier: ");
		result.append(nomDossier);
		result.append(')');
		return result.toString();
	}

} //DossierImpl
