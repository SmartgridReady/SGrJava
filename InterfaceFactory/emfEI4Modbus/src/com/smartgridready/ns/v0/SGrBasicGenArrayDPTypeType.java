/**
 */
package com.smartgridready.ns.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Basic Gen Array DP Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  These are the basic generic
 * 				data array  types must remain high level definitions for to be supported.
 * 				The definition focuses on the programming languages used at the
 * 				level of the communicators. So far Java and Python.
 * 			
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getType <em>Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getLenght <em>Lenght</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getEnum2ArrIndex <em>Enum2 Arr Index</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType()
 * @model extendedMetaData="name='SGrBasicGenArrayDPTypeType' kind='elementOnly'"
 * @generated
 */
public interface SGrBasicGenArrayDPTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SGrBasicGenDataPointTypeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrBasicGenDataPointTypeType getType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SGrBasicGenDataPointTypeType value);

	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(BigInteger)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Lenght()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='lenght' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLenght();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Enum2 Arr Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum2 Arr Index</em>' containment reference.
	 * @see #setEnum2ArrIndex(SGrEnumListType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Enum2ArrIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enum2ArrIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrEnumListType getEnum2ArrIndex();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getEnum2ArrIndex <em>Enum2 Arr Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum2 Arr Index</em>' containment reference.
	 * @see #getEnum2ArrIndex()
	 * @generated
	 */
	void setEnum2ArrIndex(SGrEnumListType value);

} // SGrBasicGenArrayDPTypeType
