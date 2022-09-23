/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrAttr4RestAPIType;
import com.smartgridready.ns.v0.SGrDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType;
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
 * An implementation of the model object '<em><b>SGr Rest API Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getRestAPIDataPoint <em>Rest API Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointsFrameTypeImpl#getRestAPIAttr <em>Rest API Attr</em>}</li>
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
	 * The cached value of the '{@link #getGenAttribute() <em>Gen Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4GenericType> genAttribute;

	/**
	 * The cached value of the '{@link #getRestAPIAttr() <em>Rest API Attr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4RestAPIType> restAPIAttr;

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
	public EList<SGrAttr4GenericType> getGenAttribute() {
		if (genAttribute == null) {
			genAttribute = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE);
		}
		return genAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4RestAPIType> getRestAPIAttr() {
		if (restAPIAttr == null) {
			restAPIAttr = new EObjectContainmentEList<SGrAttr4RestAPIType>(SGrAttr4RestAPIType.class, this, V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR);
		}
		return restAPIAttr;
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return ((InternalEList<?>)getGenAttribute()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR:
				return ((InternalEList<?>)getRestAPIAttr()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return getGenAttribute();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR:
				return getRestAPIAttr();
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				getGenAttribute().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
				getRestAPIAttr().addAll((Collection<? extends SGrAttr4RestAPIType>)newValue);
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				return;
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
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
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__GEN_ATTRIBUTE:
				return genAttribute != null && !genAttribute.isEmpty();
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE__REST_API_ATTR:
				return restAPIAttr != null && !restAPIAttr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestAPIDataPointsFrameTypeImpl
