/**
 */
package ca.polymtl.log8430.model.TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ressource de type page web.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Page#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Page#getTaillePage <em>Taille Page</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Page#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getPage()
 * @model
 * @generated
 */
public interface Page extends RessourcesDistante {
	/**
	 * Returns the value of the '<em><b>Titre Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre Page</em>' attribute.
	 * @see #setTitrePage(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getPage_TitrePage()
	 * @model
	 * @generated
	 */
	String getTitrePage();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Page#getTitrePage <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre Page</em>' attribute.
	 * @see #getTitrePage()
	 * @generated
	 */
	void setTitrePage(String value);

	/**
	 * Returns the value of the '<em><b>Taille Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Page</em>' attribute.
	 * @see #setTaillePage(int)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getPage_TaillePage()
	 * @model
	 * @generated
	 */
	int getTaillePage();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Page#getTaillePage <em>Taille Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Page</em>' attribute.
	 * @see #getTaillePage()
	 * @generated
	 */
	void setTaillePage(int value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getPage_URL()
	 * @model
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Page#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

} // Page
