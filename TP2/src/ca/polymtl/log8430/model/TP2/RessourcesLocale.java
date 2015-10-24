/**
 */
package ca.polymtl.log8430.model.TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources Locale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.RessourcesLocale#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessourcesLocale()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RessourcesLocale extends Ressource {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.polymtl.log8430.model.TP2.PermissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see ca.polymtl.log8430.model.TP2.PermissionType
	 * @see #setPermission(PermissionType)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessourcesLocale_Permission()
	 * @model
	 * @generated
	 */
	PermissionType getPermission();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.RessourcesLocale#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see ca.polymtl.log8430.model.TP2.PermissionType
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(PermissionType value);

} // RessourcesLocale
