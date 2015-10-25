/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.Page;
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
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.PageImpl#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.PageImpl#getTaillePage <em>Taille Page</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.PageImpl#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getTitrePage() <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitrePage()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitrePage() <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitrePage()
	 * @generated
	 * @ordered
	 */
	protected String titrePage = TITRE_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaillePage() <em>Taille Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePage()
	 * @generated
	 * @ordered
	 */
	protected static final int TAILLE_PAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaillePage() <em>Taille Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePage()
	 * @generated
	 * @ordered
	 */
	protected int taillePage = TAILLE_PAGE_EDEFAULT;

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
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2Package.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitrePage() {
		return titrePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitrePage(String newTitrePage) {
		String oldTitrePage = titrePage;
		titrePage = newTitrePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.PAGE__TITRE_PAGE, oldTitrePage, titrePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaillePage() {
		return taillePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaillePage(int newTaillePage) {
		int oldTaillePage = taillePage;
		taillePage = newTaillePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.PAGE__TAILLE_PAGE, oldTaillePage, taillePage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.PAGE__NOM, oldNom, nom));
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
			case TP2Package.PAGE__TITRE_PAGE:
				return getTitrePage();
			case TP2Package.PAGE__TAILLE_PAGE:
				return getTaillePage();
			case TP2Package.PAGE__NOM:
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
			case TP2Package.PAGE__TITRE_PAGE:
				setTitrePage((String)newValue);
				return;
			case TP2Package.PAGE__TAILLE_PAGE:
				setTaillePage((Integer)newValue);
				return;
			case TP2Package.PAGE__NOM:
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
			case TP2Package.PAGE__TITRE_PAGE:
				setTitrePage(TITRE_PAGE_EDEFAULT);
				return;
			case TP2Package.PAGE__TAILLE_PAGE:
				setTaillePage(TAILLE_PAGE_EDEFAULT);
				return;
			case TP2Package.PAGE__NOM:
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
			case TP2Package.PAGE__TITRE_PAGE:
				return TITRE_PAGE_EDEFAULT == null ? titrePage != null : !TITRE_PAGE_EDEFAULT.equals(titrePage);
			case TP2Package.PAGE__TAILLE_PAGE:
				return taillePage != TAILLE_PAGE_EDEFAULT;
			case TP2Package.PAGE__NOM:
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
			case TP2Package.PAGE___ACCEPT__RESSOURCEVISITOR:
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
		result.append(" (titrePage: ");
		result.append(titrePage);
		result.append(", taillePage: ");
		result.append(taillePage);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //PageImpl
