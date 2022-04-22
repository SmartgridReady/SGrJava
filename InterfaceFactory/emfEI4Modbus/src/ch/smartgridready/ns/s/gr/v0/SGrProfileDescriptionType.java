/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Profile Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Profile Element for to be used
 * 				for the generation of SGrGenericDevices and the Ecore modelling the
 * 				generation of the generic profile level interface class
 * 			
 *  Profil Element zur Integration
 * 				in generische Gerätedefinitionen oder zur Erzeugung von
 * 				ecore-Modellierungen
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getProfileNumber <em>Profile Number</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getFpNameList <em>Fp Name List</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getFpLegibDesc <em>Fp Legib Desc</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType()
 * @model extendedMetaData="name='SGrProfileDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrProfileDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Number</em>' containment reference.
	 * @see #setProfileNumber(SGrProfilenumberType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType_ProfileNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfilenumberType getProfileNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getProfileNumber <em>Profile Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Number</em>' containment reference.
	 * @see #getProfileNumber()
	 * @generated
	 */
	void setProfileNumber(SGrProfilenumberType value);

	/**
	 * Returns the value of the '<em><b>Fp Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp Name List</em>' containment reference.
	 * @see #setFpNameList(SGrNamelistType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType_FpNameList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistType getFpNameList();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getFpNameList <em>Fp Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp Name List</em>' containment reference.
	 * @see #getFpNameList()
	 * @generated
	 */
	void setFpNameList(SGrNamelistType value);

	/**
	 * Returns the value of the '<em><b>Fp Legib Desc</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrLegibDocumentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  this is the published information related to this
	 * 						functional profile
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fp Legib Desc</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType_FpLegibDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='fpLegibDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getFpLegibDesc();

	/**
	 * Returns the value of the '<em><b>Mro Visibility Indicator</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrMROPresenceLevelIndicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mro Visibility Indicator</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrMROPresenceLevelIndicationType
	 * @see #isSetMroVisibilityIndicator()
	 * @see #unsetMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType_MroVisibilityIndicator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mroVisibilityIndicator'"
	 * @generated
	 */
	SGrMROPresenceLevelIndicationType getMroVisibilityIndicator();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mro Visibility Indicator</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrMROPresenceLevelIndicationType
	 * @see #isSetMroVisibilityIndicator()
	 * @see #unsetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @generated
	 */
	void setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @generated
	 */
	void unsetMroVisibilityIndicator();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mro Visibility Indicator</em>' attribute is set.
	 * @see #unsetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @generated
	 */
	boolean isSetMroVisibilityIndicator();

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #setProfileName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrProfileDescriptionType_ProfileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='profileName'"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrProfileDescriptionType#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

} // SGrProfileDescriptionType
