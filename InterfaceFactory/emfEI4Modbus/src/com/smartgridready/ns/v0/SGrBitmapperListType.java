/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Bitmapper List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BMxxxx:
 *      Field of enumeration where endum index is used as bitmap flag
 *      Unsigned int value  [and]  ( 1 [2 *  shift left] enum_index_value means bit is set
 * 	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate <em>Sgr HP Opstate</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate <em>Sgr HC Opstate</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState <em>Hov HP Act Buffer State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate <em>Sti HP Opstate</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType()
 * @model extendedMetaData="name='SGrBitmapperListType' kind='elementOnly'"
 * @generated
 */
public interface SGrBitmapperListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sgr Bool2 Bit Rank</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrBool2BitRankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Bool2 Bit Rank</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see #isSetSgrBool2BitRank()
	 * @see #unsetSgrBool2BitRank()
	 * @see #setSgrBool2BitRank(SGrBool2BitRankType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_SgrBool2BitRank()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrBool2BitRank' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrBool2BitRankType getSgrBool2BitRank();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Bool2 Bit Rank</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see #isSetSgrBool2BitRank()
	 * @see #unsetSgrBool2BitRank()
	 * @see #getSgrBool2BitRank()
	 * @generated
	 */
	void setSgrBool2BitRank(SGrBool2BitRankType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrBool2BitRank()
	 * @see #getSgrBool2BitRank()
	 * @see #setSgrBool2BitRank(SGrBool2BitRankType)
	 * @generated
	 */
	void unsetSgrBool2BitRank();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr Bool2 Bit Rank</em>' attribute is set.
	 * @see #unsetSgrBool2BitRank()
	 * @see #getSgrBool2BitRank()
	 * @see #setSgrBool2BitRank(SGrBool2BitRankType)
	 * @generated
	 */
	boolean isSetSgrBool2BitRank();

	/**
	 * Returns the value of the '<em><b>Sgr HP Opstate</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrHPOpstateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr HP Opstate</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see #isSetSgrHPOpstate()
	 * @see #unsetSgrHPOpstate()
	 * @see #setSgrHPOpstate(SGrHPOpstateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_SgrHPOpstate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrHPOpstate' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrHPOpstateType getSgrHPOpstate();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate <em>Sgr HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr HP Opstate</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see #isSetSgrHPOpstate()
	 * @see #unsetSgrHPOpstate()
	 * @see #getSgrHPOpstate()
	 * @generated
	 */
	void setSgrHPOpstate(SGrHPOpstateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate <em>Sgr HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrHPOpstate()
	 * @see #getSgrHPOpstate()
	 * @see #setSgrHPOpstate(SGrHPOpstateType)
	 * @generated
	 */
	void unsetSgrHPOpstate();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate <em>Sgr HP Opstate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr HP Opstate</em>' attribute is set.
	 * @see #unsetSgrHPOpstate()
	 * @see #getSgrHPOpstate()
	 * @see #setSgrHPOpstate(SGrHPOpstateType)
	 * @generated
	 */
	boolean isSetSgrHPOpstate();

	/**
	 * Returns the value of the '<em><b>Sgr HC Opstate</b></em>' attribute.
	 * The literals are from the enumeration {@link SGrHCOpStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr HC Opstate</em>' attribute.
	 * @see SGrHCOpStateType
	 * @see #isSetSgrHCOpstate()
	 * @see #unsetSgrHCOpstate()
	 * @see #setSgrHCOpstate(SGrHCOpStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_SgrHCOpstate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrHCOpstate' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrHCOpStateType getSgrHCOpstate();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate <em>Sgr HC Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr HC Opstate</em>' attribute.
	 * @see SGrHCOpStateType
	 * @see #isSetSgrHCOpstate()
	 * @see #unsetSgrHCOpstate()
	 * @see #getSgrHCOpstate()
	 * @generated
	 */
	void setSgrHCOpstate(SGrHCOpStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate <em>Sgr HC Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrHCOpstate()
	 * @see #getSgrHCOpstate()
	 * @see #setSgrHCOpstate(SGrHCOpStateType)
	 * @generated
	 */
	void unsetSgrHCOpstate();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate <em>Sgr HC Opstate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr HC Opstate</em>' attribute is set.
	 * @see #unsetSgrHCOpstate()
	 * @see #getSgrHCOpstate()
	 * @see #setSgrHCOpstate(SGrHCOpStateType)
	 * @generated
	 */
	boolean isSetSgrHCOpstate();

	/**
	 * Returns the value of the '<em><b>Hov HP Act Buffer State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.HovHPActBufferStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hov HP Act Buffer State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @see #isSetHovHPActBufferState()
	 * @see #unsetHovHPActBufferState()
	 * @see #setHovHPActBufferState(HovHPActBufferStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_HovHPActBufferState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='hovHPActBufferState' namespace='##targetNamespace'"
	 * @generated
	 */
	HovHPActBufferStateType getHovHPActBufferState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState <em>Hov HP Act Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hov HP Act Buffer State</em>' attribute.
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @see #isSetHovHPActBufferState()
	 * @see #unsetHovHPActBufferState()
	 * @see #getHovHPActBufferState()
	 * @generated
	 */
	void setHovHPActBufferState(HovHPActBufferStateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState <em>Hov HP Act Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHovHPActBufferState()
	 * @see #getHovHPActBufferState()
	 * @see #setHovHPActBufferState(HovHPActBufferStateType)
	 * @generated
	 */
	void unsetHovHPActBufferState();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState <em>Hov HP Act Buffer State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hov HP Act Buffer State</em>' attribute is set.
	 * @see #unsetHovHPActBufferState()
	 * @see #getHovHPActBufferState()
	 * @see #setHovHPActBufferState(HovHPActBufferStateType)
	 * @generated
	 */
	boolean isSetHovHPActBufferState();

	/**
	 * Returns the value of the '<em><b>Sti HP Opstate</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.StiHPOpstateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sti HP Opstate</em>' attribute.
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @see #isSetStiHPOpstate()
	 * @see #unsetStiHPOpstate()
	 * @see #setStiHPOpstate(StiHPOpstateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_StiHPOpstate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='stiHPOpstate' namespace='##targetNamespace'"
	 * @generated
	 */
	StiHPOpstateType getStiHPOpstate();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate <em>Sti HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sti HP Opstate</em>' attribute.
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @see #isSetStiHPOpstate()
	 * @see #unsetStiHPOpstate()
	 * @see #getStiHPOpstate()
	 * @generated
	 */
	void setStiHPOpstate(StiHPOpstateType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate <em>Sti HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStiHPOpstate()
	 * @see #getStiHPOpstate()
	 * @see #setStiHPOpstate(StiHPOpstateType)
	 * @generated
	 */
	void unsetStiHPOpstate();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate <em>Sti HP Opstate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sti HP Opstate</em>' attribute is set.
	 * @see #unsetStiHPOpstate()
	 * @see #getStiHPOpstate()
	 * @see #setStiHPOpstate(StiHPOpstateType)
	 * @generated
	 */
	boolean isSetStiHPOpstate();

} // SGrBitmapperListType
