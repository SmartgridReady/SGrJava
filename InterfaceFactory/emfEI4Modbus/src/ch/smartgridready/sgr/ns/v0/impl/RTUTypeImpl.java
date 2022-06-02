/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.RTUDevInstanceType;
import ch.smartgridready.sgr.ns.v0.RTUType;
import ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType;
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
 * An implementation of the model object '<em><b>RTU Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.RTUTypeImpl#getRtuTrspSrvInstance <em>Rtu Trsp Srv Instance</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.RTUTypeImpl#getRtuDevInstance <em>Rtu Dev Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTUTypeImpl extends MinimalEObjectImpl.Container implements RTUType {
	/**
	 * The cached value of the '{@link #getRtuTrspSrvInstance() <em>Rtu Trsp Srv Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtuTrspSrvInstance()
	 * @generated
	 * @ordered
	 */
	protected RTUtrspSrvInstanceType rtuTrspSrvInstance;

	/**
	 * The cached value of the '{@link #getRtuDevInstance() <em>Rtu Dev Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtuDevInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RTUDevInstanceType> rtuDevInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTUTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getRTUType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RTUtrspSrvInstanceType getRtuTrspSrvInstance() {
		return rtuTrspSrvInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtuTrspSrvInstance(RTUtrspSrvInstanceType newRtuTrspSrvInstance, NotificationChain msgs) {
		RTUtrspSrvInstanceType oldRtuTrspSrvInstance = rtuTrspSrvInstance;
		rtuTrspSrvInstance = newRtuTrspSrvInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE, oldRtuTrspSrvInstance, newRtuTrspSrvInstance);
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
	public void setRtuTrspSrvInstance(RTUtrspSrvInstanceType newRtuTrspSrvInstance) {
		if (newRtuTrspSrvInstance != rtuTrspSrvInstance) {
			NotificationChain msgs = null;
			if (rtuTrspSrvInstance != null)
				msgs = ((InternalEObject)rtuTrspSrvInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE, null, msgs);
			if (newRtuTrspSrvInstance != null)
				msgs = ((InternalEObject)newRtuTrspSrvInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE, null, msgs);
			msgs = basicSetRtuTrspSrvInstance(newRtuTrspSrvInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE, newRtuTrspSrvInstance, newRtuTrspSrvInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RTUDevInstanceType> getRtuDevInstance() {
		if (rtuDevInstance == null) {
			rtuDevInstance = new EObjectContainmentEList<RTUDevInstanceType>(RTUDevInstanceType.class, this, V0Package.RTU_TYPE__RTU_DEV_INSTANCE);
		}
		return rtuDevInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE:
				return basicSetRtuTrspSrvInstance(null, msgs);
			case V0Package.RTU_TYPE__RTU_DEV_INSTANCE:
				return ((InternalEList<?>)getRtuDevInstance()).basicRemove(otherEnd, msgs);
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
			case V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE:
				return getRtuTrspSrvInstance();
			case V0Package.RTU_TYPE__RTU_DEV_INSTANCE:
				return getRtuDevInstance();
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
			case V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE:
				setRtuTrspSrvInstance((RTUtrspSrvInstanceType)newValue);
				return;
			case V0Package.RTU_TYPE__RTU_DEV_INSTANCE:
				getRtuDevInstance().clear();
				getRtuDevInstance().addAll((Collection<? extends RTUDevInstanceType>)newValue);
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
			case V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE:
				setRtuTrspSrvInstance((RTUtrspSrvInstanceType)null);
				return;
			case V0Package.RTU_TYPE__RTU_DEV_INSTANCE:
				getRtuDevInstance().clear();
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
			case V0Package.RTU_TYPE__RTU_TRSP_SRV_INSTANCE:
				return rtuTrspSrvInstance != null;
			case V0Package.RTU_TYPE__RTU_DEV_INSTANCE:
				return rtuDevInstance != null && !rtuDevInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTUTypeImpl
