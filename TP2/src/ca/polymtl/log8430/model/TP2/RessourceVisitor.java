/**
 */
package ca.polymtl.log8430.model.TP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.polymtl.log8430.model.TP2.TP2Package#getRessourceVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RessourceVisitor extends AbstractCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRessourceSupported();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Fichier fichier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Dossier dossier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(Page page);

} // RessourceVisitor
