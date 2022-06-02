/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modbus JMES Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.ModbusJMESPathType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getModbusJMESPathType()
 * @model extendedMetaData="name='modbusJMESPathType' kind='simple'"
 * @generated
 */
public interface ModbusJMESPathType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getModbusJMESPathType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.ModbusJMESPathType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ModbusJMESPathType
