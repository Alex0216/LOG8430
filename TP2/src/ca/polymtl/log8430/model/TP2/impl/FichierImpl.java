/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.PermissionType;
import ca.polymtl.log8430.model.TP2.RessourceVisitor;
import ca.polymtl.log8430.model.TP2.TP2Package;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getTailleFichierOctet <em>Taille Fichier Octet</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichierImpl extends MinimalEObjectImpl.Container implements Fichier {
	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionType PERMISSION_EDEFAULT = PermissionType.READ;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected PermissionType permission = PERMISSION_EDEFAULT;

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
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
		return TP2Package.Literals.FICHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(PermissionType newPermission) {
		PermissionType oldPermission = permission;
		permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FICHIER__PERMISSION, oldPermission, permission));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FICHIER__TAILLE_FICHIER_OCTET, oldTailleFichierOctet, tailleFichierOctet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FICHIER__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final RessourceVisitor commandVisitor) {
		commandVisitor.visit(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2Package.FICHIER__PERMISSION:
				return getPermission();
			case TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				return getTailleFichierOctet();
			case TP2Package.FICHIER__NOM:
				return getNom();
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
			case TP2Package.FICHIER__PERMISSION:
				setPermission((PermissionType)newValue);
				return;
			case TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				setTailleFichierOctet((Integer)newValue);
				return;
			case TP2Package.FICHIER__NOM:
				setNom((String)newValue);
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
			case TP2Package.FICHIER__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
			case TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				setTailleFichierOctet(TAILLE_FICHIER_OCTET_EDEFAULT);
				return;
			case TP2Package.FICHIER__NOM:
				setNom(NOM_EDEFAULT);
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
			case TP2Package.FICHIER__PERMISSION:
				return permission != PERMISSION_EDEFAULT;
			case TP2Package.FICHIER__TAILLE_FICHIER_OCTET:
				return tailleFichierOctet != TAILLE_FICHIER_OCTET_EDEFAULT;
			case TP2Package.FICHIER__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TP2Package.FICHIER___ACCEPT__ABSTRACTCOMMAND:
				accept((RessourceVisitor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (permission: ");
		result.append(permission);
		result.append(", tailleFichierOctet: ");
		result.append(tailleFichierOctet);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //FichierImpl