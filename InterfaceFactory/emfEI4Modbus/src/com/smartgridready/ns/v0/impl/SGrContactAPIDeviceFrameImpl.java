/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.ContactAPIInterfaceDescType;
import com.smartgridready.ns.v0.SGrContactAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType;
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
 * An implementation of the model object '<em><b>SGr Contact API Device Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrContactAPIDeviceFrameImpl#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrContactAPIDeviceFrameImpl#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrContactAPIDeviceFrameImpl extends SGrDeviceBaseTypeImpl implements SGrContactAPIDeviceFrame {
	/**
	 * The cached value of the '{@link #getContactApiInterfaceDesc() <em>Contact Api Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactApiInterfaceDesc()
	 * @generated
	 * @ordered
	 */
	protected ContactAPIInterfaceDescType contactApiInterfaceDesc;

	/**
	 * The cached value of the '{@link #getFpListElement() <em>Fp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrContactAPIFunctionalProfileType> fpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrContactAPIDeviceFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrContactAPIDeviceFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactAPIInterfaceDescType getContactApiInterfaceDesc() {
		return contactApiInterfaceDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactApiInterfaceDesc(ContactAPIInterfaceDescType newContactApiInterfaceDesc, NotificationChain msgs) {
		ContactAPIInterfaceDescType oldContactApiInterfaceDesc = contactApiInterfaceDesc;
		contactApiInterfaceDesc = newContactApiInterfaceDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC, oldContactApiInterfaceDesc, newContactApiInterfaceDesc);
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
	public void setContactApiInterfaceDesc(ContactAPIInterfaceDescType newContactApiInterfaceDesc) {
		if (newContactApiInterfaceDesc != contactApiInterfaceDesc) {
			NotificationChain msgs = null;
			if (contactApiInterfaceDesc != null)
				msgs = ((InternalEObject)contactApiInterfaceDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC, null, msgs);
			if (newContactApiInterfaceDesc != null)
				msgs = ((InternalEObject)newContactApiInterfaceDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC, null, msgs);
			msgs = basicSetContactApiInterfaceDesc(newContactApiInterfaceDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC, newContactApiInterfaceDesc, newContactApiInterfaceDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrContactAPIFunctionalProfileType> getFpListElement() {
		if (fpListElement == null) {
			fpListElement = new EObjectContainmentEList<SGrContactAPIFunctionalProfileType>(SGrContactAPIFunctionalProfileType.class, this, V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT);
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
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC:
				return basicSetContactApiInterfaceDesc(null, msgs);
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT:
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
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC:
				return getContactApiInterfaceDesc();
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT:
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
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC:
				setContactApiInterfaceDesc((ContactAPIInterfaceDescType)newValue);
				return;
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				getFpListElement().clear();
				getFpListElement().addAll((Collection<? extends SGrContactAPIFunctionalProfileType>)newValue);
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
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC:
				setContactApiInterfaceDesc((ContactAPIInterfaceDescType)null);
				return;
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT:
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
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC:
				return contactApiInterfaceDesc != null;
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT:
				return fpListElement != null && !fpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrContactAPIDeviceFrameImpl
