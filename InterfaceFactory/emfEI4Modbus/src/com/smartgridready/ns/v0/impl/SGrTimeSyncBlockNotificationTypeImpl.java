/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.V0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Time Sync Block Notification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getFirstAddr <em>First Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getRegisterType <em>Register Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getBlockCashName <em>Block Cash Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrTimeSyncBlockNotificationTypeImpl extends MinimalEObjectImpl.Container implements SGrTimeSyncBlockNotificationType {
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
	 * The default value of the '{@link #getFirstAddr() <em>First Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAddr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIRST_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstAddr() <em>First Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAddr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger firstAddr = FIRST_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterType() <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterType()
	 * @generated
	 * @ordered
	 */
	protected static final TEnumObjectType REGISTER_TYPE_EDEFAULT = TEnumObjectType.COIL;

	/**
	 * The cached value of the '{@link #getRegisterType() <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterType()
	 * @generated
	 * @ordered
	 */
	protected TEnumObjectType registerType = REGISTER_TYPE_EDEFAULT;

	/**
	 * This is true if the Register Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean registerTypeESet;

	/**
	 * The default value of the '{@link #getBlockCashName() <em>Block Cash Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockCashName()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_CASH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockCashName() <em>Block Cash Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockCashName()
	 * @generated
	 * @ordered
	 */
	protected String blockCashName = BLOCK_CASH_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrTimeSyncBlockNotificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrTimeSyncBlockNotificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastAccessTime() {
		return lastAccessTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessTime(long newLastAccessTime) {
		long oldLastAccessTime = lastAccessTime;
		lastAccessTime = newLastAccessTime;
		boolean oldLastAccessTimeESet = lastAccessTimeESet;
		lastAccessTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME, oldLastAccessTime, lastAccessTime, !oldLastAccessTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLastAccessTime() {
		long oldLastAccessTime = lastAccessTime;
		boolean oldLastAccessTimeESet = lastAccessTimeESet;
		lastAccessTime = LAST_ACCESS_TIME_EDEFAULT;
		lastAccessTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME, oldLastAccessTime, LAST_ACCESS_TIME_EDEFAULT, oldLastAccessTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLastAccessTime() {
		return lastAccessTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeToLive() {
		return timeToLive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeToLive(long newTimeToLive) {
		long oldTimeToLive = timeToLive;
		timeToLive = newTimeToLive;
		boolean oldTimeToLiveESet = timeToLiveESet;
		timeToLiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE, oldTimeToLive, timeToLive, !oldTimeToLiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeToLive() {
		long oldTimeToLive = timeToLive;
		boolean oldTimeToLiveESet = timeToLiveESet;
		timeToLive = TIME_TO_LIVE_EDEFAULT;
		timeToLiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE, oldTimeToLive, TIME_TO_LIVE_EDEFAULT, oldTimeToLiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeToLive() {
		return timeToLiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFirstAddr() {
		return firstAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstAddr(BigInteger newFirstAddr) {
		BigInteger oldFirstAddr = firstAddr;
		firstAddr = newFirstAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR, oldFirstAddr, firstAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnumObjectType getRegisterType() {
		return registerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterType(TEnumObjectType newRegisterType) {
		TEnumObjectType oldRegisterType = registerType;
		registerType = newRegisterType == null ? REGISTER_TYPE_EDEFAULT : newRegisterType;
		boolean oldRegisterTypeESet = registerTypeESet;
		registerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE, oldRegisterType, registerType, !oldRegisterTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRegisterType() {
		TEnumObjectType oldRegisterType = registerType;
		boolean oldRegisterTypeESet = registerTypeESet;
		registerType = REGISTER_TYPE_EDEFAULT;
		registerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE, oldRegisterType, REGISTER_TYPE_EDEFAULT, oldRegisterTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRegisterType() {
		return registerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockCashName() {
		return blockCashName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockCashName(String newBlockCashName) {
		String oldBlockCashName = blockCashName;
		blockCashName = newBlockCashName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME, oldBlockCashName, blockCashName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSize() {
		int oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME:
				return getLastAccessTime();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE:
				return getTimeToLive();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR:
				return getFirstAddr();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE:
				return getRegisterType();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME:
				return getBlockCashName();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE:
				return getSize();
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
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME:
				setLastAccessTime((Long)newValue);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE:
				setTimeToLive((Long)newValue);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR:
				setFirstAddr((BigInteger)newValue);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE:
				setRegisterType((TEnumObjectType)newValue);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME:
				setBlockCashName((String)newValue);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE:
				setSize((Integer)newValue);
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
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME:
				unsetLastAccessTime();
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE:
				unsetTimeToLive();
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR:
				setFirstAddr(FIRST_ADDR_EDEFAULT);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE:
				unsetRegisterType();
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME:
				setBlockCashName(BLOCK_CASH_NAME_EDEFAULT);
				return;
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE:
				unsetSize();
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
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME:
				return isSetLastAccessTime();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE:
				return isSetTimeToLive();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR:
				return FIRST_ADDR_EDEFAULT == null ? firstAddr != null : !FIRST_ADDR_EDEFAULT.equals(firstAddr);
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE:
				return isSetRegisterType();
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME:
				return BLOCK_CASH_NAME_EDEFAULT == null ? blockCashName != null : !BLOCK_CASH_NAME_EDEFAULT.equals(blockCashName);
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE:
				return isSetSize();
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
		result.append(", firstAddr: ");
		result.append(firstAddr);
		result.append(", registerType: ");
		if (registerTypeESet) result.append(registerType); else result.append("<unset>");
		result.append(", blockCashName: ");
		result.append(blockCashName);
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrTimeSyncBlockNotificationTypeImpl
