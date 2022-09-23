/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrAttr4RestAPIType;
import com.smartgridready.ns.v0.SGrProfileDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType;
import com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType;
import com.smartgridready.ns.v0.V0Package;

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
 * An implementation of the model object '<em><b>SGr Rest API Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIProfilesFrameTypeImpl#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIProfilesFrameTypeImpl#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIProfilesFrameTypeImpl#getRestAPIAttr <em>Rest API Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIProfilesFrameTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIProfilesFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrRestAPIProfilesFrameType {
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
	 * The cached value of the '{@link #getGenAttribute() <em>Gen Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4GenericType> genAttribute;

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
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIDataPointsFrameType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIProfilesFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIProfilesFrameType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, oldFunctionalProfile, newFunctionalProfile);
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
				msgs = ((InternalEObject)functionalProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			if (newFunctionalProfile != null)
				msgs = ((InternalEObject)newFunctionalProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			msgs = basicSetFunctionalProfile(newFunctionalProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE, newFunctionalProfile, newFunctionalProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4GenericType> getGenAttribute() {
		if (genAttribute == null) {
			genAttribute = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE);
		}
		return genAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4RestAPIType> getRestAPIAttr() {
		if (restAPIAttr == null) {
			restAPIAttr = new EObjectContainmentEList<SGrAttr4RestAPIType>(SGrAttr4RestAPIType.class, this, V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR);
		}
		return restAPIAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIDataPointsFrameType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrRestAPIDataPointsFrameType>(SGrRestAPIDataPointsFrameType.class, this, V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT);
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
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return basicSetFunctionalProfile(null, msgs);
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE:
				return ((InternalEList<?>)getGenAttribute()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR:
				return ((InternalEList<?>)getRestAPIAttr()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return getFunctionalProfile();
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE:
				return getGenAttribute();
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR:
				return getRestAPIAttr();
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)newValue);
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				getGenAttribute().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
				getRestAPIAttr().addAll((Collection<? extends SGrAttr4RestAPIType>)newValue);
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrRestAPIDataPointsFrameType>)newValue);
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
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((SGrProfileDescriptionType)null);
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
				return;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return functionalProfile != null;
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__GEN_ATTRIBUTE:
				return genAttribute != null && !genAttribute.isEmpty();
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__REST_API_ATTR:
				return restAPIAttr != null && !restAPIAttr.isEmpty();
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestAPIProfilesFrameTypeImpl
