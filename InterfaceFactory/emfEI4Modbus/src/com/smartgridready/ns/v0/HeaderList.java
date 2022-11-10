/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.HeaderList#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getHeaderList()
 * @model extendedMetaData="name='HeaderList' kind='elementOnly'"
 * @generated
 */
public interface HeaderList extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.HeaderEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getHeaderList_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HeaderEntry> getHeader();

} // HeaderList
