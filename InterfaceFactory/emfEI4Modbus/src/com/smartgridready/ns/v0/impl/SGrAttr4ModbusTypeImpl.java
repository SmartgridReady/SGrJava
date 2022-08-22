/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAccessProtectionEnabledType;
import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrModbusLayer6DeviationType;
import com.smartgridready.ns.v0.SGrScalingType;
import com.smartgridready.ns.v0.TimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Attr4 Modbus Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getScalingByMulPwr <em>Scaling By Mul Pwr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getStepByIncrement <em>Step By Increment</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getSunssf <em>Sunssf</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getPollLatencyMS <em>Poll Latency MS</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getAccessProtection <em>Access Protection</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl#getLayer6Deviation <em>Layer6 Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrAttr4ModbusTypeImpl extends MinimalEObjectImpl.Container implements SGrAttr4ModbusType {
	/**
	 * The cached value of the '{@link #getScalingByMulPwr() <em>Scaling By Mul Pwr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingByMulPwr()
	 * @generated
	 * @ordered
	 */
	protected SGrScalingType scalingByMulPwr;

	/**
	 * The default value of the '{@link #getStepByIncrement() <em>Step By Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepByIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final long STEP_BY_INCREMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStepByIncrement() <em>Step By Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepByIncrement()
	 * @generated
	 * @ordered
	 */
	protected long stepByIncrement = STEP_BY_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Step By Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepByIncrementESet;

	/**
	 * The default value of the '{@link #getSunssf() <em>Sunssf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunssf()
	 * @generated
	 * @ordered
	 */
	protected static final long SUNSSF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSunssf() <em>Sunssf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunssf()
	 * @generated
	 * @ordered
	 */
	protected long sunssf = SUNSSF_EDEFAULT;

	/**
	 * This is true if the Sunssf attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sunssfESet;

	/**
	 * The default value of the '{@link #getPollLatencyMS() <em>Poll Latency MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollLatencyMS()
	 * @generated
	 * @ordered
	 */
	protected static final long POLL_LATENCY_MS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPollLatencyMS() <em>Poll Latency MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollLatencyMS()
	 * @generated
	 * @ordered
	 */
	protected long pollLatencyMS = POLL_LATENCY_MS_EDEFAULT;

	/**
	 * This is true if the Poll Latency MS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pollLatencyMSESet;

	/**
	 * The cached value of the '{@link #getTimeSyncBlockNotification() <em>Time Sync Block Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSyncBlockNotification()
	 * @generated
	 * @ordered
	 */
	protected TimeSyncBlockNotificationType timeSyncBlockNotification;

	/**
	 * The cached value of the '{@link #getAccessProtection() <em>Access Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessProtection()
	 * @generated
	 * @ordered
	 */
	protected SGrAccessProtectionEnabledType accessProtection;

	/**
	 * The default value of the '{@link #getLayer6Deviation() <em>Layer6 Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer6Deviation()
	 * @generated
	 * @ordered
	 */
	protected static final SGrModbusLayer6DeviationType LAYER6_DEVIATION_EDEFAULT = SGrModbusLayer6DeviationType._2REG_BASE1000_L2H;

	/**
	 * The cached value of the '{@link #getLayer6Deviation() <em>Layer6 Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer6Deviation()
	 * @generated
	 * @ordered
	 */
	protected SGrModbusLayer6DeviationType layer6Deviation = LAYER6_DEVIATION_EDEFAULT;

	/**
	 * This is true if the Layer6 Deviation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layer6DeviationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrAttr4ModbusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrAttr4ModbusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrScalingType getScalingByMulPwr() {
		return scalingByMulPwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingByMulPwr(SGrScalingType newScalingByMulPwr, NotificationChain msgs) {
		SGrScalingType oldScalingByMulPwr = scalingByMulPwr;
		scalingByMulPwr = newScalingByMulPwr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR, oldScalingByMulPwr, newScalingByMulPwr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingByMulPwr(SGrScalingType newScalingByMulPwr) {
		if (newScalingByMulPwr != scalingByMulPwr) {
			NotificationChain msgs = null;
			if (scalingByMulPwr != null)
				msgs = ((InternalEObject)scalingByMulPwr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR, null, msgs);
			if (newScalingByMulPwr != null)
				msgs = ((InternalEObject)newScalingByMulPwr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR, null, msgs);
			msgs = basicSetScalingByMulPwr(newScalingByMulPwr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR, newScalingByMulPwr, newScalingByMulPwr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStepByIncrement() {
		return stepByIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepByIncrement(long newStepByIncrement) {
		long oldStepByIncrement = stepByIncrement;
		stepByIncrement = newStepByIncrement;
		boolean oldStepByIncrementESet = stepByIncrementESet;
		stepByIncrementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT, oldStepByIncrement, stepByIncrement, !oldStepByIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStepByIncrement() {
		long oldStepByIncrement = stepByIncrement;
		boolean oldStepByIncrementESet = stepByIncrementESet;
		stepByIncrement = STEP_BY_INCREMENT_EDEFAULT;
		stepByIncrementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT, oldStepByIncrement, STEP_BY_INCREMENT_EDEFAULT, oldStepByIncrementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStepByIncrement() {
		return stepByIncrementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSunssf() {
		return sunssf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSunssf(long newSunssf) {
		long oldSunssf = sunssf;
		sunssf = newSunssf;
		boolean oldSunssfESet = sunssfESet;
		sunssfESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF, oldSunssf, sunssf, !oldSunssfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSunssf() {
		long oldSunssf = sunssf;
		boolean oldSunssfESet = sunssfESet;
		sunssf = SUNSSF_EDEFAULT;
		sunssfESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF, oldSunssf, SUNSSF_EDEFAULT, oldSunssfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSunssf() {
		return sunssfESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPollLatencyMS() {
		return pollLatencyMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollLatencyMS(long newPollLatencyMS) {
		long oldPollLatencyMS = pollLatencyMS;
		pollLatencyMS = newPollLatencyMS;
		boolean oldPollLatencyMSESet = pollLatencyMSESet;
		pollLatencyMSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS, oldPollLatencyMS, pollLatencyMS, !oldPollLatencyMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPollLatencyMS() {
		long oldPollLatencyMS = pollLatencyMS;
		boolean oldPollLatencyMSESet = pollLatencyMSESet;
		pollLatencyMS = POLL_LATENCY_MS_EDEFAULT;
		pollLatencyMSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS, oldPollLatencyMS, POLL_LATENCY_MS_EDEFAULT, oldPollLatencyMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPollLatencyMS() {
		return pollLatencyMSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSyncBlockNotificationType getTimeSyncBlockNotification() {
		return timeSyncBlockNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSyncBlockNotification(TimeSyncBlockNotificationType newTimeSyncBlockNotification, NotificationChain msgs) {
		TimeSyncBlockNotificationType oldTimeSyncBlockNotification = timeSyncBlockNotification;
		timeSyncBlockNotification = newTimeSyncBlockNotification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION, oldTimeSyncBlockNotification, newTimeSyncBlockNotification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeSyncBlockNotification(TimeSyncBlockNotificationType newTimeSyncBlockNotification) {
		if (newTimeSyncBlockNotification != timeSyncBlockNotification) {
			NotificationChain msgs = null;
			if (timeSyncBlockNotification != null)
				msgs = ((InternalEObject)timeSyncBlockNotification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION, null, msgs);
			if (newTimeSyncBlockNotification != null)
				msgs = ((InternalEObject)newTimeSyncBlockNotification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION, null, msgs);
			msgs = basicSetTimeSyncBlockNotification(newTimeSyncBlockNotification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION, newTimeSyncBlockNotification, newTimeSyncBlockNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrAccessProtectionEnabledType getAccessProtection() {
		return accessProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessProtection(SGrAccessProtectionEnabledType newAccessProtection, NotificationChain msgs) {
		SGrAccessProtectionEnabledType oldAccessProtection = accessProtection;
		accessProtection = newAccessProtection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION, oldAccessProtection, newAccessProtection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessProtection(SGrAccessProtectionEnabledType newAccessProtection) {
		if (newAccessProtection != accessProtection) {
			NotificationChain msgs = null;
			if (accessProtection != null)
				msgs = ((InternalEObject)accessProtection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION, null, msgs);
			if (newAccessProtection != null)
				msgs = ((InternalEObject)newAccessProtection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION, null, msgs);
			msgs = basicSetAccessProtection(newAccessProtection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION, newAccessProtection, newAccessProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusLayer6DeviationType getLayer6Deviation() {
		return layer6Deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayer6Deviation(SGrModbusLayer6DeviationType newLayer6Deviation) {
		SGrModbusLayer6DeviationType oldLayer6Deviation = layer6Deviation;
		layer6Deviation = newLayer6Deviation == null ? LAYER6_DEVIATION_EDEFAULT : newLayer6Deviation;
		boolean oldLayer6DeviationESet = layer6DeviationESet;
		layer6DeviationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION, oldLayer6Deviation, layer6Deviation, !oldLayer6DeviationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLayer6Deviation() {
		SGrModbusLayer6DeviationType oldLayer6Deviation = layer6Deviation;
		boolean oldLayer6DeviationESet = layer6DeviationESet;
		layer6Deviation = LAYER6_DEVIATION_EDEFAULT;
		layer6DeviationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION, oldLayer6Deviation, LAYER6_DEVIATION_EDEFAULT, oldLayer6DeviationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLayer6Deviation() {
		return layer6DeviationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				return basicSetScalingByMulPwr(null, msgs);
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return basicSetTimeSyncBlockNotification(null, msgs);
			case V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION:
				return basicSetAccessProtection(null, msgs);
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
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				return getScalingByMulPwr();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT:
				return getStepByIncrement();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF:
				return getSunssf();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS:
				return getPollLatencyMS();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return getTimeSyncBlockNotification();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION:
				return getAccessProtection();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION:
				return getLayer6Deviation();
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
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				setScalingByMulPwr((SGrScalingType)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT:
				setStepByIncrement((Long)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF:
				setSunssf((Long)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS:
				setPollLatencyMS((Long)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				setTimeSyncBlockNotification((TimeSyncBlockNotificationType)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION:
				setAccessProtection((SGrAccessProtectionEnabledType)newValue);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION:
				setLayer6Deviation((SGrModbusLayer6DeviationType)newValue);
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
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				setScalingByMulPwr((SGrScalingType)null);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT:
				unsetStepByIncrement();
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF:
				unsetSunssf();
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS:
				unsetPollLatencyMS();
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				setTimeSyncBlockNotification((TimeSyncBlockNotificationType)null);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION:
				setAccessProtection((SGrAccessProtectionEnabledType)null);
				return;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION:
				unsetLayer6Deviation();
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
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				return scalingByMulPwr != null;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT:
				return isSetStepByIncrement();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SUNSSF:
				return isSetSunssf();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS:
				return isSetPollLatencyMS();
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return timeSyncBlockNotification != null;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION:
				return accessProtection != null;
			case V0Package.SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION:
				return isSetLayer6Deviation();
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
		result.append(" (stepByIncrement: ");
		if (stepByIncrementESet) result.append(stepByIncrement); else result.append("<unset>");
		result.append(", sunssf: ");
		if (sunssfESet) result.append(sunssf); else result.append("<unset>");
		result.append(", pollLatencyMS: ");
		if (pollLatencyMSESet) result.append(pollLatencyMS); else result.append("<unset>");
		result.append(", layer6Deviation: ");
		if (layer6DeviationESet) result.append(layer6Deviation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrAttr4ModbusTypeImpl
