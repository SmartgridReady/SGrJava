/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Data Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends the base data point type with Modbus attributes and data points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getBlockCashName <em>Block Cash Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType()
 * @model extendedMetaData="name='SGrModbusDataPointType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDataPointType extends SGrDataPointBaseType {
	/**
	 * Returns the value of the '<em><b>Modbus Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_ModbusDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointDescriptionType> getModbusDataPoint();

	/**
	 * Returns the value of the '<em><b>Last Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								system time in ms
	 * 								(System.currentTimeMillis()) of the last
	 * 								data polling is executed
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Access Time</em>' attribute.
	 * @see #isSetLastAccessTime()
	 * @see #unsetLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_LastAccessTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='lastAccessTime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getLastAccessTime();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Access Time</em>' attribute.
	 * @see #isSetLastAccessTime()
	 * @see #unsetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @generated
	 */
	void setLastAccessTime(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @generated
	 */
	void unsetLastAccessTime();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime <em>Last Access Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Access Time</em>' attribute is set.
	 * @see #unsetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @generated
	 */
	boolean isSetLastAccessTime();

	/**
	 * Returns the value of the '<em><b>Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								time a once capture value sustains
	 * 								before a next data polling is executed
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #setTimeToLive(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_TimeToLive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='timeToLive' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTimeToLive();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @generated
	 */
	void setTimeToLive(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	void unsetTimeToLive();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive <em>Time To Live</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time To Live</em>' attribute is set.
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	boolean isSetTimeToLive();

	/**
	 * Returns the value of the '<em><b>Block Cash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Cash Name</em>' attribute.
	 * @see #setBlockCashName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_BlockCashName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='blockCashName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBlockCashName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getBlockCashName <em>Block Cash Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Cash Name</em>' attribute.
	 * @see #getBlockCashName()
	 * @generated
	 */
	void setBlockCashName(String value);

	/**
	 * Returns the value of the '<em><b>Modbus Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4ModbusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4ModbusType> getModbusAttr();

} // SGrModbusDataPointType
