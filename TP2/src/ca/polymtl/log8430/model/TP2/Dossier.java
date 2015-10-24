/**
 */
package ca.polymtl.log8430.model.TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Dossier#getNombreEnfant <em>Nombre Enfant</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Dossier#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getDossier()
 * @model
 * @generated
 */
public interface Dossier extends RessourcesLocale {
	/**
	 * Returns the value of the '<em><b>Nombre Enfant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Enfant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Enfant</em>' attribute.
	 * @see #setNombreEnfant(int)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getDossier_NombreEnfant()
	 * @model
	 * @generated
	 */
	int getNombreEnfant();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Dossier#getNombreEnfant <em>Nombre Enfant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Enfant</em>' attribute.
	 * @see #getNombreEnfant()
	 * @generated
	 */
	void setNombreEnfant(int value);

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
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getDossier_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Dossier#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Dossier
