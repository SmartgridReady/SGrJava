/**
 */
package commHandler4Modbus.impl;

import com.smartgridready.ns.v0.SGrModbusDeviceDescriptionType;
import com.smartgridready.ns.v0.TrspServiceModbusType;

import commHandler4Modbus.CommHandler4Modbus;
import commHandler4Modbus.CommHandler4ModbusPackage;
import commHandler4Modbus.SGrCEMCommunicator;

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
 * An implementation of the model object '<em><b>Comm Handler4 Modbus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commHandler4Modbus.impl.CommHandler4ModbusImpl#getSgrcemcommunicator <em>Sgrcemcommunicator</em>}</li>
 *   <li>{@link commHandler4Modbus.impl.CommHandler4ModbusImpl#getSgrmodbusdevicedescriptiontype <em>Sgrmodbusdevicedescriptiontype</em>}</li>
 *   <li>{@link commHandler4Modbus.impl.CommHandler4ModbusImpl#getTrspservicemodbustype <em>Trspservicemodbustype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommHandler4ModbusImpl extends MinimalEObjectImpl.Container implements CommHandler4Modbus {
	/**
	 * The cached value of the '{@link #getSgrcemcommunicator() <em>Sgrcemcommunicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrcemcommunicator()
	 * @generated
	 * @ordered
	 */
	protected SGrCEMCommunicator sgrcemcommunicator;

	/**
	 * The cached value of the '{@link #getSgrmodbusdevicedescriptiontype() <em>Sgrmodbusdevicedescriptiontype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrmodbusdevicedescriptiontype()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusDeviceDescriptionType> sgrmodbusdevicedescriptiontype;

	/**
	 * The cached value of the '{@link #getTrspservicemodbustype() <em>Trspservicemodbustype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspservicemodbustype()
	 * @generated
	 * @ordered
	 */
	protected EList<TrspServiceModbusType> trspservicemodbustype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommHandler4ModbusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommHandler4ModbusPackage.Literals.COMM_HANDLER4_MODBUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrCEMCommunicator getSgrcemcommunicator() {
		if (sgrcemcommunicator != null && sgrcemcommunicator.eIsProxy()) {
			InternalEObject oldSgrcemcommunicator = (InternalEObject)sgrcemcommunicator;
			sgrcemcommunicator = (SGrCEMCommunicator)eResolveProxy(oldSgrcemcommunicator);
			if (sgrcemcommunicator != oldSgrcemcommunicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR, oldSgrcemcommunicator, sgrcemcommunicator));
			}
		}
		return sgrcemcommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrCEMCommunicator basicGetSgrcemcommunicator() {
		return sgrcemcommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSgrcemcommunicator(SGrCEMCommunicator newSgrcemcommunicator, NotificationChain msgs) {
		SGrCEMCommunicator oldSgrcemcommunicator = sgrcemcommunicator;
		sgrcemcommunicator = newSgrcemcommunicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR, oldSgrcemcommunicator, newSgrcemcommunicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgrcemcommunicator(SGrCEMCommunicator newSgrcemcommunicator) {
		if (newSgrcemcommunicator != sgrcemcommunicator) {
			NotificationChain msgs = null;
			if (sgrcemcommunicator != null)
				msgs = ((InternalEObject)sgrcemcommunicator).eInverseRemove(this, CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS, SGrCEMCommunicator.class, msgs);
			if (newSgrcemcommunicator != null)
				msgs = ((InternalEObject)newSgrcemcommunicator).eInverseAdd(this, CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS, SGrCEMCommunicator.class, msgs);
			msgs = basicSetSgrcemcommunicator(newSgrcemcommunicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR, newSgrcemcommunicator, newSgrcemcommunicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrModbusDeviceDescriptionType> getSgrmodbusdevicedescriptiontype() {
		if (sgrmodbusdevicedescriptiontype == null) {
			sgrmodbusdevicedescriptiontype = new EObjectContainmentEList<SGrModbusDeviceDescriptionType>(SGrModbusDeviceDescriptionType.class, this, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE);
		}
		return sgrmodbusdevicedescriptiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrspServiceModbusType> getTrspservicemodbustype() {
		if (trspservicemodbustype == null) {
			trspservicemodbustype = new EObjectContainmentEList<TrspServiceModbusType>(TrspServiceModbusType.class, this, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE);
		}
		return trspservicemodbustype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				if (sgrcemcommunicator != null)
					msgs = ((InternalEObject)sgrcemcommunicator).eInverseRemove(this, CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS, SGrCEMCommunicator.class, msgs);
				return basicSetSgrcemcommunicator((SGrCEMCommunicator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				return basicSetSgrcemcommunicator(null, msgs);
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE:
				return ((InternalEList<?>)getSgrmodbusdevicedescriptiontype()).basicRemove(otherEnd, msgs);
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE:
				return ((InternalEList<?>)getTrspservicemodbustype()).basicRemove(otherEnd, msgs);
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
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				if (resolve) return getSgrcemcommunicator();
				return basicGetSgrcemcommunicator();
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE:
				return getSgrmodbusdevicedescriptiontype();
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE:
				return getTrspservicemodbustype();
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
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				setSgrcemcommunicator((SGrCEMCommunicator)newValue);
				return;
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE:
				getSgrmodbusdevicedescriptiontype().clear();
				getSgrmodbusdevicedescriptiontype().addAll((Collection<? extends SGrModbusDeviceDescriptionType>)newValue);
				return;
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE:
				getTrspservicemodbustype().clear();
				getTrspservicemodbustype().addAll((Collection<? extends TrspServiceModbusType>)newValue);
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
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				setSgrcemcommunicator((SGrCEMCommunicator)null);
				return;
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE:
				getSgrmodbusdevicedescriptiontype().clear();
				return;
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE:
				getTrspservicemodbustype().clear();
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
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR:
				return sgrcemcommunicator != null;
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE:
				return sgrmodbusdevicedescriptiontype != null && !sgrmodbusdevicedescriptiontype.isEmpty();
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE:
				return trspservicemodbustype != null && !trspservicemodbustype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommHandler4ModbusImpl
