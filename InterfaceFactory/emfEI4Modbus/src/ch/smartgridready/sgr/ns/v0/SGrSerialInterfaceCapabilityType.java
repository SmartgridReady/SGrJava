/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Serial Interface Capability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrSerialInterfaceCapabilityType#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrSerialInterfaceCapabilityType#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrSerialInterfaceCapabilityType#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrSerialInterfaceCapabilityType#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSerialInterfaceCapabilityType()
 * @model extendedMetaData="name='SGrSerialInterfaceCapabilityType' kind='elementOnly'"
 * @generated
 */
public interface SGrSerialInterfaceCapabilityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Baud Rates Supported</b></em>' attribute list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.EBaudRateType}.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EBaudRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rates Supported</em>' attribute list.
	 * @see ch.smartgridready.sgr.ns.v0.EBaudRateType
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSerialInterfaceCapabilityType_BaudRatesSupported()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='baudRatesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EBaudRateType> getBaudRatesSupported();

	/**
	 * Returns the value of the '<em><b>Byte Len Supported</b></em>' attribute list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.EByteLenType}.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EByteLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len Supported</em>' attribute list.
	 * @see ch.smartgridready.sgr.ns.v0.EByteLenType
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSerialInterfaceCapabilityType_ByteLenSupported()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='byteLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EByteLenType> getByteLenSupported();

	/**
	 * Returns the value of the '<em><b>Parity Supported</b></em>' attribute list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.EParityType}.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EParityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity Supported</em>' attribute list.
	 * @see ch.smartgridready.sgr.ns.v0.EParityType
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSerialInterfaceCapabilityType_ParitySupported()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='paritySupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EParityType> getParitySupported();

	/**
	 * Returns the value of the '<em><b>Stop Bit Len Supported</b></em>' attribute list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.EStopBitLenType}.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.EStopBitLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bit Len Supported</em>' attribute list.
	 * @see ch.smartgridready.sgr.ns.v0.EStopBitLenType
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSerialInterfaceCapabilityType_StopBitLenSupported()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='stopBitLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EStopBitLenType> getStopBitLenSupported();

} // SGrSerialInterfaceCapabilityType
