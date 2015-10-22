/**
 */
package lOG8430_TP2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lOG8430_TP2.LOG8430_TP2Package
 * @generated
 */
public interface LOG8430_TP2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LOG8430_TP2Factory eINSTANCE = lOG8430_TP2.impl.LOG8430_TP2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier</em>'.
	 * @generated
	 */
	Fichier createFichier();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier</em>'.
	 * @generated
	 */
	Dossier createDossier();

	/**
	 * Returns a new object of class '<em>Ressources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressources</em>'.
	 * @generated
	 */
	Ressources createRessources();

	/**
	 * Returns a new object of class '<em>Ressources Distantes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressources Distantes</em>'.
	 * @generated
	 */
	RessourcesDistantes createRessourcesDistantes();

	/**
	 * Returns a new object of class '<em>Ressources Locales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressources Locales</em>'.
	 * @generated
	 */
	RessourcesLocales createRessourcesLocales();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LOG8430_TP2Package getLOG8430_TP2Package();

} //LOG8430_TP2Factory
