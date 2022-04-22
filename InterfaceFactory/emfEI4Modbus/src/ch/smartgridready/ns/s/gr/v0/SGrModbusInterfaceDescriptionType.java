/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusTCPoutOfBox <em>Trsp Srv Modbus TC Pout Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusRTUoutOfBox <em>Trsp Srv Modbus RT Uout Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getConversionScheme <em>Conversion Scheme</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType()
 * @model extendedMetaData="name='SGrModbusInterfaceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusInterfaceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Interface Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.ModbusInterfaceSelectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Interface Selection</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.ModbusInterfaceSelectionType
	 * @see #isSetModbusInterfaceSelection()
	 * @see #unsetModbusInterfaceSelection()
	 * @see #setModbusInterfaceSelection(ModbusInterfaceSelectionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType_ModbusInterfaceSelection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusInterfaceSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	ModbusInterfaceSelectionType getModbusInterfaceSelection();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Interface Selection</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.ModbusInterfaceSelectionType
	 * @see #isSetModbusInterfaceSelection()
	 * @see #unsetModbusInterfaceSelection()
	 * @see #getModbusInterfaceSelection()
	 * @generated
	 */
	void setModbusInterfaceSelection(ModbusInterfaceSelectionType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModbusInterfaceSelection()
	 * @see #getModbusInterfaceSelection()
	 * @see #setModbusInterfaceSelection(ModbusInterfaceSelectionType)
	 * @generated
	 */
	void unsetModbusInterfaceSelection();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modbus Interface Selection</em>' attribute is set.
	 * @see #unsetModbusInterfaceSelection()
	 * @see #getModbusInterfaceSelection()
	 * @see #setModbusInterfaceSelection(ModbusInterfaceSelectionType)
	 * @generated
	 */
	boolean isSetModbusInterfaceSelection();

	/**
	 * Returns the value of the '<em><b>Trsp Srv Modbus TC Pout Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Srv Modbus TC Pout Of Box</em>' containment reference.
	 * @see #setTrspSrvModbusTCPoutOfBox(TPIPModbus)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType_TrspSrvModbusTCPoutOfBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trspSrvModbusTCPoutOfBox' namespace='##targetNamespace'"
	 * @generated
	 */
	TPIPModbus getTrspSrvModbusTCPoutOfBox();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusTCPoutOfBox <em>Trsp Srv Modbus TC Pout Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Srv Modbus TC Pout Of Box</em>' containment reference.
	 * @see #getTrspSrvModbusTCPoutOfBox()
	 * @generated
	 */
	void setTrspSrvModbusTCPoutOfBox(TPIPModbus value);

	/**
	 * Returns the value of the '<em><b>Trsp Srv Modbus RT Uout Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Srv Modbus RT Uout Of Box</em>' containment reference.
	 * @see #setTrspSrvModbusRTUoutOfBox(TPRTUModbus)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType_TrspSrvModbusRTUoutOfBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trspSrvModbusRTUoutOfBox' namespace='##targetNamespace'"
	 * @generated
	 */
	TPRTUModbus getTrspSrvModbusRTUoutOfBox();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusRTUoutOfBox <em>Trsp Srv Modbus RT Uout Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Srv Modbus RT Uout Of Box</em>' containment reference.
	 * @see #getTrspSrvModbusRTUoutOfBox()
	 * @generated
	 */
	void setTrspSrvModbusRTUoutOfBox(TPRTUModbus value);

	/**
	 * Returns the value of the '<em><b>First Register Address Is One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Register Address Is One</em>' attribute.
	 * @see #isSetFirstRegisterAddressIsOne()
	 * @see #unsetFirstRegisterAddressIsOne()
	 * @see #setFirstRegisterAddressIsOne(boolean)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType_FirstRegisterAddressIsOne()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='firstRegisterAddressIsOne' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFirstRegisterAddressIsOne();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Register Address Is One</em>' attribute.
	 * @see #isSetFirstRegisterAddressIsOne()
	 * @see #unsetFirstRegisterAddressIsOne()
	 * @see #isFirstRegisterAddressIsOne()
	 * @generated
	 */
	void setFirstRegisterAddressIsOne(boolean value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstRegisterAddressIsOne()
	 * @see #isFirstRegisterAddressIsOne()
	 * @see #setFirstRegisterAddressIsOne(boolean)
	 * @generated
	 */
	void unsetFirstRegisterAddressIsOne();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Register Address Is One</em>' attribute is set.
	 * @see #unsetFirstRegisterAddressIsOne()
	 * @see #isFirstRegisterAddressIsOne()
	 * @see #setFirstRegisterAddressIsOne(boolean)
	 * @generated
	 */
	boolean isSetFirstRegisterAddressIsOne();

	/**
	 * Returns the value of the '<em><b>Conversion Scheme</b></em>' attribute list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.TEnumConversionFct}.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.TEnumConversionFct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Scheme</em>' attribute list.
	 * @see ch.smartgridready.ns.s.gr.v0.TEnumConversionFct
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrModbusInterfaceDescriptionType_ConversionScheme()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='conversionScheme' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEnumConversionFct> getConversionScheme();

} // SGrModbusInterfaceDescriptionType
