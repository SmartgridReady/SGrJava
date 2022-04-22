/**
 */
package commHandler4Modbus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see commHandler4Modbus.CommHandler4ModbusPackage
 * @generated
 */
public interface CommHandler4ModbusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommHandler4ModbusFactory eINSTANCE = commHandler4Modbus.impl.CommHandler4ModbusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SGr CEM Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGr CEM Communicator</em>'.
	 * @generated
	 */
	SGrCEMCommunicator createSGrCEMCommunicator();

	/**
	 * Returns a new object of class '<em>Comm Handler4 Modbus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Handler4 Modbus</em>'.
	 * @generated
	 */
	CommHandler4Modbus createCommHandler4Modbus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommHandler4ModbusPackage getCommHandler4ModbusPackage();

} //CommHandler4ModbusFactory
