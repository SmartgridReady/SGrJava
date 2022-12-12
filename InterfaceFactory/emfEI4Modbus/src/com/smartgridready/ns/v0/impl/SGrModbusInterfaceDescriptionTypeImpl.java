/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.ModbusInterfaceSelectionType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.TEnumConversionFct;
import com.smartgridready.ns.v0.TPIPModbus;
import com.smartgridready.ns.v0.TPRTUModbus;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl#getTrspSrvModbusTCPoutOfBox <em>Trsp Srv Modbus TC Pout Of Box</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl#getTrspSrvModbusRTUoutOfBox <em>Trsp Srv Modbus RT Uout Of Box</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl#getConversionScheme <em>Conversion Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusInterfaceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusInterfaceDescriptionType {
	/**
	 * The default value of the '{@link #getModbusInterfaceSelection() <em>Modbus Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusInterfaceSelection()
	 * @generated
	 * @ordered
	 */
	protected static final ModbusInterfaceSelectionType MODBUS_INTERFACE_SELECTION_EDEFAULT = ModbusInterfaceSelectionType.RTU;

	/**
	 * The cached value of the '{@link #getModbusInterfaceSelection() <em>Modbus Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusInterfaceSelection()
	 * @generated
	 * @ordered
	 */
	protected ModbusInterfaceSelectionType modbusInterfaceSelection = MODBUS_INTERFACE_SELECTION_EDEFAULT;

	/**
	 * This is true if the Modbus Interface Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modbusInterfaceSelectionESet;

	/**
	 * The cached value of the '{@link #getTrspSrvModbusTCPoutOfBox() <em>Trsp Srv Modbus TC Pout Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvModbusTCPoutOfBox()
	 * @generated
	 * @ordered
	 */
	protected TPIPModbus trspSrvModbusTCPoutOfBox;

	/**
	 * The cached value of the '{@link #getTrspSrvModbusRTUoutOfBox() <em>Trsp Srv Modbus RT Uout Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvModbusRTUoutOfBox()
	 * @generated
	 * @ordered
	 */
	protected TPRTUModbus trspSrvModbusRTUoutOfBox;

	/**
	 * The default value of the '{@link #isFirstRegisterAddressIsOne() <em>First Register Address Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstRegisterAddressIsOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_REGISTER_ADDRESS_IS_ONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirstRegisterAddressIsOne() <em>First Register Address Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstRegisterAddressIsOne()
	 * @generated
	 * @ordered
	 */
	protected boolean firstRegisterAddressIsOne = FIRST_REGISTER_ADDRESS_IS_ONE_EDEFAULT;

	/**
	 * This is true if the First Register Address Is One attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstRegisterAddressIsOneESet;

	/**
	 * The cached value of the '{@link #getConversionScheme() <em>Conversion Scheme</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionScheme()
	 * @generated
	 * @ordered
	 */
	protected EList<TEnumConversionFct> conversionScheme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusInterfaceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusInterfaceDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModbusInterfaceSelectionType getModbusInterfaceSelection() {
		return modbusInterfaceSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModbusInterfaceSelection(ModbusInterfaceSelectionType newModbusInterfaceSelection) {
		ModbusInterfaceSelectionType oldModbusInterfaceSelection = modbusInterfaceSelection;
		modbusInterfaceSelection = newModbusInterfaceSelection == null ? MODBUS_INTERFACE_SELECTION_EDEFAULT : newModbusInterfaceSelection;
		boolean oldModbusInterfaceSelectionESet = modbusInterfaceSelectionESet;
		modbusInterfaceSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION, oldModbusInterfaceSelection, modbusInterfaceSelection, !oldModbusInterfaceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModbusInterfaceSelection() {
		ModbusInterfaceSelectionType oldModbusInterfaceSelection = modbusInterfaceSelection;
		boolean oldModbusInterfaceSelectionESet = modbusInterfaceSelectionESet;
		modbusInterfaceSelection = MODBUS_INTERFACE_SELECTION_EDEFAULT;
		modbusInterfaceSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION, oldModbusInterfaceSelection, MODBUS_INTERFACE_SELECTION_EDEFAULT, oldModbusInterfaceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModbusInterfaceSelection() {
		return modbusInterfaceSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIPModbus getTrspSrvModbusTCPoutOfBox() {
		return trspSrvModbusTCPoutOfBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrspSrvModbusTCPoutOfBox(TPIPModbus newTrspSrvModbusTCPoutOfBox, NotificationChain msgs) {
		TPIPModbus oldTrspSrvModbusTCPoutOfBox = trspSrvModbusTCPoutOfBox;
		trspSrvModbusTCPoutOfBox = newTrspSrvModbusTCPoutOfBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX, oldTrspSrvModbusTCPoutOfBox, newTrspSrvModbusTCPoutOfBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrspSrvModbusTCPoutOfBox(TPIPModbus newTrspSrvModbusTCPoutOfBox) {
		if (newTrspSrvModbusTCPoutOfBox != trspSrvModbusTCPoutOfBox) {
			NotificationChain msgs = null;
			if (trspSrvModbusTCPoutOfBox != null)
				msgs = ((InternalEObject)trspSrvModbusTCPoutOfBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX, null, msgs);
			if (newTrspSrvModbusTCPoutOfBox != null)
				msgs = ((InternalEObject)newTrspSrvModbusTCPoutOfBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX, null, msgs);
			msgs = basicSetTrspSrvModbusTCPoutOfBox(newTrspSrvModbusTCPoutOfBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX, newTrspSrvModbusTCPoutOfBox, newTrspSrvModbusTCPoutOfBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPRTUModbus getTrspSrvModbusRTUoutOfBox() {
		return trspSrvModbusRTUoutOfBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrspSrvModbusRTUoutOfBox(TPRTUModbus newTrspSrvModbusRTUoutOfBox, NotificationChain msgs) {
		TPRTUModbus oldTrspSrvModbusRTUoutOfBox = trspSrvModbusRTUoutOfBox;
		trspSrvModbusRTUoutOfBox = newTrspSrvModbusRTUoutOfBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX, oldTrspSrvModbusRTUoutOfBox, newTrspSrvModbusRTUoutOfBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrspSrvModbusRTUoutOfBox(TPRTUModbus newTrspSrvModbusRTUoutOfBox) {
		if (newTrspSrvModbusRTUoutOfBox != trspSrvModbusRTUoutOfBox) {
			NotificationChain msgs = null;
			if (trspSrvModbusRTUoutOfBox != null)
				msgs = ((InternalEObject)trspSrvModbusRTUoutOfBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX, null, msgs);
			if (newTrspSrvModbusRTUoutOfBox != null)
				msgs = ((InternalEObject)newTrspSrvModbusRTUoutOfBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX, null, msgs);
			msgs = basicSetTrspSrvModbusRTUoutOfBox(newTrspSrvModbusRTUoutOfBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX, newTrspSrvModbusRTUoutOfBox, newTrspSrvModbusRTUoutOfBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstRegisterAddressIsOne() {
		return firstRegisterAddressIsOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRegisterAddressIsOne(boolean newFirstRegisterAddressIsOne) {
		boolean oldFirstRegisterAddressIsOne = firstRegisterAddressIsOne;
		firstRegisterAddressIsOne = newFirstRegisterAddressIsOne;
		boolean oldFirstRegisterAddressIsOneESet = firstRegisterAddressIsOneESet;
		firstRegisterAddressIsOneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE, oldFirstRegisterAddressIsOne, firstRegisterAddressIsOne, !oldFirstRegisterAddressIsOneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstRegisterAddressIsOne() {
		boolean oldFirstRegisterAddressIsOne = firstRegisterAddressIsOne;
		boolean oldFirstRegisterAddressIsOneESet = firstRegisterAddressIsOneESet;
		firstRegisterAddressIsOne = FIRST_REGISTER_ADDRESS_IS_ONE_EDEFAULT;
		firstRegisterAddressIsOneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE, oldFirstRegisterAddressIsOne, FIRST_REGISTER_ADDRESS_IS_ONE_EDEFAULT, oldFirstRegisterAddressIsOneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstRegisterAddressIsOne() {
		return firstRegisterAddressIsOneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEnumConversionFct> getConversionScheme() {
		if (conversionScheme == null) {
			conversionScheme = new EDataTypeEList<TEnumConversionFct>(TEnumConversionFct.class, this, V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME);
		}
		return conversionScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX:
				return basicSetTrspSrvModbusTCPoutOfBox(null, msgs);
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX:
				return basicSetTrspSrvModbusRTUoutOfBox(null, msgs);
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
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION:
				return getModbusInterfaceSelection();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX:
				return getTrspSrvModbusTCPoutOfBox();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX:
				return getTrspSrvModbusRTUoutOfBox();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE:
				return isFirstRegisterAddressIsOne();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME:
				return getConversionScheme();
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
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION:
				setModbusInterfaceSelection((ModbusInterfaceSelectionType)newValue);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX:
				setTrspSrvModbusTCPoutOfBox((TPIPModbus)newValue);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX:
				setTrspSrvModbusRTUoutOfBox((TPRTUModbus)newValue);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE:
				setFirstRegisterAddressIsOne((Boolean)newValue);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME:
				getConversionScheme().clear();
				getConversionScheme().addAll((Collection<? extends TEnumConversionFct>)newValue);
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
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION:
				unsetModbusInterfaceSelection();
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX:
				setTrspSrvModbusTCPoutOfBox((TPIPModbus)null);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX:
				setTrspSrvModbusRTUoutOfBox((TPRTUModbus)null);
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE:
				unsetFirstRegisterAddressIsOne();
				return;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME:
				getConversionScheme().clear();
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
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION:
				return isSetModbusInterfaceSelection();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX:
				return trspSrvModbusTCPoutOfBox != null;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX:
				return trspSrvModbusRTUoutOfBox != null;
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE:
				return isSetFirstRegisterAddressIsOne();
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME:
				return conversionScheme != null && !conversionScheme.isEmpty();
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
		result.append(" (modbusInterfaceSelection: ");
		if (modbusInterfaceSelectionESet) result.append(modbusInterfaceSelection); else result.append("<unset>");
		result.append(", firstRegisterAddressIsOne: ");
		if (firstRegisterAddressIsOneESet) result.append(firstRegisterAddressIsOne); else result.append("<unset>");
		result.append(", conversionScheme: ");
		result.append(conversionScheme);
		result.append(')');
		return result.toString();
	}

} //SGrModbusInterfaceDescriptionTypeImpl
