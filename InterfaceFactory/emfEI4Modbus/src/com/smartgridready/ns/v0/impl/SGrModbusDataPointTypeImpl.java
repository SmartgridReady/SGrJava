/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Data Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl#getTimeSyncBlockRefIndex <em>Time Sync Block Ref Index</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusDataPointTypeImpl extends SGrDataPointBaseTypeImpl implements SGrModbusDataPointType {
	/**
	 * The cached value of the '{@link #getModbusDataPoint() <em>Modbus Data Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusDataPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusDataPointDescriptionType> modbusDataPoint;

	/**
	 * The default value of the '{@link #getLastAccessTime() <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_ACCESS_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastAccessTime() <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessTime()
	 * @generated
	 * @ordered
	 */
	protected long lastAccessTime = LAST_ACCESS_TIME_EDEFAULT;

	/**
	 * This is true if the Last Access Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastAccessTimeESet;

	/**
	 * The default value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToLive()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_TO_LIVE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToLive()
	 * @generated
	 * @ordered
	 */
	protected long timeToLive = TIME_TO_LIVE_EDEFAULT;

	/**
	 * This is true if the Time To Live attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeToLiveESet;

	/**
	 * The default value of the '{@link #getTimeSyncBlockRefIndex() <em>Time Sync Block Ref Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSyncBlockRefIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SYNC_BLOCK_REF_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeSyncBlockRefIndex() <em>Time Sync Block Ref Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSyncBlockRefIndex()
	 * @generated
	 * @ordered
	 */
	protected int timeSyncBlockRefIndex = TIME_SYNC_BLOCK_REF_INDEX_EDEFAULT;

	/**
	 * This is true if the Time Sync Block Ref Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeSyncBlockRefIndexESet;

	/**
	 * The cached value of the '{@link #getModbusAttr() <em>Modbus Attr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4ModbusType> modbusAttr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusDataPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusDataPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrModbusDataPointDescriptionType> getModbusDataPoint() {
		if (modbusDataPoint == null) {
			modbusDataPoint = new EObjectContainmentEList<SGrModbusDataPointDescriptionType>(SGrModbusDataPointDescriptionType.class, this, V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT);
		}
		return modbusDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastAccessTime() {
		return lastAccessTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAccessTime(long newLastAccessTime) {
		long oldLastAccessTime = lastAccessTime;
		lastAccessTime = newLastAccessTime;
		boolean oldLastAccessTimeESet = lastAccessTimeESet;
		lastAccessTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME, oldLastAccessTime, lastAccessTime, !oldLastAccessTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastAccessTime() {
		long oldLastAccessTime = lastAccessTime;
		boolean oldLastAccessTimeESet = lastAccessTimeESet;
		lastAccessTime = LAST_ACCESS_TIME_EDEFAULT;
		lastAccessTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME, oldLastAccessTime, LAST_ACCESS_TIME_EDEFAULT, oldLastAccessTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastAccessTime() {
		return lastAccessTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeToLive() {
		return timeToLive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToLive(long newTimeToLive) {
		long oldTimeToLive = timeToLive;
		timeToLive = newTimeToLive;
		boolean oldTimeToLiveESet = timeToLiveESet;
		timeToLiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE, oldTimeToLive, timeToLive, !oldTimeToLiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeToLive() {
		long oldTimeToLive = timeToLive;
		boolean oldTimeToLiveESet = timeToLiveESet;
		timeToLive = TIME_TO_LIVE_EDEFAULT;
		timeToLiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE, oldTimeToLive, TIME_TO_LIVE_EDEFAULT, oldTimeToLiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeToLive() {
		return timeToLiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSyncBlockRefIndex() {
		return timeSyncBlockRefIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSyncBlockRefIndex(int newTimeSyncBlockRefIndex) {
		int oldTimeSyncBlockRefIndex = timeSyncBlockRefIndex;
		timeSyncBlockRefIndex = newTimeSyncBlockRefIndex;
		boolean oldTimeSyncBlockRefIndexESet = timeSyncBlockRefIndexESet;
		timeSyncBlockRefIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX, oldTimeSyncBlockRefIndex, timeSyncBlockRefIndex, !oldTimeSyncBlockRefIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeSyncBlockRefIndex() {
		int oldTimeSyncBlockRefIndex = timeSyncBlockRefIndex;
		boolean oldTimeSyncBlockRefIndexESet = timeSyncBlockRefIndexESet;
		timeSyncBlockRefIndex = TIME_SYNC_BLOCK_REF_INDEX_EDEFAULT;
		timeSyncBlockRefIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX, oldTimeSyncBlockRefIndex, TIME_SYNC_BLOCK_REF_INDEX_EDEFAULT, oldTimeSyncBlockRefIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeSyncBlockRefIndex() {
		return timeSyncBlockRefIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrAttr4ModbusType> getModbusAttr() {
		if (modbusAttr == null) {
			modbusAttr = new EObjectContainmentEList<SGrAttr4ModbusType>(SGrAttr4ModbusType.class, this, V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR);
		}
		return modbusAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT:
				return ((InternalEList<?>)getModbusDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				return ((InternalEList<?>)getModbusAttr()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT:
				return getModbusDataPoint();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME:
				return getLastAccessTime();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE:
				return getTimeToLive();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX:
				return getTimeSyncBlockRefIndex();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				return getModbusAttr();
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT:
				getModbusDataPoint().clear();
				getModbusDataPoint().addAll((Collection<? extends SGrModbusDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME:
				setLastAccessTime((Long)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE:
				setTimeToLive((Long)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX:
				setTimeSyncBlockRefIndex((Integer)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				getModbusAttr().clear();
				getModbusAttr().addAll((Collection<? extends SGrAttr4ModbusType>)newValue);
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT:
				getModbusDataPoint().clear();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME:
				unsetLastAccessTime();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE:
				unsetTimeToLive();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX:
				unsetTimeSyncBlockRefIndex();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				getModbusAttr().clear();
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT:
				return modbusDataPoint != null && !modbusDataPoint.isEmpty();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME:
				return isSetLastAccessTime();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE:
				return isSetTimeToLive();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__TIME_SYNC_BLOCK_REF_INDEX:
				return isSetTimeSyncBlockRefIndex();
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				return modbusAttr != null && !modbusAttr.isEmpty();
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
		result.append(" (lastAccessTime: ");
		if (lastAccessTimeESet) result.append(lastAccessTime); else result.append("<unset>");
		result.append(", timeToLive: ");
		if (timeToLiveESet) result.append(timeToLive); else result.append("<unset>");
		result.append(", timeSyncBlockRefIndex: ");
		if (timeSyncBlockRefIndexESet) result.append(timeSyncBlockRefIndex); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrModbusDataPointTypeImpl
