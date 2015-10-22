/**
 */
package lOG8430_TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lOG8430_TP2.Page#getNomPage <em>Nom Page</em>}</li>
 *   <li>{@link lOG8430_TP2.Page#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link lOG8430_TP2.Page#getTaillePage <em>Taille Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see lOG8430_TP2.LOG8430_TP2Package#getPage()
 * @model
 * @generated
 */
public interface Page extends RessourcesDistantes {
	/**
	 * Returns the value of the '<em><b>Nom Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Page</em>' attribute.
	 * @see #setNomPage(String)
	 * @see lOG8430_TP2.LOG8430_TP2Package#getPage_NomPage()
	 * @model
	 * @generated
	 */
	String getNomPage();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.Page#getNomPage <em>Nom Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Page</em>' attribute.
	 * @see #getNomPage()
	 * @generated
	 */
	void setNomPage(String value);

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
	 * @see lOG8430_TP2.LOG8430_TP2Package#getPage_TitrePage()
	 * @model
	 * @generated
	 */
	String getTitrePage();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.Page#getTitrePage <em>Titre Page</em>}' attribute.
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
	 * @see lOG8430_TP2.LOG8430_TP2Package#getPage_TaillePage()
	 * @model
	 * @generated
	 */
	int getTaillePage();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.Page#getTaillePage <em>Taille Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Page</em>' attribute.
	 * @see #getTaillePage()
	 * @generated
	 */
	void setTaillePage(int value);

} // Page
