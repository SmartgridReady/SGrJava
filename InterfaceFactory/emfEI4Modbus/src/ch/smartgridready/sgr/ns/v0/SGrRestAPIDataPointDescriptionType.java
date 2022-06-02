/**
 */
package ch.smartgridready.sgr.ns.v0;

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
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getRestAPIEndPoint <em>Rest API End Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getRestAPIJMESPath <em>Rest APIJMES Path</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType()
 * @model extendedMetaData="name='SGrRestAPIDataPointDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDataPointDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest API End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API End Point</em>' attribute.
	 * @see #setRestAPIEndPoint(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType_RestAPIEndPoint()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.RestAPIEndPointType" required="true"
	 *        extendedMetaData="kind='element' name='restAPIEndPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRestAPIEndPoint();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getRestAPIEndPoint <em>Rest API End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API End Point</em>' attribute.
	 * @see #getRestAPIEndPoint()
	 * @generated
	 */
	void setRestAPIEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Rest APIJMES Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest APIJMES Path</em>' attribute.
	 * @see #setRestAPIJMESPath(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType_RestAPIJMESPath()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.RestAPIJMESPathType" required="true"
	 *        extendedMetaData="kind='element' name='restAPIJMESPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRestAPIJMESPath();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getRestAPIJMESPath <em>Rest APIJMES Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest APIJMES Path</em>' attribute.
	 * @see #getRestAPIJMESPath()
	 * @generated
	 */
	void setRestAPIJMESPath(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIdataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIdataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(SGrRestAPIdataTypeType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIDataPointDescriptionType_DataType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	SGrRestAPIdataTypeType getDataType();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIdataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(SGrRestAPIdataTypeType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(SGrRestAPIdataTypeType)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}' attribute is set.
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
