/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe contr�leur qui s'occupe de mettre � jour les ressources des commandes, d'effacer leur r�sultat ou de tous les ex�cuter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#getCommands <em>Commands</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#isAutoRun <em>Auto Run</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#getCurrentRessource <em>Current Ressource</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#getRessourcesAvailable <em>Ressources Available</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getMaster()
 * @model
 * @generated
 */
public interface Master extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link ca.polymtl.log8430.model.TP2.AbstractCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getMaster_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Auto Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Run</em>' attribute.
	 * @see #setAutoRun(boolean)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getMaster_AutoRun()
	 * @model
	 * @generated
	 */
	boolean isAutoRun();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Efface le contenu de tous les resultats et notifie tous les observers.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tc.clear();\r\n}'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ex�cute toutes les commandes, met � jour les r�sultats et notifie les observers que ce dernier a �t� chang�.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tif(c.canExecute()){\r\n\t\tc.execute();\r\n\t}\t\t\r\n}'"
	 * @generated
	 */
	void executeAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ex�cute la commande pass�e en param�tre, met � jour le r�sultat et notifie les observers que ce dernier a �t� chang�.
	 * @param command Commande a executer.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='command.execute();'"
	 * @generated
	 */
	void executeCommand(AbstractCommand command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Met � jour toutes les commandes avec la ressource pass�e en param�tre.
	 * @param ressource Resource a assigner aux commandes.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tc.setRessource(ressource);\r\n}\r\nif(isAutoRun()){\r\n\texecuteAll();\r\n}\r\n\r\nsetCurrentRessource(ressource);'"
	 * @generated
	 */
	void updateCurrentRessource(Ressource ressource);

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Master#isAutoRun <em>Auto Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Run</em>' attribute.
	 * @see #isAutoRun()
	 * @generated
	 */
	void setAutoRun(boolean value);

	/**
	 * Returns the value of the '<em><b>Current Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Ressource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Ressource</em>' containment reference.
	 * @see #setCurrentRessource(Ressource)
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getMaster_CurrentRessource()
	 * @model containment="true"
	 * @generated
	 */
	Ressource getCurrentRessource();

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Master#getCurrentRessource <em>Current Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Ressource</em>' containment reference.
	 * @see #getCurrentRessource()
	 * @generated
	 */
	void setCurrentRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Ressources Available</b></em>' containment reference list.
	 * The list contents are of type {@link ca.polymtl.log8430.model.TP2.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressources Available</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources Available</em>' containment reference list.
	 * @see ca.polymtl.log8430.model.TP2.TP2Package#getMaster_RessourcesAvailable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessourcesAvailable();

} // Master
