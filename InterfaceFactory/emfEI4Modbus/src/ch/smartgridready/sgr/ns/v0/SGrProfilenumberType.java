/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Profilenumber Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of design source 0 means: specified by
 * 				SmartGridready, the Porfilenumber follows the SmargGirdready scheme
 * 				>0 means: specfied by manufacturer hhhh, the Profilenumber
 * 				followos a manufacturors scheme 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSpecsOwnerId <em>Specs Owner Id</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getProfileIdentification <em>Profile Identification</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSubProfileIdent <em>Sub Profile Ident</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getVersionNumber <em>Version Number</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType()
 * @model extendedMetaData="name='SGrProfilenumberType' kind='elementOnly'"
 * @generated
 */
public interface SGrProfilenumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Specs Owner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This number idntifies the creator of this instance
	 * 						definition 0 means "This is a SmartGridready specification, SGr
	 * 						definition are valid" means "designed and manufaturer hhhh" and a
	 * 						seperate set of definitions created by the manufacturer is valid
	 * 						The profile number hhhh.nnnn.uuuu.ss.VV.vv is documented in the
	 * 						SGr profile specification number
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specs Owner Id</em>' attribute.
	 * @see #isSetSpecsOwnerId()
	 * @see #unsetSpecsOwnerId()
	 * @see #setSpecsOwnerId(int)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType_SpecsOwnerId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='specsOwnerId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSpecsOwnerId();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSpecsOwnerId <em>Specs Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specs Owner Id</em>' attribute.
	 * @see #isSetSpecsOwnerId()
	 * @see #unsetSpecsOwnerId()
	 * @see #getSpecsOwnerId()
	 * @generated
	 */
	void setSpecsOwnerId(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSpecsOwnerId <em>Specs Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecsOwnerId()
	 * @see #getSpecsOwnerId()
	 * @see #setSpecsOwnerId(int)
	 * @generated
	 */
	void unsetSpecsOwnerId();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSpecsOwnerId <em>Specs Owner Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specs Owner Id</em>' attribute is set.
	 * @see #unsetSpecsOwnerId()
	 * @see #getSpecsOwnerId()
	 * @see #setSpecsOwnerId(int)
	 * @generated
	 */
	boolean isSetSpecsOwnerId();

	/**
	 * Returns the value of the '<em><b>Profile Identification</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.ProfileTypeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Profile Identfication identiofis the main
	 * 						profile classes. The enumeration text is also documented with
	 * 						numbers being referenced in the profile number
	 * 						hhhh.nnnn.uuuu.ss.VV.vv as nnnn
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Identification</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.ProfileTypeEnumType
	 * @see #isSetProfileIdentification()
	 * @see #unsetProfileIdentification()
	 * @see #setProfileIdentification(ProfileTypeEnumType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType_ProfileIdentification()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='profileIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileTypeEnumType getProfileIdentification();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getProfileIdentification <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Identification</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.ProfileTypeEnumType
	 * @see #isSetProfileIdentification()
	 * @see #unsetProfileIdentification()
	 * @see #getProfileIdentification()
	 * @generated
	 */
	void setProfileIdentification(ProfileTypeEnumType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getProfileIdentification <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileIdentification()
	 * @see #getProfileIdentification()
	 * @see #setProfileIdentification(ProfileTypeEnumType)
	 * @generated
	 */
	void unsetProfileIdentification();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getProfileIdentification <em>Profile Identification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Identification</em>' attribute is set.
	 * @see #unsetProfileIdentification()
	 * @see #getProfileIdentification()
	 * @see #setProfileIdentification(ProfileTypeEnumType)
	 * @generated
	 */
	boolean isSetProfileIdentification();

	/**
	 * Returns the value of the '<em><b>Sub Profile Ident</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SubProfileTypeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Profile Ident</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SubProfileTypeEnumType
	 * @see #isSetSubProfileIdent()
	 * @see #unsetSubProfileIdent()
	 * @see #setSubProfileIdent(SubProfileTypeEnumType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType_SubProfileIdent()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='subProfileIdent' namespace='##targetNamespace'"
	 * @generated
	 */
	SubProfileTypeEnumType getSubProfileIdent();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSubProfileIdent <em>Sub Profile Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Profile Ident</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SubProfileTypeEnumType
	 * @see #isSetSubProfileIdent()
	 * @see #unsetSubProfileIdent()
	 * @see #getSubProfileIdent()
	 * @generated
	 */
	void setSubProfileIdent(SubProfileTypeEnumType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSubProfileIdent <em>Sub Profile Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubProfileIdent()
	 * @see #getSubProfileIdent()
	 * @see #setSubProfileIdent(SubProfileTypeEnumType)
	 * @generated
	 */
	void unsetSubProfileIdent();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSubProfileIdent <em>Sub Profile Ident</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Profile Ident</em>' attribute is set.
	 * @see #unsetSubProfileIdent()
	 * @see #getSubProfileIdent()
	 * @see #setSubProfileIdent(SubProfileTypeEnumType)
	 * @generated
	 */
	boolean isSetSubProfileIdent();

	/**
	 * Returns the value of the '<em><b>Sgr Level Of Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGrLevelOfOperation defines a controls complexity
	 * 						level 1) single contact 2) 2 or more contacts /state controlled
	 * 						interface 3) statical defined characteristics tables 4) dynamic
	 * 						realtime control combined with statical defined characteristics
	 * 						tables 5) dynamic realtime control combined with dynamic
	 * 						changeable characteristics tables 6) prognosis based systems
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sgr Level Of Operation</em>' attribute.
	 * @see #isSetSgrLevelOfOperation()
	 * @see #unsetSgrLevelOfOperation()
	 * @see #setSgrLevelOfOperation(int)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType_SgrLevelOfOperation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='sgrLevelOfOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSgrLevelOfOperation();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Level Of Operation</em>' attribute.
	 * @see #isSetSgrLevelOfOperation()
	 * @see #unsetSgrLevelOfOperation()
	 * @see #getSgrLevelOfOperation()
	 * @generated
	 */
	void setSgrLevelOfOperation(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrLevelOfOperation()
	 * @see #getSgrLevelOfOperation()
	 * @see #setSgrLevelOfOperation(int)
	 * @generated
	 */
	void unsetSgrLevelOfOperation();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Level Of Operation</em>' attribute is set.
	 * @see #unsetSgrLevelOfOperation()
	 * @see #getSgrLevelOfOperation()
	 * @see #setSgrLevelOfOperation(int)
	 * @generated
	 */
	boolean isSetSgrLevelOfOperation();

	/**
	 * Returns the value of the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Number</em>' containment reference.
	 * @see #setVersionNumber(SGrVersionNumberType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrProfilenumberType_VersionNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrVersionNumberType getVersionNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrProfilenumberType#getVersionNumber <em>Version Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Number</em>' containment reference.
	 * @see #getVersionNumber()
	 * @generated
	 */
	void setVersionNumber(SGrVersionNumberType value);

} // SGrProfilenumberType
