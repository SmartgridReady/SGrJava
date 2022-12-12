/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIdataTypeType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Rest API Data Point Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointDescriptionTypeImpl#getRestServiceCall <em>Rest Service Call</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointDescriptionTypeImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIDataPointDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrRestAPIDataPointDescriptionType {
	/**
	 * The cached value of the '{@link #getRestServiceCall() <em>Rest Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestServiceCall()
	 * @generated
	 * @ordered
	 */
	protected RestServiceCall restServiceCall;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final SGrRestAPIdataTypeType DATA_TYPE_EDEFAULT = SGrRestAPIdataTypeType.NULL;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected SGrRestAPIdataTypeType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Data Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIDataPointDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIDataPointDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestServiceCall getRestServiceCall() {
		return restServiceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestServiceCall(RestServiceCall newRestServiceCall, NotificationChain msgs) {
		RestServiceCall oldRestServiceCall = restServiceCall;
		restServiceCall = newRestServiceCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL, oldRestServiceCall, newRestServiceCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestServiceCall(RestServiceCall newRestServiceCall) {
		if (newRestServiceCall != restServiceCall) {
			NotificationChain msgs = null;
			if (restServiceCall != null)
				msgs = ((InternalEObject)restServiceCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL, null, msgs);
			if (newRestServiceCall != null)
				msgs = ((InternalEObject)newRestServiceCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL, null, msgs);
			msgs = basicSetRestServiceCall(newRestServiceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL, newRestServiceCall, newRestServiceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrRestAPIdataTypeType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(SGrRestAPIdataTypeType newDataType) {
		SGrRestAPIdataTypeType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataType() {
		SGrRestAPIdataTypeType oldDataType = dataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataType = DATA_TYPE_EDEFAULT;
		dataTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataType() {
		return dataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL:
				return basicSetRestServiceCall(null, msgs);
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
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL:
				return getRestServiceCall();
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE:
				return getDataType();
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
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL:
				setRestServiceCall((RestServiceCall)newValue);
				return;
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE:
				setDataType((SGrRestAPIdataTypeType)newValue);
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
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL:
				setRestServiceCall((RestServiceCall)null);
				return;
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE:
				unsetDataType();
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
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL:
				return restServiceCall != null;
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE:
				return isSetDataType();
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
		result.append(" (dataType: ");
		if (dataTypeESet) result.append(dataType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrRestAPIDataPointDescriptionTypeImpl
