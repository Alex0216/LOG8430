/**
 */
package lOG8430_TP2;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources Locales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lOG8430_TP2.RessourcesLocales#getMyPermissionMap <em>My Permission Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see lOG8430_TP2.LOG8430_TP2Package#getRessourcesLocales()
 * @model
 * @generated
 */
public interface RessourcesLocales extends Ressources {
	/**
	 * Returns the value of the '<em><b>My Permission Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link lOG8430_TP2.PermissionType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Permission Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Permission Map</em>' map.
	 * @see lOG8430_TP2.LOG8430_TP2Package#getRessourcesLocales_MyPermissionMap()
	 * @model mapType="lOG8430_TP2.permissionMap<org.eclipse.emf.ecore.EString, lOG8430_TP2.PermissionType>"
	 * @generated
	 */
	EMap<String, PermissionType> getMyPermissionMap();

} // RessourcesLocales
