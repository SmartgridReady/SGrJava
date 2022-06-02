/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Namelist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a list of relevant namespaces
 * 				list for to display names used in different standards like EEBUS,
 * 				IEC6850,, SAREF4ENER etc this list type is used for devices,
 * 				functional profiles and datapoints. This namespace naming framework
 * 				is typically used by the SGr association in order to tailer web
 * 				based information tools. This complex data type is intended to be
 * 				extended for future relevant standarrds in order to secure
 * 				information over technology live cycles
 * 			
 *  List der für ein Profil
 * 				relevanten Namen von benutzten Standards
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getNameType <em>Name Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSLV1Name <em>SLV1 Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSWorkName <em>SWork Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSManufName <em>SManuf Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSIEC61850Name <em>SIEC61850 Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSSAREFName <em>SSAREF Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSEEBUSName <em>SEEBUS Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSHPbwpName <em>SH Pbwp Name</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType()
 * @model extendedMetaData="name='SGrNamelistType' kind='elementOnly'"
 * @generated
 */
public interface SGrNamelistType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrNamelistKindOfType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * is used to define where this naming is place in a
	 * 						device-architecture hierarchy way Device; FunctionalProfile;
	 * 						DataPoint
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Type</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrNamelistKindOfType
	 * @see #isSetNameType()
	 * @see #unsetNameType()
	 * @see #setNameType(SGrNamelistKindOfType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_NameType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='nameType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistKindOfType getNameType();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getNameType <em>Name Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Type</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrNamelistKindOfType
	 * @see #isSetNameType()
	 * @see #unsetNameType()
	 * @see #getNameType()
	 * @generated
	 */
	void setNameType(SGrNamelistKindOfType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getNameType <em>Name Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameType()
	 * @see #getNameType()
	 * @see #setNameType(SGrNamelistKindOfType)
	 * @generated
	 */
	void unsetNameType();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getNameType <em>Name Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Type</em>' attribute is set.
	 * @see #unsetNameType()
	 * @see #getNameType()
	 * @see #setNameType(SGrNamelistKindOfType)
	 * @generated
	 */
	boolean isSetNameType();

	/**
	 * Returns the value of the '<em><b>SLV1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * names used for SGr label V1 used to secure legacy
	 * 						compatibility
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SLV1 Name</em>' attribute.
	 * @see #setSLV1Name(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SLV1Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sLV1Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSLV1Name();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSLV1Name <em>SLV1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SLV1 Name</em>' attribute.
	 * @see #getSLV1Name()
	 * @generated
	 */
	void setSLV1Name(String value);

	/**
	 * Returns the value of the '<em><b>SWork Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * work names for temporary use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SWork Name</em>' attribute.
	 * @see #setSWorkName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SWorkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sWorkName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSWorkName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSWorkName <em>SWork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SWork Name</em>' attribute.
	 * @see #getSWorkName()
	 * @generated
	 */
	void setSWorkName(String value);

	/**
	 * Returns the value of the '<em><b>SManuf Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * manufacturers may use an internal wording
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SManuf Name</em>' attribute.
	 * @see #setSManufName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SManufName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sManufName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSManufName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSManufName <em>SManuf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SManuf Name</em>' attribute.
	 * @see #getSManufName()
	 * @generated
	 */
	void setSManufName(String value);

	/**
	 * Returns the value of the '<em><b>SIEC61850 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IEC 61850 termonoligy place to add the 61850
	 * 						abreviatuions if an overlap exists
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIEC61850 Name</em>' attribute.
	 * @see #setSIEC61850Name(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SIEC61850Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sIEC61850Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIEC61850Name();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSIEC61850Name <em>SIEC61850 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIEC61850 Name</em>' attribute.
	 * @see #getSIEC61850Name()
	 * @generated
	 */
	void setSIEC61850Name(String value);

	/**
	 * Returns the value of the '<em><b>SSAREF Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SAREF for ENER termonoligy place to add the SAREF
	 * 						abreviations if an overlap exists
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SSAREF Name</em>' attribute.
	 * @see #setSSAREFName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SSAREFName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sSAREFName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSSAREFName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSSAREFName <em>SSAREF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSAREF Name</em>' attribute.
	 * @see #getSSAREFName()
	 * @generated
	 */
	void setSSAREFName(String value);

	/**
	 * Returns the value of the '<em><b>SEEBUS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EEBUS for terminology place to add the EEBUS
	 * 						abreviations if an overlap exists
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SEEBUS Name</em>' attribute.
	 * @see #setSEEBUSName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SEEBUSName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sEEBUSName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSEEBUSName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSEEBUSName <em>SEEBUS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEEBUS Name</em>' attribute.
	 * @see #getSEEBUSName()
	 * @generated
	 */
	void setSEEBUSName(String value);

	/**
	 * Returns the value of the '<em><b>SH Pbwp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bwp (German Heat Pump Association) for terminology place to add the bwp
	 * 						naming for HVAC if an overlap exists
	 * 		  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SH Pbwp Name</em>' attribute.
	 * @see #setSHPbwpName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrNamelistType_SHPbwpName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sHPbwpName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSHPbwpName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrNamelistType#getSHPbwpName <em>SH Pbwp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SH Pbwp Name</em>' attribute.
	 * @see #getSHPbwpName()
	 * @generated
	 */
	void setSHPbwpName(String value);

} // SGrNamelistType
