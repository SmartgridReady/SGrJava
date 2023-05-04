/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Attr4 Modbus Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modbus Attributes support TransportService specific
 * 				parameters
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getScalingByMulPwr <em>Scaling By Mul Pwr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement <em>Step By Increment</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf <em>Sunssf</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS <em>Poll Latency MS</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getAccessProtection <em>Access Protection</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation <em>Layer6 Deviation</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopEnumMapper <em>Iop Enum Mapper</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopBitmapMapper <em>Iop Bitmap Mapper</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType()
 * @model extendedMetaData="name='SGrAttr4ModbusType' kind='elementOnly'"
 * @generated
 */
public interface SGrAttr4ModbusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaling By Mul Pwr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						generic value = dataPoint * m * 10^p
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scaling By Mul Pwr</em>' containment reference.
	 * @see #setScalingByMulPwr(SGrScalingType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_ScalingByMulPwr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scalingByMulPwr' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrScalingType getScalingByMulPwr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getScalingByMulPwr <em>Scaling By Mul Pwr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling By Mul Pwr</em>' containment reference.
	 * @see #getScalingByMulPwr()
	 * @generated
	 */
	void setScalingByMulPwr(SGrScalingType value);

	/**
	 * Returns the value of the '<em><b>Step By Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * each didgit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step By Increment</em>' attribute.
	 * @see #isSetStepByIncrement()
	 * @see #unsetStepByIncrement()
	 * @see #setStepByIncrement(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_StepByIncrement()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='stepByIncrement' namespace='##targetNamespace'"
	 * @generated
	 */
	long getStepByIncrement();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement <em>Step By Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step By Increment</em>' attribute.
	 * @see #isSetStepByIncrement()
	 * @see #unsetStepByIncrement()
	 * @see #getStepByIncrement()
	 * @generated
	 */
	void setStepByIncrement(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement <em>Step By Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepByIncrement()
	 * @see #getStepByIncrement()
	 * @see #setStepByIncrement(long)
	 * @generated
	 */
	void unsetStepByIncrement();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement <em>Step By Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step By Increment</em>' attribute is set.
	 * @see #unsetStepByIncrement()
	 * @see #getStepByIncrement()
	 * @see #setStepByIncrement(long)
	 * @generated
	 */
	boolean isSetStepByIncrement();

	/**
	 * Returns the value of the '<em><b>Sunssf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						a Sunpec specific attribute (scalefactor p -10
	 * 						... +10) generic value = dataPoint * 10^p note:
	 * 						Sunspec uses sunssf usually as Modbus Register
	 * 						with dynamic values check attribute
	 * 						"timeAlignedNotification"
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sunssf</em>' attribute.
	 * @see #isSetSunssf()
	 * @see #unsetSunssf()
	 * @see #setSunssf(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_Sunssf()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='sunssf' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSunssf();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf <em>Sunssf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sunssf</em>' attribute.
	 * @see #isSetSunssf()
	 * @see #unsetSunssf()
	 * @see #getSunssf()
	 * @generated
	 */
	void setSunssf(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf <em>Sunssf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSunssf()
	 * @see #getSunssf()
	 * @see #setSunssf(long)
	 * @generated
	 */
	void unsetSunssf();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf <em>Sunssf</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sunssf</em>' attribute is set.
	 * @see #unsetSunssf()
	 * @see #getSunssf()
	 * @see #setSunssf(long)
	 * @generated
	 */
	boolean isSetSunssf();

	/**
	 * Returns the value of the '<em><b>Poll Latency MS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						the time for a master slave communication cycle
	 * 						in ms
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll Latency MS</em>' attribute.
	 * @see #isSetPollLatencyMS()
	 * @see #unsetPollLatencyMS()
	 * @see #setPollLatencyMS(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_PollLatencyMS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='pollLatencyMS' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPollLatencyMS();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS <em>Poll Latency MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Latency MS</em>' attribute.
	 * @see #isSetPollLatencyMS()
	 * @see #unsetPollLatencyMS()
	 * @see #getPollLatencyMS()
	 * @generated
	 */
	void setPollLatencyMS(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS <em>Poll Latency MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPollLatencyMS()
	 * @see #getPollLatencyMS()
	 * @see #setPollLatencyMS(long)
	 * @generated
	 */
	void unsetPollLatencyMS();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS <em>Poll Latency MS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Poll Latency MS</em>' attribute is set.
	 * @see #unsetPollLatencyMS()
	 * @see #getPollLatencyMS()
	 * @see #setPollLatencyMS(long)
	 * @generated
	 */
	boolean isSetPollLatencyMS();

	/**
	 * Returns the value of the '<em><b>Access Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Protection</em>' containment reference.
	 * @see #setAccessProtection(SGrAccessProtectionEnabledType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_AccessProtection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessProtection' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrAccessProtectionEnabledType getAccessProtection();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getAccessProtection <em>Access Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Protection</em>' containment reference.
	 * @see #getAccessProtection()
	 * @generated
	 */
	void setAccessProtection(SGrAccessProtectionEnabledType value);

	/**
	 * Returns the value of the '<em><b>Layer6 Deviation</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrModbusLayer6DeviationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer6 Deviation</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @see #isSetLayer6Deviation()
	 * @see #unsetLayer6Deviation()
	 * @see #setLayer6Deviation(SGrModbusLayer6DeviationType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_Layer6Deviation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='layer6Deviation' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusLayer6DeviationType getLayer6Deviation();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation <em>Layer6 Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer6 Deviation</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @see #isSetLayer6Deviation()
	 * @see #unsetLayer6Deviation()
	 * @see #getLayer6Deviation()
	 * @generated
	 */
	void setLayer6Deviation(SGrModbusLayer6DeviationType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation <em>Layer6 Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayer6Deviation()
	 * @see #getLayer6Deviation()
	 * @see #setLayer6Deviation(SGrModbusLayer6DeviationType)
	 * @generated
	 */
	void unsetLayer6Deviation();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation <em>Layer6 Deviation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer6 Deviation</em>' attribute is set.
	 * @see #unsetLayer6Deviation()
	 * @see #getLayer6Deviation()
	 * @see #setLayer6Deviation(SGrModbusLayer6DeviationType)
	 * @generated
	 */
	boolean isSetLayer6Deviation();

	/**
	 * Returns the value of the '<em><b>Iop Enum Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iop Enum Mapper</em>' containment reference.
	 * @see #setIopEnumMapper(SGrModbusEnumMapperType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_IopEnumMapper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iopEnumMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusEnumMapperType getIopEnumMapper();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopEnumMapper <em>Iop Enum Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iop Enum Mapper</em>' containment reference.
	 * @see #getIopEnumMapper()
	 * @generated
	 */
	void setIopEnumMapper(SGrModbusEnumMapperType value);

	/**
	 * Returns the value of the '<em><b>Iop Bitmap Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iop Bitmap Mapper</em>' containment reference.
	 * @see #setIopBitmapMapper(SGrModbusBitmapMapperType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrAttr4ModbusType_IopBitmapMapper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iopBitmapMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusBitmapMapperType getIopBitmapMapper();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopBitmapMapper <em>Iop Bitmap Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iop Bitmap Mapper</em>' containment reference.
	 * @see #getIopBitmapMapper()
	 * @generated
	 */
	void setIopBitmapMapper(SGrModbusBitmapMapperType value);

} // SGrAttr4ModbusType
