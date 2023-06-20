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
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDomHotWOpMode <em>Cta Dom Hot WOp Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode <em>Cta HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode <em>Hov HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode <em>Hov HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState <em>Hov Buffer State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState <em>Hov HC Op State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState <em>Hov Dom Hot WState</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState <em>Hov HP Op State</em>}</li>
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
	 * Returns the value of the '<em><b>Cta Dom Hot WOp Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.CtaDomHotWOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cta Dom Hot WOp Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaDomHotWOpModeType
	 * @see #isSetCtaDomHotWOpMode()
	 * @see #unsetCtaDomHotWOpMode()
	 * @see #setCtaDomHotWOpMode(CtaDomHotWOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_CtaDomHotWOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ctaDomHotWOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CtaDomHotWOpModeType getCtaDomHotWOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDomHotWOpMode <em>Cta Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cta Dom Hot WOp Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaDomHotWOpModeType
	 * @see #isSetCtaDomHotWOpMode()
	 * @see #unsetCtaDomHotWOpMode()
	 * @see #getCtaDomHotWOpMode()
	 * @generated
	 */
	void setCtaDomHotWOpMode(CtaDomHotWOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDomHotWOpMode <em>Cta Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtaDomHotWOpMode()
	 * @see #getCtaDomHotWOpMode()
	 * @see #setCtaDomHotWOpMode(CtaDomHotWOpModeType)
	 * @generated
	 */
	void unsetCtaDomHotWOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDomHotWOpMode <em>Cta Dom Hot WOp Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cta Dom Hot WOp Mode</em>' attribute is set.
	 * @see #unsetCtaDomHotWOpMode()
	 * @see #getCtaDomHotWOpMode()
	 * @see #setCtaDomHotWOpMode(CtaDomHotWOpModeType)
	 * @generated
	 */
	boolean isSetCtaDomHotWOpMode();

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

	/**
	 * Returns the value of the '<em><b>Cta HC Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.CtaHCOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cta HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @see #isSetCtaHCOpMode()
	 * @see #unsetCtaHCOpMode()
	 * @see #setCtaHCOpMode(CtaHCOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_CtaHCOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ctaHCOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CtaHCOpModeType getCtaHCOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode <em>Cta HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cta HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @see #isSetCtaHCOpMode()
	 * @see #unsetCtaHCOpMode()
	 * @see #getCtaHCOpMode()
	 * @generated
	 */
	void setCtaHCOpMode(CtaHCOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode <em>Cta HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtaHCOpMode()
	 * @see #getCtaHCOpMode()
	 * @see #setCtaHCOpMode(CtaHCOpModeType)
	 * @generated
	 */
	void unsetCtaHCOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode <em>Cta HC Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cta HC Op Mode</em>' attribute is set.
	 * @see #unsetCtaHCOpMode()
	 * @see #getCtaHCOpMode()
	 * @see #setCtaHCOpMode(CtaHCOpModeType)
	 * @generated
	 */
	boolean isSetCtaHCOpMode();

	/**
	 * Returns the value of the '<em><b>Hov HP Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovHPOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @see #isSetHovHPOpMode()
	 * @see #unsetHovHPOpMode()
	 * @see #setHovHPOpMode(HovHPOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovHPOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovHPOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	HovHPOpModeType getHovHPOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode <em>Hov HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov HP Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @see #isSetHovHPOpMode()
	 * @see #unsetHovHPOpMode()
	 * @see #getHovHPOpMode()
	 * @generated
	 */
	void setHovHPOpMode(HovHPOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode <em>Hov HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovHPOpMode()
	 * @see #getHovHPOpMode()
	 * @see #setHovHPOpMode(HovHPOpModeType)
	 * @generated
	 */
	void unsetHovHPOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode <em>Hov HP Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov HP Op Mode</em>' attribute is set.
	 * @see #unsetHovHPOpMode()
	 * @see #getHovHPOpMode()
	 * @see #setHovHPOpMode(HovHPOpModeType)
	 * @generated
	 */
	boolean isSetHovHPOpMode();

	/**
	 * Returns the value of the '<em><b>Hov HC Op Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovHCOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @see #isSetHovHCOpMode()
	 * @see #unsetHovHCOpMode()
	 * @see #setHovHCOpMode(HovHCOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovHCOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovHCOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	HovHCOpModeType getHovHCOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode <em>Hov HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov HC Op Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @see #isSetHovHCOpMode()
	 * @see #unsetHovHCOpMode()
	 * @see #getHovHCOpMode()
	 * @generated
	 */
	void setHovHCOpMode(HovHCOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode <em>Hov HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovHCOpMode()
	 * @see #getHovHCOpMode()
	 * @see #setHovHCOpMode(HovHCOpModeType)
	 * @generated
	 */
	void unsetHovHCOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode <em>Hov HC Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov HC Op Mode</em>' attribute is set.
	 * @see #unsetHovHCOpMode()
	 * @see #getHovHCOpMode()
	 * @see #setHovHCOpMode(HovHCOpModeType)
	 * @generated
	 */
	boolean isSetHovHCOpMode();

	/**
	 * Returns the value of the '<em><b>Hov SG Ready Src Sel</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovSGReadySrcSelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov SG Ready Src Sel</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @see #isSetHovSGReadySrcSel()
	 * @see #unsetHovSGReadySrcSel()
	 * @see #setHovSGReadySrcSel(HovSGReadySrcSelType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovSGReadySrcSel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovSGReadySrcSel' namespace='##targetNamespace'"
	 * @generated
	 */
	HovSGReadySrcSelType getHovSGReadySrcSel();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov SG Ready Src Sel</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @see #isSetHovSGReadySrcSel()
	 * @see #unsetHovSGReadySrcSel()
	 * @see #getHovSGReadySrcSel()
	 * @generated
	 */
	void setHovSGReadySrcSel(HovSGReadySrcSelType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovSGReadySrcSel()
	 * @see #getHovSGReadySrcSel()
	 * @see #setHovSGReadySrcSel(HovSGReadySrcSelType)
	 * @generated
	 */
	void unsetHovSGReadySrcSel();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov SG Ready Src Sel</em>' attribute is set.
	 * @see #unsetHovSGReadySrcSel()
	 * @see #getHovSGReadySrcSel()
	 * @see #setHovSGReadySrcSel(HovSGReadySrcSelType)
	 * @generated
	 */
	boolean isSetHovSGReadySrcSel();

	/**
	 * Returns the value of the '<em><b>Hov Buffer State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovBufferStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov Buffer State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @see #isSetHovBufferState()
	 * @see #unsetHovBufferState()
	 * @see #setHovBufferState(HovBufferStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovBufferState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovBufferState' namespace='##targetNamespace'"
	 * @generated
	 */
	HovBufferStateType getHovBufferState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState <em>Hov Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov Buffer State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @see #isSetHovBufferState()
	 * @see #unsetHovBufferState()
	 * @see #getHovBufferState()
	 * @generated
	 */
	void setHovBufferState(HovBufferStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState <em>Hov Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovBufferState()
	 * @see #getHovBufferState()
	 * @see #setHovBufferState(HovBufferStateType)
	 * @generated
	 */
	void unsetHovBufferState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState <em>Hov Buffer State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov Buffer State</em>' attribute is set.
	 * @see #unsetHovBufferState()
	 * @see #getHovBufferState()
	 * @see #setHovBufferState(HovBufferStateType)
	 * @generated
	 */
	boolean isSetHovBufferState();

	/**
	 * Returns the value of the '<em><b>Hov HC Op State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovHCOpStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov HC Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @see #isSetHovHCOpState()
	 * @see #unsetHovHCOpState()
	 * @see #setHovHCOpState(HovHCOpStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovHCOpState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovHCOpState' namespace='##targetNamespace'"
	 * @generated
	 */
	HovHCOpStateType getHovHCOpState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState <em>Hov HC Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov HC Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @see #isSetHovHCOpState()
	 * @see #unsetHovHCOpState()
	 * @see #getHovHCOpState()
	 * @generated
	 */
	void setHovHCOpState(HovHCOpStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState <em>Hov HC Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovHCOpState()
	 * @see #getHovHCOpState()
	 * @see #setHovHCOpState(HovHCOpStateType)
	 * @generated
	 */
	void unsetHovHCOpState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState <em>Hov HC Op State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov HC Op State</em>' attribute is set.
	 * @see #unsetHovHCOpState()
	 * @see #getHovHCOpState()
	 * @see #setHovHCOpState(HovHCOpStateType)
	 * @generated
	 */
	boolean isSetHovHCOpState();

	/**
	 * Returns the value of the '<em><b>Hov Dom Hot WOp Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovDomHotWOpModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov Dom Hot WOp Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @see #isSetHovDomHotWOpMode()
	 * @see #unsetHovDomHotWOpMode()
	 * @see #setHovDomHotWOpMode(HovDomHotWOpModeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovDomHotWOpMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovDomHotWOpMode' namespace='##targetNamespace'"
	 * @generated
	 */
	HovDomHotWOpModeType getHovDomHotWOpMode();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov Dom Hot WOp Mode</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @see #isSetHovDomHotWOpMode()
	 * @see #unsetHovDomHotWOpMode()
	 * @see #getHovDomHotWOpMode()
	 * @generated
	 */
	void setHovDomHotWOpMode(HovDomHotWOpModeType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovDomHotWOpMode()
	 * @see #getHovDomHotWOpMode()
	 * @see #setHovDomHotWOpMode(HovDomHotWOpModeType)
	 * @generated
	 */
	void unsetHovDomHotWOpMode();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov Dom Hot WOp Mode</em>' attribute is set.
	 * @see #unsetHovDomHotWOpMode()
	 * @see #getHovDomHotWOpMode()
	 * @see #setHovDomHotWOpMode(HovDomHotWOpModeType)
	 * @generated
	 */
	boolean isSetHovDomHotWOpMode();

	/**
	 * Returns the value of the '<em><b>Hov Dom Hot WState</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovDomHotWStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov Dom Hot WState</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @see #isSetHovDomHotWState()
	 * @see #unsetHovDomHotWState()
	 * @see #setHovDomHotWState(HovDomHotWStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovDomHotWState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovDomHotWState' namespace='##targetNamespace'"
	 * @generated
	 */
	HovDomHotWStateType getHovDomHotWState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState <em>Hov Dom Hot WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov Dom Hot WState</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @see #isSetHovDomHotWState()
	 * @see #unsetHovDomHotWState()
	 * @see #getHovDomHotWState()
	 * @generated
	 */
	void setHovDomHotWState(HovDomHotWStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState <em>Hov Dom Hot WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovDomHotWState()
	 * @see #getHovDomHotWState()
	 * @see #setHovDomHotWState(HovDomHotWStateType)
	 * @generated
	 */
	void unsetHovDomHotWState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState <em>Hov Dom Hot WState</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov Dom Hot WState</em>' attribute is set.
	 * @see #unsetHovDomHotWState()
	 * @see #getHovDomHotWState()
	 * @see #setHovDomHotWState(HovDomHotWStateType)
	 * @generated
	 */
	boolean isSetHovDomHotWState();

	/**
	 * Returns the value of the '<em><b>Hov HP Op State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovHPOpStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov HP Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @see #isSetHovHPOpState()
	 * @see #unsetHovHPOpState()
	 * @see #setHovHPOpState(HovHPOpStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrEnumListType_HovHPOpState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovHPOpState' namespace='##targetNamespace'"
	 * @generated
	 */
	HovHPOpStateType getHovHPOpState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState <em>Hov HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov HP Op State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @see #isSetHovHPOpState()
	 * @see #unsetHovHPOpState()
	 * @see #getHovHPOpState()
	 * @generated
	 */
	void setHovHPOpState(HovHPOpStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState <em>Hov HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovHPOpState()
	 * @see #getHovHPOpState()
	 * @see #setHovHPOpState(HovHPOpStateType)
	 * @generated
	 */
	void unsetHovHPOpState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState <em>Hov HP Op State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov HP Op State</em>' attribute is set.
	 * @see #unsetHovHPOpState()
	 * @see #getHovHPOpState()
	 * @see #setHovHPOpState(HovHPOpStateType)
	 * @generated
	 */
	boolean isSetHovHPOpState();

} // SGrEnumListType
