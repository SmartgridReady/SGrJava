/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrGenDeviceFrame;
import com.smartgridready.ns.v0.SGrGenFunctionalProfileType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Gen Device Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrGenDeviceFrameImpl#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrGenDeviceFrameImpl extends SGrDeviceBaseTypeImpl implements SGrGenDeviceFrame {
	/**
	 * The cached value of the '{@link #getFpListElement() <em>Fp List Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpListElement()
	 * @generated
	 * @ordered
	 */
	protected SGrGenFunctionalProfileType fpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrGenDeviceFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrGenDeviceFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrGenFunctionalProfileType getFpListElement() {
		return fpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpListElement(SGrGenFunctionalProfileType newFpListElement, NotificationChain msgs) {
		SGrGenFunctionalProfileType oldFpListElement = fpListElement;
		fpListElement = newFpListElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT, oldFpListElement, newFpListElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFpListElement(SGrGenFunctionalProfileType newFpListElement) {
		if (newFpListElement != fpListElement) {
			NotificationChain msgs = null;
			if (fpListElement != null)
				msgs = ((InternalEObject)fpListElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT, null, msgs);
			if (newFpListElement != null)
				msgs = ((InternalEObject)newFpListElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT, null, msgs);
			msgs = basicSetFpListElement(newFpListElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT, newFpListElement, newFpListElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT:
				return basicSetFpListElement(null, msgs);
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
			case V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT:
				return getFpListElement();
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
			case V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT:
				setFpListElement((SGrGenFunctionalProfileType)newValue);
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
			case V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT:
				setFpListElement((SGrGenFunctionalProfileType)null);
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
			case V0Package.SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT:
				return fpListElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SGrGenDeviceFrameImpl
