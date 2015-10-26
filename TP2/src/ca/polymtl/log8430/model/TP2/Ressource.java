/**
 */
package ca.polymtl.log8430.model.TP2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='commandVisitor.visit(this);'"
	 * @generated
	 */
	void accept(AbstractCommand commandVisitor);

} // Ressource
