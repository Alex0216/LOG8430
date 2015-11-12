/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe abstraite représentant une commande.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getCommandName <em>Command Name</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getResult <em>Result</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getRessource <em>Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getAbstractCommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Name</em>' attribute.
	 * @see #setCommandName(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getAbstractCommand_CommandName()
	 * @model
	 * @generated
	 */
	String getCommandName();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getCommandName <em>Command Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Name</em>' attribute.
	 * @see #getCommandName()
	 * @generated
	 */
	void setCommandName(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getAbstractCommand_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getAbstractCommand_Ressource()
	 * @model transient="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.AbstractCommand#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Efface le contenu du résultat et notifie tous les observers.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='setResult(\"\");'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vérifie si la commande actuelle peut effectuer son exécution selon la ressource choisie.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean canExecute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visite la ressource de type Fichier.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void visit(Fichier fichier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visite la ressource de type Dossier.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void visit(Dossier dossier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visite la ressource de type Page.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void visit(Page page);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exécute la commande selon le path actuel, met à jour le résultat et notifie les observers que ce dernier a été changé.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(ressource != null)\r\n\tressource.accept(this);'"
	 * @generated
	 */
	void execute();

} // AbstractCommand
