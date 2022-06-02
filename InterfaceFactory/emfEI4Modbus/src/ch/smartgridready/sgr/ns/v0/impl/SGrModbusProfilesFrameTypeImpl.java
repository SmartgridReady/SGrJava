/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrModbusAttrFrameType;
import ch.smartgridready.sgr.ns.v0.SGrModbusDataPointsFrameType;
import ch.smartgridready.sgr.ns.v0.SGrModbusProfilesFrameType;
import ch.smartgridready.sgr.ns.v0.SGrProfileDescriptionType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrModbusProfilesFrameTypeImpl#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrModbusProfilesFrameTypeImpl#getFpMbAttrReference <em>Fp Mb Attr Reference</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrModbusProfilesFrameTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusProfilesFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusProfilesFrameType {
	/**
	 * The cached value of the '{@link #getFunctionalProfile() <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProfile()
	 * @generated
	 * @ordered
	 */
	protected SGrProfileDescriptionType functionalProfile;

	/**
	 * The cached value of the '{@link #getFpMbAttrReference() <em>Fp Mb Attr Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpMbAttrReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusAttrFrameType> fpMbAttrReference;

	/**
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusDataPointsFrameType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusProfilesFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusProfilesFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrProfileDescriptionType getFunctionalProfile() {
		return functionalProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalProfile(SGrProfileDescriptionType newFunctionalProfile, NotificationChain msgs) {
		SGrProfileDescriptionType oldFunctionalProfile = functionalProfile;
		functionalProfile = newFunctionalProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, oldFunctionalProfile, newFunctionalProfile);
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
	public void setFunctionalProfile(SGrProfileDescriptionType newFunctionalProfile) {
		if (newFunctionalProfile != functionalProfile) {
			NotificationChain msgs = null;
			if (functionalProfile != null)
				msgs = ((InternalEObject)functionalProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			if (newFunctionalProfile != null)
				msgs = ((InternalEObject)newFunctionalProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			msgs = basicSetFunctionalProfile(newFunctionalProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, newFunctionalProfile, newFunctionalProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusAttrFrameType> getFpMbAttrReference() {
		if (fpMbAttrReference == null) {
			fpMbAttrReference = new EObjectContainmentEList<SGrModbusAttrFrameType>(SGrModbusAttrFrameType.class, this, V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE);
		}
		return fpMbAttrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusDataPointsFrameType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrModbusDataPointsFrameType>(SGrModbusDataPointsFrameType.class, this, V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT);
		}
		return dpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return basicSetFunctionalProfile(null, msgs);
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE:
				return ((InternalEList<?>)getFpMbAttrReference()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				return ((InternalEList<?>)getDpListElement()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return getFunctionalProfile();
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE:
				return getFpMbAttrReference();
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				return getDpListElement();
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
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)newValue);
				return;
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE:
				getFpMbAttrReference().clear();
				getFpMbAttrReference().addAll((Collection<? extends SGrModbusAttrFrameType>)newValue);
				return;
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrModbusDataPointsFrameType>)newValue);
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
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)null);
				return;
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE:
				getFpMbAttrReference().clear();
				return;
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
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
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return functionalProfile != null;
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__FP_MB_ATTR_REFERENCE:
				return fpMbAttrReference != null && !fpMbAttrReference.isEmpty();
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusProfilesFrameTypeImpl
