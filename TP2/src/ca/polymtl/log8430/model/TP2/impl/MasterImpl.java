/**
 */
package ca.polymtl.log8430.model.TP2.impl;

import ca.polymtl.log8430.model.TP2.AbstractCommand;
import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.Ressource;
import ca.polymtl.log8430.model.TP2.TP2Package;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.MasterImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link ca.polymtl.log8430.model.TP2.impl.MasterImpl#isAutoRun <em>Auto Run</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterImpl extends MinimalEObjectImpl.Container implements Master {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCommand> commands;

	/**
	 * The default value of the '{@link #isAutoRun() <em>Auto Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_RUN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAutoRun() <em>Auto Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRun()
	 * @generated
	 * @ordered
	 */
	protected boolean autoRun = AUTO_RUN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP2Package.Literals.MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCommand> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<AbstractCommand>(AbstractCommand.class, this, TP2Package.MASTER__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoRun() {
		return autoRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
		for(AbstractCommand c: commands){
			c.clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeAll() {
		for(AbstractCommand c: commands){
			if(c.canExecute()){
				c.execute();
			}		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeCommand(final AbstractCommand command) {
		command.execute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRessource(final Ressource ressource) {
		for(AbstractCommand c: commands){
			c.setRessource(ressource);
		}
		if(isAutoRun()){
			executeAll();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRun(boolean newAutoRun) {
		boolean oldAutoRun = autoRun;
		autoRun = newAutoRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP2Package.MASTER__AUTO_RUN, oldAutoRun, autoRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TP2Package.MASTER__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TP2Package.MASTER__COMMANDS:
				return getCommands();
			case TP2Package.MASTER__AUTO_RUN:
				return isAutoRun();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TP2Package.MASTER__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends AbstractCommand>)newValue);
				return;
			case TP2Package.MASTER__AUTO_RUN:
				setAutoRun((Boolean)newValue);
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
			case TP2Package.MASTER__COMMANDS:
				getCommands().clear();
				return;
			case TP2Package.MASTER__AUTO_RUN:
				setAutoRun(AUTO_RUN_EDEFAULT);
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
			case TP2Package.MASTER__COMMANDS:
				return commands != null && !commands.isEmpty();
			case TP2Package.MASTER__AUTO_RUN:
				return autoRun != AUTO_RUN_EDEFAULT;
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
			case TP2Package.MASTER___CLEAR:
				clear();
				return null;
			case TP2Package.MASTER___EXECUTE_ALL:
				executeAll();
				return null;
			case TP2Package.MASTER___EXECUTE_COMMAND__ABSTRACTCOMMAND:
				executeCommand((AbstractCommand)arguments.get(0));
				return null;
			case TP2Package.MASTER___UPDATE_RESSOURCE__RESSOURCE:
				updateRessource((Ressource)arguments.get(0));
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
		result.append(" (AutoRun: ");
		result.append(autoRun);
		result.append(')');
		return result.toString();
	}

} //MasterImpl
