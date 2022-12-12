/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4RestAPIType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Attr4 Rest API Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrAttr4RestAPITypeImpl#getPlaceHolder4futureExtensions <em>Place Holder4future Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrAttr4RestAPITypeImpl extends MinimalEObjectImpl.Container implements SGrAttr4RestAPIType {
	/**
	 * The default value of the '{@link #getPlaceHolder4futureExtensions() <em>Place Holder4future Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder4futureExtensions()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_HOLDER4FUTURE_EXTENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceHolder4futureExtensions() <em>Place Holder4future Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder4futureExtensions()
	 * @generated
	 * @ordered
	 */
	protected String placeHolder4futureExtensions = PLACE_HOLDER4FUTURE_EXTENSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrAttr4RestAPITypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrAttr4RestAPIType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceHolder4futureExtensions() {
		return placeHolder4futureExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceHolder4futureExtensions(String newPlaceHolder4futureExtensions) {
		String oldPlaceHolder4futureExtensions = placeHolder4futureExtensions;
		placeHolder4futureExtensions = newPlaceHolder4futureExtensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS, oldPlaceHolder4futureExtensions, placeHolder4futureExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS:
				return getPlaceHolder4futureExtensions();
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
			case V0Package.SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS:
				setPlaceHolder4futureExtensions((String)newValue);
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
			case V0Package.SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS:
				setPlaceHolder4futureExtensions(PLACE_HOLDER4FUTURE_EXTENSIONS_EDEFAULT);
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
			case V0Package.SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS:
				return PLACE_HOLDER4FUTURE_EXTENSIONS_EDEFAULT == null ? placeHolder4futureExtensions != null : !PLACE_HOLDER4FUTURE_EXTENSIONS_EDEFAULT.equals(placeHolder4futureExtensions);
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
		result.append(" (placeHolder4futureExtensions: ");
		result.append(placeHolder4futureExtensions);
		result.append(')');
		return result.toString();
	}

} //SGrAttr4RestAPITypeImpl
