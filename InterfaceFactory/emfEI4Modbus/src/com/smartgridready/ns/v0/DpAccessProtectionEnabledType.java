/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dp Access Protection Enabled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modbus datapoints may be protected by execptions. If
 * 				this is the case, a datapoint may be selected as true with a range
 * 				of supported exceptions. A NOT listed exception means no XY
 * 				exception
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getDpAccessProtectionEnabledType()
 * @model extendedMetaData="name='dpAccessProtectionEnabledType' kind='elementOnly'"
 * @generated
 */
public interface DpAccessProtectionEnabledType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Exception</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.TEnumExceptionCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Exception</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @see #isSetModbusException()
	 * @see #unsetModbusException()
	 * @see #setModbusException(TEnumExceptionCodeType)
	 * @see com.smartgridready.ns.v0.V0Package#getDpAccessProtectionEnabledType_ModbusException()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusException' namespace='##targetNamespace'"
	 * @generated
	 */
	TEnumExceptionCodeType getModbusException();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Exception</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @see #isSetModbusException()
	 * @see #unsetModbusException()
	 * @see #getModbusException()
	 * @generated
	 */
	void setModbusException(TEnumExceptionCodeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModbusException()
	 * @see #getModbusException()
	 * @see #setModbusException(TEnumExceptionCodeType)
	 * @generated
	 */
	void unsetModbusException();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modbus Exception</em>' attribute is set.
	 * @see #unsetModbusException()
	 * @see #getModbusException()
	 * @see #setModbusException(TEnumExceptionCodeType)
	 * @generated
	 */
	boolean isSetModbusException();

	/**
	 * Returns the value of the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enabled</em>' attribute.
	 * @see #isSetIsEnabled()
	 * @see #unsetIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getDpAccessProtectionEnabledType_IsEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isEnabled'"
	 * @generated
	 */
	boolean isIsEnabled();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enabled</em>' attribute.
	 * @see #isSetIsEnabled()
	 * @see #unsetIsEnabled()
	 * @see #isIsEnabled()
	 * @generated
	 */
	void setIsEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEnabled()
	 * @see #isIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @generated
	 */
	void unsetIsEnabled();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Enabled</em>' attribute is set.
	 * @see #unsetIsEnabled()
	 * @see #isIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @generated
	 */
	boolean isSetIsEnabled();

} // DpAccessProtectionEnabledType
