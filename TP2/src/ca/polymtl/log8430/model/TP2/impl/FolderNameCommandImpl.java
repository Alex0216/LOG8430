/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.FolderNameCommand;
import ca.polymtl.log8430.model.TP2.Page;
import ca.polymtl.log8430.model.TP2.Ressource;
import ca.polymtl.log8430.model.TP2.TP2Package;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Name Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl#getCommandName <em>Command Name</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl#getResult <em>Result</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.FolderNameCommandImpl#getRessource <em>Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolderNameCommandImpl extends MinimalEObjectImpl.Container implements FolderNameCommand {
	/**
	 * The default value of the '{@link #getCommandName() <em>Command Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommandName() <em>Command Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandName()
	 * @generated
	 * @ordered
	 */
	protected String commandName = COMMAND_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderNameCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2Package.Literals.FOLDER_NAME_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandName() {
		return commandName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandName(String newCommandName) {
		String oldCommandName = commandName;
		commandName = newCommandName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FOLDER_NAME_COMMAND__COMMAND_NAME, oldCommandName, commandName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FOLDER_NAME_COMMAND__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TP2Package.FOLDER_NAME_COMMAND__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.FOLDER_NAME_COMMAND__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		if(ressource != null)
			ressource.accept(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
		setResult("");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (ressource instanceof Dossier)
			return true;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Fichier fichier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void visit(Dossier dossier) {
		setResult(Paths.get(dossier.getCheminAbsolu()).getFileName().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Page page) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2Package.FOLDER_NAME_COMMAND__COMMAND_NAME:
				return getCommandName();
			case TP2Package.FOLDER_NAME_COMMAND__RESULT:
				return getResult();
			case TP2Package.FOLDER_NAME_COMMAND__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TP2Package.FOLDER_NAME_COMMAND__COMMAND_NAME:
				setCommandName((String)newValue);
				return;
			case TP2Package.FOLDER_NAME_COMMAND__RESULT:
				setResult((String)newValue);
				return;
			case TP2Package.FOLDER_NAME_COMMAND__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TP2Package.FOLDER_NAME_COMMAND__COMMAND_NAME:
				setCommandName(COMMAND_NAME_EDEFAULT);
				return;
			case TP2Package.FOLDER_NAME_COMMAND__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case TP2Package.FOLDER_NAME_COMMAND__RESSOURCE:
				setRessource((Ressource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TP2Package.FOLDER_NAME_COMMAND__COMMAND_NAME:
				return COMMAND_NAME_EDEFAULT == null ? commandName != null : !COMMAND_NAME_EDEFAULT.equals(commandName);
			case TP2Package.FOLDER_NAME_COMMAND__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case TP2Package.FOLDER_NAME_COMMAND__RESSOURCE:
				return ressource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TP2Package.FOLDER_NAME_COMMAND___EXECUTE:
				execute();
				return null;
			case TP2Package.FOLDER_NAME_COMMAND___CLEAR:
				clear();
				return null;
			case TP2Package.FOLDER_NAME_COMMAND___CAN_EXECUTE:
				return canExecute();
			case TP2Package.FOLDER_NAME_COMMAND___VISIT__FICHIER:
				visit((Fichier)arguments.get(0));
				return null;
			case TP2Package.FOLDER_NAME_COMMAND___VISIT__DOSSIER:
				visit((Dossier)arguments.get(0));
				return null;
			case TP2Package.FOLDER_NAME_COMMAND___VISIT__PAGE:
				visit((Page)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commandName: ");
		result.append(commandName);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //FolderNameCommandImpl
