/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrEnumListType;
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
 * An implementation of the model object '<em><b>SGr Basic Gen Array DP Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getDpInstance <em>Dp Instance</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getArrLen <em>Arr Len</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getEnum2ArrIndex <em>Enum2 Arr Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrBasicGenArrayDPTypeTypeImpl extends MinimalEObjectImpl.Container implements SGrBasicGenArrayDPTypeType {
	/**
	 * The cached value of the '{@link #getDpInstance() <em>Dp Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrBasicGenDataPointTypeType> dpInstance;

	/**
	 * The default value of the '{@link #getArrLen() <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrLen()
	 * @generated
	 * @ordered
	 */
	protected static final long ARR_LEN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getArrLen() <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrLen()
	 * @generated
	 * @ordered
	 */
	protected long arrLen = ARR_LEN_EDEFAULT;

	/**
	 * This is true if the Arr Len attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrLenESet;

	/**
	 * The cached value of the '{@link #getEnum2ArrIndex() <em>Enum2 Arr Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum2ArrIndex()
	 * @generated
	 * @ordered
	 */
	protected SGrEnumListType enum2ArrIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrBasicGenArrayDPTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrBasicGenArrayDPTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrBasicGenDataPointTypeType> getDpInstance() {
		if (dpInstance == null) {
			dpInstance = new EObjectContainmentEList<SGrBasicGenDataPointTypeType>(SGrBasicGenDataPointTypeType.class, this, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE);
		}
		return dpInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getArrLen() {
		return arrLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrLen(long newArrLen) {
		long oldArrLen = arrLen;
		arrLen = newArrLen;
		boolean oldArrLenESet = arrLenESet;
		arrLenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN, oldArrLen, arrLen, !oldArrLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArrLen() {
		long oldArrLen = arrLen;
		boolean oldArrLenESet = arrLenESet;
		arrLen = ARR_LEN_EDEFAULT;
		arrLenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN, oldArrLen, ARR_LEN_EDEFAULT, oldArrLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArrLen() {
		return arrLenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEnumListType getEnum2ArrIndex() {
		return enum2ArrIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum2ArrIndex(SGrEnumListType newEnum2ArrIndex, NotificationChain msgs) {
		SGrEnumListType oldEnum2ArrIndex = enum2ArrIndex;
		enum2ArrIndex = newEnum2ArrIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX, oldEnum2ArrIndex, newEnum2ArrIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum2ArrIndex(SGrEnumListType newEnum2ArrIndex) {
		if (newEnum2ArrIndex != enum2ArrIndex) {
			NotificationChain msgs = null;
			if (enum2ArrIndex != null)
				msgs = ((InternalEObject)enum2ArrIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX, null, msgs);
			if (newEnum2ArrIndex != null)
				msgs = ((InternalEObject)newEnum2ArrIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX, null, msgs);
			msgs = basicSetEnum2ArrIndex(newEnum2ArrIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX, newEnum2ArrIndex, newEnum2ArrIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE:
				return ((InternalEList<?>)getDpInstance()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX:
				return basicSetEnum2ArrIndex(null, msgs);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE:
				return getDpInstance();
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN:
				return getArrLen();
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX:
				return getEnum2ArrIndex();
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE:
				getDpInstance().clear();
				getDpInstance().addAll((Collection<? extends SGrBasicGenDataPointTypeType>)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN:
				setArrLen((Long)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX:
				setEnum2ArrIndex((SGrEnumListType)newValue);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE:
				getDpInstance().clear();
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN:
				unsetArrLen();
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX:
				setEnum2ArrIndex((SGrEnumListType)null);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__DP_INSTANCE:
				return dpInstance != null && !dpInstance.isEmpty();
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ARR_LEN:
				return isSetArrLen();
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__ENUM2_ARR_INDEX:
				return enum2ArrIndex != null;
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
		result.append(" (arrLen: ");
		if (arrLenESet) result.append(arrLen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrBasicGenArrayDPTypeTypeImpl
