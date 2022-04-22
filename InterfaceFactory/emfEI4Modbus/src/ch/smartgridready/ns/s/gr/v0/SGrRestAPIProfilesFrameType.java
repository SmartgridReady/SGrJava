/**
 */
package ch.smartgridready.ns.s.gr.v0;

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
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIProfilesFrameType#getFpRestAPIAttrReference <em>Fp Rest API Attr Reference</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIProfilesFrameType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestAPIProfilesFrameType()
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
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestAPIProfilesFrameType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfileDescriptionType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIProfilesFrameType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(SGrProfileDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp Rest API Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RestAPIAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: RestAPI related and Generic
	 * 						fpRestAPIAttrRefernce values are valid for a whole functional
	 * 						profile
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fp Rest API Attr Reference</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestAPIProfilesFrameType_FpRestAPIAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpRestAPIAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIAttrFrameType> getFpRestAPIAttrReference();

	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrRestAPIDataPointsFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestAPIProfilesFrameType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIDataPointsFrameType> getDpListElement();

} // SGrRestAPIProfilesFrameType
