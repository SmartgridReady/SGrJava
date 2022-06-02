/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrRestDataPointsFrameType;
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
 * An implementation of the model object '<em><b>SGr Rest Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestDataPointsFrameTypeImpl#getRestDataPoint <em>Rest Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestDataPointsFrameTypeImpl#getDpRestAPIAttrReference <em>Dp Rest API Attr Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestDataPointsFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrRestDataPointsFrameType {
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
	 * The cached value of the '{@link #getRestDataPoint() <em>Rest Data Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestDataPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIDataPointDescriptionType> restDataPoint;

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
	protected SGrRestDataPointsFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestDataPointsFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrDataPointDescriptionType> getDataPoint() {
		if (dataPoint == null) {
			dataPoint = new EObjectContainmentEList<SGrDataPointDescriptionType>(SGrDataPointDescriptionType.class, this, V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT);
		}
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIDataPointDescriptionType> getRestDataPoint() {
		if (restDataPoint == null) {
			restDataPoint = new EObjectContainmentEList<SGrRestAPIDataPointDescriptionType>(SGrRestAPIDataPointDescriptionType.class, this, V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT);
		}
		return restDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIAttrFrameType> getDpRestAPIAttrReference() {
		if (dpRestAPIAttrReference == null) {
			dpRestAPIAttrReference = new EObjectContainmentEList<SGrRestAPIAttrFrameType>(SGrRestAPIAttrFrameType.class, this, V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE);
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
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return ((InternalEList<?>)getDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT:
				return ((InternalEList<?>)getRestDataPoint()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
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
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return getDataPoint();
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT:
				return getRestDataPoint();
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
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
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				getDataPoint().addAll((Collection<? extends SGrDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT:
				getRestDataPoint().clear();
				getRestDataPoint().addAll((Collection<? extends SGrRestAPIDataPointDescriptionType>)newValue);
				return;
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
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
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				getDataPoint().clear();
				return;
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT:
				getRestDataPoint().clear();
				return;
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
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
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DATA_POINT:
				return dataPoint != null && !dataPoint.isEmpty();
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__REST_DATA_POINT:
				return restDataPoint != null && !restDataPoint.isEmpty();
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE__DP_REST_API_ATTR_REFERENCE:
				return dpRestAPIAttrReference != null && !dpRestAPIAttrReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestDataPointsFrameTypeImpl
