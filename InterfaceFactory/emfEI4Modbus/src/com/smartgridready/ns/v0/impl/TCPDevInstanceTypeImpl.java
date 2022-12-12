/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.TCPDevInstanceType;
import com.smartgridready.ns.v0.TPIPModbus;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCP Dev Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TCPDevInstanceTypeImpl#getDevInstName <em>Dev Inst Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TCPDevInstanceTypeImpl#getDevAddr <em>Dev Addr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCPDevInstanceTypeImpl extends MinimalEObjectImpl.Container implements TCPDevInstanceType {
	/**
	 * The default value of the '{@link #getDevInstName() <em>Dev Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevInstName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEV_INST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevInstName() <em>Dev Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevInstName()
	 * @generated
	 * @ordered
	 */
	protected String devInstName = DEV_INST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevAddr() <em>Dev Addr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevAddr()
	 * @generated
	 * @ordered
	 */
	protected TPIPModbus devAddr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPDevInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTCPDevInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevInstName() {
		return devInstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevInstName(String newDevInstName) {
		String oldDevInstName = devInstName;
		devInstName = newDevInstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME, oldDevInstName, devInstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIPModbus getDevAddr() {
		return devAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevAddr(TPIPModbus newDevAddr, NotificationChain msgs) {
		TPIPModbus oldDevAddr = devAddr;
		devAddr = newDevAddr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR, oldDevAddr, newDevAddr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevAddr(TPIPModbus newDevAddr) {
		if (newDevAddr != devAddr) {
			NotificationChain msgs = null;
			if (devAddr != null)
				msgs = ((InternalEObject)devAddr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR, null, msgs);
			if (newDevAddr != null)
				msgs = ((InternalEObject)newDevAddr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR, null, msgs);
			msgs = basicSetDevAddr(newDevAddr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR, newDevAddr, newDevAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR:
				return basicSetDevAddr(null, msgs);
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
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME:
				return getDevInstName();
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR:
				return getDevAddr();
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
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME:
				setDevInstName((String)newValue);
				return;
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR:
				setDevAddr((TPIPModbus)newValue);
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
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME:
				setDevInstName(DEV_INST_NAME_EDEFAULT);
				return;
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR:
				setDevAddr((TPIPModbus)null);
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
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME:
				return DEV_INST_NAME_EDEFAULT == null ? devInstName != null : !DEV_INST_NAME_EDEFAULT.equals(devInstName);
			case V0Package.TCP_DEV_INSTANCE_TYPE__DEV_ADDR:
				return devAddr != null;
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
		result.append(" (devInstName: ");
		result.append(devInstName);
		result.append(')');
		return result.toString();
	}

} //TCPDevInstanceTypeImpl
