/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.DocumentRoot;
import com.smartgridready.ns.v0.EBaudRateType;
import com.smartgridready.ns.v0.EByteLenType;
import com.smartgridready.ns.v0.EParityType;
import com.smartgridready.ns.v0.EStopBitLenType;
import com.smartgridready.ns.v0.NetworkConnectionStateType;
import com.smartgridready.ns.v0.SGrContactAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrFunctionalProfileFrameType;
import com.smartgridready.ns.v0.SGrGenDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType;
import com.smartgridready.ns.v0.TrspServiceModbusType;
import com.smartgridready.ns.v0.V0Package;

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
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getNetConnectionState <em>Net Connection State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrContactAPIDeviceFrame <em>SGr Contact API Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrFunctionalProfileFrame <em>SGr Functional Profile Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrGenDeviceFrame <em>SGr Gen Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getSGrSerialInterfaceCapability <em>SGr Serial Interface Capability</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DocumentRootImpl#getTrspServiceModbus <em>Trsp Service Modbus</em>}</li>
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
	public SGrContactAPIDeviceFrame getSGrContactAPIDeviceFrame() {
		return (SGrContactAPIDeviceFrame)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame newSGrContactAPIDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceFrame(), newSGrContactAPIDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame newSGrContactAPIDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrContactAPIDeviceFrame(), newSGrContactAPIDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrFunctionalProfileFrameType getSGrFunctionalProfileFrame() {
		return (SGrFunctionalProfileFrameType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrFunctionalProfileFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrFunctionalProfileFrame(SGrFunctionalProfileFrameType newSGrFunctionalProfileFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrFunctionalProfileFrame(), newSGrFunctionalProfileFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrFunctionalProfileFrame(SGrFunctionalProfileFrameType newSGrFunctionalProfileFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrFunctionalProfileFrame(), newSGrFunctionalProfileFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrGenDeviceFrame getSGrGenDeviceFrame() {
		return (SGrGenDeviceFrame)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrGenDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrGenDeviceFrame(SGrGenDeviceFrame newSGrGenDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrGenDeviceFrame(), newSGrGenDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrGenDeviceFrame(SGrGenDeviceFrame newSGrGenDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrGenDeviceFrame(), newSGrGenDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusDeviceFrame getSGrModbusDeviceFrame() {
		return (SGrModbusDeviceFrame)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrModbusDeviceFrame(SGrModbusDeviceFrame newSGrModbusDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), newSGrModbusDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrModbusDeviceFrame(SGrModbusDeviceFrame newSGrModbusDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrModbusDeviceFrame(), newSGrModbusDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestAPIDeviceFrame getSGrRestAPIDeviceFrame() {
		return (SGrRestAPIDeviceFrame)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame newSGrRestAPIDeviceFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), newSGrRestAPIDeviceFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame newSGrRestAPIDeviceFrame) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrRestAPIDeviceFrame(), newSGrRestAPIDeviceFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSerialInterfaceCapabilityType getSGrSerialInterfaceCapability() {
		return (SGrSerialInterfaceCapabilityType)getMixed().get(V0Package.eINSTANCE.getDocumentRoot_SGrSerialInterfaceCapability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSGrSerialInterfaceCapability, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(V0Package.eINSTANCE.getDocumentRoot_SGrSerialInterfaceCapability(), newSGrSerialInterfaceCapability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSGrSerialInterfaceCapability) {
		((FeatureMap.Internal)getMixed()).set(V0Package.eINSTANCE.getDocumentRoot_SGrSerialInterfaceCapability(), newSGrSerialInterfaceCapability);
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
			case V0Package.DOCUMENT_ROOT__NET_CONNECTION_STATE:
				return basicSetNetConnectionState(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION:
				return basicSetSGrModbusDataPointDescription(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION:
				return basicSetSGrModbusInterfaceDescription(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME:
				return basicSetSGrContactAPIDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME:
				return basicSetSGrFunctionalProfileFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME:
				return basicSetSGrGenDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return basicSetSGrModbusDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return basicSetSGrRestAPIDeviceFrame(null, msgs);
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return basicSetSGrSerialInterfaceCapability(null, msgs);
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
				return getSGrContactAPIDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME:
				return getSGrFunctionalProfileFrame();
			case V0Package.DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME:
				return getSGrGenDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return getSGrModbusDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return getSGrRestAPIDeviceFrame();
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return getSGrSerialInterfaceCapability();
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
				setSGrContactAPIDeviceFrame((SGrContactAPIDeviceFrame)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME:
				setSGrFunctionalProfileFrame((SGrFunctionalProfileFrameType)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME:
				setSGrGenDeviceFrame((SGrGenDeviceFrame)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				setSGrModbusDeviceFrame((SGrModbusDeviceFrame)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				setSGrRestAPIDeviceFrame((SGrRestAPIDeviceFrame)newValue);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				setSGrSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)newValue);
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
				setSGrContactAPIDeviceFrame((SGrContactAPIDeviceFrame)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME:
				setSGrFunctionalProfileFrame((SGrFunctionalProfileFrameType)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME:
				setSGrGenDeviceFrame((SGrGenDeviceFrame)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				setSGrModbusDeviceFrame((SGrModbusDeviceFrame)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				setSGrRestAPIDeviceFrame((SGrRestAPIDeviceFrame)null);
				return;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				setSGrSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)null);
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
				return getSGrContactAPIDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME:
				return getSGrFunctionalProfileFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME:
				return getSGrGenDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME:
				return getSGrModbusDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME:
				return getSGrRestAPIDeviceFrame() != null;
			case V0Package.DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY:
				return getSGrSerialInterfaceCapability() != null;
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
