/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Flex Assistance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists <em>Assists</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo <em>Obliged To</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrFlexAssistanceType()
 * @model extendedMetaData="name='SGrFlexAssistanceType' kind='elementOnly'"
 * @generated
 */
public interface SGrFlexAssistanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assists</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrSGCPServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see #isSetAssists()
	 * @see #unsetAssists()
	 * @see #setAssists(SGrSGCPServiceType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFlexAssistanceType_Assists()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='assists' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSGCPServiceType getAssists();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see #isSetAssists()
	 * @see #unsetAssists()
	 * @see #getAssists()
	 * @generated
	 */
	void setAssists(SGrSGCPServiceType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssists()
	 * @see #getAssists()
	 * @see #setAssists(SGrSGCPServiceType)
	 * @generated
	 */
	void unsetAssists();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists <em>Assists</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assists</em>' attribute is set.
	 * @see #unsetAssists()
	 * @see #getAssists()
	 * @see #setAssists(SGrSGCPServiceType)
	 * @generated
	 */
	boolean isSetAssists();

	/**
	 * Returns the value of the '<em><b>Obliged To</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrObligLvlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obliged To</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see #isSetObligedTo()
	 * @see #unsetObligedTo()
	 * @see #setObligedTo(SGrObligLvlType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFlexAssistanceType_ObligedTo()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='obliged_to' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrObligLvlType getObligedTo();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo <em>Obliged To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obliged To</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see #isSetObligedTo()
	 * @see #unsetObligedTo()
	 * @see #getObligedTo()
	 * @generated
	 */
	void setObligedTo(SGrObligLvlType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo <em>Obliged To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObligedTo()
	 * @see #getObligedTo()
	 * @see #setObligedTo(SGrObligLvlType)
	 * @generated
	 */
	void unsetObligedTo();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo <em>Obliged To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Obliged To</em>' attribute is set.
	 * @see #unsetObligedTo()
	 * @see #getObligedTo()
	 * @see #setObligedTo(SGrObligLvlType)
	 * @generated
	 */
	boolean isSetObligedTo();

} // SGrFlexAssistanceType
