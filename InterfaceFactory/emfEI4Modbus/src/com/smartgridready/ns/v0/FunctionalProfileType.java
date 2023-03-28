/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Profile Element for to be used for the
 *                                 generation of SGrGenericDevices and the Ecore modelling the
 *                                 generation of the generic profile level interface class 
 *  Profil Element zur Integration in
 *                                 generische Gerätedefinitionen oder zur Erzeugung von
 *                                 ecore-Modellierungen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.FunctionalProfileType#getProfileNumber <em>Profile Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpNameList <em>Fp Name List</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpLegibDesc <em>Fp Legib Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpPrgDesc <em>Fp Prg Desc</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getFunctionalProfileType()
 * @model extendedMetaData="name='functionalProfile_._type' kind='elementOnly'"
 * @generated
 */
public interface FunctionalProfileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Number</em>' containment reference.
	 * @see #setProfileNumber(SGrProfilenumberType)
	 * @see com.smartgridready.ns.v0.V0Package#getFunctionalProfileType_ProfileNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfilenumberType getProfileNumber();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.FunctionalProfileType#getProfileNumber <em>Profile Number</em>}' containment reference.
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
	 * @see com.smartgridready.ns.v0.V0Package#getFunctionalProfileType_FpNameList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistType getFpNameList();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpNameList <em>Fp Name List</em>}' containment reference.
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
	 *  this is the published information related to
	 *                                         this functional profile 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fp Legib Desc</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getFunctionalProfileType_FpLegibDesc()
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
	 * @see com.smartgridready.ns.v0.V0Package#getFunctionalProfileType_FpPrgDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='fpPrgDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getFpPrgDesc();

} // FunctionalProfileType
