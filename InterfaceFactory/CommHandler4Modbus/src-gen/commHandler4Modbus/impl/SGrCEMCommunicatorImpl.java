/**
 */
package commHandler4Modbus.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import commHandler4Modbus.CommHandler4Modbus;
import commHandler4Modbus.CommHandler4ModbusPackage;
import commHandler4Modbus.SGrCEMCommunicator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr CEM Communicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commHandler4Modbus.impl.SGrCEMCommunicatorImpl#getCommhandler4modbus <em>Commhandler4modbus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrCEMCommunicatorImpl extends MinimalEObjectImpl.Container implements SGrCEMCommunicator {
	
	private static AdapterFactory composedAdapterFactory;
	
	
	/**
	 * The cached value of the '{@link #getCommhandler4modbus() <em>Commhandler4modbus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommhandler4modbus()
	 * @generated
	 * @ordered
	 */
	protected EList<CommHandler4Modbus> commhandler4modbus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrCEMCommunicatorImpl() {
		super();
	}

	
//	public static void main(String args[]) {
//		/**
//		 * @Generated NOT
//		 * 
//		 * @author Chris Broennimann
//		 *
//		 */
//		// Helper for API Test 
//
//		System.out.println("starting Test: sample  communication handler Demonstrator for the JAVA based beta test");
//		System.out.println("testing SmartGridready appplication layer interoparability solutions .... Mai 2021");
//
//		/**
//		 * <!-- begin-user-doc -->
//		 * This Parser reads device description and adds the control instances required to the already existing  
//		 * SGrModbusDeviceDescriptionTypeImpl instance.
//		 * <!-- end-user-doc -->
//		 * @generated NOT
//		 * @Author Chris Broennimann / July 2021
//		 */
//
//		try {
//
//			final String XML_BASE_DIR = "/C:/dev/SmartGridReady_new/projects/InterfaceFactory/src/XMLInstances/SGr/";
//			
//			
//			EPackage.Registry.INSTANCE.put( ch.smartgridready.ns.s.gr.v0.V0Package.eNS_URI, ch.smartgridready.ns.s.gr.v0.V0Package.eINSTANCE);
//			
//
//			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( )
//    			.put("xml", new XMIResourceFactoryImpl() );
//			
//			AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
//					getAdapterFactory(), 
//					new BasicCommandStack());
//			
//			
//			domain.getResourceSet().setPackageRegistry( EPackage.Registry.INSTANCE );			
//			Resource resource = domain.createResource( XML_BASE_DIR + "mvpEi4Modbus_0_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml" );
//			resource.load(null);
//			
//			ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType 
//				biDirFlexMgmt = (ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType) resource.getAllContents().next();
//			
//			
//			// dry testing of currently available EI's
//			System.out.println("------------------->  CREATING INSTANCE OF  SGCP_BiDirFlexMgmt DEVICE MVP   <-------------------");			 		
//			SGrModbusDeviceDescriptionType sgrBiDirFlexMgmtMvp = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType(); 
//			sgrBiDirFlexMgmtMvp.ParseModbusDevDescClass(XML_BASE_DIR + "mvpEi4Modbus_0_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml");
//			System.out.println("------------------->  CREATING INSTANCE OF  SGCP_BiDirFlexMgmt DEVICE FULL   <-------------------");				
//			SGrModbusDeviceDescriptionType sgrBiDirFlexMgmtFull = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType(); 
//			sgrBiDirFlexMgmtFull.ParseModbusDevDescClass(XML_BASE_DIR + "FullEi4Modbus_0_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml");	
//			System.out.println("------------------->  CREATING INSTANCE OF  SGCP_BiDirFlexMgmt DEVICE VGT   <-------------------");	
//			SGrModbusDeviceDescriptionType sgrBiDirFlexMgmtVGT = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType(); 
//			sgrBiDirFlexMgmtVGT.ParseModbusDevDescClass(XML_BASE_DIR + "VGT_Ei4Modbus_0_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml");
//			SGrModbusDeviceDescriptionType sgrBiDirFlexMgmtGZm = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType();
//			sgrBiDirFlexMgmtGZm.ParseModbusDevDescClass( XML_BASE_DIR + "goZmartEi4Modbus_0_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml");
//			System.out.println("------------------->  CREATING INSTANCE OF  abb_terra_01 DEVICE by clemap   <-------------------");	
//			SGrModbusDeviceDescriptionType sgrABBTerra = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType(); 
//			sgrABBTerra.ParseModbusDevDescClass(XML_BASE_DIR + "abb_terra_01.xml");
//			
//			System.out.println();
//			System.out.println(
//					"------------------->  CREATING INSTANCE OF TRANSPORTSERVICE MODBUS RTU  <-------------------");
//			DriverAPI4ModbusRTU mbRTU = new DriverAPI4ModbusRTU();
//
//			System.out.println();
//			System.out.println(
//					"------------------->  CREATING INSTANCE OF DEVICE sgcpMeter (ABB M24)  <-------------------");
//			SGrModbusDeviceDescriptionType sgcpMeter = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType();
//			sgcpMeter.ParseModbusDevDescClass( XML_BASE_DIR + "betaModbusABBMeterV0.1.2.xml");
//			sgcpMeter.setRefDriverClass(mbRTU);
//
//			System.out.println();
//			System.out.println("------------------->  CREATING INSTANCE OF DEVICE  heatMeter )  <-------------------");
//			SGrModbusDeviceDescriptionType heatMeter = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType();
//			heatMeter.ParseModbusDevDescClass( XML_BASE_DIR + "SontexSupercal5V0.1.2.xml");
//			heatMeter.setRefDriverClass(mbRTU);
//
//			System.out.println();
//			System.out.println(
//					"------------------->  CREATING INSTANCE OF DEVICE froniusInverter (Fronius Symo)  <-------------------");
//			SGrModbusDeviceDescriptionType sgrPVInverter = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType();
//			sgrPVInverter.ParseModbusDevDescClass(XML_BASE_DIR + "EI4ModbusFroniusSymoV0.1.2.xml");
//			DriverAPI4ModbusTCP mbFronInv = new DriverAPI4ModbusTCP();
//			try {
//				mbFronInv.initDevice("192.168.1.181", 502);
//				sgrPVInverter.setRefDriverTCPClass(mbFronInv);
//				sgrPVInverter.getApitreetype().getIsConnected().setIsConnected(true);
//			} catch (IOException e) {
//				System.out.println("Fronius Symo is off line");
//				sgrPVInverter.getApitreetype().getIsConnected().setIsConnected(false);
//			}
//
//			System.out.println();
//			System.out.println("------------------->  CREATING INSTANCE OF DEVICE sgrGaroWallbox   <-------------------");
//			SGrModbusDeviceDescriptionType sgrGaroWallbox = V0Factory.eINSTANCE.createSGrModbusDeviceDescriptionType();
//			sgrGaroWallbox.ParseModbusDevDescClass(XML_BASE_DIR + "GaroEVSEDemo.xml");
//			DriverAPI4ModbusTCP mbGaroEVE = new DriverAPI4ModbusTCP();
//			try {
//				mbGaroEVE.initDevice("192.168.1.182", 502);
//				sgrGaroWallbox.setRefDriverTCPClass(mbGaroEVE);
//				sgrGaroWallbox.getApitreetype().getIsConnected().setIsConnected(true);
//
//			} catch (IOException e) {
//				System.out.println("Garo Wallbox is off line");
//				sgrGaroWallbox.getApitreetype().getIsConnected().setIsConnected(false);
//			}
//			
//			System.out.println();
//
//			// for IBT lab installation
//			mbRTU.initTrspService("COM6");
//			// for Supercal mobile demo
//			//mbRTU.initTrspService("COM8");
//
//			// loop data
//			String Val1, Val2, Val3, Val4;
//			String hmVal1 = "-", hmVal2 = "-", hmVal3 = "-", hmVal4 = "-";
//			int hmTime = 4000, hmStep = 0;
//			System.out.println();
//			System.out.println("------------------->  STARTING REAL TIME OPERATION TEST   <-------------------");
//			for (int lcnt = 0; lcnt < 10; lcnt++) {
//				System.out.println();
//
//				mbRTU.setUnitIdentifier((byte) 11);
//				Val1 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
//				Val2 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
//				Val3 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
//				System.out.printf("ABBMeter ActiveEnerBalanceAC [KWh]:  " + Val1 + ",  " + Val2 + ",  " + Val3 + " %n");
//
//				Val1 = sgcpMeter.getVal("ActivePowerAC", "ActivePowerACtot");
//				Val2 = sgcpMeter.getVal("ActivePowerAC", "ActivePowerACL1");
//				Val3 = sgcpMeter.getVal("ActivePowerAC", "ActivePowerACL2");
//				Val4 = sgcpMeter.getVal("ActivePowerAC", "ActivePowerACL3");
//				System.out.printf("ABBMeter ActivePowerAC [KW]:       " + Val1 + ", " + Val2 + ",  " + Val3 + ",  "
//						+ Val4 + " %n");
//				
//				if  (sgrGaroWallbox.getApitreetype().getIsConnected().isIsConnected() == true)
//				{
//				  Val1 = sgrGaroWallbox.getVal("EVSE", "CurrentACL1");
//				  Val2 = sgrGaroWallbox.getVal("EVSE", "CurrentACL2");
//				  Val3 = sgrGaroWallbox.getVal("EVSE", "CurrentACL3");
//				  System.out.printf("sgrGaroWallbox CurrentAC [A]:       " + Val1 + ", " + Val2 + ",  " + Val3 + " %n");
//				}
//				if  (sgrPVInverter.getApitreetype().getIsConnected().isIsConnected() == true)
//				{
//				  Val1 = sgrPVInverter.getVal("SunspInvModel", "SunspecID");
//				  Val2 = sgrPVInverter.getVal("SunspInvModel", "InvModelBlockLen");
//				  Val3 = sgrPVInverter.getVal("SunspInvModel", "CurrentACtot");
//				  System.out.printf("FroniusSymo, SspID.len CurrACtot[A]:  " + Val1 + "." + Val2 + ",  " + Val3 + " %n");
//
//				  Val1 = sgrPVInverter.getVal("SunspInvModel", "CurrentACL1");
//				  Val2 = sgrPVInverter.getVal("SunspInvModel", "CurrentACL2");
//				  Val3 = sgrPVInverter.getVal("SunspInvModel", "CurrentACL3");
//				  System.out.printf("FroniusSymo CurrentAC [A]:          " + Val1 + ", " + Val2 + ",  " + Val3 + " %n");
//				}
//				/*	mbRTU.setUnitIdentifier((byte) 16);
//					if (hmStep == 1) hmVal1 = heatMeter.getVal("Temperature", "hiTemp");
//				 	
//					// special case for "slow device" management: reason: easympdbus generates telegrams with bad CRC codes 
//					// TODO: manage timeout exceptions in place
//					if (hmStep == 2) hmVal2 = heatMeter.getVal("Temperature", "lowTemp");
//					if (hmStep == 3)hmVal3 = heatMeter.getVal("PowerFlow", "actPower");
//					if (hmStep == 4 ) 
//					{
//						hmVal4 = heatMeter.getVal("PowerFlow", "actFlow");	
//						hmStep = 0;
//					}
//					hmStep = hmStep+1;;
//					
//					System.out.printf("HeatMeter TempHi/Low[°C], Power[W], Flow[m3/h]: " + hmVal1 + "/" + hmVal2 + ",  " + hmVal3 + ",  " + hmVal4 + " %n");
//				*/
//				Thread.sleep(1000);
//			}
//
//			mbRTU.disconnect();
//			mbFronInv.disconnect();
//			mbGaroEVE.disconnect();
//		}
//
//		catch (ParserConfigurationException e) {
//			System.out.println("ERR: could not read device description");
//		} catch (SAXException e) {
//			System.out.println("ERR: Parser SAX exception");
//		} catch (IOException e) {
//			System.out.println("ERR: PIO exception");
//		} catch (ModbusException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SerialPortException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SerialPortTimeoutException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommHandler4ModbusPackage.Literals.SGR_CEM_COMMUNICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommHandler4Modbus> getCommhandler4modbus() {
		if (commhandler4modbus == null) {
			commhandler4modbus = new EObjectWithInverseResolvingEList<CommHandler4Modbus>(CommHandler4Modbus.class, this, CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS, CommHandler4ModbusPackage.COMM_HANDLER4_MODBUS__SGRCEMCOMMUNICATOR);
		}
		return commhandler4modbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommhandler4modbus()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				return ((InternalEList<?>)getCommhandler4modbus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				return getCommhandler4modbus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				getCommhandler4modbus().clear();
				getCommhandler4modbus().addAll((Collection<? extends CommHandler4Modbus>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				getCommhandler4modbus().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommHandler4ModbusPackage.SGR_CEM_COMMUNICATOR__COMMHANDLER4MODBUS:
				return commhandler4modbus != null && !commhandler4modbus.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Return an ComposedAdapterFactory for all registered models
	 * 
	 * @return a ComposedAdapterFactory
	 * 
	 * @generated NOT
	 */
	protected static AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}

} //SGrCEMCommunicatorImpl
