/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.FunctionalProfileType;
import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrDataPointBaseType;
import com.smartgridready.ns.v0.SGrFunctionalProfileFrameType;
import com.smartgridready.ns.v0.SGrReleaseNotes;
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
 * An implementation of the model object '<em><b>SGr Functional Profile Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrFunctionalProfileFrameTypeImpl extends MinimalEObjectImpl.Container implements SGrFunctionalProfileFrameType {
	/**
	 * The cached value of the '{@link #getReleaseNotes() <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseNotes()
	 * @generated
	 * @ordered
	 */
	protected SGrReleaseNotes releaseNotes;

	/**
	 * The cached value of the '{@link #getFunctionalProfile() <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProfile()
	 * @generated
	 * @ordered
	 */
	protected FunctionalProfileType functionalProfile;

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
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrDataPointBaseType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrFunctionalProfileFrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrFunctionalProfileFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrReleaseNotes getReleaseNotes() {
		return releaseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseNotes(SGrReleaseNotes newReleaseNotes, NotificationChain msgs) {
		SGrReleaseNotes oldReleaseNotes = releaseNotes;
		releaseNotes = newReleaseNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES, oldReleaseNotes, newReleaseNotes);
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
	public void setReleaseNotes(SGrReleaseNotes newReleaseNotes) {
		if (newReleaseNotes != releaseNotes) {
			NotificationChain msgs = null;
			if (releaseNotes != null)
				msgs = ((InternalEObject)releaseNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES, null, msgs);
			if (newReleaseNotes != null)
				msgs = ((InternalEObject)newReleaseNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES, null, msgs);
			msgs = basicSetReleaseNotes(newReleaseNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES, newReleaseNotes, newReleaseNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalProfileType getFunctionalProfile() {
		return functionalProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalProfile(FunctionalProfileType newFunctionalProfile, NotificationChain msgs) {
		FunctionalProfileType oldFunctionalProfile = functionalProfile;
		functionalProfile = newFunctionalProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE, oldFunctionalProfile, newFunctionalProfile);
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
	public void setFunctionalProfile(FunctionalProfileType newFunctionalProfile) {
		if (newFunctionalProfile != functionalProfile) {
			NotificationChain msgs = null;
			if (functionalProfile != null)
				msgs = ((InternalEObject)functionalProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			if (newFunctionalProfile != null)
				msgs = ((InternalEObject)newFunctionalProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE, null, msgs);
			msgs = basicSetFunctionalProfile(newFunctionalProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE, newFunctionalProfile, newFunctionalProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrAttr4GenericType> getGenAttribute() {
		if (genAttribute == null) {
			genAttribute = new EObjectContainmentEList<SGrAttr4GenericType>(SGrAttr4GenericType.class, this, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE);
		}
		return genAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrDataPointBaseType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrDataPointBaseType>(SGrDataPointBaseType.class, this, V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT);
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES:
				return basicSetReleaseNotes(null, msgs);
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return basicSetFunctionalProfile(null, msgs);
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE:
				return ((InternalEList<?>)getGenAttribute()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES:
				return getReleaseNotes();
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return getFunctionalProfile();
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE:
				return getGenAttribute();
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES:
				setReleaseNotes((SGrReleaseNotes)newValue);
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((FunctionalProfileType)newValue);
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				getGenAttribute().addAll((Collection<? extends SGrAttr4GenericType>)newValue);
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrDataPointBaseType>)newValue);
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES:
				setReleaseNotes((SGrReleaseNotes)null);
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE:
				setFunctionalProfile((FunctionalProfileType)null);
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE:
				getGenAttribute().clear();
				return;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT:
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES:
				return releaseNotes != null;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE:
				return functionalProfile != null;
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE:
				return genAttribute != null && !genAttribute.isEmpty();
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrFunctionalProfileFrameTypeImpl
