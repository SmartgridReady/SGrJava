/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Release Notes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Contains versioning, history and release states
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrReleaseNotes#getState <em>State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrReleaseNotes#getChangelog <em>Changelog</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrReleaseNotes()
 * @model extendedMetaData="name='SGrReleaseNotes' kind='elementOnly'"
 * @generated
 */
public interface SGrReleaseNotes extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrReleaseState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(SGrReleaseState)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrReleaseNotes_State()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrReleaseState getState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(SGrReleaseState value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(SGrReleaseState)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(SGrReleaseState)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Changelog</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrChangeLog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changelog</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrReleaseNotes_Changelog()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='changelog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrChangeLog> getChangelog();

} // SGrReleaseNotes
