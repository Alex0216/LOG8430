/**
 */
package ca.polymtl.log8430.model.TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Fichier#getTailleFichierOctet <em>Taille Fichier Octet</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Fichier#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getFichier()
 * @model
 * @generated
 */
public interface Fichier extends RessourcesLocale {
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
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getFichier_TailleFichierOctet()
	 * @model
	 * @generated
	 */
	int getTailleFichierOctet();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Fichier#getTailleFichierOctet <em>Taille Fichier Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Fichier Octet</em>' attribute.
	 * @see #getTailleFichierOctet()
	 * @generated
	 */
	void setTailleFichierOctet(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getFichier_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Fichier#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Fichier
