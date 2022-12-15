/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.V0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Basic Gen Array DP Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getLenght <em>Lenght</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenArrayDPTypeTypeImpl#getEnum2ArrIndex <em>Enum2 Arr Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrBasicGenArrayDPTypeTypeImpl extends MinimalEObjectImpl.Container implements SGrBasicGenArrayDPTypeType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SGrBasicGenDataPointTypeType type;

	/**
	 * The default value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LENGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lenght = LENGHT_EDEFAULT;

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
	@Override
	public SGrBasicGenDataPointTypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SGrBasicGenDataPointTypeType newType, NotificationChain msgs) {
		SGrBasicGenDataPointTypeType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE, oldType, newType);
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
	public void setType(SGrBasicGenDataPointTypeType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLenght() {
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLenght(BigInteger newLenght) {
		BigInteger oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__LENGHT, oldLenght, lenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE:
				return basicSetType(null, msgs);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE:
				return getType();
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__LENGHT:
				return getLenght();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE:
				setType((SGrBasicGenDataPointTypeType)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__LENGHT:
				setLenght((BigInteger)newValue);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE:
				setType((SGrBasicGenDataPointTypeType)null);
				return;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__LENGHT:
				setLenght(LENGHT_EDEFAULT);
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
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__TYPE:
				return type != null;
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE__LENGHT:
				return LENGHT_EDEFAULT == null ? lenght != null : !LENGHT_EDEFAULT.equals(lenght);
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
		result.append(" (lenght: ");
		result.append(lenght);
		result.append(')');
		return result.toString();
	}

} //SGrBasicGenArrayDPTypeTypeImpl
