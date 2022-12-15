/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4RestAPIType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;
import com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Rest API Device Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDeviceFrameImpl#getRestAPIAttr <em>Rest API Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDeviceFrameImpl#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIDeviceFrameImpl#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIDeviceFrameImpl extends SGrDeviceBaseTypeImpl implements SGrRestAPIDeviceFrame {
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
	 * The cached value of the '{@link #getRestAPIInterfaceDesc() <em>Rest API Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIInterfaceDesc()
	 * @generated
	 * @ordered
	 */
	protected SGrRestAPIInterfaceDescriptionType restAPIInterfaceDesc;

	/**
	 * The cached value of the '{@link #getFpListElement() <em>Fp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIFunctionalProfileType> fpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIDeviceFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIDeviceFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4RestAPIType> getRestAPIAttr() {
		if (restAPIAttr == null) {
			restAPIAttr = new EObjectContainmentEList<SGrAttr4RestAPIType>(SGrAttr4RestAPIType.class, this, V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR);
		}
		return restAPIAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestAPIInterfaceDescriptionType getRestAPIInterfaceDesc() {
		return restAPIInterfaceDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType newRestAPIInterfaceDesc, NotificationChain msgs) {
		SGrRestAPIInterfaceDescriptionType oldRestAPIInterfaceDesc = restAPIInterfaceDesc;
		restAPIInterfaceDesc = newRestAPIInterfaceDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC, oldRestAPIInterfaceDesc, newRestAPIInterfaceDesc);
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
	public void setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType newRestAPIInterfaceDesc) {
		if (newRestAPIInterfaceDesc != restAPIInterfaceDesc) {
			NotificationChain msgs = null;
			if (restAPIInterfaceDesc != null)
				msgs = ((InternalEObject)restAPIInterfaceDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC, null, msgs);
			if (newRestAPIInterfaceDesc != null)
				msgs = ((InternalEObject)newRestAPIInterfaceDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC, null, msgs);
			msgs = basicSetRestAPIInterfaceDesc(newRestAPIInterfaceDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC, newRestAPIInterfaceDesc, newRestAPIInterfaceDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIFunctionalProfileType> getFpListElement() {
		if (fpListElement == null) {
			fpListElement = new EObjectContainmentEList<SGrRestAPIFunctionalProfileType>(SGrRestAPIFunctionalProfileType.class, this, V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT);
		}
		return fpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR:
				return ((InternalEList<?>)getRestAPIAttr()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC:
				return basicSetRestAPIInterfaceDesc(null, msgs);
			case V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				return ((InternalEList<?>)getFpListElement()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR:
				return getRestAPIAttr();
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC:
				return getRestAPIInterfaceDesc();
			case V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				return getFpListElement();
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
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR:
				getRestAPIAttr().clear();
				getRestAPIAttr().addAll((Collection<? extends SGrAttr4RestAPIType>)newValue);
				return;
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC:
				setRestAPIInterfaceDesc((SGrRestAPIInterfaceDescriptionType)newValue);
				return;
			case V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				getFpListElement().clear();
				getFpListElement().addAll((Collection<? extends SGrRestAPIFunctionalProfileType>)newValue);
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
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR:
				getRestAPIAttr().clear();
				return;
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC:
				setRestAPIInterfaceDesc((SGrRestAPIInterfaceDescriptionType)null);
				return;
			case V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				getFpListElement().clear();
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
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_ATTR:
				return restAPIAttr != null && !restAPIAttr.isEmpty();
			case V0Package.SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC:
				return restAPIInterfaceDesc != null;
			case V0Package.SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				return fpListElement != null && !fpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestAPIDeviceFrameImpl
