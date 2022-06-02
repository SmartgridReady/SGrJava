/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPIP Modbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modbus IP address:Specific P elements for Modbus over
 * 				IP protocol. This definition is partially inherited from
 * 				61850-80-5's tPTypeModbusIPEnum typedef but reduced to a single
 * 				interface (not redundant adresses RG1 and RG2) and information layer
 * 				definitions
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getPort <em>Port</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getAddress <em>Address</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getSlaveID <em>Slave ID</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPIPModbus()
 * @model extendedMetaData="name='tP_IPModbus' kind='elementOnly'"
 * @generated
 */
public interface TPIPModbus extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #setPort(long)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPIPModbus_Port()
	 * @model unsettable="true" dataType="ch.smartgridready.sgr.ns.v0.TIPportNrType" required="true"
	 *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPort();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #getPort()
	 * @generated
	 */
	void setPort(long value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(long)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getPort <em>Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port</em>' attribute is set.
	 * @see #unsetPort()
	 * @see #getPort()
	 * @see #setPort(long)
	 * @generated
	 */
	boolean isSetPort();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(IpADDRType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPIPModbus_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	IpADDRType getAddress();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(IpADDRType value);

	/**
	 * Returns the value of the '<em><b>Slave ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave ID</em>' attribute.
	 * @see #isSetSlaveID()
	 * @see #unsetSlaveID()
	 * @see #setSlaveID(int)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPIPModbus_SlaveID()
	 * @model unsettable="true" dataType="ch.smartgridready.sgr.ns.v0.TSlaveIDType" required="true"
	 *        extendedMetaData="kind='element' name='slaveID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSlaveID();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getSlaveID <em>Slave ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave ID</em>' attribute.
	 * @see #isSetSlaveID()
	 * @see #unsetSlaveID()
	 * @see #getSlaveID()
	 * @generated
	 */
	void setSlaveID(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getSlaveID <em>Slave ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlaveID()
	 * @see #getSlaveID()
	 * @see #setSlaveID(int)
	 * @generated
	 */
	void unsetSlaveID();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.TPIPModbus#getSlaveID <em>Slave ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slave ID</em>' attribute is set.
	 * @see #unsetSlaveID()
	 * @see #getSlaveID()
	 * @see #setSlaveID(int)
	 * @generated
	 */
	boolean isSetSlaveID();

} // TPIPModbus
