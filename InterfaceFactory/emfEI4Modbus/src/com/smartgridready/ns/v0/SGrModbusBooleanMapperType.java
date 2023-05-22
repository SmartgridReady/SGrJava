/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Boolean Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *           Booleans at modbus level may be true if 1, 0, 0xff, -1 , all but not a certain value .
 *           isPositiveLogic is true if a number must contain a specific value to be valid
 *           isPositiveLogic is false if a number must contain any  but NOT a specific value to be valid  
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isIsPositiveLogic <em>Is Positive Logic</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBooleanMapperType()
 * @model extendedMetaData="name='SGrModbusBooleanMapperType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusBooleanMapperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Positive Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Positive Logic</em>' attribute.
	 * @see #isSetIsPositiveLogic()
	 * @see #unsetIsPositiveLogic()
	 * @see #setIsPositiveLogic(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBooleanMapperType_IsPositiveLogic()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isPositiveLogic' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsPositiveLogic();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isIsPositiveLogic <em>Is Positive Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Positive Logic</em>' attribute.
	 * @see #isSetIsPositiveLogic()
	 * @see #unsetIsPositiveLogic()
	 * @see #isIsPositiveLogic()
	 * @generated
	 */
	void setIsPositiveLogic(boolean value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isIsPositiveLogic <em>Is Positive Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPositiveLogic()
	 * @see #isIsPositiveLogic()
	 * @see #setIsPositiveLogic(boolean)
	 * @generated
	 */
	void unsetIsPositiveLogic();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isIsPositiveLogic <em>Is Positive Logic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Positive Logic</em>' attribute is set.
	 * @see #unsetIsPositiveLogic()
	 * @see #isIsPositiveLogic()
	 * @see #setIsPositiveLogic(boolean)
	 * @generated
	 */
	boolean isSetIsPositiveLogic();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBooleanMapperType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	boolean isSetValue();

} // SGrModbusBooleanMapperType
