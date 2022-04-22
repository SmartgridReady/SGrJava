/**
 */
package commHandler4Modbus.impl;

import commHandler4Modbus.CommHandler4Modbus;
import commHandler4Modbus.CommHandler4ModbusFactory;
import commHandler4Modbus.CommHandler4ModbusPackage;
import commHandler4Modbus.SGrCEMCommunicator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommHandler4ModbusPackageImpl extends EPackageImpl implements CommHandler4ModbusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrCEMCommunicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commHandler4ModbusEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see commHandler4Modbus.CommHandler4ModbusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommHandler4ModbusPackageImpl() {
		super(eNS_URI, CommHandler4ModbusFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CommHandler4ModbusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommHandler4ModbusPackage init() {
		if (isInited) return (CommHandler4ModbusPackage)EPackage.Registry.INSTANCE.getEPackage(CommHandler4ModbusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommHandler4ModbusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommHandler4ModbusPackageImpl theCommHandler4ModbusPackage = registeredCommHandler4ModbusPackage instanceof CommHandler4ModbusPackageImpl ? (CommHandler4ModbusPackageImpl)registeredCommHandler4ModbusPackage : new CommHandler4ModbusPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ch.smartgridready.ns.s.gr.v0.V0Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommHandler4ModbusPackage.createPackageContents();

		// Initialize created meta-data
		theCommHandler4ModbusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommHandler4ModbusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommHandler4ModbusPackage.eNS_URI, theCommHandler4ModbusPackage);
		return theCommHandler4ModbusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrCEMCommunicator() {
		return sGrCEMCommunicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrCEMCommunicator_Commhandler4modbus() {
		return (EReference)sGrCEMCommunicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommHandler4Modbus() {
		return commHandler4ModbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommHandler4Modbus_Sgrcemcommunicator() {
		return (EReference)commHandler4ModbusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommHandler4Modbus_Sgrmodbusdevicedescriptiontype() {
		return (EReference)commHandler4ModbusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommHandler4Modbus_Trspservicemodbustype() {
		return (EReference)commHandler4ModbusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommHandler4ModbusFactory getCommHandler4ModbusFactory() {
		return (CommHandler4ModbusFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sGrCEMCommunicatorEClass = createEClass(SGR_CEM_COMMUNICATOR);
		createEReference(sGrCEMCommunicatorEClass, SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS);

		commHandler4ModbusEClass = createEClass(COMM_HANDLER4_MODBUS);
		createEReference(commHandler4ModbusEClass, COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR);
		createEReference(commHandler4ModbusEClass, COMM_HANDLER4_MODBUS__SGRMODBUSDEVICEDESCRIPTIONTYPE);
		createEReference(commHandler4ModbusEClass, COMM_HANDLER4_MODBUS__TRSPSERVICEMODBUSTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ch.smartgridready.ns.s.gr.v0.V0Package theV0Package = (ch.smartgridready.ns.s.gr.v0.V0Package)EPackage.Registry.INSTANCE.getEPackage(ch.smartgridready.ns.s.gr.v0.V0Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sGrCEMCommunicatorEClass, SGrCEMCommunicator.class, "SGrCEMCommunicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGrCEMCommunicator_Commhandler4modbus(), this.getCommHandler4Modbus(), this.getCommHandler4Modbus_Sgrcemcommunicator(), "commhandler4modbus", null, 1, -1, SGrCEMCommunicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commHandler4ModbusEClass, CommHandler4Modbus.class, "CommHandler4Modbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommHandler4Modbus_Sgrcemcommunicator(), this.getSGrCEMCommunicator(), this.getSGrCEMCommunicator_Commhandler4modbus(), "sgrcemcommunicator", null, 1, 1, CommHandler4Modbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommHandler4Modbus_Sgrmodbusdevicedescriptiontype(), theV0Package.getSGrModbusDeviceDescriptionType(), null, "sgrmodbusdevicedescriptiontype", null, 1, -1, CommHandler4Modbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommHandler4Modbus_Trspservicemodbustype(), theV0Package.getTrspServiceModbusType(), null, "trspservicemodbustype", null, 0, -1, CommHandler4Modbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommHandler4ModbusPackageImpl
