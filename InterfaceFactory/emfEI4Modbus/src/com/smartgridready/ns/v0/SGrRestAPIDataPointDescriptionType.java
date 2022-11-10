/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Data Point Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getRestServiceCall <em>Rest Service Call</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType()
 * @model extendedMetaData="name='SGrRestAPIDataPointDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDataPointDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Service Call</em>' containment reference.
	 * @see #setRestServiceCall(RestServiceCall)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType_RestServiceCall()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restServiceCall' namespace='##targetNamespace'"
	 * @generated
	 */
	RestServiceCall getRestServiceCall();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getRestServiceCall <em>Rest Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Service Call</em>' containment reference.
	 * @see #getRestServiceCall()
	 * @generated
	 */
	void setRestServiceCall(RestServiceCall value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrRestAPIdataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(SGrRestAPIdataTypeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType_DataType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	SGrRestAPIdataTypeType getDataType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(SGrRestAPIdataTypeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(SGrRestAPIdataTypeType)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' attribute is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(SGrRestAPIdataTypeType)
	 * @generated
	 */
	boolean isSetDataType();

} // SGrRestAPIDataPointDescriptionType
