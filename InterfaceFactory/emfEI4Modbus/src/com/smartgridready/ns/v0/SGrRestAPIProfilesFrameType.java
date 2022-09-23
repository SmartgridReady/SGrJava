/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Profiles Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType#getRestAPIAttr <em>Rest API Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIProfilesFrameType()
 * @model extendedMetaData="name='SGrRestAPIProfilesFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIProfilesFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Profile</em>' containment reference.
	 * @see #setFunctionalProfile(SGrProfileDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIProfilesFrameType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfileDescriptionType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(SGrProfileDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIProfilesFrameType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

	/**
	 * Returns the value of the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4RestAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIProfilesFrameType_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIProfilesFrameType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointsFrameType> getDpListElement();

} // SGrRestAPIProfilesFrameType
