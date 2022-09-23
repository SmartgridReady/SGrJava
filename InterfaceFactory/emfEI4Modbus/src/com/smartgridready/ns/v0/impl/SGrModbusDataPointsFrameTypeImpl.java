/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointsFrameType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointsFrameTypeImpl#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointsFrameTypeImpl#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointsFrameTypeImpl#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusDataPointsFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusDataPointsFrameType {
	/**
	 * The cached value of the '{@link #getDataPoint() <em>Data Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrDataPointDescriptionType> dataPoint;

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
	 * The cached value of the '{@link #getGenAttribute() <em>Gen Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4GenericType> genAttribute;

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
	protected SGrModbusDataPointsFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusDataPointsFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrDataPointDescriptionType> getDataPoint() {
		if (dataPoint == null) {
			dataPoint = new EObjectContainmentEList<SGrDataPointDescriptionType>(SGrDataPointDescriptionType.class, this, V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT);
		}
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusDataPointDescriptionType> getModbusDataPoint() {
		if (modbusDataPoint == null) {
			modbusDataPoint = new EObjectContainmentEList<SGrModbusDataPointDescriptionType>(SGrModbusDataPointDescriptionType.class, this, V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT);
		}
		return modbusDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4GenericType> getGenAttribute() {
		if (genAttribute == null) {
			genAttribute = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE);
		}
		return genAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4ModbusType> getModbusAttr() {
		if (modbusAttr == null) {
			modbusAttr = new EObjectContainmentEList<SGrAttr4ModbusType>(SGrAttr4ModbusType.class, this, V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR);
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return ((InternalEList<?>)getDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT:
				return ((InternalEList<?>)getModbusDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return ((InternalEList<?>)getGenAttribute()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR:
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return getDataPoint();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT:
				return getModbusDataPoint();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return getGenAttribute();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR:
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				getDataPoint().addAll((Collection<? extends SGrDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT:
				getModbusDataPoint().clear();
				getModbusDataPoint().addAll((Collection<? extends SGrModbusDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				getGenAttribute().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR:
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT:
				getModbusDataPoint().clear();
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				return;
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR:
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return dataPoint != null && !dataPoint.isEmpty();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_DATA_POINT:
				return modbusDataPoint != null && !modbusDataPoint.isEmpty();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return genAttribute != null && !genAttribute.isEmpty();
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__MODBUS_ATTR:
				return modbusAttr != null && !modbusAttr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusDataPointsFrameTypeImpl
