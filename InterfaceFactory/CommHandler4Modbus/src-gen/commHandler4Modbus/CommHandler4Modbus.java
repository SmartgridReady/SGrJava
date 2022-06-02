/**
 */
package commHandler4Modbus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Handler4 Modbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator <em>Sgrcemcommunicator</em>}</li>
 *   <li>{@link commHandler4Modbus.CommHandler4Modbus#getSgrmodbusdevicedescriptiontype <em>Sgrmodbusdevicedescriptiontype</em>}</li>
 *   <li>{@link commHandler4Modbus.CommHandler4Modbus#getTrspservicemodbustype <em>Trspservicemodbustype</em>}</li>
 * </ul>
 *
 * @see commHandler4Modbus.CommHandler4ModbusPackage#getCommHandler4Modbus()
 * @model
 * @generated
 */
public interface CommHandler4Modbus extends EObject {
	/**
	 * Returns the value of the '<em><b>Sgrcemcommunicator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link commHandler4Modbus.SGrCEMCommunicator#getCommhandler4modbus <em>Commhandler4modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgrcemcommunicator</em>' reference.
	 * @see #setSgrcemcommunicator(SGrCEMCommunicator)
	 * @see commHandler4Modbus.CommHandler4ModbusPackage#getCommHandler4Modbus_Sgrcemcommunicator()
	 * @see commHandler4Modbus.SGrCEMCommunicator#getCommhandler4modbus
	 * @model opposite="commhandler4modbus" required="true"
	 * @generated
	 */
	SGrCEMCommunicator getSgrcemcommunicator();

	/**
	 * Sets the value of the '{@link commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator <em>Sgrcemcommunicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgrcemcommunicator</em>' reference.
	 * @see #getSgrcemcommunicator()
	 * @generated
	 */
	void setSgrcemcommunicator(SGrCEMCommunicator value);

	/**
	 * Returns the value of the '<em><b>Sgrmodbusdevicedescriptiontype</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgrmodbusdevicedescriptiontype</em>' containment reference list.
	 * @see commHandler4Modbus.CommHandler4ModbusPackage#getCommHandler4Modbus_Sgrmodbusdevicedescriptiontype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType> getSgrmodbusdevicedescriptiontype();

	/**
	 * Returns the value of the '<em><b>Trspservicemodbustype</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.TrspServiceModbusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trspservicemodbustype</em>' containment reference list.
	 * @see commHandler4Modbus.CommHandler4ModbusPackage#getCommHandler4Modbus_Trspservicemodbustype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ch.smartgridready.sgr.ns.v0.TrspServiceModbusType> getTrspservicemodbustype();

} // CommHandler4Modbus
