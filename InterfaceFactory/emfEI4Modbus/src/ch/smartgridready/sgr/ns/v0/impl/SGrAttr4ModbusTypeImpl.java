/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrAttr4ModbusType;
import ch.smartgridready.sgr.ns.v0.SGrScalingType;
import ch.smartgridready.sgr.ns.v0.TimeSyncBlockNotificationType;
import ch.smartgridready.sgr.ns.v0.V0Package;

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
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrAttr4ModbusTypeImpl#getScalingByMulPwr <em>Scaling By Mul Pwr</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrAttr4ModbusTypeImpl#getStepByIncrement <em>Step By Increment</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrAttr4ModbusTypeImpl#getSunssf <em>Sunssf</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrAttr4ModbusTypeImpl#getPollLatencyMS <em>Poll Latency MS</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrAttr4ModbusTypeImpl#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}</li>
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR:
				return basicSetScalingByMulPwr(null, msgs);
			case V0Package.SGR_ATTR4_MODBUS_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return basicSetTimeSyncBlockNotification(null, msgs);
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
		result.append(')');
		return result.toString();
	}

} //SGrAttr4ModbusTypeImpl
