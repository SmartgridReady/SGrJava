/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.HeaderEntry#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.HeaderEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getHeaderEntry()
 * @model extendedMetaData="name='HeaderEntry' kind='empty'"
 * @generated
 */
public interface HeaderEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Name</em>' attribute.
	 * @see #setHeaderName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getHeaderEntry_HeaderName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='headerName'"
	 * @generated
	 */
	String getHeaderName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.HeaderEntry#getHeaderName <em>Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Name</em>' attribute.
	 * @see #getHeaderName()
	 * @generated
	 */
	void setHeaderName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.smartgridready.ns.v0.V0Package#getHeaderEntry_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.HeaderEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // HeaderEntry
