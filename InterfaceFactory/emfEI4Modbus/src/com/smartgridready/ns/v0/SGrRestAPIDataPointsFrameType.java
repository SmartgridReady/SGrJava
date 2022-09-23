/**
 */
package com.smartgridready.ns.v0;

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
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType#getRestAPIDataPoint <em>Rest API Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType#getRestAPIAttr <em>Rest API Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType()
 * @model extendedMetaData="name='SGrRestAPIDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Rest API Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_RestAPIDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointDescriptionType> getRestAPIDataPoint();

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_GenAttribute()
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointsFrameType_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

} // SGrRestAPIDataPointsFrameType
