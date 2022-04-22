/**
 */
package commHandler4Modbus;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see commHandler4Modbus.CommHandler4ModbusFactory
 * @model kind="package"
 * @generated
 */
public interface CommHandler4ModbusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commHandler4Modbus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/commHandler4Modbus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commHandler4Modbus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommHandler4ModbusPackage eINSTANCE = commHandler4Modbus.impl.CommHandler4ModbusPackageImpl.init();

	/**
	 * The meta object id for the '{@link commHandler4Modbus.impl.SGrCEMCommunicatorImpl <em>SGr CEM Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commHandler4Modbus.impl.SGrCEMCommunicatorImpl
	 * @see commHandler4Modbus.impl.CommHandler4ModbusPackageImpl#getSGrCEMCommunicator()
	 * @generated
	 */
	int SGR_CEM_COMMUNICATOR = 0;

	/**
	 * The feature id for the '<em><b>Commhandler4modbus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS = 0;

	/**
	 * The number of structural features of the '<em>SGr CEM Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CEM_COMMUNICATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SGr CEM Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CEM_COMMUNICATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commHandler4Modbus.impl.CommHandler4ModbusImpl <em>Comm Handler4 Modbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commHandler4Modbus.impl.CommHandler4ModbusImpl
	 * @see commHandler4Modbus.impl.CommHandler4ModbusPackageImpl#getCommHandler4Modbus()
	 * @generated
	 */
	int COMM_HANDLER4_MODBUS = 1;

	/**
	 * The feature id for the '<em><b>Sgrcemcommunicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR = 0;

	/**
	 * The feature id for the '<em><b>Sgrmodbusdevicedescriptiontype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE = 1;

	/**
	 * The feature id for the '<em><b>Trspservicemodbustype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE = 2;

	/**
	 * The number of structural features of the '<em>Comm Handler4 Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_HANDLER4_MODBUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comm Handler4 Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_HANDLER4_MODBUS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link commHandler4Modbus.SGrCEMCommunicator <em>SGr CEM Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr CEM Communicator</em>'.
	 * @see commHandler4Modbus.SGrCEMCommunicator
	 * @generated
	 */
	EClass getSGrCEMCommunicator();

	/**
	 * Returns the meta object for the reference list '{@link commHandler4Modbus.SGrCEMCommunicator#getCommhandler4modbus <em>Commhandler4modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commhandler4modbus</em>'.
	 * @see commHandler4Modbus.SGrCEMCommunicator#getCommhandler4modbus()
	 * @see #getSGrCEMCommunicator()
	 * @generated
	 */
	EReference getSGrCEMCommunicator_Commhandler4modbus();

	/**
	 * Returns the meta object for class '{@link commHandler4Modbus.CommHandler4Modbus <em>Comm Handler4 Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Handler4 Modbus</em>'.
	 * @see commHandler4Modbus.CommHandler4Modbus
	 * @generated
	 */
	EClass getCommHandler4Modbus();

	/**
	 * Returns the meta object for the reference '{@link commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator <em>Sgrcemcommunicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sgrcemcommunicator</em>'.
	 * @see commHandler4Modbus.CommHandler4Modbus#getSgrcemcommunicator()
	 * @see #getCommHandler4Modbus()
	 * @generated
	 */
	EReference getCommHandler4Modbus_Sgrcemcommunicator();

	/**
	 * Returns the meta object for the containment reference list '{@link commHandler4Modbus.CommHandler4Modbus#getSgrmodbusdevicedescriptiontype <em>Sgrmodbusdevicedescriptiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sgrmodbusdevicedescriptiontype</em>'.
	 * @see commHandler4Modbus.CommHandler4Modbus#getSgrmodbusdevicedescriptiontype()
	 * @see #getCommHandler4Modbus()
	 * @generated
	 */
	EReference getCommHandler4Modbus_Sgrmodbusdevicedescriptiontype();

	/**
	 * Returns the meta object for the containment reference list '{@link commHandler4Modbus.CommHandler4Modbus#getTrspservicemodbustype <em>Trspservicemodbustype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trspservicemodbustype</em>'.
	 * @see commHandler4Modbus.CommHandler4Modbus#getTrspservicemodbustype()
	 * @see #getCommHandler4Modbus()
	 * @generated
	 */
	EReference getCommHandler4Modbus_Trspservicemodbustype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommHandler4ModbusFactory getCommHandler4ModbusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link commHandler4Modbus.impl.SGrCEMCommunicatorImpl <em>SGr CEM Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commHandler4Modbus.impl.SGrCEMCommunicatorImpl
		 * @see commHandler4Modbus.impl.CommHandler4ModbusPackageImpl#getSGrCEMCommunicator()
		 * @generated
		 */
		EClass SGR_CEM_COMMUNICATOR = eINSTANCE.getSGrCEMCommunicator();

		/**
		 * The meta object literal for the '<em><b>Commhandler4modbus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS = eINSTANCE.getSGrCEMCommunicator_Commhandler4modbus();

		/**
		 * The meta object literal for the '{@link commHandler4Modbus.impl.CommHandler4ModbusImpl <em>Comm Handler4 Modbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commHandler4Modbus.impl.CommHandler4ModbusImpl
		 * @see commHandler4Modbus.impl.CommHandler4ModbusPackageImpl#getCommHandler4Modbus()
		 * @generated
		 */
		EClass COMM_HANDLER4_MODBUS = eINSTANCE.getCommHandler4Modbus();

		/**
		 * The meta object literal for the '<em><b>Sgrcemcommunicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR = eINSTANCE.getCommHandler4Modbus_Sgrcemcommunicator();

		/**
		 * The meta object literal for the '<em><b>Sgrmodbusdevicedescriptiontype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE = eINSTANCE.getCommHandler4Modbus_Sgrmodbusdevicedescriptiontype();

		/**
		 * The meta object literal for the '<em><b>Trspservicemodbustype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE = eINSTANCE.getCommHandler4Modbus_Trspservicemodbustype();

	}

} //CommHandler4ModbusPackage
