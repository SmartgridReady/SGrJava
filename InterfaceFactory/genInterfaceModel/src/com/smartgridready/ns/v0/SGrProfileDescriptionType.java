/**
 */
package com.smartgridready.ns.v0;

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
 *   <li>{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileNumber <em>Profile Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpNameList <em>Fp Name List</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpLegibDesc <em>Fp Legib Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpPrgDesc <em>Fp Prg Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType()
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType_ProfileNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfilenumberType getProfileNumber();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileNumber <em>Profile Number</em>}' containment reference.
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType_FpNameList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistType getFpNameList();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpNameList <em>Fp Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp Name List</em>' containment reference.
	 * @see #getFpNameList()
	 * @generated
	 */
	void setFpNameList(SGrNamelistType value);

	/**
	 * Returns the value of the '<em><b>Fp Legib Desc</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrLegibDocumentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     				this is the published information related to this
	 *     				functional profile
	 *     			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fp Legib Desc</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType_FpLegibDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='fpLegibDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getFpLegibDesc();

	/**
	 * Returns the value of the '<em><b>Fp Prg Desc</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrLegibDocumentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp Prg Desc</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType_FpPrgDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='fpPrgDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getFpPrgDesc();

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #setProfileName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrProfileDescriptionType_ProfileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='profileName'"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

} // SGrProfileDescriptionType
