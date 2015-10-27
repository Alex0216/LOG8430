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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#getCommands <em>Commands</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.Master#isAutoRun <em>Auto Run</em>}</li>
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tc.clear();\r\n}'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tif(c.canExecute()){\r\n\t\tc.execute();\r\n\t}\t\t\r\n}'"
	 * @generated
	 */
	void executeAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='command.execute();'"
	 * @generated
	 */
	void executeCommand(AbstractCommand command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(AbstractCommand c: commands){\r\n\tc.setRessource(ressource);\r\n}\r\nif(isAutoRun()){\r\n\texecuteAll();\r\n}'"
	 * @generated
	 */
	void updateRessource(Ressource ressource);

	/**
	 * Sets the value of the '{@link ca.polymtl.log8430.model.TP2.Master#isAutoRun <em>Auto Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Run</em>' attribute.
	 * @see #isAutoRun()
	 * @generated
	 */
	void setAutoRun(boolean value);

} // Master
