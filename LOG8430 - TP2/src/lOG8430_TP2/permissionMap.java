/**
 */
package lOG8430_TP2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>permission Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lOG8430_TP2.permissionMap#getKey <em>Key</em>}</li>
 *   <li>{@link lOG8430_TP2.permissionMap#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see lOG8430_TP2.LOG8430_TP2Package#getpermissionMap()
 * @model
 * @generated
 */
public interface permissionMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see lOG8430_TP2.LOG8430_TP2Package#getpermissionMap_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.permissionMap#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lOG8430_TP2.PermissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lOG8430_TP2.PermissionType
	 * @see #setValue(PermissionType)
	 * @see lOG8430_TP2.LOG8430_TP2Package#getpermissionMap_Value()
	 * @model
	 * @generated
	 */
	PermissionType getValue();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.permissionMap#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lOG8430_TP2.PermissionType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PermissionType value);

} // permissionMap
