/**
 */
package lOG8430_TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lOG8430_TP2.Fichier#getNomFichier <em>Nom Fichier</em>}</li>
 *   <li>{@link lOG8430_TP2.Fichier#getTailleFichierOctet <em>Taille Fichier Octet</em>}</li>
 * </ul>
 * </p>
 *
 * @see lOG8430_TP2.LOG8430_TP2Package#getFichier()
 * @model
 * @generated
 */
public interface Fichier extends RessourcesLocales {
	/**
	 * Returns the value of the '<em><b>Nom Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Fichier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Fichier</em>' attribute.
	 * @see #setNomFichier(String)
	 * @see lOG8430_TP2.LOG8430_TP2Package#getFichier_NomFichier()
	 * @model
	 * @generated
	 */
	String getNomFichier();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.Fichier#getNomFichier <em>Nom Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Fichier</em>' attribute.
	 * @see #getNomFichier()
	 * @generated
	 */
	void setNomFichier(String value);

	/**
	 * Returns the value of the '<em><b>Taille Fichier Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Fichier Octet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Fichier Octet</em>' attribute.
	 * @see #setTailleFichierOctet(int)
	 * @see lOG8430_TP2.LOG8430_TP2Package#getFichier_TailleFichierOctet()
	 * @model
	 * @generated
	 */
	int getTailleFichierOctet();

	/**
	 * Sets the value of the '{@link lOG8430_TP2.Fichier#getTailleFichierOctet <em>Taille Fichier Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Fichier Octet</em>' attribute.
	 * @see #getTailleFichierOctet()
	 * @generated
	 */
	void setTailleFichierOctet(int value);

} // Fichier
