/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.ResponseQuery#getQueryType <em>Query Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.ResponseQuery#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getResponseQuery()
 * @model extendedMetaData="name='ResponseQuery' kind='elementOnly'"
 * @generated
 */
public interface ResponseQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.ResponseQueryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @see #isSetQueryType()
	 * @see #unsetQueryType()
	 * @see #setQueryType(ResponseQueryType)
	 * @see com.smartgridready.ns.v0.V0Package#getResponseQuery_QueryType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='queryType' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseQueryType getQueryType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.ResponseQuery#getQueryType <em>Query Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @see #isSetQueryType()
	 * @see #unsetQueryType()
	 * @see #getQueryType()
	 * @generated
	 */
	void setQueryType(ResponseQueryType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.ResponseQuery#getQueryType <em>Query Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryType()
	 * @see #getQueryType()
	 * @see #setQueryType(ResponseQueryType)
	 * @generated
	 */
	void unsetQueryType();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.ResponseQuery#getQueryType <em>Query Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Query Type</em>' attribute is set.
	 * @see #unsetQueryType()
	 * @see #getQueryType()
	 * @see #setQueryType(ResponseQueryType)
	 * @generated
	 */
	boolean isSetQueryType();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see com.smartgridready.ns.v0.V0Package#getResponseQuery_Query()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.ResponseQuery#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

} // ResponseQuery
