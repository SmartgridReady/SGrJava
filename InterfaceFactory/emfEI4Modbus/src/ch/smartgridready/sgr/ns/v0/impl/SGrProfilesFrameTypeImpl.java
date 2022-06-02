/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrAttr4GenericType;
import ch.smartgridready.sgr.ns.v0.SGrDataPointsFrameType;
import ch.smartgridready.sgr.ns.v0.SGrProfileDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrProfilesFrameType;
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
 * An implementation of the model object '<em><b>SGr Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrProfilesFrameTypeImpl#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrProfilesFrameTypeImpl#getFpAttr4Generic <em>Fp Attr4 Generic</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrProfilesFrameTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrProfilesFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrProfilesFrameType {
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
	 * The cached value of the '{@link #getFpAttr4Generic() <em>Fp Attr4 Generic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpAttr4Generic()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4GenericType> fpAttr4Generic;

	/**
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrDataPointsFrameType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrProfilesFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrProfilesFrameType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, oldFunctionalProfile, newFunctionalProfile);
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
				msgs = ((InternalEObject)functionalProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			if (newFunctionalProfile != null)
				msgs = ((InternalEObject)newFunctionalProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			msgs = basicSetFunctionalProfile(newFunctionalProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, newFunctionalProfile, newFunctionalProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4GenericType> getFpAttr4Generic() {
		if (fpAttr4Generic == null) {
			fpAttr4Generic = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC);
		}
		return fpAttr4Generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrDataPointsFrameType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrDataPointsFrameType>(SGrDataPointsFrameType.class, this, V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT);
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
			case V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return basicSetFunctionalProfile(null, msgs);
			case V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC:
				return ((InternalEList<?>)getFpAttr4Generic()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return getFunctionalProfile();
			case V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC:
				return getFpAttr4Generic();
			case V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)newValue);
				return;
			case V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC:
				getFpAttr4Generic().clear();
				getFpAttr4Generic().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
				return;
			case V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrDataPointsFrameType>)newValue);
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
			case V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)null);
				return;
			case V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC:
				getFpAttr4Generic().clear();
				return;
			case V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return functionalProfile != null;
			case V0Package.SGR_PROFILES_FRAME_TYPE__FP_ATTR4_GENERIC:
				return fpAttr4Generic != null && !fpAttr4Generic.isEmpty();
			case V0Package.SGR_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrProfilesFrameTypeImpl
