/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Data Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends the base data point type with Rest API attributes and data points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIDataPoint <em>Rest API Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIAttr <em>Rest API Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointType()
 * @model extendedMetaData="name='SGrRestAPIDataPointType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDataPointType extends SGrDataPointBaseType {
	/**
	 * Returns the value of the '<em><b>Rest API Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointType_RestAPIDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointDescriptionType> getRestAPIDataPoint();

	/**
	 * Returns the value of the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4RestAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointType_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

} // SGrRestAPIDataPointType
