/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Service Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.RestServiceCall#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.RestServiceCall#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.RestServiceCall#getRequestPath <em>Request Path</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.RestServiceCall#getRequestBody <em>Request Body</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.RestServiceCall#getResponseQuery <em>Response Query</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall()
 * @model extendedMetaData="name='RestServiceCall' kind='elementOnly'"
 * @generated
 */
public interface RestServiceCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #setRequestHeader(HeaderList)
	 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall_RequestHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderList getRequestHeader();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(HeaderList value);

	/**
	 * Returns the value of the '<em><b>Request Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Method</em>' attribute.
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @see #isSetRequestMethod()
	 * @see #unsetRequestMethod()
	 * @see #setRequestMethod(HttpMethod)
	 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall_RequestMethod()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='requestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	HttpMethod getRequestMethod();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestMethod <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Method</em>' attribute.
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @see #isSetRequestMethod()
	 * @see #unsetRequestMethod()
	 * @see #getRequestMethod()
	 * @generated
	 */
	void setRequestMethod(HttpMethod value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestMethod <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestMethod()
	 * @see #getRequestMethod()
	 * @see #setRequestMethod(HttpMethod)
	 * @generated
	 */
	void unsetRequestMethod();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestMethod <em>Request Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Method</em>' attribute is set.
	 * @see #unsetRequestMethod()
	 * @see #getRequestMethod()
	 * @see #setRequestMethod(HttpMethod)
	 * @generated
	 */
	boolean isSetRequestMethod();

	/**
	 * Returns the value of the '<em><b>Request Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Path</em>' attribute.
	 * @see #setRequestPath(String)
	 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall_RequestPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='requestPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequestPath();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestPath <em>Request Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Path</em>' attribute.
	 * @see #getRequestPath()
	 * @generated
	 */
	void setRequestPath(String value);

	/**
	 * Returns the value of the '<em><b>Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Body</em>' attribute.
	 * @see #setRequestBody(String)
	 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall_RequestBody()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='requestBody' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequestBody();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestBody <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Body</em>' attribute.
	 * @see #getRequestBody()
	 * @generated
	 */
	void setRequestBody(String value);

	/**
	 * Returns the value of the '<em><b>Response Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Query</em>' containment reference.
	 * @see #setResponseQuery(ResponseQuery)
	 * @see com.smartgridready.ns.v0.V0Package#getRestServiceCall_ResponseQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseQuery getResponseQuery();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.RestServiceCall#getResponseQuery <em>Response Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Query</em>' containment reference.
	 * @see #getResponseQuery()
	 * @generated
	 */
	void setResponseQuery(ResponseQuery value);

} // RestServiceCall
