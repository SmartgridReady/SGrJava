/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTU Dev Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getDeviceInstName <em>Device Inst Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getSlaveAddr <em>Slave Addr</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUDevInstanceType()
 * @model extendedMetaData="name='RTUDevInstanceType' kind='elementOnly'"
 * @generated
 */
public interface RTUDevInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Inst Name</em>' attribute.
	 * @see #setDeviceInstName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUDevInstanceType_DeviceInstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='deviceInstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeviceInstName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getDeviceInstName <em>Device Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Inst Name</em>' attribute.
	 * @see #getDeviceInstName()
	 * @generated
	 */
	void setDeviceInstName(String value);

	/**
	 * Returns the value of the '<em><b>Slave Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Addr</em>' attribute.
	 * @see #isSetSlaveAddr()
	 * @see #unsetSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUDevInstanceType_SlaveAddr()
	 * @model unsettable="true" dataType="ch.smartgridready.ns.s.gr.v0.TSlaveIDType" required="true"
	 *        extendedMetaData="kind='element' name='slaveAddr' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSlaveAddr();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getSlaveAddr <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Addr</em>' attribute.
	 * @see #isSetSlaveAddr()
	 * @see #unsetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @generated
	 */
	void setSlaveAddr(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getSlaveAddr <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @generated
	 */
	void unsetSlaveAddr();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType#getSlaveAddr <em>Slave Addr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slave Addr</em>' attribute is set.
	 * @see #unsetSlaveAddr()
	 * @see #getSlaveAddr()
	 * @see #setSlaveAddr(int)
	 * @generated
	 */
	boolean isSetSlaveAddr();

} // RTUDevInstanceType
