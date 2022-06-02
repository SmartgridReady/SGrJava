/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  RPT Root Point for stand alone Rest Functional
 * 				Profile description. It includes the embedded generic Profile
 * 				decription
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestDataPointsFrameType#getRestDataPoint <em>Rest Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestDataPointsFrameType#getDpRestAPIAttrReference <em>Dp Rest API Attr Reference</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestDataPointsFrameType()
 * @model extendedMetaData="name='SGrRestDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Rest Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RestAPIAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: Rest related and Generic
	 * 						fpReatAPIAttrRefernce values are valid for a single datapoint
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Data Point</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestDataPointsFrameType_RestDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RestDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointDescriptionType> getRestDataPoint();

	/**
	 * Returns the value of the '<em><b>Dp Rest API Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Rest API Attr Reference</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestDataPointsFrameType_DpRestAPIAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dpRestAPIAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIAttrFrameType> getDpRestAPIAttrReference();

} // SGrRestDataPointsFrameType
