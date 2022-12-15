/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.TPipV6genAddrType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPip V6gen Addr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPipV6genAddrTypeImpl#getPrelimStringDef <em>Prelim String Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPipV6genAddrTypeImpl extends MinimalEObjectImpl.Container implements TPipV6genAddrType {
	/**
	 * The default value of the '{@link #getPrelimStringDef() <em>Prelim String Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrelimStringDef()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIM_STRING_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrelimStringDef() <em>Prelim String Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrelimStringDef()
	 * @generated
	 * @ordered
	 */
	protected String prelimStringDef = PRELIM_STRING_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPipV6genAddrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTPipV6genAddrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrelimStringDef() {
		return prelimStringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrelimStringDef(String newPrelimStringDef) {
		String oldPrelimStringDef = prelimStringDef;
		prelimStringDef = newPrelimStringDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF, oldPrelimStringDef, prelimStringDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF:
				return getPrelimStringDef();
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
			case V0Package.TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF:
				setPrelimStringDef((String)newValue);
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
			case V0Package.TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF:
				setPrelimStringDef(PRELIM_STRING_DEF_EDEFAULT);
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
			case V0Package.TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF:
				return PRELIM_STRING_DEF_EDEFAULT == null ? prelimStringDef != null : !PRELIM_STRING_DEF_EDEFAULT.equals(prelimStringDef);
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
		result.append(" (prelimStringDef: ");
		result.append(prelimStringDef);
		result.append(')');
		return result.toString();
	}

} //TPipV6genAddrTypeImpl
