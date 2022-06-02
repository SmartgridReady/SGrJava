/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrAttr4GenericType;
import ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrDataPointsFrameType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrDataPointsFrameTypeImpl#getDpAttr4Generic <em>Dp Attr4 Generic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrDataPointsFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrDataPointsFrameType {
	/**
	 * The cached value of the '{@link #getDataPoint() <em>Data Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPoint()
	 * @generated
	 * @ordered
	 */
	protected SGrDataPointDescriptionType dataPoint;

	/**
	 * The cached value of the '{@link #getDpAttr4Generic() <em>Dp Attr4 Generic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpAttr4Generic()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4GenericType> dpAttr4Generic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrDataPointsFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrDataPointsFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrDataPointDescriptionType getDataPoint() {
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPoint(SGrDataPointDescriptionType newDataPoint, NotificationChain msgs) {
		SGrDataPointDescriptionType oldDataPoint = dataPoint;
		dataPoint = newDataPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT, oldDataPoint, newDataPoint);
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
	public void setDataPoint(SGrDataPointDescriptionType newDataPoint) {
		if (newDataPoint != dataPoint) {
			NotificationChain msgs = null;
			if (dataPoint != null)
				msgs = ((InternalEObject)dataPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT, null, msgs);
			if (newDataPoint != null)
				msgs = ((InternalEObject)newDataPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT, null, msgs);
			msgs = basicSetDataPoint(newDataPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT, newDataPoint, newDataPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4GenericType> getDpAttr4Generic() {
		if (dpAttr4Generic == null) {
			dpAttr4Generic = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC);
		}
		return dpAttr4Generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return basicSetDataPoint(null, msgs);
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC:
				return ((InternalEList<?>)getDpAttr4Generic()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return getDataPoint();
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC:
				return getDpAttr4Generic();
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
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				setDataPoint((SGrDataPointDescriptionType)newValue);
				return;
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC:
				getDpAttr4Generic().clear();
				getDpAttr4Generic().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
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
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				setDataPoint((SGrDataPointDescriptionType)null);
				return;
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC:
				getDpAttr4Generic().clear();
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
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return dataPoint != null;
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE__DP_ATTR4_GENERIC:
				return dpAttr4Generic != null && !dpAttr4Generic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrDataPointsFrameTypeImpl
