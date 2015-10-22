/**
 */
package lOG8430_TP2.impl;

import lOG8430_TP2.LOG8430_TP2Package;
import lOG8430_TP2.Page;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lOG8430_TP2.impl.PageImpl#getNomPage <em>Nom Page</em>}</li>
 *   <li>{@link lOG8430_TP2.impl.PageImpl#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link lOG8430_TP2.impl.PageImpl#getTaillePage <em>Taille Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends RessourcesDistantesImpl implements Page {
	/**
	 * The default value of the '{@link #getNomPage() <em>Nom Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomPage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomPage() <em>Nom Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomPage()
	 * @generated
	 * @ordered
	 */
	protected String nomPage = NOM_PAGE_EDEFAULT;

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
		return LOG8430_TP2Package.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomPage() {
		return nomPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomPage(String newNomPage) {
		String oldNomPage = nomPage;
		nomPage = newNomPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.PAGE__NOM_PAGE, oldNomPage, nomPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.PAGE__TITRE_PAGE, oldTitrePage, titrePage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LOG8430_TP2Package.PAGE__TAILLE_PAGE, oldTaillePage, taillePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LOG8430_TP2Package.PAGE__NOM_PAGE:
				return getNomPage();
			case LOG8430_TP2Package.PAGE__TITRE_PAGE:
				return getTitrePage();
			case LOG8430_TP2Package.PAGE__TAILLE_PAGE:
				return getTaillePage();
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
			case LOG8430_TP2Package.PAGE__NOM_PAGE:
				setNomPage((String)newValue);
				return;
			case LOG8430_TP2Package.PAGE__TITRE_PAGE:
				setTitrePage((String)newValue);
				return;
			case LOG8430_TP2Package.PAGE__TAILLE_PAGE:
				setTaillePage((Integer)newValue);
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
			case LOG8430_TP2Package.PAGE__NOM_PAGE:
				setNomPage(NOM_PAGE_EDEFAULT);
				return;
			case LOG8430_TP2Package.PAGE__TITRE_PAGE:
				setTitrePage(TITRE_PAGE_EDEFAULT);
				return;
			case LOG8430_TP2Package.PAGE__TAILLE_PAGE:
				setTaillePage(TAILLE_PAGE_EDEFAULT);
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
			case LOG8430_TP2Package.PAGE__NOM_PAGE:
				return NOM_PAGE_EDEFAULT == null ? nomPage != null : !NOM_PAGE_EDEFAULT.equals(nomPage);
			case LOG8430_TP2Package.PAGE__TITRE_PAGE:
				return TITRE_PAGE_EDEFAULT == null ? titrePage != null : !TITRE_PAGE_EDEFAULT.equals(titrePage);
			case LOG8430_TP2Package.PAGE__TAILLE_PAGE:
				return taillePage != TAILLE_PAGE_EDEFAULT;
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
		result.append(" (nomPage: ");
		result.append(nomPage);
		result.append(", titrePage: ");
		result.append(titrePage);
		result.append(", taillePage: ");
		result.append(taillePage);
		result.append(')');
		return result.toString();
	}

} //PageImpl
