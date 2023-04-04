/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Enum List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource <em>Sgr Power Source</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2 <em>Sgready State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1 <em>Sgready State Lv1</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState <em>Sgr EV State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService <em>Sgr SGCP Service</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl <em>Sgr Oblig Lvl</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState <em>Sgr OCPP State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode <em>Sgr HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode <em>Sgr HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode <em>Sgr DHW Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode <em>Cta DHW Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType()
 * @model extendedMetaData="name='SGrEnumListType' kind='elementOnly'"
 * @generated
 */
public interface SGrEnumListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sgr Meas Value Source</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrMeasValueSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Meas Value Source</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see #isSetSgrMeasValueSource()
	 * @see #unsetSgrMeasValueSource()
	 * @see #setSgrMeasValueSource(SGrMeasValueSourceType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrMeasValueSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrMeasValueSource' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrMeasValueSourceType getSgrMeasValueSource();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Meas Value Source</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see #isSetSgrMeasValueSource()
	 * @see #unsetSgrMeasValueSource()
	 * @see #getSgrMeasValueSource()
	 * @generated
	 */
	void setSgrMeasValueSource(SGrMeasValueSourceType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrMeasValueSource()
	 * @see #getSgrMeasValueSource()
	 * @see #setSgrMeasValueSource(SGrMeasValueSourceType)
	 * @generated
	 */
	void unsetSgrMeasValueSource();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Meas Value Source</em>' attribute is set.
	 * @see #unsetSgrMeasValueSource()
	 * @see #getSgrMeasValueSource()
	 * @see #setSgrMeasValueSource(SGrMeasValueSourceType)
	 * @generated
	 */
	boolean isSetSgrMeasValueSource();

	/**
	 * Returns the value of the '<em><b>Sgr Power Source</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrPowerSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Power Source</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see #isSetSgrPowerSource()
	 * @see #unsetSgrPowerSource()
	 * @see #setSgrPowerSource(SGrPowerSourceType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrPowerSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrPowerSource' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrPowerSourceType getSgrPowerSource();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource <em>Sgr Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Power Source</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see #isSetSgrPowerSource()
	 * @see #unsetSgrPowerSource()
	 * @see #getSgrPowerSource()
	 * @generated
	 */
	void setSgrPowerSource(SGrPowerSourceType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource <em>Sgr Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrPowerSource()
	 * @see #getSgrPowerSource()
	 * @see #setSgrPowerSource(SGrPowerSourceType)
	 * @generated
	 */
	void unsetSgrPowerSource();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource <em>Sgr Power Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Power Source</em>' attribute is set.
	 * @see #unsetSgrPowerSource()
	 * @see #getSgrPowerSource()
	 * @see #setSgrPowerSource(SGrPowerSourceType)
	 * @generated
	 */
	boolean isSetSgrPowerSource();

	/**
	 * Returns the value of the '<em><b>Sgready State Lv2</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGReadyStateLv2Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgready State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see #isSetSgreadyStateLv2()
	 * @see #unsetSgreadyStateLv2()
	 * @see #setSgreadyStateLv2(SGReadyStateLv2Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgreadyStateLv2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgreadyStateLv2' namespace='##targetNamespace'"
	 * @generated
	 */
	SGReadyStateLv2Type getSgreadyStateLv2();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2 <em>Sgready State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgready State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see #isSetSgreadyStateLv2()
	 * @see #unsetSgreadyStateLv2()
	 * @see #getSgreadyStateLv2()
	 * @generated
	 */
	void setSgreadyStateLv2(SGReadyStateLv2Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2 <em>Sgready State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgreadyStateLv2()
	 * @see #getSgreadyStateLv2()
	 * @see #setSgreadyStateLv2(SGReadyStateLv2Type)
	 * @generated
	 */
	void unsetSgreadyStateLv2();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2 <em>Sgready State Lv2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgready State Lv2</em>' attribute is set.
	 * @see #unsetSgreadyStateLv2()
	 * @see #getSgreadyStateLv2()
	 * @see #setSgreadyStateLv2(SGReadyStateLv2Type)
	 * @generated
	 */
	boolean isSetSgreadyStateLv2();

	/**
	 * Returns the value of the '<em><b>Sgready State Lv1</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGReadyStateLv1Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgready State Lv1</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see #isSetSgreadyStateLv1()
	 * @see #unsetSgreadyStateLv1()
	 * @see #setSgreadyStateLv1(SGReadyStateLv1Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgreadyStateLv1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgreadyStateLv1' namespace='##targetNamespace'"
	 * @generated
	 */
	SGReadyStateLv1Type getSgreadyStateLv1();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1 <em>Sgready State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgready State Lv1</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see #isSetSgreadyStateLv1()
	 * @see #unsetSgreadyStateLv1()
	 * @see #getSgreadyStateLv1()
	 * @generated
	 */
	void setSgreadyStateLv1(SGReadyStateLv1Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1 <em>Sgready State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgreadyStateLv1()
	 * @see #getSgreadyStateLv1()
	 * @see #setSgreadyStateLv1(SGReadyStateLv1Type)
	 * @generated
	 */
	void unsetSgreadyStateLv1();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1 <em>Sgready State Lv1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgready State Lv1</em>' attribute is set.
	 * @see #unsetSgreadyStateLv1()
	 * @see #getSgreadyStateLv1()
	 * @see #setSgreadyStateLv1(SGReadyStateLv1Type)
	 * @generated
	 */
	boolean isSetSgreadyStateLv1();

	/**
	 * Returns the value of the '<em><b>Sgr Sunsp State Codes</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrSunspStateCodesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Sunsp State Codes</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see #isSetSgrSunspStateCodes()
	 * @see #unsetSgrSunspStateCodes()
	 * @see #setSgrSunspStateCodes(SGrSunspStateCodesType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrSunspStateCodes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrSunspStateCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSunspStateCodesType getSgrSunspStateCodes();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Sunsp State Codes</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see #isSetSgrSunspStateCodes()
	 * @see #unsetSgrSunspStateCodes()
	 * @see #getSgrSunspStateCodes()
	 * @generated
	 */
	void setSgrSunspStateCodes(SGrSunspStateCodesType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrSunspStateCodes()
	 * @see #getSgrSunspStateCodes()
	 * @see #setSgrSunspStateCodes(SGrSunspStateCodesType)
	 * @generated
	 */
	void unsetSgrSunspStateCodes();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Sunsp State Codes</em>' attribute is set.
	 * @see #unsetSgrSunspStateCodes()
	 * @see #getSgrSunspStateCodes()
	 * @see #setSgrSunspStateCodes(SGrSunspStateCodesType)
	 * @generated
	 */
	boolean isSetSgrSunspStateCodes();

	/**
	 * Returns the value of the '<em><b>Sgr EVSE State Lv2</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrEVSEStateLv2Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr EVSE State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see #isSetSgrEVSEStateLv2()
	 * @see #unsetSgrEVSEStateLv2()
	 * @see #setSgrEVSEStateLv2(SGrEVSEStateLv2Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrEVSEStateLv2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrEVSEStateLv2' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrEVSEStateLv2Type getSgrEVSEStateLv2();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr EVSE State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see #isSetSgrEVSEStateLv2()
	 * @see #unsetSgrEVSEStateLv2()
	 * @see #getSgrEVSEStateLv2()
	 * @generated
	 */
	void setSgrEVSEStateLv2(SGrEVSEStateLv2Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrEVSEStateLv2()
	 * @see #getSgrEVSEStateLv2()
	 * @see #setSgrEVSEStateLv2(SGrEVSEStateLv2Type)
	 * @generated
	 */
	void unsetSgrEVSEStateLv2();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr EVSE State Lv2</em>' attribute is set.
	 * @see #unsetSgrEVSEStateLv2()
	 * @see #getSgrEVSEStateLv2()
	 * @see #setSgrEVSEStateLv2(SGrEVSEStateLv2Type)
	 * @generated
	 */
	boolean isSetSgrEVSEStateLv2();

	/**
	 * Returns the value of the '<em><b>Sgr EVSE State Lv1</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrEVSEStateLv1Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr EVSE State Lv1</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see #isSetSgrEVSEStateLv1()
	 * @see #unsetSgrEVSEStateLv1()
	 * @see #setSgrEVSEStateLv1(SGrEVSEStateLv1Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrEVSEStateLv1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrEVSEStateLv1' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrEVSEStateLv1Type getSgrEVSEStateLv1();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr EVSE State Lv1</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see #isSetSgrEVSEStateLv1()
	 * @see #unsetSgrEVSEStateLv1()
	 * @see #getSgrEVSEStateLv1()
	 * @generated
	 */
	void setSgrEVSEStateLv1(SGrEVSEStateLv1Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrEVSEStateLv1()
	 * @see #getSgrEVSEStateLv1()
	 * @see #setSgrEVSEStateLv1(SGrEVSEStateLv1Type)
	 * @generated
	 */
	void unsetSgrEVSEStateLv1();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr EVSE State Lv1</em>' attribute is set.
	 * @see #unsetSgrEVSEStateLv1()
	 * @see #getSgrEVSEStateLv1()
	 * @see #setSgrEVSEStateLv1(SGrEVSEStateLv1Type)
	 * @generated
	 */
	boolean isSetSgrEVSEStateLv1();

	/**
	 * Returns the value of the '<em><b>Sgr SGCP Load State Lv2</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr SGCP Load State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see #isSetSgrSGCPLoadStateLv2()
	 * @see #unsetSgrSGCPLoadStateLv2()
	 * @see #setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrSGCPLoadStateLv2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrSGCPLoadStateLv2' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSGCPLoadStateLv2Type getSgrSGCPLoadStateLv2();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr SGCP Load State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see #isSetSgrSGCPLoadStateLv2()
	 * @see #unsetSgrSGCPLoadStateLv2()
	 * @see #getSgrSGCPLoadStateLv2()
	 * @generated
	 */
	void setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrSGCPLoadStateLv2()
	 * @see #getSgrSGCPLoadStateLv2()
	 * @see #setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type)
	 * @generated
	 */
	void unsetSgrSGCPLoadStateLv2();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr SGCP Load State Lv2</em>' attribute is set.
	 * @see #unsetSgrSGCPLoadStateLv2()
	 * @see #getSgrSGCPLoadStateLv2()
	 * @see #setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type)
	 * @generated
	 */
	boolean isSetSgrSGCPLoadStateLv2();

	/**
	 * Returns the value of the '<em><b>Sgr SGCP Feed In State Lv2</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr SGCP Feed In State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see #isSetSgrSGCPFeedInStateLv2()
	 * @see #unsetSgrSGCPFeedInStateLv2()
	 * @see #setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrSGCPFeedInStateLv2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrSGCPFeedInStateLv2' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSGCPFeedInStateLv2Type getSgrSGCPFeedInStateLv2();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr SGCP Feed In State Lv2</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see #isSetSgrSGCPFeedInStateLv2()
	 * @see #unsetSgrSGCPFeedInStateLv2()
	 * @see #getSgrSGCPFeedInStateLv2()
	 * @generated
	 */
	void setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrSGCPFeedInStateLv2()
	 * @see #getSgrSGCPFeedInStateLv2()
	 * @see #setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type)
	 * @generated
	 */
	void unsetSgrSGCPFeedInStateLv2();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr SGCP Feed In State Lv2</em>' attribute is set.
	 * @see #unsetSgrSGCPFeedInStateLv2()
	 * @see #getSgrSGCPFeedInStateLv2()
	 * @see #setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type)
	 * @generated
	 */
	boolean isSetSgrSGCPFeedInStateLv2();

	/**
	 * Returns the value of the '<em><b>Sgr EV State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrEVStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr EV State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see #isSetSgrEVState()
	 * @see #unsetSgrEVState()
	 * @see #setSgrEVState(SGrEVStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrEVState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrEVState' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrEVStateType getSgrEVState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState <em>Sgr EV State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr EV State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see #isSetSgrEVState()
	 * @see #unsetSgrEVState()
	 * @see #getSgrEVState()
	 * @generated
	 */
	void setSgrEVState(SGrEVStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState <em>Sgr EV State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrEVState()
	 * @see #getSgrEVState()
	 * @see #setSgrEVState(SGrEVStateType)
	 * @generated
	 */
	void unsetSgrEVState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState <em>Sgr EV State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr EV State</em>' attribute is set.
	 * @see #unsetSgrEVState()
	 * @see #getSgrEVState()
	 * @see #setSgrEVState(SGrEVStateType)
	 * @generated
	 */
	boolean isSetSgrEVState();

	/**
	 * Returns the value of the '<em><b>Sgr SGCP Service</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrSGCPServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr SGCP Service</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see #isSetSgrSGCPService()
	 * @see #unsetSgrSGCPService()
	 * @see #setSgrSGCPService(SGrSGCPServiceType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrSGCPService()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrSGCPService' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSGCPServiceType getSgrSGCPService();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService <em>Sgr SGCP Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr SGCP Service</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see #isSetSgrSGCPService()
	 * @see #unsetSgrSGCPService()
	 * @see #getSgrSGCPService()
	 * @generated
	 */
	void setSgrSGCPService(SGrSGCPServiceType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService <em>Sgr SGCP Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrSGCPService()
	 * @see #getSgrSGCPService()
	 * @see #setSgrSGCPService(SGrSGCPServiceType)
	 * @generated
	 */
	void unsetSgrSGCPService();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService <em>Sgr SGCP Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr SGCP Service</em>' attribute is set.
	 * @see #unsetSgrSGCPService()
	 * @see #getSgrSGCPService()
	 * @see #setSgrSGCPService(SGrSGCPServiceType)
	 * @generated
	 */
	boolean isSetSgrSGCPService();

	/**
	 * Returns the value of the '<em><b>Sgr Oblig Lvl</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrObligLvlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Oblig Lvl</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see #isSetSgrObligLvl()
	 * @see #unsetSgrObligLvl()
	 * @see #setSgrObligLvl(SGrObligLvlType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrObligLvl()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrObligLvl' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrObligLvlType getSgrObligLvl();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl <em>Sgr Oblig Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Oblig Lvl</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see #isSetSgrObligLvl()
	 * @see #unsetSgrObligLvl()
	 * @see #getSgrObligLvl()
	 * @generated
	 */
	void setSgrObligLvl(SGrObligLvlType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl <em>Sgr Oblig Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrObligLvl()
	 * @see #getSgrObligLvl()
	 * @see #setSgrObligLvl(SGrObligLvlType)
	 * @generated
	 */
	void unsetSgrObligLvl();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl <em>Sgr Oblig Lvl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Oblig Lvl</em>' attribute is set.
	 * @see #unsetSgrObligLvl()
	 * @see #getSgrObligLvl()
	 * @see #setSgrObligLvl(SGrObligLvlType)
	 * @generated
	 */
	boolean isSetSgrObligLvl();

	/**
	 * Returns the value of the '<em><b>Sgr OCPP State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrOCPPStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr OCPP State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see #isSetSgrOCPPState()
	 * @see #unsetSgrOCPPState()
	 * @see #setSgrOCPPState(SGrOCPPStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrOCPPState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrOCPPState' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrOCPPStateType getSgrOCPPState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState <em>Sgr OCPP State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr OCPP State</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see #isSetSgrOCPPState()
	 * @see #unsetSgrOCPPState()
	 * @see #getSgrOCPPState()
	 * @generated
	 */
	void setSgrOCPPState(SGrOCPPStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState <em>Sgr OCPP State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrOCPPState()
	 * @see #getSgrOCPPState()
	 * @see #setSgrOCPPState(SGrOCPPStateType)
	 * @generated
	 */
	void unsetSgrOCPPState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState <em>Sgr OCPP State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr OCPP State</em>' attribute is set.
	 * @see #unsetSgrOCPPState()
	 * @see #getSgrOCPPState()
	 * @see #setSgrOCPPState(SGrOCPPStateType)
	 * @generated
	 */
	boolean isSetSgrOCPPState();

	/**
	 * Returns the value of the '<em><b>Sgr HP Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrHPOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see #isSetSgrHPOpMode()
	 * @see #unsetSgrHPOpMode()
	 * @see #setSgrHPOpMode(SGrHPOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrHPOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrHPOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrHPOpModeType getSgrHPOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode <em>Sgr HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see #isSetSgrHPOpMode()
	 * @see #unsetSgrHPOpMode()
	 * @see #getSgrHPOpMode()
	 * @generated
	 */
	void setSgrHPOpMode(SGrHPOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode <em>Sgr HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrHPOpMode()
	 * @see #getSgrHPOpMode()
	 * @see #setSgrHPOpMode(SGrHPOpModeType)
	 * @generated
	 */
	void unsetSgrHPOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode <em>Sgr HP Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr HP Op Mode</em>' attribute is set.
	 * @see #unsetSgrHPOpMode()
	 * @see #getSgrHPOpMode()
	 * @see #setSgrHPOpMode(SGrHPOpModeType)
	 * @generated
	 */
	boolean isSetSgrHPOpMode();

	/**
	 * Returns the value of the '<em><b>Sgr HC Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrHCOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see #isSetSgrHCOpMode()
	 * @see #unsetSgrHCOpMode()
	 * @see #setSgrHCOpMode(SGrHCOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrHCOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrHCOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrHCOpModeType getSgrHCOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode <em>Sgr HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see #isSetSgrHCOpMode()
	 * @see #unsetSgrHCOpMode()
	 * @see #getSgrHCOpMode()
	 * @generated
	 */
	void setSgrHCOpMode(SGrHCOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode <em>Sgr HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrHCOpMode()
	 * @see #getSgrHCOpMode()
	 * @see #setSgrHCOpMode(SGrHCOpModeType)
	 * @generated
	 */
	void unsetSgrHCOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode <em>Sgr HC Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr HC Op Mode</em>' attribute is set.
	 * @see #unsetSgrHCOpMode()
	 * @see #getSgrHCOpMode()
	 * @see #setSgrHCOpMode(SGrHCOpModeType)
	 * @generated
	 */
	boolean isSetSgrHCOpMode();

	/**
	 * Returns the value of the '<em><b>Sgr DHW Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrDHWOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr DHW Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @see #isSetSgrDHWOpMode()
	 * @see #unsetSgrDHWOpMode()
	 * @see #setSgrDHWOpMode(SGrDHWOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_SgrDHWOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrDHWOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDHWOpModeType getSgrDHWOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode <em>Sgr DHW Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr DHW Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @see #isSetSgrDHWOpMode()
	 * @see #unsetSgrDHWOpMode()
	 * @see #getSgrDHWOpMode()
	 * @generated
	 */
	void setSgrDHWOpMode(SGrDHWOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode <em>Sgr DHW Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrDHWOpMode()
	 * @see #getSgrDHWOpMode()
	 * @see #setSgrDHWOpMode(SGrDHWOpModeType)
	 * @generated
	 */
	void unsetSgrDHWOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode <em>Sgr DHW Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr DHW Op Mode</em>' attribute is set.
	 * @see #unsetSgrDHWOpMode()
	 * @see #getSgrDHWOpMode()
	 * @see #setSgrDHWOpMode(SGrDHWOpModeType)
	 * @generated
	 */
	boolean isSetSgrDHWOpMode();

	/**
	 * Returns the value of the '<em><b>Cta DHW Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.CtaDHWOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cta DHW Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see #isSetCtaDHWOpMode()
	 * @see #unsetCtaDHWOpMode()
	 * @see #setCtaDHWOpMode(CtaDHWOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_CtaDHWOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ctaDHWOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CtaDHWOpModeType getCtaDHWOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode <em>Cta DHW Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cta DHW Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see #isSetCtaDHWOpMode()
	 * @see #unsetCtaDHWOpMode()
	 * @see #getCtaDHWOpMode()
	 * @generated
	 */
	void setCtaDHWOpMode(CtaDHWOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode <em>Cta DHW Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtaDHWOpMode()
	 * @see #getCtaDHWOpMode()
	 * @see #setCtaDHWOpMode(CtaDHWOpModeType)
	 * @generated
	 */
	void unsetCtaDHWOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode <em>Cta DHW Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cta DHW Op Mode</em>' attribute is set.
	 * @see #unsetCtaDHWOpMode()
	 * @see #getCtaDHWOpMode()
	 * @see #setCtaDHWOpMode(CtaDHWOpModeType)
	 * @generated
	 */
	boolean isSetCtaDHWOpMode();

	/**
	 * Returns the value of the '<em><b>Cta HP Op State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.CtaHPOpStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cta HP Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @see #isSetCtaHPOpState()
	 * @see #unsetCtaHPOpState()
	 * @see #setCtaHPOpState(CtaHPOpStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_CtaHPOpState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ctaHPOpState' namespace='##targetNamespace'"
	 * @generated
	 */
	CtaHPOpStateType getCtaHPOpState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cta HP Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @see #isSetCtaHPOpState()
	 * @see #unsetCtaHPOpState()
	 * @see #getCtaHPOpState()
	 * @generated
	 */
	void setCtaHPOpState(CtaHPOpStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtaHPOpState()
	 * @see #getCtaHPOpState()
	 * @see #setCtaHPOpState(CtaHPOpStateType)
	 * @generated
	 */
	void unsetCtaHPOpState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cta HP Op State</em>' attribute is set.
	 * @see #unsetCtaHPOpState()
	 * @see #getCtaHPOpState()
	 * @see #setCtaHPOpState(CtaHPOpStateType)
	 * @generated
	 */
	boolean isSetCtaHPOpState();

	/**
	 * Returns the value of the '<em><b>Cta HP Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.CtaHPOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cta HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @see #isSetCtaHPOpMode()
	 * @see #unsetCtaHPOpMode()
	 * @see #setCtaHPOpMode(CtaHPOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_CtaHPOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ctaHPOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CtaHPOpModeType getCtaHPOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cta HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @see #isSetCtaHPOpMode()
	 * @see #unsetCtaHPOpMode()
	 * @see #getCtaHPOpMode()
	 * @generated
	 */
	void setCtaHPOpMode(CtaHPOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtaHPOpMode()
	 * @see #getCtaHPOpMode()
	 * @see #setCtaHPOpMode(CtaHPOpModeType)
	 * @generated
	 */
	void unsetCtaHPOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cta HP Op Mode</em>' attribute is set.
	 * @see #unsetCtaHPOpMode()
	 * @see #getCtaHPOpMode()
	 * @see #setCtaHPOpMode(CtaHPOpModeType)
	 * @generated
	 */
	boolean isSetCtaHPOpMode();

} // SGrEnumListType
