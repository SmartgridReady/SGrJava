/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.FunctionalProfileType;
import com.smartgridready.ns.v0.SGrLegibDocumentationType;
import com.smartgridready.ns.v0.SGrNamelistType;
import com.smartgridready.ns.v0.SGrProfilenumberType;
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
 * An implementation of the model object '<em><b>Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl#getProfileNumber <em>Profile Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl#getFpNameList <em>Fp Name List</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl#getFpLegibDesc <em>Fp Legib Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl#getFpPrgDesc <em>Fp Prg Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalProfileTypeImpl extends MinimalEObjectImpl.Container implements FunctionalProfileType {
	/**
	 * The cached value of the '{@link #getProfileNumber() <em>Profile Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileNumber()
	 * @generated
	 * @ordered
	 */
	protected SGrProfilenumberType profileNumber;

	/**
	 * The cached value of the '{@link #getFpNameList() <em>Fp Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpNameList()
	 * @generated
	 * @ordered
	 */
	protected SGrNamelistType fpNameList;

	/**
	 * The cached value of the '{@link #getFpLegibDesc() <em>Fp Legib Desc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpLegibDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrLegibDocumentationType> fpLegibDesc;

	/**
	 * The cached value of the '{@link #getFpPrgDesc() <em>Fp Prg Desc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpPrgDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrLegibDocumentationType> fpPrgDesc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getFunctionalProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrProfilenumberType getProfileNumber() {
		return profileNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileNumber(SGrProfilenumberType newProfileNumber, NotificationChain msgs) {
		SGrProfilenumberType oldProfileNumber = profileNumber;
		profileNumber = newProfileNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER, oldProfileNumber, newProfileNumber);
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
	public void setProfileNumber(SGrProfilenumberType newProfileNumber) {
		if (newProfileNumber != profileNumber) {
			NotificationChain msgs = null;
			if (profileNumber != null)
				msgs = ((InternalEObject)profileNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER, null, msgs);
			if (newProfileNumber != null)
				msgs = ((InternalEObject)newProfileNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER, null, msgs);
			msgs = basicSetProfileNumber(newProfileNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER, newProfileNumber, newProfileNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrNamelistType getFpNameList() {
		return fpNameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpNameList(SGrNamelistType newFpNameList, NotificationChain msgs) {
		SGrNamelistType oldFpNameList = fpNameList;
		fpNameList = newFpNameList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST, oldFpNameList, newFpNameList);
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
	public void setFpNameList(SGrNamelistType newFpNameList) {
		if (newFpNameList != fpNameList) {
			NotificationChain msgs = null;
			if (fpNameList != null)
				msgs = ((InternalEObject)fpNameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST, null, msgs);
			if (newFpNameList != null)
				msgs = ((InternalEObject)newFpNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST, null, msgs);
			msgs = basicSetFpNameList(newFpNameList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST, newFpNameList, newFpNameList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrLegibDocumentationType> getFpLegibDesc() {
		if (fpLegibDesc == null) {
			fpLegibDesc = new EObjectContainmentEList<SGrLegibDocumentationType>(SGrLegibDocumentationType.class, this, V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC);
		}
		return fpLegibDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrLegibDocumentationType> getFpPrgDesc() {
		if (fpPrgDesc == null) {
			fpPrgDesc = new EObjectContainmentEList<SGrLegibDocumentationType>(SGrLegibDocumentationType.class, this, V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC);
		}
		return fpPrgDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER:
				return basicSetProfileNumber(null, msgs);
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST:
				return basicSetFpNameList(null, msgs);
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC:
				return ((InternalEList<?>)getFpLegibDesc()).basicRemove(otherEnd, msgs);
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC:
				return ((InternalEList<?>)getFpPrgDesc()).basicRemove(otherEnd, msgs);
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
			case V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER:
				return getProfileNumber();
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST:
				return getFpNameList();
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC:
				return getFpLegibDesc();
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC:
				return getFpPrgDesc();
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
			case V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER:
				setProfileNumber((SGrProfilenumberType)newValue);
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST:
				setFpNameList((SGrNamelistType)newValue);
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC:
				getFpLegibDesc().clear();
				getFpLegibDesc().addAll((Collection<? extends SGrLegibDocumentationType>)newValue);
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC:
				getFpPrgDesc().clear();
				getFpPrgDesc().addAll((Collection<? extends SGrLegibDocumentationType>)newValue);
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
			case V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER:
				setProfileNumber((SGrProfilenumberType)null);
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST:
				setFpNameList((SGrNamelistType)null);
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC:
				getFpLegibDesc().clear();
				return;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC:
				getFpPrgDesc().clear();
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
			case V0Package.FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER:
				return profileNumber != null;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST:
				return fpNameList != null;
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC:
				return fpLegibDesc != null && !fpLegibDesc.isEmpty();
			case V0Package.FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC:
				return fpPrgDesc != null && !fpPrgDesc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalProfileTypeImpl
