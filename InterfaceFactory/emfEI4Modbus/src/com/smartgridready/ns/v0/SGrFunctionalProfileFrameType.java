/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Functional Profile Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileFrameType()
 * @model extendedMetaData="name='SGrFunctionalProfileFrame_._type' kind='elementOnly'"
 * @generated
 */
public interface SGrFunctionalProfileFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Notes</em>' containment reference.
	 * @see #setReleaseNotes(SGrReleaseNotes)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileFrameType_ReleaseNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrReleaseNotes getReleaseNotes();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getReleaseNotes <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Notes</em>' containment reference.
	 * @see #getReleaseNotes()
	 * @generated
	 */
	void setReleaseNotes(SGrReleaseNotes value);

	/**
	 * Returns the value of the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Profile</em>' containment reference.
	 * @see #setFunctionalProfile(FunctionalProfileType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileFrameType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionalProfileType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(FunctionalProfileType value);

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileFrameType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileFrameType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointBaseType> getDpListElement();

} // SGrFunctionalProfileFrameType
