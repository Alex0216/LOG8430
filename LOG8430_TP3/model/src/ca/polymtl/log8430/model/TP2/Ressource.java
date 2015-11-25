/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe abstraite représentant une ressource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Ressource#getNom <em>Nom</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Ressource#getTailleOctet <em>Taille Octet</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Ressource#getProprietaire <em>Proprietaire</em>}</li>
 * </ul>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Ressource extends EObject {
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
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessource_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Ressource#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Taille Octet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Octet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Octet</em>' attribute.
	 * @see #setTailleOctet(long)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessource_TailleOctet()
	 * @model
	 * @generated
	 */
	long getTailleOctet();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Ressource#getTailleOctet <em>Taille Octet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Octet</em>' attribute.
	 * @see #getTailleOctet()
	 * @generated
	 */
	void setTailleOctet(long value);

	/**
	 * Returns the value of the '<em><b>Proprietaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proprietaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprietaire</em>' attribute.
	 * @see #setProprietaire(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessource_Proprietaire()
	 * @model
	 * @generated
	 */
	String getProprietaire();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Ressource#getProprietaire <em>Proprietaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proprietaire</em>' attribute.
	 * @see #getProprietaire()
	 * @generated
	 */
	void setProprietaire(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepte une commande visiteur.
	 * @param commandVisitor Commande sur laquelle on veut executer la fonction.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='commandVisitor.visit(this);'"
	 * @generated
	 */
	void accept(AbstractCommand commandVisitor);

} // Ressource
