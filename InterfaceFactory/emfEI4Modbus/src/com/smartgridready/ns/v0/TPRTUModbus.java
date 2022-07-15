/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPRTU Modbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr <em>Slave Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected <em>Baud Rate Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected <em>Byte Len Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getParitySelected <em>Parity Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected <em>Stop Bit Len Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TPRTUModbus#getSerialInterfaceCapability <em>Serial Interface Capability</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus()
 * @model extendedMetaData="name='tP_RTUModbus' kind='elementOnly'"
 * @generated
 */
public interface TPRTUModbus extends EObject {
	/**
	 * Returns the value of the '<em><b>Slave Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Addr</em>' attribute.
	 * @see #isSetSlaveAddr()
	 * @see #unsetSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_SlaveAddr()
	 * @model unsettable="true" dataType="com.smartgridready.ns.v0.TSlaveIDType" required="true"
	 *        extendedMetaData="kind='element' name='slaveAddr' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSlaveAddr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Addr</em>' attribute.
	 * @see #isSetSlaveAddr()
	 * @see #unsetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @generated
	 */
	void setSlaveAddr(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @generated
	 */
	void unsetSlaveAddr();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr <em>Slave Addr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slave Addr</em>' attribute is set.
	 * @see #unsetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @generated
	 */
	boolean isSetSlaveAddr();

	/**
	 * Returns the value of the '<em><b>Baud Rate Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EBaudRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see #isSetBaudRateSelected()
	 * @see #unsetBaudRateSelected()
	 * @see #setBaudRateSelected(EBaudRateType)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_BaudRateSelected()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='baudRateSelected' namespace='##targetNamespace'"
	 * @generated
	 */
	EBaudRateType getBaudRateSelected();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected <em>Baud Rate Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see #isSetBaudRateSelected()
	 * @see #unsetBaudRateSelected()
	 * @see #getBaudRateSelected()
	 * @generated
	 */
	void setBaudRateSelected(EBaudRateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected <em>Baud Rate Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaudRateSelected()
	 * @see #getBaudRateSelected()
	 * @see #setBaudRateSelected(EBaudRateType)
	 * @generated
	 */
	void unsetBaudRateSelected();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected <em>Baud Rate Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Baud Rate Selected</em>' attribute is set.
	 * @see #unsetBaudRateSelected()
	 * @see #getBaudRateSelected()
	 * @see #setBaudRateSelected(EBaudRateType)
	 * @generated
	 */
	boolean isSetBaudRateSelected();

	/**
	 * Returns the value of the '<em><b>Byte Len Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EByteLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see #isSetByteLenSelected()
	 * @see #unsetByteLenSelected()
	 * @see #setByteLenSelected(EByteLenType)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_ByteLenSelected()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='byteLenSelected' namespace='##targetNamespace'"
	 * @generated
	 */
	EByteLenType getByteLenSelected();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected <em>Byte Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see #isSetByteLenSelected()
	 * @see #unsetByteLenSelected()
	 * @see #getByteLenSelected()
	 * @generated
	 */
	void setByteLenSelected(EByteLenType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected <em>Byte Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteLenSelected()
	 * @see #getByteLenSelected()
	 * @see #setByteLenSelected(EByteLenType)
	 * @generated
	 */
	void unsetByteLenSelected();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected <em>Byte Len Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Len Selected</em>' attribute is set.
	 * @see #unsetByteLenSelected()
	 * @see #getByteLenSelected()
	 * @see #setByteLenSelected(EByteLenType)
	 * @generated
	 */
	boolean isSetByteLenSelected();

	/**
	 * Returns the value of the '<em><b>Parity Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EParityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EParityType
	 * @see #isSetParitySelected()
	 * @see #unsetParitySelected()
	 * @see #setParitySelected(EParityType)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_ParitySelected()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='paritySelected' namespace='##targetNamespace'"
	 * @generated
	 */
	EParityType getParitySelected();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getParitySelected <em>Parity Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EParityType
	 * @see #isSetParitySelected()
	 * @see #unsetParitySelected()
	 * @see #getParitySelected()
	 * @generated
	 */
	void setParitySelected(EParityType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getParitySelected <em>Parity Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParitySelected()
	 * @see #getParitySelected()
	 * @see #setParitySelected(EParityType)
	 * @generated
	 */
	void unsetParitySelected();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getParitySelected <em>Parity Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parity Selected</em>' attribute is set.
	 * @see #unsetParitySelected()
	 * @see #getParitySelected()
	 * @see #setParitySelected(EParityType)
	 * @generated
	 */
	boolean isSetParitySelected();

	/**
	 * Returns the value of the '<em><b>Stop Bit Len Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EStopBitLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bit Len Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @see #isSetStopBitLenSelected()
	 * @see #unsetStopBitLenSelected()
	 * @see #setStopBitLenSelected(EStopBitLenType)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_StopBitLenSelected()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='stopBitLenSelected' namespace='##targetNamespace'"
	 * @generated
	 */
	EStopBitLenType getStopBitLenSelected();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected <em>Stop Bit Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bit Len Selected</em>' attribute.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @see #isSetStopBitLenSelected()
	 * @see #unsetStopBitLenSelected()
	 * @see #getStopBitLenSelected()
	 * @generated
	 */
	void setStopBitLenSelected(EStopBitLenType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected <em>Stop Bit Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopBitLenSelected()
	 * @see #getStopBitLenSelected()
	 * @see #setStopBitLenSelected(EStopBitLenType)
	 * @generated
	 */
	void unsetStopBitLenSelected();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected <em>Stop Bit Len Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop Bit Len Selected</em>' attribute is set.
	 * @see #unsetStopBitLenSelected()
	 * @see #getStopBitLenSelected()
	 * @see #setStopBitLenSelected(EStopBitLenType)
	 * @generated
	 */
	boolean isSetStopBitLenSelected();

	/**
	 * Returns the value of the '<em><b>Serial Interface Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Interface Capability</em>' containment reference.
	 * @see #setSerialInterfaceCapability(SGrSerialInterfaceCapabilityType)
	 * @see com.smartgridready.ns.v0.V0Package#getTPRTUModbus_SerialInterfaceCapability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='serialInterfaceCapability' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSerialInterfaceCapabilityType getSerialInterfaceCapability();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPRTUModbus#getSerialInterfaceCapability <em>Serial Interface Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Interface Capability</em>' containment reference.
	 * @see #getSerialInterfaceCapability()
	 * @generated
	 */
	void setSerialInterfaceCapability(SGrSerialInterfaceCapabilityType value);

} // TPRTUModbus
