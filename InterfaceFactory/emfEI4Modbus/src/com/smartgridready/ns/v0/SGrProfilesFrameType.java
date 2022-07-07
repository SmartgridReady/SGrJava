/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Functional Profile description in generic lineup
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfilesFrameType#getFpAttr4Generic <em>Fp Attr4 Generic</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfilesFrameType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrProfilesFrameType()
 * @model extendedMetaData="name='SGrProfilesFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrProfilesFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Profile</em>' containment reference.
	 * @see #setFunctionalProfile(SGrProfileDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfilesFrameType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfileDescriptionType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(SGrProfileDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp Attr4 Generic</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp Attr4 Generic</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfilesFrameType_FpAttr4Generic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpAttr4Generic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getFpAttr4Generic();

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointsFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfilesFrameType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointsFrameType> getDpListElement();

} // SGrProfilesFrameType
