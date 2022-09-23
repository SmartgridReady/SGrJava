/**
 */
package com.smartgridready.ns.v0;

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
 *   <li>{@link com.smartgridready.ns.v0.SGrRestDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestDataPointsFrameType#getRestDataPoint <em>Rest Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestDataPointsFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestDataPointsFrameType#getRestAPIAttr <em>Rest API Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestDataPointsFrameType()
 * @model extendedMetaData="name='SGrRestDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Rest Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestDataPointsFrameType_RestDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RestDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointDescriptionType> getRestDataPoint();

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestDataPointsFrameType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

	/**
	 * Returns the value of the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4RestAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestDataPointsFrameType_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

} // SGrRestDataPointsFrameType
