/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrModbusBooleanMapperType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Boolean Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusBooleanMapperTypeImpl#isAssignedValueMeans <em>Assigned Value Means</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusBooleanMapperTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusBooleanMapperTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusBooleanMapperType {
	/**
	 * The default value of the '{@link #isAssignedValueMeans() <em>Assigned Value Means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssignedValueMeans()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSIGNED_VALUE_MEANS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssignedValueMeans() <em>Assigned Value Means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssignedValueMeans()
	 * @generated
	 * @ordered
	 */
	protected boolean assignedValueMeans = ASSIGNED_VALUE_MEANS_EDEFAULT;

	/**
	 * This is true if the Assigned Value Means attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assignedValueMeansESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusBooleanMapperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusBooleanMapperType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAssignedValueMeans() {
		return assignedValueMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedValueMeans(boolean newAssignedValueMeans) {
		boolean oldAssignedValueMeans = assignedValueMeans;
		assignedValueMeans = newAssignedValueMeans;
		boolean oldAssignedValueMeansESet = assignedValueMeansESet;
		assignedValueMeansESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS, oldAssignedValueMeans, assignedValueMeans, !oldAssignedValueMeansESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAssignedValueMeans() {
		boolean oldAssignedValueMeans = assignedValueMeans;
		boolean oldAssignedValueMeansESet = assignedValueMeansESet;
		assignedValueMeans = ASSIGNED_VALUE_MEANS_EDEFAULT;
		assignedValueMeansESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS, oldAssignedValueMeans, ASSIGNED_VALUE_MEANS_EDEFAULT, oldAssignedValueMeansESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssignedValueMeans() {
		return assignedValueMeansESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValue() {
		long oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS:
				return isAssignedValueMeans();
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE:
				return getValue();
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
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS:
				setAssignedValueMeans((Boolean)newValue);
				return;
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE:
				setValue((Long)newValue);
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
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS:
				unsetAssignedValueMeans();
				return;
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE:
				unsetValue();
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
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__ASSIGNED_VALUE_MEANS:
				return isSetAssignedValueMeans();
			case V0Package.SGR_MODBUS_BOOLEAN_MAPPER_TYPE__VALUE:
				return isSetValue();
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
		result.append(" (assignedValueMeans: ");
		if (assignedValueMeansESet) result.append(assignedValueMeans); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrModbusBooleanMapperTypeImpl
