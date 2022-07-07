/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact API Interface Desc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts <em>Num Contacts</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getContactAPIInterfaceDescType()
 * @model extendedMetaData="name='ContactAPI_InterfaceDescType' kind='elementOnly'"
 * @generated
 */
public interface ContactAPIInterfaceDescType extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Contacts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Contacts</em>' attribute.
	 * @see #isSetNumContacts()
	 * @see #unsetNumContacts()
	 * @see #setNumContacts(int)
	 * @see com.smartgridready.ns.v0.V0Package#getContactAPIInterfaceDescType_NumContacts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='numContacts' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumContacts();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts <em>Num Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Contacts</em>' attribute.
	 * @see #isSetNumContacts()
	 * @see #unsetNumContacts()
	 * @see #getNumContacts()
	 * @generated
	 */
	void setNumContacts(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts <em>Num Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumContacts()
	 * @see #getNumContacts()
	 * @see #setNumContacts(int)
	 * @generated
	 */
	void unsetNumContacts();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts <em>Num Contacts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Contacts</em>' attribute is set.
	 * @see #unsetNumContacts()
	 * @see #getNumContacts()
	 * @see #setNumContacts(int)
	 * @generated
	 */
	boolean isSetNumContacts();

	/**
	 * Returns the value of the '<em><b>Contact Stabilisation Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Stabilisation Time Ms</em>' attribute.
	 * @see #isSetContactStabilisationTimeMs()
	 * @see #unsetContactStabilisationTimeMs()
	 * @see #setContactStabilisationTimeMs(long)
	 * @see com.smartgridready.ns.v0.V0Package#getContactAPIInterfaceDescType_ContactStabilisationTimeMs()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='contactStabilisationTimeMs' namespace='##targetNamespace'"
	 * @generated
	 */
	long getContactStabilisationTimeMs();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Stabilisation Time Ms</em>' attribute.
	 * @see #isSetContactStabilisationTimeMs()
	 * @see #unsetContactStabilisationTimeMs()
	 * @see #getContactStabilisationTimeMs()
	 * @generated
	 */
	void setContactStabilisationTimeMs(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContactStabilisationTimeMs()
	 * @see #getContactStabilisationTimeMs()
	 * @see #setContactStabilisationTimeMs(long)
	 * @generated
	 */
	void unsetContactStabilisationTimeMs();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contact Stabilisation Time Ms</em>' attribute is set.
	 * @see #unsetContactStabilisationTimeMs()
	 * @see #getContactStabilisationTimeMs()
	 * @see #setContactStabilisationTimeMs(long)
	 * @generated
	 */
	boolean isSetContactStabilisationTimeMs();

} // ContactAPIInterfaceDescType
