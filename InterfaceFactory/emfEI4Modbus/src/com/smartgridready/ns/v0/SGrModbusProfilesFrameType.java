/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusProfilesFrameType#getFpMbAttrReference <em>Fp Mb Attr Reference</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusProfilesFrameType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusProfilesFrameType()
 * @model extendedMetaData="name='SGrModbusProfilesFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusProfilesFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Profile</em>' containment reference.
	 * @see #setFunctionalProfile(SGrProfileDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusProfilesFrameType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfileDescriptionType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(SGrProfileDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp Mb Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModbusAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: Modbus related and Generic
	 * 						fpMbAttrRefernce values are valid for a whole functional profile
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fp Mb Attr Reference</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusProfilesFrameType_FpMbAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpMbAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusAttrFrameType> getFpMbAttrReference();

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusProfilesFrameType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointsFrameType> getDpListElement();

} // SGrModbusProfilesFrameType
