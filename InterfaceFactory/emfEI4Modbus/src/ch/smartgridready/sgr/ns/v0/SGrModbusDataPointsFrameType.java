/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RPT Root Point for stand alone Modbus Functional
 * 				Profile description. It includes the embedded generic Porfile
 * 				decription
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDataPointsFrameType#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDataPointsFrameType#getDpMbAttrReference <em>Dp Mb Attr Reference</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDataPointsFrameType()
 * @model extendedMetaData="name='SGrModbusDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Modbus Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrModbusDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModbusAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: Modbus related and Generic
	 * 						fpMbAttrRefernce values are valid for a single datapoint
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modbus Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDataPointsFrameType_ModbusDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointDescriptionType> getModbusDataPoint();

	/**
	 * Returns the value of the '<em><b>Dp Mb Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrModbusAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Mb Attr Reference</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDataPointsFrameType_DpMbAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dpMbAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusAttrFrameType> getDpMbAttrReference();

} // SGrModbusDataPointsFrameType
