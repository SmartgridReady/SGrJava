/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getDpInstance <em>Dp Instance</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getArrLen <em>Arr Len</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getEnum2ArrIndex <em>Enum2 Arr Index</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType()
 * @model extendedMetaData="name='SGrBasicGenArrayDPTypeType' kind='elementOnly'"
 * @generated
 */
public interface SGrBasicGenArrayDPTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dp Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Instance</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_DpInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrBasicGenDataPointTypeType> getDpInstance();

	/**
	 * Returns the value of the '<em><b>Arr Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arr Len</em>' attribute.
	 * @see #isSetArrLen()
	 * @see #unsetArrLen()
	 * @see #setArrLen(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_ArrLen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='arrLen' namespace='##targetNamespace'"
	 * @generated
	 */
	long getArrLen();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getArrLen <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arr Len</em>' attribute.
	 * @see #isSetArrLen()
	 * @see #unsetArrLen()
	 * @see #getArrLen()
	 * @generated
	 */
	void setArrLen(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getArrLen <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrLen()
	 * @see #getArrLen()
	 * @see #setArrLen(long)
	 * @generated
	 */
	void unsetArrLen();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getArrLen <em>Arr Len</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arr Len</em>' attribute is set.
	 * @see #unsetArrLen()
	 * @see #getArrLen()
	 * @see #setArrLen(long)
	 * @generated
	 */
	boolean isSetArrLen();

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
