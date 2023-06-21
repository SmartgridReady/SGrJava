/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Functional Profile Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for functional profile
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getFunctionalProfile <em>Functional Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getGenAttribute <em>Gen Attribute</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileBaseType()
 * @model extendedMetaData="name='SGrFunctionalProfileBaseType' kind='elementOnly'"
 * @generated
 */
public interface SGrFunctionalProfileBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Profile</em>' containment reference.
	 * @see #setFunctionalProfile(SGrProfileDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileBaseType_FunctionalProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functionalProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfileDescriptionType getFunctionalProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getFunctionalProfile <em>Functional Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profile</em>' containment reference.
	 * @see #getFunctionalProfile()
	 * @generated
	 */
	void setFunctionalProfile(SGrProfileDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrFunctionalProfileBaseType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

} // SGrFunctionalProfileBaseType
