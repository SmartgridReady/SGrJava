/**
 */
package commHandler4Modbus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr CEM Communicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commHandler4Modbus.SGrCEMCommunicator#getCommhandler4modbus <em>Commhandler4modbus</em>}</li>
 * </ul>
 *
 * @see commHandler4Modbus.CommHandler4ModbusPackage#getSGrCEMCommunicator()
 * @model
 * @generated
 */
public interface SGrCEMCommunicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Commhandler4modbus</b></em>' reference list.
	 * The list contents are of type {@link commHandler4Modbus.CommHandler4Modbus}.
	 * It is bidirectional and its opposite is '{@link commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator <em>Sgrcemcommunicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commhandler4modbus</em>' reference list.
	 * @see commHandler4Modbus.CommHandler4ModbusPackage#getSGrCEMCommunicator_Commhandler4modbus()
	 * @see commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator
	 * @model opposite="sgrcemcommunicator" required="true"
	 * @generated
	 */
	EList<CommHandler4Modbus> getCommhandler4modbus();

} // SGrCEMCommunicator
