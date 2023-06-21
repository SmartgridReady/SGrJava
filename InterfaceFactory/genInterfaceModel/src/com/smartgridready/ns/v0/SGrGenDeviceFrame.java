/**
 */
package com.smartgridready.ns.v0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Gen Device Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data type definition for a Generic Device Description as an EI (External Interface)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrGenDeviceFrame#getFpListElement <em>Fp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrGenDeviceFrame()
 * @model extendedMetaData="name='SGrGenDeviceFrame' kind='elementOnly'"
 * @generated
 */
public interface SGrGenDeviceFrame extends SGrDeviceBaseType {
	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference.
	 * @see #setFpListElement(SGrGenFunctionalProfileType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrGenDeviceFrame_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrGenFunctionalProfileType getFpListElement();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrGenDeviceFrame#getFpListElement <em>Fp List Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp List Element</em>' containment reference.
	 * @see #getFpListElement()
	 * @generated
	 */
	void setFpListElement(SGrGenFunctionalProfileType value);

} // SGrGenDeviceFrame
