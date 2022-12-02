/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrStabilityFallbackType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Stability Fallback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrStabilityFallbackTypeImpl#getMaxReceiveTime <em>Max Receive Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrStabilityFallbackTypeImpl#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrStabilityFallbackTypeImpl#getFallbackValue <em>Fallback Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrStabilityFallbackTypeImpl extends MinimalEObjectImpl.Container implements SGrStabilityFallbackType {
	/**
	 * The default value of the '{@link #getMaxReceiveTime() <em>Max Receive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_RECEIVE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxReceiveTime() <em>Max Receive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveTime()
	 * @generated
	 * @ordered
	 */
	protected float maxReceiveTime = MAX_RECEIVE_TIME_EDEFAULT;

	/**
	 * This is true if the Max Receive Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxReceiveTimeESet;

	/**
	 * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final float INIT_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected float initValue = INIT_VALUE_EDEFAULT;

	/**
	 * This is true if the Init Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initValueESet;

	/**
	 * The default value of the '{@link #getFallbackValue() <em>Fallback Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackValue()
	 * @generated
	 * @ordered
	 */
	protected static final float FALLBACK_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFallbackValue() <em>Fallback Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackValue()
	 * @generated
	 * @ordered
	 */
	protected float fallbackValue = FALLBACK_VALUE_EDEFAULT;

	/**
	 * This is true if the Fallback Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fallbackValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrStabilityFallbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrStabilityFallbackType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxReceiveTime() {
		return maxReceiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveTime(float newMaxReceiveTime) {
		float oldMaxReceiveTime = maxReceiveTime;
		maxReceiveTime = newMaxReceiveTime;
		boolean oldMaxReceiveTimeESet = maxReceiveTimeESet;
		maxReceiveTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME, oldMaxReceiveTime, maxReceiveTime, !oldMaxReceiveTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxReceiveTime() {
		float oldMaxReceiveTime = maxReceiveTime;
		boolean oldMaxReceiveTimeESet = maxReceiveTimeESet;
		maxReceiveTime = MAX_RECEIVE_TIME_EDEFAULT;
		maxReceiveTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME, oldMaxReceiveTime, MAX_RECEIVE_TIME_EDEFAULT, oldMaxReceiveTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxReceiveTime() {
		return maxReceiveTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitValue(float newInitValue) {
		float oldInitValue = initValue;
		initValue = newInitValue;
		boolean oldInitValueESet = initValueESet;
		initValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE, oldInitValue, initValue, !oldInitValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInitValue() {
		float oldInitValue = initValue;
		boolean oldInitValueESet = initValueESet;
		initValue = INIT_VALUE_EDEFAULT;
		initValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE, oldInitValue, INIT_VALUE_EDEFAULT, oldInitValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInitValue() {
		return initValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getFallbackValue() {
		return fallbackValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFallbackValue(float newFallbackValue) {
		float oldFallbackValue = fallbackValue;
		fallbackValue = newFallbackValue;
		boolean oldFallbackValueESet = fallbackValueESet;
		fallbackValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE, oldFallbackValue, fallbackValue, !oldFallbackValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFallbackValue() {
		float oldFallbackValue = fallbackValue;
		boolean oldFallbackValueESet = fallbackValueESet;
		fallbackValue = FALLBACK_VALUE_EDEFAULT;
		fallbackValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE, oldFallbackValue, FALLBACK_VALUE_EDEFAULT, oldFallbackValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFallbackValue() {
		return fallbackValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME:
				return getMaxReceiveTime();
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE:
				return getInitValue();
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE:
				return getFallbackValue();
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
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME:
				setMaxReceiveTime((Float)newValue);
				return;
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE:
				setInitValue((Float)newValue);
				return;
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE:
				setFallbackValue((Float)newValue);
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
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME:
				unsetMaxReceiveTime();
				return;
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE:
				unsetInitValue();
				return;
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE:
				unsetFallbackValue();
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
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME:
				return isSetMaxReceiveTime();
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE:
				return isSetInitValue();
			case V0Package.SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE:
				return isSetFallbackValue();
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
		result.append(" (maxReceiveTime: ");
		if (maxReceiveTimeESet) result.append(maxReceiveTime); else result.append("<unset>");
		result.append(", initValue: ");
		if (initValueESet) result.append(initValue); else result.append("<unset>");
		result.append(", fallbackValue: ");
		if (fallbackValueESet) result.append(fallbackValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrStabilityFallbackTypeImpl
