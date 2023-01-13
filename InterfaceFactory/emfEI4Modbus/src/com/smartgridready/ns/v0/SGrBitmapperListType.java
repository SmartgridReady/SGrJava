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
 * BM0001:
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
 *   <li>{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstateStiebel <em>Sgr HP Opstate Stiebel</em>}</li>
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
	 * Returns the value of the '<em><b>Sgr HP Opstate Stiebel</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrHPOpstateStiebelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr HP Opstate Stiebel</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateStiebelType
	 * @see #isSetSgrHPOpstateStiebel()
	 * @see #unsetSgrHPOpstateStiebel()
	 * @see #setSgrHPOpstateStiebel(SGrHPOpstateStiebelType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBitmapperListType_SgrHPOpstateStiebel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='sgrHPOpstateStiebel' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrHPOpstateStiebelType getSgrHPOpstateStiebel();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstateStiebel <em>Sgr HP Opstate Stiebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr HP Opstate Stiebel</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateStiebelType
	 * @see #isSetSgrHPOpstateStiebel()
	 * @see #unsetSgrHPOpstateStiebel()
	 * @see #getSgrHPOpstateStiebel()
	 * @generated
	 */
	void setSgrHPOpstateStiebel(SGrHPOpstateStiebelType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstateStiebel <em>Sgr HP Opstate Stiebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSgrHPOpstateStiebel()
	 * @see #getSgrHPOpstateStiebel()
	 * @see #setSgrHPOpstateStiebel(SGrHPOpstateStiebelType)
	 * @generated
	 */
	void unsetSgrHPOpstateStiebel();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstateStiebel <em>Sgr HP Opstate Stiebel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sgr HP Opstate Stiebel</em>' attribute is set.
	 * @see #unsetSgrHPOpstateStiebel()
	 * @see #getSgrHPOpstateStiebel()
	 * @see #setSgrHPOpstateStiebel(SGrHPOpstateStiebelType)
	 * @generated
	 */
	boolean isSetSgrHPOpstateStiebel();

} // SGrBitmapperListType
