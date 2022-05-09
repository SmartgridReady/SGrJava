/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.DocumentRoot;
import ch.smartgridready.ns.s.gr.v0.EBaudRateType;
import ch.smartgridready.ns.s.gr.v0.EByteLenType;
import ch.smartgridready.ns.s.gr.v0.EParityType;
import ch.smartgridready.ns.s.gr.v0.EStopBitLenType;
import ch.smartgridready.ns.s.gr.v0.NetworkConnectionStateType;
import ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDataPointDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrProfilesFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrRESTAPIDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrSerialInterfaceCapabilityType;
import ch.smartgridready.ns.s.gr.v0.TrspServiceModbusType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getFunctionalProfiles <em>Functional Profiles</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getGenDeviceFrame <em>Gen Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getNetConnectionState <em>Net Connection State</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSgrContactAPIDeviceFrame <em>Sgr Contact API Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrContactAPIDeviceDescriptionType <em>SGr Contact API Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrModbusDeviceDescriptionType <em>SGr Modbus Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrRESTAPIDeviceDescriptionType <em>SGr RESTAPI Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getSgrSerialInterfaceCapability <em>Sgr Serial Interface Capability</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.DocumentRootImpl#getTrspServiceModbus <em>Trsp Service Modbus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getBaudRatesSupported() <em>Baud Rates Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRatesSupported()
	 * @generated
	 * @ordered
	 */
	protected static final EBaudRateType BAUD_RATES_SUPPORTED_EDEFAULT = EBaudRateType._300;

	/**
	 * The default value of the '{@link #getByteLenSupported() <em>Byte Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLenSupported()
	 * @generated
	 * @ordered
	 */
	protected static final EByteLenType BYTE_LEN_SUPPORTED_EDEFAULT = EByteLenType._7;

	/**
	 * The default value of the '{@link #getModbusFunctionCodesSupported() <em>Modbus Function Codes Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusFunctionCodesSupported()
	 * @generated
	 * @ordered
	 */
	protected static final String MODBUS_FUNCTION_CODES_SUPPORTED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getParitySupported() <em>Parity Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParitySupported()
	 * @generated
	 * @ordered
	 */
	protected static final EParityType PARITY_SUPPORTED_EDEFAULT = EParityType.EVEN;

	/**
	 * The default value of the '{@link #getStopBitLenSupported() <em>Stop Bit Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLenSupported()
	 * @generated
	 * @ordered
	 */
	protected static final EStopBitLenType STOP_BIT_LEN_SUPPORTED_EDEFAULT = EStopBitLenType._0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, V0Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBaudRateType getBaudRatesSupported() {
		return (EBaudRateType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_BaudRatesSupported(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaudRatesSupported(EBaudRateType newBaudRatesSupported) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_BaudRatesSupported(), newBaudRatesSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EByteLenType getByteLenSupported() {
		return (EByteLenType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_ByteLenSupported(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteLenSupported(EByteLenType newByteLenSupported) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_ByteLenSupported(), newByteLenSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrDeviceProfileType getDeviceProfile() {
		return (SGrDeviceProfileType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_DeviceProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceProfile(SGrDeviceProfileType newDeviceProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_DeviceProfile(), newDeviceProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceProfile(SGrDeviceProfileType newDeviceProfile) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_DeviceProfile(), newDeviceProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrProfilesFrameType getFunctionalProfiles() {
		return (SGrProfilesFrameType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_FunctionalProfiles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalProfiles(SGrProfilesFrameType newFunctionalProfiles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_FunctionalProfiles(), newFunctionalProfiles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalProfiles(SGrProfilesFrameType newFunctionalProfiles) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_FunctionalProfiles(), newFunctionalProfiles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrDeviceDescriptionType getGenDeviceFrame() {
		return (SGrDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_GenDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDeviceFrame(SGrDeviceDescriptionType newGenDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_GenDeviceFrame(), newGenDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenDeviceFrame(SGrDeviceDescriptionType newGenDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_GenDeviceFrame(), newGenDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModbusFunctionCodesSupported() {
		return (String)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_ModbusFunctionCodesSupported(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModbusFunctionCodesSupported(String newModbusFunctionCodesSupported) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_ModbusFunctionCodesSupported(), newModbusFunctionCodesSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkConnectionStateType getNetConnectionState() {
		return (NetworkConnectionStateType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_NetConnectionState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetConnectionState(NetworkConnectionStateType newNetConnectionState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_NetConnectionState(), newNetConnectionState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetConnectionState(NetworkConnectionStateType newNetConnectionState) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_NetConnectionState(), newNetConnectionState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EParityType getParitySupported() {
		return (EParityType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_ParitySupported(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParitySupported(EParityType newParitySupported) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_ParitySupported(), newParitySupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusDataPointDescriptionType getSGrModbusDataPointDescription() {
		return (SGrModbusDataPointDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDataPointDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrModbusDataPointDescription(SGrModbusDataPointDescriptionType newSGrModbusDataPointDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDataPointDescription(), newSGrModbusDataPointDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrModbusDataPointDescription(SGrModbusDataPointDescriptionType newSGrModbusDataPointDescription) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDataPointDescription(), newSGrModbusDataPointDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusInterfaceDescriptionType getSGrModbusInterfaceDescription() {
		return (SGrModbusInterfaceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrModbusInterfaceDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrModbusInterfaceDescription(SGrModbusInterfaceDescriptionType newSGrModbusInterfaceDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrModbusInterfaceDescription(), newSGrModbusInterfaceDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrModbusInterfaceDescription(SGrModbusInterfaceDescriptionType newSGrModbusInterfaceDescription) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrModbusInterfaceDescription(), newSGrModbusInterfaceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrContactAPIDeviceDescriptionType getSgrContactAPIDeviceFrame() {
		return (SGrContactAPIDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SgrContactAPIDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSgrContactAPIDeviceFrame(SGrContactAPIDeviceDescriptionType newSgrContactAPIDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SgrContactAPIDeviceFrame(), newSgrContactAPIDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrContactAPIDeviceFrame(SGrContactAPIDeviceDescriptionType newSgrContactAPIDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SgrContactAPIDeviceFrame(), newSgrContactAPIDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrContactAPIDeviceDescriptionType getSGrContactAPIDeviceDescriptionType() {
		return (SGrContactAPIDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceDescriptionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType newSGrContactAPIDeviceDescriptionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceDescriptionType(), newSGrContactAPIDeviceDescriptionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType newSGrContactAPIDeviceDescriptionType) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceDescriptionType(), newSGrContactAPIDeviceDescriptionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusDeviceDescriptionType getSGrModbusDeviceDescriptionType() {
		return (SGrModbusDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceDescriptionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType newSGrModbusDeviceDescriptionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceDescriptionType(), newSGrModbusDeviceDescriptionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType newSGrModbusDeviceDescriptionType) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceDescriptionType(), newSGrModbusDeviceDescriptionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusDeviceDescriptionType getSGrModbusDeviceFrame() {
		return (SGrModbusDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrModbusDeviceFrame(SGrModbusDeviceDescriptionType newSGrModbusDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), newSGrModbusDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrModbusDeviceFrame(SGrModbusDeviceDescriptionType newSGrModbusDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), newSGrModbusDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRESTAPIDeviceDescriptionType getSGrRESTAPIDeviceDescriptionType() {
		return (SGrRESTAPIDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrRESTAPIDeviceDescriptionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType newSGrRESTAPIDeviceDescriptionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrRESTAPIDeviceDescriptionType(), newSGrRESTAPIDeviceDescriptionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType newSGrRESTAPIDeviceDescriptionType) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrRESTAPIDeviceDescriptionType(), newSGrRESTAPIDeviceDescriptionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRESTAPIDeviceDescriptionType getSGrRestAPIDeviceFrame() {
		return (SGrRESTAPIDeviceDescriptionType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrRestAPIDeviceFrame(SGrRESTAPIDeviceDescriptionType newSGrRestAPIDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), newSGrRestAPIDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrRestAPIDeviceFrame(SGrRESTAPIDeviceDescriptionType newSGrRestAPIDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), newSGrRestAPIDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSerialInterfaceCapabilityType getSgrSerialInterfaceCapability() {
		return (SGrSerialInterfaceCapabilityType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SgrSerialInterfaceCapability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSgrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSgrSerialInterfaceCapability, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SgrSerialInterfaceCapability(), newSgrSerialInterfaceCapability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSgrSerialInterfaceCapability) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SgrSerialInterfaceCapability(), newSgrSerialInterfaceCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStopBitLenType getStopBitLenSupported() {
		return (EStopBitLenType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_StopBitLenSupported(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopBitLenSupported(EStopBitLenType newStopBitLenSupported) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_StopBitLenSupported(), newStopBitLenSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrspServiceModbusType getTrspServiceModbus() {
		return (TrspServiceModbusType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_TrspServiceModbus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrspServiceModbus(TrspServiceModbusType newTrspServiceModbus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_TrspServiceModbus(), newTrspServiceModbus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrspServiceModbus(TrspServiceModbusType newTrspServiceModbus) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_TrspServiceModbus(), newTrspServiceModbus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case V0Package.DOCUMENT_ROOT__DEVICE_PROFILE:
				return basicSetDeviceProfile(null, msgs);
			case V0Package.DOCUMENT_ROOT__FUNCTIONAL_PROFILES:
				return basicSetFunctionalProfiles(null, msgs);
			case V0Package.DOCUMENT_ROOT__GEN_DEVICE_FRAME:
				return basicSetGenDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				return basicSetNetConnectionState(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				return basicSetSGrModbusDataPointDescription(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				return basicSetSGrModbusInterfaceDescription(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				return basicSetSgrContactAPIDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				return basicSetSGrContactAPIDeviceDescriptionType(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				return basicSetSGrModbusDeviceDescriptionType(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return basicSetSGrModbusDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				return basicSetSGrRESTAPIDeviceDescriptionType(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return basicSetSGrRestAPIDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return basicSetSgrSerialInterfaceCapability(null, msgs);
			case V0Package.DOCUMENT_ROOT__TRSP_SERVICE_MODBUS:
				return basicSetTrspServiceModbus(null, msgs);
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
			case V0Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case V0Package.DOCUMENT_ROOT__BAUD_RATES_SUPPORTED:
				return getBaudRatesSupported();
			case V0Package.DOCUMENT_ROOT__BYTE_LEN_SUPPORTED:
				return getByteLenSupported();
			case V0Package.DOCUMENT_ROOT__DEVICE_PROFILE:
				return getDeviceProfile();
			case V0Package.DOCUMENT_ROOT__FUNCTIONAL_PROFILES:
				return getFunctionalProfiles();
			case V0Package.DOCUMENT_ROOT__GEN_DEVICE_FRAME:
				return getGenDeviceFrame();
			case V0Package.DOCUMENT_ROOT__MODBUS_FUNCTION_CODES_SUPPORTED:
				return getModbusFunctionCodesSupported();
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				return getNetConnectionState();
			case V0Package.DOCUMENT_ROOT__PARITY_SUPPORTED:
				return getParitySupported();
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				return getSGrModbusDataPointDescription();
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				return getSGrModbusInterfaceDescription();
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				return getSgrContactAPIDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				return getSGrContactAPIDeviceDescriptionType();
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				return getSGrModbusDeviceDescriptionType();
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return getSGrModbusDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				return getSGrRESTAPIDeviceDescriptionType();
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return getSGrRestAPIDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return getSgrSerialInterfaceCapability();
			case V0Package.DOCUMENT_ROOT__STOP_BIT_LEN_SUPPORTED:
				return getStopBitLenSupported();
			case V0Package.DOCUMENT_ROOT__TRSP_SERVICE_MODBUS:
				return getTrspServiceModbus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case V0Package.DOCUMENT_ROOT__BAUD_RATES_SUPPORTED:
				setBaudRatesSupported((EBaudRateType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__BYTE_LEN_SUPPORTED:
				setByteLenSupported((EByteLenType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__FUNCTIONAL_PROFILES:
				setFunctionalProfiles((SGrProfilesFrameType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__GEN_DEVICE_FRAME:
				setGenDeviceFrame((SGrDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__MODBUS_FUNCTION_CODES_SUPPORTED:
				setModbusFunctionCodesSupported((String)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				setNetConnectionState((NetworkConnectionStateType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__PARITY_SUPPORTED:
				setParitySupported((EParityType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				setSGrModbusDataPointDescription((SGrModbusDataPointDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				setSGrModbusInterfaceDescription((SGrModbusInterfaceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				setSgrContactAPIDeviceFrame((SGrContactAPIDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				setSGrContactAPIDeviceDescriptionType((SGrContactAPIDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				setSGrModbusDeviceDescriptionType((SGrModbusDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				setSGrModbusDeviceFrame((SGrModbusDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				setSGrRESTAPIDeviceDescriptionType((SGrRESTAPIDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				setSGrRestAPIDeviceFrame((SGrRESTAPIDeviceDescriptionType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				setSgrSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__STOP_BIT_LEN_SUPPORTED:
				setStopBitLenSupported((EStopBitLenType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__TRSP_SERVICE_MODBUS:
				setTrspServiceModbus((TrspServiceModbusType)newValue);
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
			case V0Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case V0Package.DOCUMENT_ROOT__BAUD_RATES_SUPPORTED:
				setBaudRatesSupported(BAUD_RATES_SUPPORTED_EDEFAULT);
				return;
			case V0Package.DOCUMENT_ROOT__BYTE_LEN_SUPPORTED:
				setByteLenSupported(BYTE_LEN_SUPPORTED_EDEFAULT);
				return;
			case V0Package.DOCUMENT_ROOT__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)null);
				return;
			case V0Package.DOCUMENT_ROOT__FUNCTIONAL_PROFILES:
				setFunctionalProfiles((SGrProfilesFrameType)null);
				return;
			case V0Package.DOCUMENT_ROOT__GEN_DEVICE_FRAME:
				setGenDeviceFrame((SGrDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__MODBUS_FUNCTION_CODES_SUPPORTED:
				setModbusFunctionCodesSupported(MODBUS_FUNCTION_CODES_SUPPORTED_EDEFAULT);
				return;
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				setNetConnectionState((NetworkConnectionStateType)null);
				return;
			case V0Package.DOCUMENT_ROOT__PARITY_SUPPORTED:
				setParitySupported(PARITY_SUPPORTED_EDEFAULT);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				setSGrModbusDataPointDescription((SGrModbusDataPointDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				setSGrModbusInterfaceDescription((SGrModbusInterfaceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				setSgrContactAPIDeviceFrame((SGrContactAPIDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				setSGrContactAPIDeviceDescriptionType((SGrContactAPIDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				setSGrModbusDeviceDescriptionType((SGrModbusDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				setSGrModbusDeviceFrame((SGrModbusDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				setSGrRESTAPIDeviceDescriptionType((SGrRESTAPIDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				setSGrRestAPIDeviceFrame((SGrRESTAPIDeviceDescriptionType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				setSgrSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)null);
				return;
			case V0Package.DOCUMENT_ROOT__STOP_BIT_LEN_SUPPORTED:
				setStopBitLenSupported(STOP_BIT_LEN_SUPPORTED_EDEFAULT);
				return;
			case V0Package.DOCUMENT_ROOT__TRSP_SERVICE_MODBUS:
				setTrspServiceModbus((TrspServiceModbusType)null);
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
			case V0Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case V0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case V0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case V0Package.DOCUMENT_ROOT__BAUD_RATES_SUPPORTED:
				return getBaudRatesSupported() != BAUD_RATES_SUPPORTED_EDEFAULT;
			case V0Package.DOCUMENT_ROOT__BYTE_LEN_SUPPORTED:
				return getByteLenSupported() != BYTE_LEN_SUPPORTED_EDEFAULT;
			case V0Package.DOCUMENT_ROOT__DEVICE_PROFILE:
				return getDeviceProfile() != null;
			case V0Package.DOCUMENT_ROOT__FUNCTIONAL_PROFILES:
				return getFunctionalProfiles() != null;
			case V0Package.DOCUMENT_ROOT__GEN_DEVICE_FRAME:
				return getGenDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__MODBUS_FUNCTION_CODES_SUPPORTED:
				return MODBUS_FUNCTION_CODES_SUPPORTED_EDEFAULT == null ? getModbusFunctionCodesSupported() != null : !MODBUS_FUNCTION_CODES_SUPPORTED_EDEFAULT.equals(getModbusFunctionCodesSupported());
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				return getNetConnectionState() != null;
			case V0Package.DOCUMENT_ROOT__PARITY_SUPPORTED:
				return getParitySupported() != PARITY_SUPPORTED_EDEFAULT;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				return getSGrModbusDataPointDescription() != null;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				return getSGrModbusInterfaceDescription() != null;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				return getSgrContactAPIDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				return getSGrContactAPIDeviceDescriptionType() != null;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				return getSGrModbusDeviceDescriptionType() != null;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return getSGrModbusDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				return getSGrRESTAPIDeviceDescriptionType() != null;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return getSGrRestAPIDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return getSgrSerialInterfaceCapability() != null;
			case V0Package.DOCUMENT_ROOT__STOP_BIT_LEN_SUPPORTED:
				return getStopBitLenSupported() != STOP_BIT_LEN_SUPPORTED_EDEFAULT;
			case V0Package.DOCUMENT_ROOT__TRSP_SERVICE_MODBUS:
				return getTrspServiceModbus() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
