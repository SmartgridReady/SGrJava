/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Access Protection Enabled Type</b></em>'.
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
 *   <li>{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrAccessProtectionEnabledType()
 * @model extendedMetaData="name='SGrAccessProtectionEnabledType' kind='elementOnly'"
 * @generated
 */
public interface SGrAccessProtectionEnabledType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Exception</b></em>' attribute list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.TEnumExceptionCodeType}.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.TEnumExceptionCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Exception</em>' attribute list.
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAccessProtectionEnabledType_ModbusException()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='modbusException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEnumExceptionCodeType> getModbusException();

	/**
	 * Returns the value of the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enabled</em>' attribute.
	 * @see #isSetIsEnabled()
	 * @see #unsetIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAccessProtectionEnabledType_IsEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isEnabled'"
	 * @generated
	 */
	boolean isIsEnabled();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEnabled()
	 * @see #isIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @generated
	 */
	void unsetIsEnabled();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Enabled</em>' attribute is set.
	 * @see #unsetIsEnabled()
	 * @see #isIsEnabled()
	 * @see #setIsEnabled(boolean)
	 * @generated
	 */
	boolean isSetIsEnabled();

} // SGrAccessProtectionEnabledType
