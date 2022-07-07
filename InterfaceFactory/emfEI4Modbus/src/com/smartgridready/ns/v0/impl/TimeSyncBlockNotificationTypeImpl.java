/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.TimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sync Block Notification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TimeSyncBlockNotificationTypeImpl#getBlockNumber <em>Block Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TimeSyncBlockNotificationTypeImpl#getTimeoutMs <em>Timeout Ms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSyncBlockNotificationTypeImpl extends MinimalEObjectImpl.Container implements TimeSyncBlockNotificationType {
	/**
	 * The default value of the '{@link #getBlockNumber() <em>Block Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCK_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlockNumber() <em>Block Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNumber()
	 * @generated
	 * @ordered
	 */
	protected int blockNumber = BLOCK_NUMBER_EDEFAULT;

	/**
	 * This is true if the Block Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockNumberESet;

	/**
	 * The default value of the '{@link #getTimeoutMs() <em>Timeout Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMs()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeoutMs() <em>Timeout Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMs()
	 * @generated
	 * @ordered
	 */
	protected int timeoutMs = TIMEOUT_MS_EDEFAULT;

	/**
	 * This is true if the Timeout Ms attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutMsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSyncBlockNotificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTimeSyncBlockNotificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBlockNumber() {
		return blockNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockNumber(int newBlockNumber) {
		int oldBlockNumber = blockNumber;
		blockNumber = newBlockNumber;
		boolean oldBlockNumberESet = blockNumberESet;
		blockNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER, oldBlockNumber, blockNumber, !oldBlockNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBlockNumber() {
		int oldBlockNumber = blockNumber;
		boolean oldBlockNumberESet = blockNumberESet;
		blockNumber = BLOCK_NUMBER_EDEFAULT;
		blockNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER, oldBlockNumber, BLOCK_NUMBER_EDEFAULT, oldBlockNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBlockNumber() {
		return blockNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeoutMs() {
		return timeoutMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutMs(int newTimeoutMs) {
		int oldTimeoutMs = timeoutMs;
		timeoutMs = newTimeoutMs;
		boolean oldTimeoutMsESet = timeoutMsESet;
		timeoutMsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS, oldTimeoutMs, timeoutMs, !oldTimeoutMsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeoutMs() {
		int oldTimeoutMs = timeoutMs;
		boolean oldTimeoutMsESet = timeoutMsESet;
		timeoutMs = TIMEOUT_MS_EDEFAULT;
		timeoutMsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS, oldTimeoutMs, TIMEOUT_MS_EDEFAULT, oldTimeoutMsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeoutMs() {
		return timeoutMsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER:
				return getBlockNumber();
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS:
				return getTimeoutMs();
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
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER:
				setBlockNumber((Integer)newValue);
				return;
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS:
				setTimeoutMs((Integer)newValue);
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
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER:
				unsetBlockNumber();
				return;
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS:
				unsetTimeoutMs();
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
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_NUMBER:
				return isSetBlockNumber();
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIMEOUT_MS:
				return isSetTimeoutMs();
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
		result.append(" (blockNumber: ");
		if (blockNumberESet) result.append(blockNumber); else result.append("<unset>");
		result.append(", timeoutMs: ");
		if (timeoutMsESet) result.append(timeoutMs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeSyncBlockNotificationTypeImpl
