/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	@Override
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
	@Override
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR:
				return modbusAttr != null && !modbusAttr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusDataPointTypeImpl
