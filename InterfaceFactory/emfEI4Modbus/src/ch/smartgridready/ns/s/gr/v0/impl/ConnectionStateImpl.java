/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.ConnectionState;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.ConnectionStateImpl#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.ConnectionStateImpl#getNextAttempt <em>Next Attempt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionStateImpl extends MinimalEObjectImpl.Container implements ConnectionState {
	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * This is true if the Is Connected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConnectedESet;

	/**
	 * The default value of the '{@link #getNextAttempt() <em>Next Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextAttempt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar NEXT_ATTEMPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextAttempt() <em>Next Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextAttempt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar nextAttempt = NEXT_ATTEMPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getConnectionState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConnected(boolean newIsConnected) {
		boolean oldIsConnected = isConnected;
		isConnected = newIsConnected;
		boolean oldIsConnectedESet = isConnectedESet;
		isConnectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.CONNECTION_STATE__IS_CONNECTED, oldIsConnected, isConnected, !oldIsConnectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsConnected() {
		boolean oldIsConnected = isConnected;
		boolean oldIsConnectedESet = isConnectedESet;
		isConnected = IS_CONNECTED_EDEFAULT;
		isConnectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.CONNECTION_STATE__IS_CONNECTED, oldIsConnected, IS_CONNECTED_EDEFAULT, oldIsConnectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsConnected() {
		return isConnectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getNextAttempt() {
		return nextAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextAttempt(XMLGregorianCalendar newNextAttempt) {
		XMLGregorianCalendar oldNextAttempt = nextAttempt;
		nextAttempt = newNextAttempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.CONNECTION_STATE__NEXT_ATTEMPT, oldNextAttempt, nextAttempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.CONNECTION_STATE__IS_CONNECTED:
				return isIsConnected();
			case V0Package.CONNECTION_STATE__NEXT_ATTEMPT:
				return getNextAttempt();
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
			case V0Package.CONNECTION_STATE__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
				return;
			case V0Package.CONNECTION_STATE__NEXT_ATTEMPT:
				setNextAttempt((XMLGregorianCalendar)newValue);
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
			case V0Package.CONNECTION_STATE__IS_CONNECTED:
				unsetIsConnected();
				return;
			case V0Package.CONNECTION_STATE__NEXT_ATTEMPT:
				setNextAttempt(NEXT_ATTEMPT_EDEFAULT);
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
			case V0Package.CONNECTION_STATE__IS_CONNECTED:
				return isSetIsConnected();
			case V0Package.CONNECTION_STATE__NEXT_ATTEMPT:
				return NEXT_ATTEMPT_EDEFAULT == null ? nextAttempt != null : !NEXT_ATTEMPT_EDEFAULT.equals(nextAttempt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isConnected: ");
		if (isConnectedESet) result.append(isConnected); else result.append("<unset>");
		result.append(", nextAttempt: ");
		result.append(nextAttempt);
		result.append(')');
		return result.toString();
	}

} //ConnectionStateImpl
