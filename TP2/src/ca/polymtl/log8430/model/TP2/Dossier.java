/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ressource qui représente un dossier. Un dossier peut contenir d'autres ressources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Dossier#getNombreEnfant <em>Nombre Enfant</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Dossier#getListEnfants <em>List Enfants</em>}</li>
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
	 * Returns the value of the '<em><b>List Enfants</b></em>' reference list.
	 * The list contents are of type {@link ca.polymtl.log8430.model.TP2.RessourcesLocale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Enfants</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contient la liste de tous les enfants du dossier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Enfants</em>' reference list.
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getDossier_ListEnfants()
	 * @model extendedMetaData="name='ListEnfants' kind='attribute'"
	 * @generated
	 */
	EList<RessourcesLocale> getListEnfants();

} // Dossier
