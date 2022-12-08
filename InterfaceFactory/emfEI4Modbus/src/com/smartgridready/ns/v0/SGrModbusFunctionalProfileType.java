/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends the base functional profile type with Modbus attributes and data points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getModbusAttr <em>Modbus Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusFunctionalProfileType()
 * @model extendedMetaData="name='SGrModbusFunctionalProfileType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusFunctionalProfileType extends SGrFunctionalProfileBaseType {
	/**
	 * Returns the value of the '<em><b>Time Sync Block Notification</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     				       a transaction number for a sequence of Registeres
	 *     				       (usually transmitted by Blocktransfers) to be
	 *     				      transferred together
	 *     			        
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Sync Block Notification</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusFunctionalProfileType_TimeSyncBlockNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeSyncBlockNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrTimeSyncBlockNotificationType> getTimeSyncBlockNotification();

	/**
	 * Returns the value of the '<em><b>Modbus Attr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Attr</em>' containment reference.
	 * @see #setModbusAttr(SGrAttr4ModbusType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusFunctionalProfileType_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrAttr4ModbusType getModbusAttr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getModbusAttr <em>Modbus Attr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Attr</em>' containment reference.
	 * @see #getModbusAttr()
	 * @generated
	 */
	void setModbusAttr(SGrAttr4ModbusType value);

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusDataPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusFunctionalProfileType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointType> getDpListElement();

} // SGrModbusFunctionalProfileType
