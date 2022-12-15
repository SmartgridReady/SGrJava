/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.SGRrestAPIBearerType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SG Rrest API Bearer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGRrestAPIBearerTypeImpl#getServiceCall <em>Service Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGRrestAPIBearerTypeImpl extends MinimalEObjectImpl.Container implements SGRrestAPIBearerType {
	/**
	 * The cached value of the '{@link #getServiceCall() <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCall()
	 * @generated
	 * @ordered
	 */
	protected RestServiceCall serviceCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGRrestAPIBearerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGRrestAPIBearerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestServiceCall getServiceCall() {
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCall(RestServiceCall newServiceCall, NotificationChain msgs) {
		RestServiceCall oldServiceCall = serviceCall;
		serviceCall = newServiceCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL, oldServiceCall, newServiceCall);
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
	public void setServiceCall(RestServiceCall newServiceCall) {
		if (newServiceCall != serviceCall) {
			NotificationChain msgs = null;
			if (serviceCall != null)
				msgs = ((InternalEObject)serviceCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL, null, msgs);
			if (newServiceCall != null)
				msgs = ((InternalEObject)newServiceCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL, null, msgs);
			msgs = basicSetServiceCall(newServiceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL, newServiceCall, newServiceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL:
				return basicSetServiceCall(null, msgs);
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
			case V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL:
				return getServiceCall();
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
			case V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL:
				setServiceCall((RestServiceCall)newValue);
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
			case V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL:
				setServiceCall((RestServiceCall)null);
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
			case V0Package.SG_RREST_API_BEARER_TYPE__SERVICE_CALL:
				return serviceCall != null;
		}
		return super.eIsSet(featureID);
	}

} //SGRrestAPIBearerTypeImpl
