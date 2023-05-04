/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrModbusEnumMapperType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Enum Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusEnumMapperTypeImpl#getModbusEnumMapper <em>Modbus Enum Mapper</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusEnumMapperTypeImpl#getGenEnumMapper <em>Gen Enum Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusEnumMapperTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusEnumMapperType {
	/**
	 * The cached value of the '{@link #getModbusEnumMapper() <em>Modbus Enum Mapper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusEnumMapper()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> modbusEnumMapper;

	/**
	 * The cached value of the '{@link #getGenEnumMapper() <em>Gen Enum Mapper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenEnumMapper()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> genEnumMapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusEnumMapperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusEnumMapperType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getModbusEnumMapper() {
		if (modbusEnumMapper == null) {
			modbusEnumMapper = new EDataTypeEList<Long>(Long.class, this, V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER);
		}
		return modbusEnumMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getGenEnumMapper() {
		if (genEnumMapper == null) {
			genEnumMapper = new EDataTypeEList<Long>(Long.class, this, V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER);
		}
		return genEnumMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER:
				return getModbusEnumMapper();
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER:
				return getGenEnumMapper();
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
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER:
				getModbusEnumMapper().clear();
				getModbusEnumMapper().addAll((Collection<? extends Long>)newValue);
				return;
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER:
				getGenEnumMapper().clear();
				getGenEnumMapper().addAll((Collection<? extends Long>)newValue);
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
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER:
				getModbusEnumMapper().clear();
				return;
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER:
				getGenEnumMapper().clear();
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
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER:
				return modbusEnumMapper != null && !modbusEnumMapper.isEmpty();
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER:
				return genEnumMapper != null && !genEnumMapper.isEmpty();
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
		result.append(" (modbusEnumMapper: ");
		result.append(modbusEnumMapper);
		result.append(", genEnumMapper: ");
		result.append(genEnumMapper);
		result.append(')');
		return result.toString();
	}

} //SGrModbusEnumMapperTypeImpl
