/**
 */
package commHandler4Modbus.impl;

import commHandler4Modbus.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommHandler4ModbusFactoryImpl extends EFactoryImpl implements CommHandler4ModbusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommHandler4ModbusFactory init() {
		try {
			CommHandler4ModbusFactory theCommHandler4ModbusFactory = (CommHandler4ModbusFactory)EPackage.Registry.INSTANCE.getEFactory(CommHandler4ModbusPackage.eNS_URI);
			if (theCommHandler4ModbusFactory != null) {
				return theCommHandler4ModbusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommHandler4ModbusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommHandler4ModbusFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR: return createSGrCEMCommunicator();
			case CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS: return createCommHandler4Modbus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrCEMCommunicator createSGrCEMCommunicator() {
		SGrCEMCommunicatorImpl sGrCEMCommunicator = new SGrCEMCommunicatorImpl();
		return sGrCEMCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommHandler4Modbus createCommHandler4Modbus() {
		CommHandler4ModbusImpl commHandler4Modbus = new CommHandler4ModbusImpl();
		return commHandler4Modbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommHandler4ModbusPackage getCommHandler4ModbusPackage() {
		return (CommHandler4ModbusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommHandler4ModbusPackage getPackage() {
		return CommHandler4ModbusPackage.eINSTANCE;
	}

} //CommHandler4ModbusFactoryImpl
