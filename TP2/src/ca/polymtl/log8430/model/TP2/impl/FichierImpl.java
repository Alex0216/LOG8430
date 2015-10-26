/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.AbstractCommand;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.PermissionType;
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
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getTailleOctet <em>Taille Octet</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getCheminAbsolu <em>Chemin Absolu</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FichierImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichierImpl extends MinimalEObjectImpl.Container implements Fichier {
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
	 * The default value of the '{@link #getTailleOctet() <em>Taille Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleOctet()
	 * @generated
	 * @ordered
	 */
	protected static final long TAILLE_OCTET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTailleOctet() <em>Taille Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleOctet()
	 * @generated
	 * @ordered
	 */
	protected long tailleOctet = TAILLE_OCTET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheminAbsolu() <em>Chemin Absolu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheminAbsolu()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_ABSOLU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheminAbsolu() <em>Chemin Absolu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheminAbsolu()
	 * @generated
	 * @ordered
	 */
	protected String cheminAbsolu = CHEMIN_ABSOLU_EDEFAULT;

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
	public long getTailleOctet() {
		return tailleOctet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleOctet(long newTailleOctet) {
		long oldTailleOctet = tailleOctet;
		tailleOctet = newTailleOctet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FICHIER__TAILLE_OCTET, oldTailleOctet, tailleOctet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheminAbsolu() {
		return cheminAbsolu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheminAbsolu(String newCheminAbsolu) {
		String oldCheminAbsolu = cheminAbsolu;
		cheminAbsolu = newCheminAbsolu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FICHIER__CHEMIN_ABSOLU, oldCheminAbsolu, cheminAbsolu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AbstractCommand commandVisitor) {
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
			case TP2Package.FICHIER__NOM:
				return getNom();
			case TP2Package.FICHIER__TAILLE_OCTET:
				return getTailleOctet();
			case TP2Package.FICHIER__CHEMIN_ABSOLU:
				return getCheminAbsolu();
			case TP2Package.FICHIER__PERMISSION:
				return getPermission();
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
			case TP2Package.FICHIER__NOM:
				setNom((String)newValue);
				return;
			case TP2Package.FICHIER__TAILLE_OCTET:
				setTailleOctet((Long)newValue);
				return;
			case TP2Package.FICHIER__CHEMIN_ABSOLU:
				setCheminAbsolu((String)newValue);
				return;
			case TP2Package.FICHIER__PERMISSION:
				setPermission((PermissionType)newValue);
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
			case TP2Package.FICHIER__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case TP2Package.FICHIER__TAILLE_OCTET:
				setTailleOctet(TAILLE_OCTET_EDEFAULT);
				return;
			case TP2Package.FICHIER__CHEMIN_ABSOLU:
				setCheminAbsolu(CHEMIN_ABSOLU_EDEFAULT);
				return;
			case TP2Package.FICHIER__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
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
			case TP2Package.FICHIER__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case TP2Package.FICHIER__TAILLE_OCTET:
				return tailleOctet != TAILLE_OCTET_EDEFAULT;
			case TP2Package.FICHIER__CHEMIN_ABSOLU:
				return CHEMIN_ABSOLU_EDEFAULT == null ? cheminAbsolu != null : !CHEMIN_ABSOLU_EDEFAULT.equals(cheminAbsolu);
			case TP2Package.FICHIER__PERMISSION:
				return permission != PERMISSION_EDEFAULT;
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
				accept((AbstractCommand)arguments.get(0));
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", tailleOctet: ");
		result.append(tailleOctet);
		result.append(", cheminAbsolu: ");
		result.append(cheminAbsolu);
		result.append(", permission: ");
		result.append(permission);
		result.append(')');
		return result.toString();
	}

} //FichierImpl
