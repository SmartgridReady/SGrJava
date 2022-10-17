/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Contact API Device Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data type definition for a Contact API Device Description as an EI (External Interface)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrContactAPIDeviceFrame()
 * @model extendedMetaData="name='SGrContactAPIDeviceFrame' kind='elementOnly'"
 * @generated
 */
public interface SGrContactAPIDeviceFrame extends SGrDeviceBaseType {
	/**
	 * Returns the value of the '<em><b>Contact Api Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Api Interface Desc</em>' containment reference.
	 * @see #setContactApiInterfaceDesc(ContactAPIInterfaceDescType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrContactAPIDeviceFrame_ContactApiInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contactApiInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactAPIInterfaceDescType getContactApiInterfaceDesc();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Api Interface Desc</em>' containment reference.
	 * @see #getContactApiInterfaceDesc()
	 * @generated
	 */
	void setContactApiInterfaceDesc(ContactAPIInterfaceDescType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrContactAPIDeviceFrame_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrContactAPIFunctionalProfileType> getFpListElement();

} // SGrContactAPIDeviceFrame
