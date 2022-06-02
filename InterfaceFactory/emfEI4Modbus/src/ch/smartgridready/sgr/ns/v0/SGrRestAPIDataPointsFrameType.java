/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RPT Root Point for stand alone RestAPI Functional
 * 				Profile description. It includes the embedded generic Porfile
 * 				decription
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointsFrameType#getRestAPIDataPoint <em>Rest API Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointsFrameType#getDpRestAPIAttrReference <em>Dp Rest API Attr Reference</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType()
 * @model extendedMetaData="name='SGrRestAPIDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Rest API Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RestAPIAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: RestAPI related and Generic
	 * 						fpRestAPIAttrRefernce values are valid for a single datapoint
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest API Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_RestAPIDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointDescriptionType> getRestAPIDataPoint();

	/**
	 * Returns the value of the '<em><b>Dp Rest API Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Rest API Attr Reference</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_DpRestAPIAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dpRestAPIAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIAttrFrameType> getDpRestAPIAttrReference();

} // SGrRestAPIDataPointsFrameType
