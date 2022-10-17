/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Device Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data type definition for a Rest API Device Description as an EI (External Interface)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIAttr <em>Rest API Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDeviceFrame()
 * @model extendedMetaData="name='SGrRestAPIDeviceFrame' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIDeviceFrame extends SGrDeviceBaseType {
	/**
	 * Returns the value of the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4RestAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDeviceFrame_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

	/**
	 * Returns the value of the '<em><b>Rest API Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Interface Desc</em>' containment reference.
	 * @see #setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDeviceFrame_RestAPIInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestAPIInterfaceDescriptionType getRestAPIInterfaceDesc();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Interface Desc</em>' containment reference.
	 * @see #getRestAPIInterfaceDesc()
	 * @generated
	 */
	void setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIDeviceFrame_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIFunctionalProfileType> getFpListElement();

} // SGrRestAPIDeviceFrame
