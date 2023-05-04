/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrModbusBitmapMapperType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Bitmap Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusBitmapMapperTypeImpl#getModbusBitMapper <em>Modbus Bit Mapper</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusBitmapMapperTypeImpl#getGenBitMapper <em>Gen Bit Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusBitmapMapperTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusBitmapMapperType {
	/**
	 * The cached value of the '{@link #getModbusBitMapper() <em>Modbus Bit Mapper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusBitMapper()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> modbusBitMapper;

	/**
	 * The cached value of the '{@link #getGenBitMapper() <em>Gen Bit Mapper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenBitMapper()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> genBitMapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusBitmapMapperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusBitmapMapperType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getModbusBitMapper() {
		if (modbusBitMapper == null) {
			modbusBitMapper = new EDataTypeEList<Long>(Long.class, this, V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER);
		}
		return modbusBitMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getGenBitMapper() {
		if (genBitMapper == null) {
			genBitMapper = new EDataTypeEList<Long>(Long.class, this, V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER);
		}
		return genBitMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER:
				return getModbusBitMapper();
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER:
				return getGenBitMapper();
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
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER:
				getModbusBitMapper().clear();
				getModbusBitMapper().addAll((Collection<? extends Long>)newValue);
				return;
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER:
				getGenBitMapper().clear();
				getGenBitMapper().addAll((Collection<? extends Long>)newValue);
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
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER:
				getModbusBitMapper().clear();
				return;
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER:
				getGenBitMapper().clear();
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
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER:
				return modbusBitMapper != null && !modbusBitMapper.isEmpty();
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER:
				return genBitMapper != null && !genBitMapper.isEmpty();
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
		result.append(" (modbusBitMapper: ");
		result.append(modbusBitMapper);
		result.append(", genBitMapper: ");
		result.append(genBitMapper);
		result.append(')');
		return result.toString();
	}

} //SGrModbusBitmapMapperTypeImpl
