/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SG Rrest API Bearer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getRestAPIEndPoint <em>Rest API End Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getRestAPIJMESPath <em>Rest APIJMES Path</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGRrestAPIBearerType()
 * @model extendedMetaData="name='SGRrestAPIBearerType' kind='elementOnly'"
 * @generated
 */
public interface SGRrestAPIBearerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest API End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API End Point</em>' attribute.
	 * @see #setRestAPIEndPoint(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGRrestAPIBearerType_RestAPIEndPoint()
	 * @model dataType="com.smartgridready.ns.v0.RestAPIEndPointType1" required="true"
	 *        extendedMetaData="kind='element' name='restAPIEndPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRestAPIEndPoint();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getRestAPIEndPoint <em>Rest API End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API End Point</em>' attribute.
	 * @see #getRestAPIEndPoint()
	 * @generated
	 */
	void setRestAPIEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Rest APIJMES Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest APIJMES Path</em>' containment reference.
	 * @see #setRestAPIJMESPath(RestAPIJMESPathType1)
	 * @see com.smartgridready.ns.v0.V0Package#getSGRrestAPIBearerType_RestAPIJMESPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIJMESPath' namespace='##targetNamespace'"
	 * @generated
	 */
	RestAPIJMESPathType1 getRestAPIJMESPath();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getRestAPIJMESPath <em>Rest APIJMES Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest APIJMES Path</em>' containment reference.
	 * @see #getRestAPIJMESPath()
	 * @generated
	 */
	void setRestAPIJMESPath(RestAPIJMESPathType1 value);

} // SGRrestAPIBearerType
