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
 *           If this attribute is not set, true means 1, false means 0
 *           Booleans at modbus register level may use different schemas like anyvalue but x = true 
 *           in this case, set  assignedValueMeans=false and value=x
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isAssignedValueMeans <em>Assigned Value Means</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBooleanMapperType()
 * @model extendedMetaData="name='SGrModbusBooleanMapperType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusBooleanMapperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assigned Value Means</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value Means</em>' attribute.
	 * @see #isSetAssignedValueMeans()
	 * @see #unsetAssignedValueMeans()
	 * @see #setAssignedValueMeans(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBooleanMapperType_AssignedValueMeans()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='assignedValueMeans' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAssignedValueMeans();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isAssignedValueMeans <em>Assigned Value Means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value Means</em>' attribute.
	 * @see #isSetAssignedValueMeans()
	 * @see #unsetAssignedValueMeans()
	 * @see #isAssignedValueMeans()
	 * @generated
	 */
	void setAssignedValueMeans(boolean value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isAssignedValueMeans <em>Assigned Value Means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssignedValueMeans()
	 * @see #isAssignedValueMeans()
	 * @see #setAssignedValueMeans(boolean)
	 * @generated
	 */
	void unsetAssignedValueMeans();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusBooleanMapperType#isAssignedValueMeans <em>Assigned Value Means</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assigned Value Means</em>' attribute is set.
	 * @see #unsetAssignedValueMeans()
	 * @see #isAssignedValueMeans()
	 * @see #setAssignedValueMeans(boolean)
	 * @generated
	 */
	boolean isSetAssignedValueMeans();

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
