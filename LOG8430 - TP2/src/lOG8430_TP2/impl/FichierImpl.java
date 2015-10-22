/**
 */
package lOG8430_TP2.impl;

import lOG8430_TP2.Fichier;
import lOG8430_TP2.LOG8430_TP2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lOG8430_TP2.impl.FichierImpl#getNomFichier <em>Nom Fichier</em>}</li>
 *   <li>{@link lOG8430_TP2.impl.FichierImpl#getTailleFichierOctet <em>Taille Fichier Octet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichierImpl extends RessourcesLocalesImpl implements Fichier {
	/**
	 * The default value of the '{@link #getNomFichier() <em>Nom Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFichier()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_FICHIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomFichier() <em>Nom Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFichier()
	 * @generated
	 * @ordered
	 */
	protected String nomFichier = NOM_FICHIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTailleFichierOctet() <em>Taille Fichier Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleFichierOctet()
	 * @generated
	 * @ordered
	 */
	protected static final int TAILLE_FICHIER_OCTET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTailleFichierOctet() <em>Taille Fichier Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleFichierOctet()
	 * @generated
	 * @ordered
	 */
	protected int tailleFichierOctet = TAILLE_FICHIER_OCTET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LOG8430_TP2Package.Literals.FICHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomFichier() {
		return nomFichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomFichier(String newNomFichier) {
		String oldNomFichier = nomFichier;
		nomFichier = newNomFichier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.FICHIER__NOM_FICHIER, oldNomFichier, nomFichier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTailleFichierOctet() {
		return tailleFichierOctet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleFichierOctet(int newTailleFichierOctet) {
		int oldTailleFichierOctet = tailleFichierOctet;
		tailleFichierOctet = newTailleFichierOctet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.FICHIER__TAILLE_FICHIER_OCTET, oldTailleFichierOctet, tailleFichierOctet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LOG8430_TP2Package.FICHIER__NOM_FICHIER:
				return getNomFichier();
			case LOG8430_TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				return getTailleFichierOctet();
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
			case LOG8430_TP2Package.FICHIER__NOM_FICHIER:
				setNomFichier((String)newValue);
				return;
			case LOG8430_TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				setTailleFichierOctet((Integer)newValue);
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
			case LOG8430_TP2Package.FICHIER__NOM_FICHIER:
				setNomFichier(NOM_FICHIER_EDEFAULT);
				return;
			case LOG8430_TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				setTailleFichierOctet(TAILLE_FICHIER_OCTET_EDEFAULT);
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
			case LOG8430_TP2Package.FICHIER__NOM_FICHIER:
				return NOM_FICHIER_EDEFAULT == null ? nomFichier != null : !NOM_FICHIER_EDEFAULT.equals(nomFichier);
			case LOG8430_TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				return tailleFichierOctet != TAILLE_FICHIER_OCTET_EDEFAULT;
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
		result.append(" (nomFichier: ");
		result.append(nomFichier);
		result.append(", tailleFichierOctet: ");
		result.append(tailleFichierOctet);
		result.append(')');
		return result.toString();
	}

} //FichierImpl
