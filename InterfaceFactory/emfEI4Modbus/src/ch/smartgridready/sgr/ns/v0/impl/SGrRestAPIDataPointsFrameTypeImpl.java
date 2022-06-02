/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointsFrameType;
import ch.smartgridready.sgr.ns.v0.V0Package;

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
 * An implementation of the model object '<em><b>SGr Rest API Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getRestAPIDataPoint <em>Rest API Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getDpRestAPIAttrReference <em>Dp Rest API Attr Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIDataPointsFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrRestAPIDataPointsFrameType {
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
	 * The cached value of the '{@link #getRestAPIDataPoint() <em>Rest API Data Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIDataPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIDataPointDescriptionType> restAPIDataPoint;

	/**
	 * The cached value of the '{@link #getDpRestAPIAttrReference() <em>Dp Rest API Attr Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpRestAPIAttrReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIAttrFrameType> dpRestAPIAttrReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIDataPointsFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIDataPointsFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrDataPointDescriptionType> getDataPoint() {
		if (dataPoint == null) {
			dataPoint = new EObjectContainmentEList<SGrDataPointDescriptionType>(SGrDataPointDescriptionType.class, this, V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT);
		}
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIDataPointDescriptionType> getRestAPIDataPoint() {
		if (restAPIDataPoint == null) {
			restAPIDataPoint = new EObjectContainmentEList<SGrRestAPIDataPointDescriptionType>(SGrRestAPIDataPointDescriptionType.class, this, V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT);
		}
		return restAPIDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIAttrFrameType> getDpRestAPIAttrReference() {
		if (dpRestAPIAttrReference == null) {
			dpRestAPIAttrReference = new EObjectContainmentEList<SGrRestAPIAttrFrameType>(SGrRestAPIAttrFrameType.class, this, V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE);
		}
		return dpRestAPIAttrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return ((InternalEList<?>)getDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT:
				return ((InternalEList<?>)getRestAPIDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				return ((InternalEList<?>)getDpRestAPIAttrReference()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return getDataPoint();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT:
				return getRestAPIDataPoint();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				return getDpRestAPIAttrReference();
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				getDataPoint().addAll((Collection<? extends SGrDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT:
				getRestAPIDataPoint().clear();
				getRestAPIDataPoint().addAll((Collection<? extends SGrRestAPIDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				getDpRestAPIAttrReference().clear();
				getDpRestAPIAttrReference().addAll((Collection<? extends SGrRestAPIAttrFrameType>)newValue);
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT:
				getRestAPIDataPoint().clear();
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				getDpRestAPIAttrReference().clear();
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return dataPoint != null && !dataPoint.isEmpty();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_DATA_POINT:
				return restAPIDataPoint != null && !restAPIDataPoint.isEmpty();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				return dpRestAPIAttrReference != null && !dpRestAPIAttrReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestAPIDataPointsFrameTypeImpl
