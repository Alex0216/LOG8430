/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.Dossier;
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
 * An implementation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.DossierImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.DossierImpl#getNombreEnfant <em>Nombre Enfant</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.DossierImpl#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierImpl extends MinimalEObjectImpl.Container implements Dossier {
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
	 * The default value of the '{@link #getNombreEnfant() <em>Nombre Enfant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfant()
	 * @generated
	 * @ordered
	 */
	protected static final int NOMBRE_ENFANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNombreEnfant() <em>Nombre Enfant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfant()
	 * @generated
	 * @ordered
	 */
	protected int nombreEnfant = NOMBRE_ENFANT_EDEFAULT;

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
		return TP2Package.Literals.DOSSIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.DOSSIER__PERMISSION, oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNombreEnfant() {
		return nombreEnfant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEnfant(int newNombreEnfant) {
		int oldNombreEnfant = nombreEnfant;
		nombreEnfant = newNombreEnfant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.DOSSIER__NOMBRE_ENFANT, oldNombreEnfant, nombreEnfant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.DOSSIER__NOM, oldNom, nom));
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
			case TP2Package.DOSSIER__PERMISSION:
				return getPermission();
			case TP2Package.DOSSIER__NOMBRE_ENFANT:
				return getNombreEnfant();
			case TP2Package.DOSSIER__NOM:
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
			case TP2Package.DOSSIER__PERMISSION:
				setPermission((PermissionType)newValue);
				return;
			case TP2Package.DOSSIER__NOMBRE_ENFANT:
				setNombreEnfant((Integer)newValue);
				return;
			case TP2Package.DOSSIER__NOM:
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
			case TP2Package.DOSSIER__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
			case TP2Package.DOSSIER__NOMBRE_ENFANT:
				setNombreEnfant(NOMBRE_ENFANT_EDEFAULT);
				return;
			case TP2Package.DOSSIER__NOM:
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
			case TP2Package.DOSSIER__PERMISSION:
				return permission != PERMISSION_EDEFAULT;
			case TP2Package.DOSSIER__NOMBRE_ENFANT:
				return nombreEnfant != NOMBRE_ENFANT_EDEFAULT;
			case TP2Package.DOSSIER__NOM:
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
			case TP2Package.DOSSIER___ACCEPT__RESSOURCEVISITOR:
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
		result.append(", nombreEnfant: ");
		result.append(nombreEnfant);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //DossierImpl
