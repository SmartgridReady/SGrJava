/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGrDataPointDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusAttrFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDataPointDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDataPointsFrameType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

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
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDataPointsFrameTypeImpl#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDataPointsFrameTypeImpl#getDpMbAttrReference <em>Dp Mb Attr Reference</em>}</li>
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
	 * The cached value of the '{@link #getDpMbAttrReference() <em>Dp Mb Attr Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpMbAttrReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusAttrFrameType> dpMbAttrReference;

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
	public EList<SGrModbusAttrFrameType> getDpMbAttrReference() {
		if (dpMbAttrReference == null) {
			dpMbAttrReference = new EObjectContainmentEList<SGrModbusAttrFrameType>(SGrModbusAttrFrameType.class, this, V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE);
		}
		return dpMbAttrReference;
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE:
				return ((InternalEList<?>)getDpMbAttrReference()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE:
				return getDpMbAttrReference();
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE:
				getDpMbAttrReference().clear();
				getDpMbAttrReference().addAll((Collection<? extends SGrModbusAttrFrameType>)newValue);
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE:
				getDpMbAttrReference().clear();
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
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE__DP_MB_ATTR_REFERENCE:
				return dpMbAttrReference != null && !dpMbAttrReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusDataPointsFrameTypeImpl
