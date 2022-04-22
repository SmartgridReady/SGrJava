/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGrInterfaceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrTransportServicesUsedListType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrInterfaceDescriptionTypeImpl#getTechnologyUsed <em>Technology Used</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrInterfaceDescriptionTypeImpl#isIsLocalControl <em>Is Local Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrInterfaceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrInterfaceDescriptionType {
	/**
	 * The default value of the '{@link #getTechnologyUsed() <em>Technology Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyUsed()
	 * @generated
	 * @ordered
	 */
	protected static final SGrTransportServicesUsedListType TECHNOLOGY_USED_EDEFAULT = SGrTransportServicesUsedListType.EEBUS;

	/**
	 * The cached value of the '{@link #getTechnologyUsed() <em>Technology Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyUsed()
	 * @generated
	 * @ordered
	 */
	protected SGrTransportServicesUsedListType technologyUsed = TECHNOLOGY_USED_EDEFAULT;

	/**
	 * This is true if the Technology Used attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean technologyUsedESet;

	/**
	 * The default value of the '{@link #isIsLocalControl() <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalControl() <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalControl = IS_LOCAL_CONTROL_EDEFAULT;

	/**
	 * This is true if the Is Local Control attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalControlESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrInterfaceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrInterfaceDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrTransportServicesUsedListType getTechnologyUsed() {
		return technologyUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnologyUsed(SGrTransportServicesUsedListType newTechnologyUsed) {
		SGrTransportServicesUsedListType oldTechnologyUsed = technologyUsed;
		technologyUsed = newTechnologyUsed == null ? TECHNOLOGY_USED_EDEFAULT : newTechnologyUsed;
		boolean oldTechnologyUsedESet = technologyUsedESet;
		technologyUsedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED, oldTechnologyUsed, technologyUsed, !oldTechnologyUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTechnologyUsed() {
		SGrTransportServicesUsedListType oldTechnologyUsed = technologyUsed;
		boolean oldTechnologyUsedESet = technologyUsedESet;
		technologyUsed = TECHNOLOGY_USED_EDEFAULT;
		technologyUsedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED, oldTechnologyUsed, TECHNOLOGY_USED_EDEFAULT, oldTechnologyUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTechnologyUsed() {
		return technologyUsedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLocalControl() {
		return isLocalControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLocalControl(boolean newIsLocalControl) {
		boolean oldIsLocalControl = isLocalControl;
		isLocalControl = newIsLocalControl;
		boolean oldIsLocalControlESet = isLocalControlESet;
		isLocalControlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, isLocalControl, !oldIsLocalControlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsLocalControl() {
		boolean oldIsLocalControl = isLocalControl;
		boolean oldIsLocalControlESet = isLocalControlESet;
		isLocalControl = IS_LOCAL_CONTROL_EDEFAULT;
		isLocalControlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, IS_LOCAL_CONTROL_EDEFAULT, oldIsLocalControlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsLocalControl() {
		return isLocalControlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED:
				return getTechnologyUsed();
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isIsLocalControl();
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
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED:
				setTechnologyUsed((SGrTransportServicesUsedListType)newValue);
				return;
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				setIsLocalControl((Boolean)newValue);
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
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED:
				unsetTechnologyUsed();
				return;
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				unsetIsLocalControl();
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
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__TECHNOLOGY_USED:
				return isSetTechnologyUsed();
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isSetIsLocalControl();
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
		result.append(" (technologyUsed: ");
		if (technologyUsedESet) result.append(technologyUsed); else result.append("<unset>");
		result.append(", isLocalControl: ");
		if (isLocalControlESet) result.append(isLocalControl); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrInterfaceDescriptionTypeImpl
