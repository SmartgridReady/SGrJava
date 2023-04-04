/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrScalingType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrScalingTypeImpl#getMultiplicator <em>Multiplicator</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrScalingTypeImpl#getPowerof10 <em>Powerof10</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrScalingTypeImpl extends MinimalEObjectImpl.Container implements SGrScalingType {
	/**
	 * The default value of the '{@link #getMultiplicator() <em>Multiplicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicator()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicator() <em>Multiplicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicator()
	 * @generated
	 * @ordered
	 */
	protected int multiplicator = MULTIPLICATOR_EDEFAULT;

	/**
	 * This is true if the Multiplicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicatorESet;

	/**
	 * The default value of the '{@link #getPowerof10() <em>Powerof10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerof10()
	 * @generated
	 * @ordered
	 */
	protected static final int POWEROF10_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerof10() <em>Powerof10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerof10()
	 * @generated
	 * @ordered
	 */
	protected int powerof10 = POWEROF10_EDEFAULT;

	/**
	 * This is true if the Powerof10 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerof10ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrScalingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrScalingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicator() {
		return multiplicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicator(int newMultiplicator) {
		int oldMultiplicator = multiplicator;
		multiplicator = newMultiplicator;
		boolean oldMultiplicatorESet = multiplicatorESet;
		multiplicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_SCALING_TYPE__MULTIPLICATOR, oldMultiplicator, multiplicator, !oldMultiplicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplicator() {
		int oldMultiplicator = multiplicator;
		boolean oldMultiplicatorESet = multiplicatorESet;
		multiplicator = MULTIPLICATOR_EDEFAULT;
		multiplicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_SCALING_TYPE__MULTIPLICATOR, oldMultiplicator, MULTIPLICATOR_EDEFAULT, oldMultiplicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplicator() {
		return multiplicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPowerof10() {
		return powerof10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerof10(int newPowerof10) {
		int oldPowerof10 = powerof10;
		powerof10 = newPowerof10;
		boolean oldPowerof10ESet = powerof10ESet;
		powerof10ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_SCALING_TYPE__POWEROF10, oldPowerof10, powerof10, !oldPowerof10ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPowerof10() {
		int oldPowerof10 = powerof10;
		boolean oldPowerof10ESet = powerof10ESet;
		powerof10 = POWEROF10_EDEFAULT;
		powerof10ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_SCALING_TYPE__POWEROF10, oldPowerof10, POWEROF10_EDEFAULT, oldPowerof10ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPowerof10() {
		return powerof10ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_SCALING_TYPE__MULTIPLICATOR:
				return getMultiplicator();
			case V0Package.SGR_SCALING_TYPE__POWEROF10:
				return getPowerof10();
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
			case V0Package.SGR_SCALING_TYPE__MULTIPLICATOR:
				setMultiplicator((Integer)newValue);
				return;
			case V0Package.SGR_SCALING_TYPE__POWEROF10:
				setPowerof10((Integer)newValue);
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
			case V0Package.SGR_SCALING_TYPE__MULTIPLICATOR:
				unsetMultiplicator();
				return;
			case V0Package.SGR_SCALING_TYPE__POWEROF10:
				unsetPowerof10();
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
			case V0Package.SGR_SCALING_TYPE__MULTIPLICATOR:
				return isSetMultiplicator();
			case V0Package.SGR_SCALING_TYPE__POWEROF10:
				return isSetPowerof10();
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
		result.append(" (multiplicator: ");
		if (multiplicatorESet) result.append(multiplicator); else result.append("<unset>");
		result.append(", powerof10: ");
		if (powerof10ESet) result.append(powerof10); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrScalingTypeImpl
