/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Utrsp Srv Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getByteLen <em>Byte Len</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getParity <em>Parity</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getStopBitLen <em>Stop Bit Len</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getRTUtrspSrvInstanceType()
 * @model extendedMetaData="name='RTUtrspSrvInstanceType' kind='elementOnly'"
 * @generated
 */
public interface RTUtrspSrvInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EBaudRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EBaudRateType
	 * @see #isSetBaudRate()
	 * @see #unsetBaudRate()
	 * @see #setBaudRate(EBaudRateType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getRTUtrspSrvInstanceType_BaudRate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='baudRate' namespace='##targetNamespace'"
	 * @generated
	 */
	EBaudRateType getBaudRate();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EBaudRateType
	 * @see #isSetBaudRate()
	 * @see #unsetBaudRate()
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(EBaudRateType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaudRate()
	 * @see #getBaudRate()
	 * @see #setBaudRate(EBaudRateType)
	 * @generated
	 */
	void unsetBaudRate();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getBaudRate <em>Baud Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Baud Rate</em>' attribute is set.
	 * @see #unsetBaudRate()
	 * @see #getBaudRate()
	 * @see #setBaudRate(EBaudRateType)
	 * @generated
	 */
	boolean isSetBaudRate();

	/**
	 * Returns the value of the '<em><b>Byte Len</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EByteLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EByteLenType
	 * @see #isSetByteLen()
	 * @see #unsetByteLen()
	 * @see #setByteLen(EByteLenType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getRTUtrspSrvInstanceType_ByteLen()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='byteLen' namespace='##targetNamespace'"
	 * @generated
	 */
	EByteLenType getByteLen();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getByteLen <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EByteLenType
	 * @see #isSetByteLen()
	 * @see #unsetByteLen()
	 * @see #getByteLen()
	 * @generated
	 */
	void setByteLen(EByteLenType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getByteLen <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteLen()
	 * @see #getByteLen()
	 * @see #setByteLen(EByteLenType)
	 * @generated
	 */
	void unsetByteLen();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getByteLen <em>Byte Len</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Len</em>' attribute is set.
	 * @see #unsetByteLen()
	 * @see #getByteLen()
	 * @see #setByteLen(EByteLenType)
	 * @generated
	 */
	boolean isSetByteLen();

	/**
	 * Returns the value of the '<em><b>Parity</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EParityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EParityType
	 * @see #isSetParity()
	 * @see #unsetParity()
	 * @see #setParity(EParityType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getRTUtrspSrvInstanceType_Parity()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='parity' namespace='##targetNamespace'"
	 * @generated
	 */
	EParityType getParity();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getParity <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EParityType
	 * @see #isSetParity()
	 * @see #unsetParity()
	 * @see #getParity()
	 * @generated
	 */
	void setParity(EParityType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getParity <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParity()
	 * @see #getParity()
	 * @see #setParity(EParityType)
	 * @generated
	 */
	void unsetParity();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getParity <em>Parity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parity</em>' attribute is set.
	 * @see #unsetParity()
	 * @see #getParity()
	 * @see #setParity(EParityType)
	 * @generated
	 */
	boolean isSetParity();

	/**
	 * Returns the value of the '<em><b>Stop Bit Len</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EStopBitLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bit Len</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EStopBitLenType
	 * @see #isSetStopBitLen()
	 * @see #unsetStopBitLen()
	 * @see #setStopBitLen(EStopBitLenType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getRTUtrspSrvInstanceType_StopBitLen()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='stopBitLen' namespace='##targetNamespace'"
	 * @generated
	 */
	EStopBitLenType getStopBitLen();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getStopBitLen <em>Stop Bit Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bit Len</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.EStopBitLenType
	 * @see #isSetStopBitLen()
	 * @see #unsetStopBitLen()
	 * @see #getStopBitLen()
	 * @generated
	 */
	void setStopBitLen(EStopBitLenType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getStopBitLen <em>Stop Bit Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopBitLen()
	 * @see #getStopBitLen()
	 * @see #setStopBitLen(EStopBitLenType)
	 * @generated
	 */
	void unsetStopBitLen();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.RTUtrspSrvInstanceType#getStopBitLen <em>Stop Bit Len</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop Bit Len</em>' attribute is set.
	 * @see #unsetStopBitLen()
	 * @see #getStopBitLen()
	 * @see #setStopBitLen(EStopBitLenType)
	 * @generated
	 */
	boolean isSetStopBitLen();

} // RTUtrspSrvInstanceType
