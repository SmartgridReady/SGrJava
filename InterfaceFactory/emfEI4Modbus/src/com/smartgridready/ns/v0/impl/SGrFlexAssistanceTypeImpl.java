/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrFlexAssistanceType;
import com.smartgridready.ns.v0.SGrObligLvlType;
import com.smartgridready.ns.v0.SGrSGCPServiceType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Flex Assistance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFlexAssistanceTypeImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFlexAssistanceTypeImpl#getObligedTo <em>Obliged To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrFlexAssistanceTypeImpl extends MinimalEObjectImpl.Container implements SGrFlexAssistanceType {
	/**
	 * The default value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected static final SGrSGCPServiceType ASSISTS_EDEFAULT = SGrSGCPServiceType.AT_NET_SERVICABLE;

	/**
	 * The cached value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected SGrSGCPServiceType assists = ASSISTS_EDEFAULT;

	/**
	 * This is true if the Assists attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assistsESet;

	/**
	 * The default value of the '{@link #getObligedTo() <em>Obliged To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligedTo()
	 * @generated
	 * @ordered
	 */
	protected static final SGrObligLvlType OBLIGED_TO_EDEFAULT = SGrObligLvlType.OLSHALL;

	/**
	 * The cached value of the '{@link #getObligedTo() <em>Obliged To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligedTo()
	 * @generated
	 * @ordered
	 */
	protected SGrObligLvlType obligedTo = OBLIGED_TO_EDEFAULT;

	/**
	 * This is true if the Obliged To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean obligedToESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrFlexAssistanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrFlexAssistanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSGCPServiceType getAssists() {
		return assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssists(SGrSGCPServiceType newAssists) {
		SGrSGCPServiceType oldAssists = assists;
		assists = newAssists == null ? ASSISTS_EDEFAULT : newAssists;
		boolean oldAssistsESet = assistsESet;
		assistsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS, oldAssists, assists, !oldAssistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAssists() {
		SGrSGCPServiceType oldAssists = assists;
		boolean oldAssistsESet = assistsESet;
		assists = ASSISTS_EDEFAULT;
		assistsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS, oldAssists, ASSISTS_EDEFAULT, oldAssistsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssists() {
		return assistsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrObligLvlType getObligedTo() {
		return obligedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObligedTo(SGrObligLvlType newObligedTo) {
		SGrObligLvlType oldObligedTo = obligedTo;
		obligedTo = newObligedTo == null ? OBLIGED_TO_EDEFAULT : newObligedTo;
		boolean oldObligedToESet = obligedToESet;
		obligedToESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO, oldObligedTo, obligedTo, !oldObligedToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetObligedTo() {
		SGrObligLvlType oldObligedTo = obligedTo;
		boolean oldObligedToESet = obligedToESet;
		obligedTo = OBLIGED_TO_EDEFAULT;
		obligedToESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO, oldObligedTo, OBLIGED_TO_EDEFAULT, oldObligedToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetObligedTo() {
		return obligedToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS:
				return getAssists();
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO:
				return getObligedTo();
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
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS:
				setAssists((SGrSGCPServiceType)newValue);
				return;
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO:
				setObligedTo((SGrObligLvlType)newValue);
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
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS:
				unsetAssists();
				return;
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO:
				unsetObligedTo();
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
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__ASSISTS:
				return isSetAssists();
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO:
				return isSetObligedTo();
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
		result.append(" (assists: ");
		if (assistsESet) result.append(assists); else result.append("<unset>");
		result.append(", obligedTo: ");
		if (obligedToESet) result.append(obligedTo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrFlexAssistanceTypeImpl
