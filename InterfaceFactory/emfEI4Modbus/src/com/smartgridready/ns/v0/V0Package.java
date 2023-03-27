/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.smartgridready.ns.v0.V0Factory
 * @model kind="package"
 * @generated
 */
public interface V0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "v0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smartgridready.com/ns/V0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "v0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	V0Package eINSTANCE = com.smartgridready.ns.v0.impl.V0PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.ContactAPIInterfaceDescTypeImpl <em>Contact API Interface Desc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.ContactAPIInterfaceDescTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getContactAPIInterfaceDescType()
	 * @generated
	 */
	int CONTACT_API_INTERFACE_DESC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Num Contacts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS = 0;

	/**
	 * The feature id for the '<em><b>Contact Stabilisation Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS = 1;

	/**
	 * The number of structural features of the '<em>Contact API Interface Desc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_API_INTERFACE_DESC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contact API Interface Desc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_API_INTERFACE_DESC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.DocumentRootImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Baud Rates Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BAUD_RATES_SUPPORTED = 3;

	/**
	 * The feature id for the '<em><b>Byte Len Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BYTE_LEN_SUPPORTED = 4;

	/**
	 * The feature id for the '<em><b>Modbus Function Codes Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODBUS_FUNCTION_CODES_SUPPORTED = 5;

	/**
	 * The feature id for the '<em><b>Net Connection State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NET_CONNECTION_STATE = 6;

	/**
	 * The feature id for the '<em><b>Parity Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARITY_SUPPORTED = 7;

	/**
	 * The feature id for the '<em><b>SGr Modbus Data Point Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_MODBUS_DATA_POINT_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>SGr Modbus Interface Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_MODBUS_INTERFACE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>SGr Contact API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_CONTACT_API_DEVICE_FRAME = 10;

	/**
	 * The feature id for the '<em><b>SGr Functional Profile Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_FUNCTIONAL_PROFILE_FRAME = 11;

	/**
	 * The feature id for the '<em><b>SGr Gen Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME = 12;

	/**
	 * The feature id for the '<em><b>SGr Modbus Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_MODBUS_DEVICE_FRAME = 13;

	/**
	 * The feature id for the '<em><b>SGr Rest API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_REST_API_DEVICE_FRAME = 14;

	/**
	 * The feature id for the '<em><b>SGr Serial Interface Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_SERIAL_INTERFACE_CAPABILITY = 15;

	/**
	 * The feature id for the '<em><b>Stop Bit Len Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP_BIT_LEN_SUPPORTED = 16;

	/**
	 * The feature id for the '<em><b>Trsp Service Modbus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRSP_SERVICE_MODBUS = 17;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl <em>Functional Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.FunctionalProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getFunctionalProfileType()
	 * @generated
	 */
	int FUNCTIONAL_PROFILE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Profile Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE__PROFILE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Fp Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE__FP_NAME_LIST = 1;

	/**
	 * The feature id for the '<em><b>Fp Legib Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE__FP_LEGIB_DESC = 2;

	/**
	 * The feature id for the '<em><b>Fp Prg Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE__FP_PRG_DESC = 3;

	/**
	 * The number of structural features of the '<em>Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.HeaderEntryImpl <em>Header Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.HeaderEntryImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHeaderEntry()
	 * @generated
	 */
	int HEADER_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY__HEADER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Header Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.HeaderListImpl <em>Header List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.HeaderListImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHeaderList()
	 * @generated
	 */
	int HEADER_LIST = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LIST__HEADER = 0;

	/**
	 * The number of structural features of the '<em>Header List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Header List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.IpADDRTypeImpl <em>Ip ADDR Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.IpADDRTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpADDRType()
	 * @generated
	 */
	int IP_ADDR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Ip V4n1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE__IP_V4N1 = 0;

	/**
	 * The feature id for the '<em><b>Ip V4n2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE__IP_V4N2 = 1;

	/**
	 * The feature id for the '<em><b>Ip V4n3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE__IP_V4N3 = 2;

	/**
	 * The feature id for the '<em><b>Ip V4n4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE__IP_V4N4 = 3;

	/**
	 * The number of structural features of the '<em>Ip ADDR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ip ADDR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.ModbusJMESPathTypeImpl <em>Modbus JMES Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.ModbusJMESPathTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getModbusJMESPathType()
	 * @generated
	 */
	int MODBUS_JMES_PATH_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS_JMES_PATH_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Modbus JMES Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS_JMES_PATH_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modbus JMES Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS_JMES_PATH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.NetworkConnectionStateTypeImpl <em>Network Connection State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.NetworkConnectionStateTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getNetworkConnectionStateType()
	 * @generated
	 */
	int NETWORK_CONNECTION_STATE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_STATE_TYPE__IS_CONNECTED = 0;

	/**
	 * The feature id for the '<em><b>Next Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_STATE_TYPE__NEXT_ATTEMPT = 1;

	/**
	 * The number of structural features of the '<em>Network Connection State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_STATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Connection State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.ResponseQueryImpl <em>Response Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.ResponseQueryImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getResponseQuery()
	 * @generated
	 */
	int RESPONSE_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Query Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_QUERY__QUERY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_QUERY__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Response Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl <em>Rest Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.RestServiceCallImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRestServiceCall()
	 * @generated
	 */
	int REST_SERVICE_CALL = 9;

	/**
	 * The feature id for the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL__REQUEST_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Request Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL__REQUEST_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Request Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL__REQUEST_PATH = 2;

	/**
	 * The feature id for the '<em><b>Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL__REQUEST_BODY = 3;

	/**
	 * The feature id for the '<em><b>Response Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL__RESPONSE_QUERY = 4;

	/**
	 * The number of structural features of the '<em>Rest Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rest Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.RTUDevInstanceTypeImpl <em>RTU Dev Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.RTUDevInstanceTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRTUDevInstanceType()
	 * @generated
	 */
	int RTU_DEV_INSTANCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Device Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Slave Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR = 1;

	/**
	 * The number of structural features of the '<em>RTU Dev Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_DEV_INSTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RTU Dev Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_DEV_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.RTUtrspSrvInstanceTypeImpl <em>RT Utrsp Srv Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.RTUtrspSrvInstanceTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRTUtrspSrvInstanceType()
	 * @generated
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE = 0;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN = 1;

	/**
	 * The feature id for the '<em><b>Parity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE__PARITY = 2;

	/**
	 * The feature id for the '<em><b>Stop Bit Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN = 3;

	/**
	 * The number of structural features of the '<em>RT Utrsp Srv Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>RT Utrsp Srv Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_UTRSP_SRV_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.RTUTypeImpl <em>RTU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.RTUTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRTUType()
	 * @generated
	 */
	int RTU_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Rtu Trsp Srv Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_TYPE__RTU_TRSP_SRV_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Rtu Dev Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_TYPE__RTU_DEV_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>RTU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RTU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTU_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrAccessProtectionEnabledTypeImpl <em>SGr Access Protection Enabled Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrAccessProtectionEnabledTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrAccessProtectionEnabledType()
	 * @generated
	 */
	int SGR_ACCESS_PROTECTION_ENABLED_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Modbus Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED = 1;

	/**
	 * The number of structural features of the '<em>SGr Access Protection Enabled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ACCESS_PROTECTION_ENABLED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Access Protection Enabled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ACCESS_PROTECTION_ENABLED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrAttr4GenericTypeImpl <em>SGr Attr4 Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrAttr4GenericTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrAttr4GenericType()
	 * @generated
	 */
	int SGR_ATTR4_GENERIC_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MAX_VAL = 0;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MIN_VAL = 1;

	/**
	 * The feature id for the '<em><b>Spec Quality Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Stability Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK = 4;

	/**
	 * The feature id for the '<em><b>Smooth Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Max Latency Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME_MS = 6;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE = 9;

	/**
	 * The feature id for the '<em><b>Curtailment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__CURTAILMENT = 10;

	/**
	 * The feature id for the '<em><b>Min Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MIN_LOAD = 11;

	/**
	 * The feature id for the '<em><b>Max Lock Time Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES = 12;

	/**
	 * The feature id for the '<em><b>Min Run Time Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES = 13;

	/**
	 * The feature id for the '<em><b>Value By Time Table Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES = 14;

	/**
	 * The feature id for the '<em><b>Flex Assistance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__FLEX_ASSISTANCE = 15;

	/**
	 * The number of structural features of the '<em>SGr Attr4 Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>SGr Attr4 Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl <em>SGr Attr4 Modbus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrAttr4ModbusTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrAttr4ModbusType()
	 * @generated
	 */
	int SGR_ATTR4_MODBUS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Scaling By Mul Pwr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__SCALING_BY_MUL_PWR = 0;

	/**
	 * The feature id for the '<em><b>Step By Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__STEP_BY_INCREMENT = 1;

	/**
	 * The feature id for the '<em><b>Sunssf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__SUNSSF = 2;

	/**
	 * The feature id for the '<em><b>Poll Latency MS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__POLL_LATENCY_MS = 3;

	/**
	 * The feature id for the '<em><b>Access Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__ACCESS_PROTECTION = 4;

	/**
	 * The feature id for the '<em><b>Layer6 Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__LAYER6_DEVIATION = 5;

	/**
	 * The feature id for the '<em><b>Iop Enum Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__IOP_ENUM_MAPPER = 6;

	/**
	 * The feature id for the '<em><b>Iop Bitmap Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE__IOP_BITMAP_MAPPER = 7;

	/**
	 * The number of structural features of the '<em>SGr Attr4 Modbus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>SGr Attr4 Modbus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_MODBUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrAttr4RestAPITypeImpl <em>SGr Attr4 Rest API Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrAttr4RestAPITypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrAttr4RestAPIType()
	 * @generated
	 */
	int SGR_ATTR4_REST_API_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Place Holder4future Extensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_REST_API_TYPE__PLACE_HOLDER4FUTURE_EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>SGr Attr4 Rest API Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_REST_API_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SGr Attr4 Rest API Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_REST_API_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl <em>SGr Basic Gen Data Point Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Enum2bitmap Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM2BITMAP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>Int8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8 = 2;

	/**
	 * The feature id for the '<em><b>Int16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16 = 3;

	/**
	 * The feature id for the '<em><b>Int32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32 = 4;

	/**
	 * The feature id for the '<em><b>Int64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64 = 5;

	/**
	 * The feature id for the '<em><b>Int8 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U = 6;

	/**
	 * The feature id for the '<em><b>Int16 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U = 7;

	/**
	 * The feature id for the '<em><b>Int32 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U = 8;

	/**
	 * The feature id for the '<em><b>Int64 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U = 9;

	/**
	 * The feature id for the '<em><b>Float32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32 = 10;

	/**
	 * The feature id for the '<em><b>Float64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64 = 11;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM = 12;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME = 13;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING = 14;

	/**
	 * The number of structural features of the '<em>SGr Basic Gen Data Point Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>SGr Basic Gen Data Point Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl <em>SGr Bitmapper List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBitmapperListType()
	 * @generated
	 */
	int SGR_BITMAPPER_LIST_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Sgr Bool2 Bit Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK = 0;

	/**
	 * The feature id for the '<em><b>Sgr HP Opstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE = 1;

	/**
	 * The feature id for the '<em><b>Sti HP Opstate Stiebel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL = 2;

	/**
	 * The feature id for the '<em><b>Sgr HC Opstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE = 3;

	/**
	 * The feature id for the '<em><b>Sgr HP Act Buffer State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE = 4;

	/**
	 * The number of structural features of the '<em>SGr Bitmapper List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SGr Bitmapper List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrChangeLogImpl <em>SGr Change Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrChangeLogImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrChangeLog()
	 * @generated
	 */
	int SGR_CHANGE_LOG = 19;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG__DATE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG__COMMENT = 3;

	/**
	 * The number of structural features of the '<em>SGr Change Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SGr Change Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CHANGE_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDeviceBaseTypeImpl <em>SGr Device Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDeviceBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceBaseType()
	 * @generated
	 */
	int SGR_DEVICE_BASE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__RELEASE_NOTES = 0;

	/**
	 * The feature id for the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__DEVICE_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__GEN_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__DEVICE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__IS_LOCAL_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__MANUFACTURER_ID = 5;

	/**
	 * The feature id for the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE__MANUFACTURER_NAME = 6;

	/**
	 * The number of structural features of the '<em>SGr Device Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SGr Device Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrContactAPIDeviceFrameImpl <em>SGr Contact API Device Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrContactAPIDeviceFrameImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrContactAPIDeviceFrame()
	 * @generated
	 */
	int SGR_CONTACT_API_DEVICE_FRAME = 20;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__RELEASE_NOTES = SGR_DEVICE_BASE_TYPE__RELEASE_NOTES;

	/**
	 * The feature id for the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__DEVICE_PROFILE = SGR_DEVICE_BASE_TYPE__DEVICE_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__GEN_ATTRIBUTE = SGR_DEVICE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__DEVICE_NAME = SGR_DEVICE_BASE_TYPE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__IS_LOCAL_CONTROL = SGR_DEVICE_BASE_TYPE__IS_LOCAL_CONTROL;

	/**
	 * The feature id for the '<em><b>Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__MANUFACTURER_ID = SGR_DEVICE_BASE_TYPE__MANUFACTURER_ID;

	/**
	 * The feature id for the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__MANUFACTURER_NAME = SGR_DEVICE_BASE_TYPE__MANUFACTURER_NAME;

	/**
	 * The feature id for the '<em><b>Contact Api Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__CONTACT_API_INTERFACE_DESC = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME__FP_LIST_ELEMENT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGr Contact API Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME_FEATURE_COUNT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SGr Contact API Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_DEVICE_FRAME_OPERATION_COUNT = SGR_DEVICE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileBaseTypeImpl <em>SGr Functional Profile Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrFunctionalProfileBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrFunctionalProfileBaseType()
	 * @generated
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE__FUNCTIONAL_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE__GEN_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>SGr Functional Profile Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Functional Profile Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrContactAPIFunctionalProfileTypeImpl <em>SGr Contact API Functional Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrContactAPIFunctionalProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrContactAPIFunctionalProfileType()
	 * @generated
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE__FUNCTIONAL_PROFILE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__FUNCTIONAL_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE__GEN_ATTRIBUTE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Dp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGr Contact API Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE_FEATURE_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGr Contact API Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE_OPERATION_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDataPointBaseTypeImpl <em>SGr Data Point Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDataPointBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDataPointBaseType()
	 * @generated
	 */
	int SGR_DATA_POINT_BASE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_BASE_TYPE__DATA_POINT = 0;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_BASE_TYPE__GEN_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>SGr Data Point Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Data Point Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDataPointDescriptionTypeImpl <em>SGr Data Point Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDataPointDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDataPointDescriptionType()
	 * @generated
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Basic Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__BASIC_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Arr Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN = 1;

	/**
	 * The feature id for the '<em><b>Dp Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__DP_NAME_LIST = 2;

	/**
	 * The feature id for the '<em><b>Dp Legib Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__DP_LEGIB_DESC = 3;

	/**
	 * The feature id for the '<em><b>Dp Prg Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__DP_PRG_DESC = 4;

	/**
	 * The feature id for the '<em><b>Datapoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__DATAPOINT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Mro Visibility Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__MRO_VISIBILITY_INDICATOR = 6;

	/**
	 * The feature id for the '<em><b>Rwp Datadirection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__RWP_DATADIRECTION = 7;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE__UNIT = 8;

	/**
	 * The number of structural features of the '<em>SGr Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>SGr Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DATA_POINT_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl <em>SGr Device Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceProfileType()
	 * @generated
	 */
	int SGR_DEVICE_PROFILE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Dev Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST = 0;

	/**
	 * The feature id for the '<em><b>Dev Legib Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC = 1;

	/**
	 * The feature id for the '<em><b>Transport Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Device Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND = 3;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Software Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION = 5;

	/**
	 * The feature id for the '<em><b>Hardware Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION = 6;

	/**
	 * The feature id for the '<em><b>Brand Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__BRAND_NAME = 7;

	/**
	 * The feature id for the '<em><b>Power Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Nominal Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER = 9;

	/**
	 * The feature id for the '<em><b>Manuf Spec Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT = 10;

	/**
	 * The feature id for the '<em><b>Manufacturer Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL = 11;

	/**
	 * The feature id for the '<em><b>Rem Author ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID = 12;

	/**
	 * The feature id for the '<em><b>Dev Levelof Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Dev Prg Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE__DEV_PRG_DESC = 14;

	/**
	 * The number of structural features of the '<em>SGr Device Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>SGr Device Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_DEVICE_PROFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl <em>SGr Enum List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEnumListType()
	 * @generated
	 */
	int SGR_ENUM_LIST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Sgr Meas Value Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Sgr Power Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Sgready State Lv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2 = 2;

	/**
	 * The feature id for the '<em><b>Sgready State Lv1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1 = 3;

	/**
	 * The feature id for the '<em><b>Sgr Sunsp State Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES = 4;

	/**
	 * The feature id for the '<em><b>Sgr EVSE State Lv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2 = 5;

	/**
	 * The feature id for the '<em><b>Sgr EVSE State Lv1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1 = 6;

	/**
	 * The feature id for the '<em><b>Sgr SGCP Load State Lv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2 = 7;

	/**
	 * The feature id for the '<em><b>Sgr SGCP Feed In State Lv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2 = 8;

	/**
	 * The feature id for the '<em><b>Sgr EV State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_EV_STATE = 9;

	/**
	 * The feature id for the '<em><b>Sgr SGCP Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Sgr Oblig Lvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL = 11;

	/**
	 * The feature id for the '<em><b>Sgr OCPP State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE = 12;

	/**
	 * The feature id for the '<em><b>Sgr HP Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE = 13;

	/**
	 * The feature id for the '<em><b>Sgr HC Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE = 14;

	/**
	 * The feature id for the '<em><b>Sgr DHW Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__SGR_DHW_OP_MODE = 15;

	/**
	 * The feature id for the '<em><b>Cta DHW Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__CTA_DHW_OP_MODE = 16;

	/**
	 * The number of structural features of the '<em>SGr Enum List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>SGr Enum List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrFlexAssistanceTypeImpl <em>SGr Flex Assistance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrFlexAssistanceTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrFlexAssistanceType()
	 * @generated
	 */
	int SGR_FLEX_ASSISTANCE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FLEX_ASSISTANCE_TYPE__ASSISTS = 0;

	/**
	 * The feature id for the '<em><b>Obliged To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FLEX_ASSISTANCE_TYPE__OBLIGED_TO = 1;

	/**
	 * The number of structural features of the '<em>SGr Flex Assistance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FLEX_ASSISTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Flex Assistance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FLEX_ASSISTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl <em>SGr Functional Profile Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrFunctionalProfileFrameTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrFunctionalProfileFrameType()
	 * @generated
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__RELEASE_NOTES = 0;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__FUNCTIONAL_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__GEN_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Dp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE__DP_LIST_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>SGr Functional Profile Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SGr Functional Profile Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_FUNCTIONAL_PROFILE_FRAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrGenDeviceFrameImpl <em>SGr Gen Device Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrGenDeviceFrameImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrGenDeviceFrame()
	 * @generated
	 */
	int SGR_GEN_DEVICE_FRAME = 30;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__RELEASE_NOTES = SGR_DEVICE_BASE_TYPE__RELEASE_NOTES;

	/**
	 * The feature id for the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__DEVICE_PROFILE = SGR_DEVICE_BASE_TYPE__DEVICE_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__GEN_ATTRIBUTE = SGR_DEVICE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__DEVICE_NAME = SGR_DEVICE_BASE_TYPE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__IS_LOCAL_CONTROL = SGR_DEVICE_BASE_TYPE__IS_LOCAL_CONTROL;

	/**
	 * The feature id for the '<em><b>Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__MANUFACTURER_ID = SGR_DEVICE_BASE_TYPE__MANUFACTURER_ID;

	/**
	 * The feature id for the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__MANUFACTURER_NAME = SGR_DEVICE_BASE_TYPE__MANUFACTURER_NAME;

	/**
	 * The feature id for the '<em><b>Fp List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME__FP_LIST_ELEMENT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGr Gen Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME_FEATURE_COUNT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGr Gen Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_DEVICE_FRAME_OPERATION_COUNT = SGR_DEVICE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrGenFunctionalProfileTypeImpl <em>SGr Gen Functional Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrGenFunctionalProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrGenFunctionalProfileType()
	 * @generated
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE__FUNCTIONAL_PROFILE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__FUNCTIONAL_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE__GEN_ATTRIBUTE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Dp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGr Gen Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE_FEATURE_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGr Gen Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE_OPERATION_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrLegibDocumentationTypeImpl <em>SGr Legib Documentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrLegibDocumentationTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrLegibDocumentationType()
	 * @generated
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Text Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE__URI = 2;

	/**
	 * The number of structural features of the '<em>SGr Legib Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SGr Legib Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_LEGIB_DOCUMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusBitmapMapperTypeImpl <em>SGr Modbus Bitmap Mapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusBitmapMapperTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusBitmapMapperType()
	 * @generated
	 */
	int SGR_MODBUS_BITMAP_MAPPER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Modbus Bit Mapper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_BITMAP_MAPPER_TYPE__MODBUS_BIT_MAPPER = 0;

	/**
	 * The feature id for the '<em><b>Gen Bit Mapper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_BITMAP_MAPPER_TYPE__GEN_BIT_MAPPER = 1;

	/**
	 * The number of structural features of the '<em>SGr Modbus Bitmap Mapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_BITMAP_MAPPER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Modbus Bitmap Mapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_BITMAP_MAPPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl <em>SGr Modbus Data Point Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Modbus Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Arr Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN = 1;

	/**
	 * The feature id for the '<em><b>Modbus First Register Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Dp Size Nr Registers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS = 3;

	/**
	 * The feature id for the '<em><b>Bitmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK = 4;

	/**
	 * The feature id for the '<em><b>Master Functions Supported</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED = 5;

	/**
	 * The feature id for the '<em><b>Modbus JMES Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH = 6;

	/**
	 * The number of structural features of the '<em>SGr Modbus Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SGr Modbus Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl <em>SGr Modbus Data Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusDataPointTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusDataPointType()
	 * @generated
	 */
	int SGR_MODBUS_DATA_POINT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__DATA_POINT = SGR_DATA_POINT_BASE_TYPE__DATA_POINT;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__GEN_ATTRIBUTE = SGR_DATA_POINT_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Modbus Data Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__MODBUS_DATA_POINT = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__LAST_ACCESS_TIME = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__TIME_TO_LIVE = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block Cash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__BLOCK_CASH_NAME = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modbus Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE__MODBUS_ATTR = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SGr Modbus Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE_FEATURE_COUNT = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SGr Modbus Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DATA_POINT_TYPE_OPERATION_COUNT = SGR_DATA_POINT_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl <em>SGr Modbus Device Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusDeviceFrame()
	 * @generated
	 */
	int SGR_MODBUS_DEVICE_FRAME = 36;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__RELEASE_NOTES = SGR_DEVICE_BASE_TYPE__RELEASE_NOTES;

	/**
	 * The feature id for the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__DEVICE_PROFILE = SGR_DEVICE_BASE_TYPE__DEVICE_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__GEN_ATTRIBUTE = SGR_DEVICE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__DEVICE_NAME = SGR_DEVICE_BASE_TYPE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__IS_LOCAL_CONTROL = SGR_DEVICE_BASE_TYPE__IS_LOCAL_CONTROL;

	/**
	 * The feature id for the '<em><b>Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__MANUFACTURER_ID = SGR_DEVICE_BASE_TYPE__MANUFACTURER_ID;

	/**
	 * The feature id for the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__MANUFACTURER_NAME = SGR_DEVICE_BASE_TYPE__MANUFACTURER_NAME;

	/**
	 * The feature id for the '<em><b>Modbus Attr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modbus Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Sync Block Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Connection State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SGr Modbus Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME_FEATURE_COUNT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SGr Modbus Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_DEVICE_FRAME_OPERATION_COUNT = SGR_DEVICE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusEnumMapperTypeImpl <em>SGr Modbus Enum Mapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusEnumMapperTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusEnumMapperType()
	 * @generated
	 */
	int SGR_MODBUS_ENUM_MAPPER_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Modbus Enum Mapper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_ENUM_MAPPER_TYPE__MODBUS_ENUM_MAPPER = 0;

	/**
	 * The feature id for the '<em><b>Gen Enum Mapper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_ENUM_MAPPER_TYPE__GEN_ENUM_MAPPER = 1;

	/**
	 * The number of structural features of the '<em>SGr Modbus Enum Mapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_ENUM_MAPPER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Modbus Enum Mapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_ENUM_MAPPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusFunctionalProfileTypeImpl <em>SGr Modbus Functional Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusFunctionalProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusFunctionalProfileType()
	 * @generated
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__FUNCTIONAL_PROFILE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__FUNCTIONAL_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__GEN_ATTRIBUTE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Modbus Attr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGr Modbus Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE_FEATURE_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SGr Modbus Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE_OPERATION_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl <em>SGr Modbus Interface Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrModbusInterfaceDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Modbus Interface Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__MODBUS_INTERFACE_SELECTION = 0;

	/**
	 * The feature id for the '<em><b>Trsp Srv Modbus TC Pout Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_TC_POUT_OF_BOX = 1;

	/**
	 * The feature id for the '<em><b>Trsp Srv Modbus RT Uout Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_MODBUS_RT_UOUT_OF_BOX = 2;

	/**
	 * The feature id for the '<em><b>First Register Address Is One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__FIRST_REGISTER_ADDRESS_IS_ONE = 3;

	/**
	 * The feature id for the '<em><b>Conversion Scheme</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE__CONVERSION_SCHEME = 4;

	/**
	 * The number of structural features of the '<em>SGr Modbus Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SGr Modbus Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrNamelistTypeImpl <em>SGr Namelist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrNamelistTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrNamelistType()
	 * @generated
	 */
	int SGR_NAMELIST_TYPE = 40;

	/**
	 * The feature id for the '<em><b>SLV1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SLV1_NAME = 0;

	/**
	 * The feature id for the '<em><b>SWork Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SWORK_NAME = 1;

	/**
	 * The feature id for the '<em><b>SManuf Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SMANUF_NAME = 2;

	/**
	 * The feature id for the '<em><b>SIEC61850 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SIEC61850_NAME = 3;

	/**
	 * The feature id for the '<em><b>SSAREF Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SSAREF_NAME = 4;

	/**
	 * The feature id for the '<em><b>SEEBUS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SEEBUS_NAME = 5;

	/**
	 * The feature id for the '<em><b>SSUNSPEC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SSUNSPEC_NAME = 6;

	/**
	 * The feature id for the '<em><b>SH Pbwp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SH_PBWP_NAME = 7;

	/**
	 * The feature id for the '<em><b>SEN17609 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE__SEN17609_NAME = 8;

	/**
	 * The number of structural features of the '<em>SGr Namelist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>SGr Namelist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_NAMELIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrProfileDescriptionTypeImpl <em>SGr Profile Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrProfileDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrProfileDescriptionType()
	 * @generated
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Profile Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE__PROFILE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Fp Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE__FP_NAME_LIST = 1;

	/**
	 * The feature id for the '<em><b>Fp Legib Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE__FP_LEGIB_DESC = 2;

	/**
	 * The feature id for the '<em><b>Fp Prg Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE__FP_PRG_DESC = 3;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE__PROFILE_NAME = 4;

	/**
	 * The number of structural features of the '<em>SGr Profile Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SGr Profile Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl <em>SGr Profilenumber Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrProfilenumberType()
	 * @generated
	 */
	int SGR_PROFILENUMBER_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Specs Owner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID = 0;

	/**
	 * The feature id for the '<em><b>Profile Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Sub Profile Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT = 2;

	/**
	 * The feature id for the '<em><b>Sgr Level Of Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE__VERSION_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>SGr Profilenumber Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SGr Profilenumber Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_PROFILENUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrReleaseNotesImpl <em>SGr Release Notes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrReleaseNotesImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrReleaseNotes()
	 * @generated
	 */
	int SGR_RELEASE_NOTES = 43;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_RELEASE_NOTES__STATE = 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_RELEASE_NOTES__REMARKS = 1;

	/**
	 * The feature id for the '<em><b>Changelog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_RELEASE_NOTES__CHANGELOG = 2;

	/**
	 * The number of structural features of the '<em>SGr Release Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_RELEASE_NOTES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SGr Release Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_RELEASE_NOTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGRrestAPIBearerTypeImpl <em>SG Rrest API Bearer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGRrestAPIBearerTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGRrestAPIBearerType()
	 * @generated
	 */
	int SG_RREST_API_BEARER_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SG_RREST_API_BEARER_TYPE__SERVICE_CALL = 0;

	/**
	 * The number of structural features of the '<em>SG Rrest API Bearer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SG_RREST_API_BEARER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SG Rrest API Bearer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SG_RREST_API_BEARER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointDescriptionTypeImpl <em>SGr Rest API Data Point Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestAPIDataPointDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIDataPointDescriptionType()
	 * @generated
	 */
	int SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Rest Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__REST_SERVICE_CALL = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>SGr Rest API Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Rest API Data Point Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestAPIDataPointTypeImpl <em>SGr Rest API Data Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestAPIDataPointTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIDataPointType()
	 * @generated
	 */
	int SGR_REST_API_DATA_POINT_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE__DATA_POINT = SGR_DATA_POINT_BASE_TYPE__DATA_POINT;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE__GEN_ATTRIBUTE = SGR_DATA_POINT_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rest API Data Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE__REST_API_DATA_POINT = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE__REST_API_ATTR = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGr Rest API Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE_FEATURE_COUNT = SGR_DATA_POINT_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SGr Rest API Data Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DATA_POINT_TYPE_OPERATION_COUNT = SGR_DATA_POINT_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestAPIDeviceFrameImpl <em>SGr Rest API Device Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestAPIDeviceFrameImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	int SGR_REST_API_DEVICE_FRAME = 47;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__RELEASE_NOTES = SGR_DEVICE_BASE_TYPE__RELEASE_NOTES;

	/**
	 * The feature id for the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__DEVICE_PROFILE = SGR_DEVICE_BASE_TYPE__DEVICE_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__GEN_ATTRIBUTE = SGR_DEVICE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__DEVICE_NAME = SGR_DEVICE_BASE_TYPE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__IS_LOCAL_CONTROL = SGR_DEVICE_BASE_TYPE__IS_LOCAL_CONTROL;

	/**
	 * The feature id for the '<em><b>Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__MANUFACTURER_ID = SGR_DEVICE_BASE_TYPE__MANUFACTURER_ID;

	/**
	 * The feature id for the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__MANUFACTURER_NAME = SGR_DEVICE_BASE_TYPE__MANUFACTURER_NAME;

	/**
	 * The feature id for the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__REST_API_ATTR = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest API Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__REST_API_INTERFACE_DESC = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME__FP_LIST_ELEMENT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SGr Rest API Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME_FEATURE_COUNT = SGR_DEVICE_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SGr Rest API Device Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_DEVICE_FRAME_OPERATION_COUNT = SGR_DEVICE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestAPIFunctionalProfileTypeImpl <em>SGr Rest API Functional Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestAPIFunctionalProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIFunctionalProfileType()
	 * @generated
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Functional Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__FUNCTIONAL_PROFILE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__FUNCTIONAL_PROFILE;

	/**
	 * The feature id for the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__GEN_ATTRIBUTE = SGR_FUNCTIONAL_PROFILE_BASE_TYPE__GEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dp List Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGr Rest API Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE_FEATURE_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SGr Rest API Functional Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_FUNCTIONAL_PROFILE_TYPE_OPERATION_COUNT = SGR_FUNCTIONAL_PROFILE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl <em>SGr Rest API Interface Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Rest API Interface Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION = 0;

	/**
	 * The feature id for the '<em><b>Trsp Srv Rest TCPV 4out Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX = 1;

	/**
	 * The feature id for the '<em><b>Trsp Srv Rest TCPV 6out Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX = 2;

	/**
	 * The feature id for the '<em><b>Trsp Srv Rest UR Iout Of Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX = 3;

	/**
	 * The feature id for the '<em><b>Rest API Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Rest API Bearer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER = 5;

	/**
	 * The feature id for the '<em><b>Rest API Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC = 6;

	/**
	 * The number of structural features of the '<em>SGr Rest API Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SGr Rest API Interface Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_API_INTERFACE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrRestBasicTypeImpl <em>SGr Rest Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrRestBasicTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestBasicType()
	 * @generated
	 */
	int SGR_REST_BASIC_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Rest Basic Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Rest Basic Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>SGr Rest Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_BASIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Rest Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_REST_BASIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrScalingTypeImpl <em>SGr Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrScalingTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrScalingType()
	 * @generated
	 */
	int SGR_SCALING_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Multiplicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SCALING_TYPE__MULTIPLICATOR = 0;

	/**
	 * The feature id for the '<em><b>Powerof10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SCALING_TYPE__POWEROF10 = 1;

	/**
	 * The number of structural features of the '<em>SGr Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SCALING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SGr Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SCALING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl <em>SGr Serial Interface Capability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSerialInterfaceCapabilityType()
	 * @generated
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Baud Rates Supported</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED = 0;

	/**
	 * The feature id for the '<em><b>Byte Len Supported</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED = 1;

	/**
	 * The feature id for the '<em><b>Parity Supported</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED = 2;

	/**
	 * The feature id for the '<em><b>Stop Bit Len Supported</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED = 3;

	/**
	 * The number of structural features of the '<em>SGr Serial Interface Capability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SGr Serial Interface Capability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SERIAL_INTERFACE_CAPABILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrSmoothTransitionTypeImpl <em>SGr Smooth Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrSmoothTransitionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSmoothTransitionType()
	 * @generated
	 */
	int SGR_SMOOTH_TRANSITION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Win Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS = 0;

	/**
	 * The feature id for the '<em><b>Rvrt Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS = 1;

	/**
	 * The feature id for the '<em><b>Rmp Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS = 2;

	/**
	 * The number of structural features of the '<em>SGr Smooth Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SMOOTH_TRANSITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SGr Smooth Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_SMOOTH_TRANSITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrStabilityFallbackTypeImpl <em>SGr Stability Fallback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrStabilityFallbackTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrStabilityFallbackType()
	 * @generated
	 */
	int SGR_STABILITY_FALLBACK_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Max Receive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_STABILITY_FALLBACK_TYPE__MAX_RECEIVE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_STABILITY_FALLBACK_TYPE__INIT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Fallback Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_STABILITY_FALLBACK_TYPE__FALLBACK_VALUE = 2;

	/**
	 * The number of structural features of the '<em>SGr Stability Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_STABILITY_FALLBACK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SGr Stability Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_STABILITY_FALLBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl <em>SGr Time Sync Block Notification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrTimeSyncBlockNotificationTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Last Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__LAST_ACCESS_TIME = 0;

	/**
	 * The feature id for the '<em><b>Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__TIME_TO_LIVE = 1;

	/**
	 * The feature id for the '<em><b>First Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__FIRST_ADDR = 2;

	/**
	 * The feature id for the '<em><b>Register Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__REGISTER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Block Cash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__BLOCK_CASH_NAME = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE__SIZE = 5;

	/**
	 * The number of structural features of the '<em>SGr Time Sync Block Notification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>SGr Time Sync Block Notification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl <em>SGr Version Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrVersionNumberType()
	 * @generated
	 */
	int SGR_VERSION_NUMBER_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Primary Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Secondary Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Sub Release Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>SGr Version Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_VERSION_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SGr Version Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_VERSION_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TCPDevInstanceTypeImpl <em>TCP Dev Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TCPDevInstanceTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTCPDevInstanceType()
	 * @generated
	 */
	int TCP_DEV_INSTANCE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Dev Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_DEV_INSTANCE_TYPE__DEV_INST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dev Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_DEV_INSTANCE_TYPE__DEV_ADDR = 1;

	/**
	 * The number of structural features of the '<em>TCP Dev Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_DEV_INSTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCP Dev Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_DEV_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TCPtrspSrvInstanceTypeImpl <em>TC Ptrsp Srv Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TCPtrspSrvInstanceTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTCPtrspSrvInstanceType()
	 * @generated
	 */
	int TC_PTRSP_SRV_INSTANCE_TYPE = 58;

	/**
	 * The number of structural features of the '<em>TC Ptrsp Srv Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PTRSP_SRV_INSTANCE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>TC Ptrsp Srv Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PTRSP_SRV_INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TCPTypeImpl <em>TCP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TCPTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTCPType()
	 * @generated
	 */
	int TCP_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Tcp Trsp Srv Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TYPE__TCP_TRSP_SRV_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Tcp Dev Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TYPE__TCP_DEV_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>TCP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TPIPModbusImpl <em>TPIP Modbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TPIPModbusImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTPIPModbus()
	 * @generated
	 */
	int TPIP_MODBUS = 60;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_MODBUS__PORT = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_MODBUS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Slave ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_MODBUS__SLAVE_ID = 2;

	/**
	 * The number of structural features of the '<em>TPIP Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_MODBUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TPIP Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_MODBUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TPipV4genAddrTypeImpl <em>TPip V4gen Addr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TPipV4genAddrTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTPipV4genAddrType()
	 * @generated
	 */
	int TPIP_V4GEN_ADDR_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Ip V4port Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR = 0;

	/**
	 * The feature id for the '<em><b>Ip V4n1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE__IP_V4N1 = 1;

	/**
	 * The feature id for the '<em><b>Ip V4n2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE__IP_V4N2 = 2;

	/**
	 * The feature id for the '<em><b>Ip V4n3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE__IP_V4N3 = 3;

	/**
	 * The feature id for the '<em><b>Ip V4n4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE__IP_V4N4 = 4;

	/**
	 * The number of structural features of the '<em>TPip V4gen Addr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TPip V4gen Addr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V4GEN_ADDR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TPipV6genAddrTypeImpl <em>TPip V6gen Addr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TPipV6genAddrTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTPipV6genAddrType()
	 * @generated
	 */
	int TPIP_V6GEN_ADDR_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Prelim String Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V6GEN_ADDR_TYPE__PRELIM_STRING_DEF = 0;

	/**
	 * The number of structural features of the '<em>TPip V6gen Addr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V6GEN_ADDR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TPip V6gen Addr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_V6GEN_ADDR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl <em>TPRTU Modbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TPRTUModbusImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTPRTUModbus()
	 * @generated
	 */
	int TPRTU_MODBUS = 63;

	/**
	 * The feature id for the '<em><b>Slave Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__SLAVE_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Baud Rate Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__BAUD_RATE_SELECTED = 1;

	/**
	 * The feature id for the '<em><b>Byte Len Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__BYTE_LEN_SELECTED = 2;

	/**
	 * The feature id for the '<em><b>Parity Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__PARITY_SELECTED = 3;

	/**
	 * The feature id for the '<em><b>Stop Bit Len Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__STOP_BIT_LEN_SELECTED = 4;

	/**
	 * The feature id for the '<em><b>Serial Interface Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY = 5;

	/**
	 * The number of structural features of the '<em>TPRTU Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TPRTU Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRTU_MODBUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TrspServiceModbusTypeImpl <em>Trsp Service Modbus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TrspServiceModbusTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTrspServiceModbusType()
	 * @generated
	 */
	int TRSP_SERVICE_MODBUS_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Rtu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRSP_SERVICE_MODBUS_TYPE__RTU = 0;

	/**
	 * The feature id for the '<em><b>Tcp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRSP_SERVICE_MODBUS_TYPE__TCP = 1;

	/**
	 * The number of structural features of the '<em>Trsp Service Modbus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRSP_SERVICE_MODBUS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trsp Service Modbus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRSP_SERVICE_MODBUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.TSGrModbusRegisterRefImpl <em>TS Gr Modbus Register Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.TSGrModbusRegisterRefImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTSGrModbusRegisterRef()
	 * @generated
	 */
	int TS_GR_MODBUS_REGISTER_REF = 65;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_GR_MODBUS_REGISTER_REF__ADDR = 0;

	/**
	 * The feature id for the '<em><b>Bit Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_GR_MODBUS_REGISTER_REF__BIT_RANK = 1;

	/**
	 * The feature id for the '<em><b>Register Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>TS Gr Modbus Register Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_GR_MODBUS_REGISTER_REF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TS Gr Modbus Register Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_GR_MODBUS_REGISTER_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.CtaDHWOpModeType <em>Cta DHW Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaDHWOpModeType()
	 * @generated
	 */
	int CTA_DHW_OP_MODE_TYPE = 66;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.EBaudRateType <em>EBaud Rate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEBaudRateType()
	 * @generated
	 */
	int EBAUD_RATE_TYPE = 67;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.EByteLenType <em>EByte Len Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEByteLenType()
	 * @generated
	 */
	int EBYTE_LEN_TYPE = 68;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.EParityType <em>EParity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EParityType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEParityType()
	 * @generated
	 */
	int EPARITY_TYPE = 69;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.EStopBitLenType <em>EStop Bit Len Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEStopBitLenType()
	 * @generated
	 */
	int ESTOP_BIT_LEN_TYPE = 70;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 71;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.LevelOfOperationType <em>Level Of Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getLevelOfOperationType()
	 * @generated
	 */
	int LEVEL_OF_OPERATION_TYPE = 72;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.MasterFunctionsSupportedType <em>Master Functions Supported Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.MasterFunctionsSupportedType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getMasterFunctionsSupportedType()
	 * @generated
	 */
	int MASTER_FUNCTIONS_SUPPORTED_TYPE = 73;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.ModbusInterfaceSelectionType <em>Modbus Interface Selection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ModbusInterfaceSelectionType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getModbusInterfaceSelectionType()
	 * @generated
	 */
	int MODBUS_INTERFACE_SELECTION_TYPE = 74;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.ProfileTypeEnumType <em>Profile Type Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getProfileTypeEnumType()
	 * @generated
	 */
	int PROFILE_TYPE_ENUM_TYPE = 75;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.ResponseQueryType <em>Response Query Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getResponseQueryType()
	 * @generated
	 */
	int RESPONSE_QUERY_TYPE = 76;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrBool2BitRankType <em>SGr Bool2 Bit Rank Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBool2BitRankType()
	 * @generated
	 */
	int SGR_BOOL2_BIT_RANK_TYPE = 77;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrDeviceKindType <em>SGr Device Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceKindType()
	 * @generated
	 */
	int SGR_DEVICE_KIND_TYPE = 78;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrDHWOpModeType <em>SGr DHW Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDHWOpModeType()
	 * @generated
	 */
	int SGR_DHW_OP_MODE_TYPE = 79;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGReadyStateLv1Type <em>SG Ready State Lv1 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv1Type()
	 * @generated
	 */
	int SG_READY_STATE_LV1_TYPE = 80;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGReadyStateLv2Type <em>SG Ready State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv2Type()
	 * @generated
	 */
	int SG_READY_STATE_LV2_TYPE = 81;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVSEStateLv1Type <em>SGr EVSE State Lv1 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv1Type()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV1_TYPE = 82;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVSEStateLv2Type <em>SGr EVSE State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv2Type()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV2_TYPE = 83;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVStateType <em>SGr EV State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVStateType()
	 * @generated
	 */
	int SGR_EV_STATE_TYPE = 84;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHCOpModeType <em>SGr HC Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHCOpModeType()
	 * @generated
	 */
	int SGR_HC_OP_MODE_TYPE = 85;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SgrHCOpStateType <em>Sgr HC Op State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSgrHCOpStateType()
	 * @generated
	 */
	int SGR_HC_OP_STATE_TYPE = 86;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHPActBufferStateType <em>SGr HP Act Buffer State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPActBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPActBufferStateType()
	 * @generated
	 */
	int SGR_HP_ACT_BUFFER_STATE_TYPE = 87;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHPOpModeType <em>SGr HP Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpModeType()
	 * @generated
	 */
	int SGR_HP_OP_MODE_TYPE = 88;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHPOpstateType <em>SGr HP Opstate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpstateType()
	 * @generated
	 */
	int SGR_HP_OPSTATE_TYPE = 89;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrLanguageType <em>SGr Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrLanguageType()
	 * @generated
	 */
	int SGR_LANGUAGE_TYPE = 90;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrManufacturerIDType <em>SGr Manufacturer ID Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrManufacturerIDType()
	 * @generated
	 */
	int SGR_MANUFACTURER_ID_TYPE = 91;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMeasValueSourceType <em>SGr Meas Value Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueSourceType()
	 * @generated
	 */
	int SGR_MEAS_VALUE_SOURCE_TYPE = 92;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMeasValueType <em>SGr Meas Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueType()
	 * @generated
	 */
	int SGR_MEAS_VALUE_TYPE = 93;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrModbusLayer6DeviationType <em>SGr Modbus Layer6 Deviation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusLayer6DeviationType()
	 * @generated
	 */
	int SGR_MODBUS_LAYER6_DEVIATION_TYPE = 94;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType <em>SGr MRO Presence Level Indication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMROPresenceLevelIndicationType()
	 * @generated
	 */
	int SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE = 95;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrObligLvlType <em>SGr Oblig Lvl Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrObligLvlType()
	 * @generated
	 */
	int SGR_OBLIG_LVL_TYPE = 96;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrOCPPStateType <em>SGr OCPP State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrOCPPStateType()
	 * @generated
	 */
	int SGR_OCPP_STATE_TYPE = 97;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrPowerSourceType <em>SGr Power Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPowerSourceType()
	 * @generated
	 */
	int SGR_POWER_SOURCE_TYPE = 98;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrReleaseState <em>SGr Release State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrReleaseState()
	 * @generated
	 */
	int SGR_RELEASE_STATE = 99;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType <em>SGr Rest API Authentication Enum Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIAuthenticationEnumMethodType()
	 * @generated
	 */
	int SGR_REST_API_AUTHENTICATION_ENUM_METHOD_TYPE = 100;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrRestAPIdataTypeType <em>SGr Rest AP Idata Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIdataTypeType()
	 * @generated
	 */
	int SGR_REST_AP_IDATA_TYPE_TYPE = 101;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype <em>SGr Rest API Interface Selectiontype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIInterfaceSelectiontype()
	 * @generated
	 */
	int SGR_REST_API_INTERFACE_SELECTIONTYPE = 102;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrRWPType <em>SGr RWP Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRWPType()
	 * @generated
	 */
	int SGR_RWP_TYPE = 103;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type <em>SGr SGCP Feed In State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPFeedInStateLv2Type()
	 * @generated
	 */
	int SGR_SGCP_FEED_IN_STATE_LV2_TYPE = 104;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type <em>SGr SGCP Load State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPLoadStateLv2Type()
	 * @generated
	 */
	int SGR_SGCP_LOAD_STATE_LV2_TYPE = 105;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPServiceType <em>SGr SGCP Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPServiceType()
	 * @generated
	 */
	int SGR_SGCP_SERVICE_TYPE = 106;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSunspStateCodesType <em>SGr Sunsp State Codes Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSunspStateCodesType()
	 * @generated
	 */
	int SGR_SUNSP_STATE_CODES_TYPE = 107;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrTransportServicesUsedListType <em>SGr Transport Services Used List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrTransportServicesUsedListType()
	 * @generated
	 */
	int SGR_TRANSPORT_SERVICES_USED_LIST_TYPE = 108;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrUnits <em>SGr Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrUnits()
	 * @generated
	 */
	int SGR_UNITS = 109;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.StiHPOpstateStiebelType <em>Sti HP Opstate Stiebel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.StiHPOpstateStiebelType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getStiHPOpstateStiebelType()
	 * @generated
	 */
	int STI_HP_OPSTATE_STIEBEL_TYPE = 110;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SubProfileTypeEnumType <em>Sub Profile Type Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSubProfileTypeEnumType()
	 * @generated
	 */
	int SUB_PROFILE_TYPE_ENUM_TYPE = 111;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.TEnumConversionFct <em>TEnum Conversion Fct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumConversionFct
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumConversionFct()
	 * @generated
	 */
	int TENUM_CONVERSION_FCT = 112;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.TEnumExceptionCodeType <em>TEnum Exception Code Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumExceptionCodeType()
	 * @generated
	 */
	int TENUM_EXCEPTION_CODE_TYPE = 113;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.TEnumObjectType <em>TEnum Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumObjectType()
	 * @generated
	 */
	int TENUM_OBJECT_TYPE = 114;

	/**
	 * The meta object id for the '<em>Bitmask Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getBitmaskType()
	 * @generated
	 */
	int BITMASK_TYPE = 115;

	/**
	 * The meta object id for the '<em>Cta DHW Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaDHWOpModeTypeObject()
	 * @generated
	 */
	int CTA_DHW_OP_MODE_TYPE_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Dp Size Nr Registers Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getDpSizeNrRegistersType()
	 * @generated
	 */
	int DP_SIZE_NR_REGISTERS_TYPE = 117;

	/**
	 * The meta object id for the '<em>Dp Size Nr Registers Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getDpSizeNrRegistersTypeObject()
	 * @generated
	 */
	int DP_SIZE_NR_REGISTERS_TYPE_OBJECT = 118;

	/**
	 * The meta object id for the '<em>EBaud Rate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEBaudRateTypeObject()
	 * @generated
	 */
	int EBAUD_RATE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>EByte Len Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEByteLenTypeObject()
	 * @generated
	 */
	int EBYTE_LEN_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>EParity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EParityType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEParityTypeObject()
	 * @generated
	 */
	int EPARITY_TYPE_OBJECT = 121;

	/**
	 * The meta object id for the '<em>EStop Bit Len Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getEStopBitLenTypeObject()
	 * @generated
	 */
	int ESTOP_BIT_LEN_TYPE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Http Method Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHttpMethodObject()
	 * @generated
	 */
	int HTTP_METHOD_OBJECT = 123;

	/**
	 * The meta object id for the '<em>Ip V4n1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n1Type()
	 * @generated
	 */
	int IP_V4N1_TYPE = 124;

	/**
	 * The meta object id for the '<em>Ip V4n1 Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n1Type1()
	 * @generated
	 */
	int IP_V4N1_TYPE1 = 125;

	/**
	 * The meta object id for the '<em>Ip V4n2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n2Type()
	 * @generated
	 */
	int IP_V4N2_TYPE = 126;

	/**
	 * The meta object id for the '<em>Ip V4n2 Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n2Type1()
	 * @generated
	 */
	int IP_V4N2_TYPE1 = 127;

	/**
	 * The meta object id for the '<em>Ip V4n3 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n3Type()
	 * @generated
	 */
	int IP_V4N3_TYPE = 128;

	/**
	 * The meta object id for the '<em>Ip V4n3 Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n3Type1()
	 * @generated
	 */
	int IP_V4N3_TYPE1 = 129;

	/**
	 * The meta object id for the '<em>Ip V4n4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n4Type()
	 * @generated
	 */
	int IP_V4N4_TYPE = 130;

	/**
	 * The meta object id for the '<em>Ip V4n4 Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4n4Type1()
	 * @generated
	 */
	int IP_V4N4_TYPE1 = 131;

	/**
	 * The meta object id for the '<em>Ip V4port Nr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4portNrType()
	 * @generated
	 */
	int IP_V4PORT_NR_TYPE = 132;

	/**
	 * The meta object id for the '<em>Ip V4port Nr Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getIpV4portNrTypeObject()
	 * @generated
	 */
	int IP_V4PORT_NR_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Level Of Operation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getLevelOfOperationTypeObject()
	 * @generated
	 */
	int LEVEL_OF_OPERATION_TYPE_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Master Functions Supported Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.MasterFunctionsSupportedType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getMasterFunctionsSupportedTypeObject()
	 * @generated
	 */
	int MASTER_FUNCTIONS_SUPPORTED_TYPE_OBJECT = 135;

	/**
	 * The meta object id for the '<em>Modbus Interface Selection Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ModbusInterfaceSelectionType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getModbusInterfaceSelectionTypeObject()
	 * @generated
	 */
	int MODBUS_INTERFACE_SELECTION_TYPE_OBJECT = 136;

	/**
	 * The meta object id for the '<em>Place Holder4future Extensions Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getPlaceHolder4futureExtensionsType()
	 * @generated
	 */
	int PLACE_HOLDER4FUTURE_EXTENSIONS_TYPE = 137;

	/**
	 * The meta object id for the '<em>Prelim String Def Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getPrelimStringDefType()
	 * @generated
	 */
	int PRELIM_STRING_DEF_TYPE = 138;

	/**
	 * The meta object id for the '<em>Profile Type Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getProfileTypeEnumTypeObject()
	 * @generated
	 */
	int PROFILE_TYPE_ENUM_TYPE_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Response Query Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getResponseQueryTypeObject()
	 * @generated
	 */
	int RESPONSE_QUERY_TYPE_OBJECT = 140;

	/**
	 * The meta object id for the '<em>Rest API End Point Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRestAPIEndPointType()
	 * @generated
	 */
	int REST_API_END_POINT_TYPE = 141;

	/**
	 * The meta object id for the '<em>Rest APIJMES Path Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRestAPIJMESPathType()
	 * @generated
	 */
	int REST_APIJMES_PATH_TYPE = 142;

	/**
	 * The meta object id for the '<em>Rest Basic Password Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRestBasicPasswordType()
	 * @generated
	 */
	int REST_BASIC_PASSWORD_TYPE = 143;

	/**
	 * The meta object id for the '<em>Rest Basic Username Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getRestBasicUsernameType()
	 * @generated
	 */
	int REST_BASIC_USERNAME_TYPE = 144;

	/**
	 * The meta object id for the '<em>SGr Bool2 Bit Rank Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBool2BitRankTypeObject()
	 * @generated
	 */
	int SGR_BOOL2_BIT_RANK_TYPE_OBJECT = 145;

	/**
	 * The meta object id for the '<em>SGr Device Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceKindTypeObject()
	 * @generated
	 */
	int SGR_DEVICE_KIND_TYPE_OBJECT = 146;

	/**
	 * The meta object id for the '<em>SGr DHW Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDHWOpModeTypeObject()
	 * @generated
	 */
	int SGR_DHW_OP_MODE_TYPE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>SG Ready State Lv1 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv1TypeObject()
	 * @generated
	 */
	int SG_READY_STATE_LV1_TYPE_OBJECT = 148;

	/**
	 * The meta object id for the '<em>SG Ready State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv2TypeObject()
	 * @generated
	 */
	int SG_READY_STATE_LV2_TYPE_OBJECT = 149;

	/**
	 * The meta object id for the '<em>SGr EVSE State Lv1 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv1TypeObject()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV1_TYPE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>SGr EVSE State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv2TypeObject()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV2_TYPE_OBJECT = 151;

	/**
	 * The meta object id for the '<em>SGr EV State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVStateTypeObject()
	 * @generated
	 */
	int SGR_EV_STATE_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>SGr HC Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHCOpModeTypeObject()
	 * @generated
	 */
	int SGR_HC_OP_MODE_TYPE_OBJECT = 153;

	/**
	 * The meta object id for the '<em>Sgr HC Op State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSgrHCOpStateTypeObject()
	 * @generated
	 */
	int SGR_HC_OP_STATE_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>SGr HP Act Buffer State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPActBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPActBufferStateTypeObject()
	 * @generated
	 */
	int SGR_HP_ACT_BUFFER_STATE_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>SGr HP Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpModeTypeObject()
	 * @generated
	 */
	int SGR_HP_OP_MODE_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>SGr HP Opstate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpstateTypeObject()
	 * @generated
	 */
	int SGR_HP_OPSTATE_TYPE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>SGr Language Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrLanguageTypeObject()
	 * @generated
	 */
	int SGR_LANGUAGE_TYPE_OBJECT = 158;

	/**
	 * The meta object id for the '<em>SGr Manufacturer ID Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrManufacturerIDTypeObject()
	 * @generated
	 */
	int SGR_MANUFACTURER_ID_TYPE_OBJECT = 159;

	/**
	 * The meta object id for the '<em>SGr Meas Value Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueSourceTypeObject()
	 * @generated
	 */
	int SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT = 160;

	/**
	 * The meta object id for the '<em>SGr Meas Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueTypeObject()
	 * @generated
	 */
	int SGR_MEAS_VALUE_TYPE_OBJECT = 161;

	/**
	 * The meta object id for the '<em>SGr Modbus Layer6 Deviation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrModbusLayer6DeviationTypeObject()
	 * @generated
	 */
	int SGR_MODBUS_LAYER6_DEVIATION_TYPE_OBJECT = 162;

	/**
	 * The meta object id for the '<em>SGr MRO Presence Level Indication Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMROPresenceLevelIndicationTypeObject()
	 * @generated
	 */
	int SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT = 163;

	/**
	 * The meta object id for the '<em>SGr Oblig Lvl Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrObligLvlTypeObject()
	 * @generated
	 */
	int SGR_OBLIG_LVL_TYPE_OBJECT = 164;

	/**
	 * The meta object id for the '<em>SGr OCPP State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrOCPPStateTypeObject()
	 * @generated
	 */
	int SGR_OCPP_STATE_TYPE_OBJECT = 165;

	/**
	 * The meta object id for the '<em>SGr Power Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPowerSourceTypeObject()
	 * @generated
	 */
	int SGR_POWER_SOURCE_TYPE_OBJECT = 166;

	/**
	 * The meta object id for the '<em>SGr Precision Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPrecisionType()
	 * @generated
	 */
	int SGR_PRECISION_TYPE = 167;

	/**
	 * The meta object id for the '<em>SGr Precision Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPrecisionTypeObject()
	 * @generated
	 */
	int SGR_PRECISION_TYPE_OBJECT = 168;

	/**
	 * The meta object id for the '<em>SGr Release State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrReleaseStateObject()
	 * @generated
	 */
	int SGR_RELEASE_STATE_OBJECT = 169;

	/**
	 * The meta object id for the '<em>SGr Rest API Authentication Enum Method Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIAuthenticationEnumMethodTypeObject()
	 * @generated
	 */
	int SGR_REST_API_AUTHENTICATION_ENUM_METHOD_TYPE_OBJECT = 170;

	/**
	 * The meta object id for the '<em>SGr Rest AP Idata Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIdataTypeTypeObject()
	 * @generated
	 */
	int SGR_REST_AP_IDATA_TYPE_TYPE_OBJECT = 171;

	/**
	 * The meta object id for the '<em>SGr Rest API Interface Selectiontype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRestAPIInterfaceSelectiontypeObject()
	 * @generated
	 */
	int SGR_REST_API_INTERFACE_SELECTIONTYPE_OBJECT = 172;

	/**
	 * The meta object id for the '<em>SGr RWP Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRWPTypeObject()
	 * @generated
	 */
	int SGR_RWP_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>SGr SGCP Feed In State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPFeedInStateLv2TypeObject()
	 * @generated
	 */
	int SGR_SGCP_FEED_IN_STATE_LV2_TYPE_OBJECT = 174;

	/**
	 * The meta object id for the '<em>SGr SGCP Load State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPLoadStateLv2TypeObject()
	 * @generated
	 */
	int SGR_SGCP_LOAD_STATE_LV2_TYPE_OBJECT = 175;

	/**
	 * The meta object id for the '<em>SGr SGCP Service Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPServiceTypeObject()
	 * @generated
	 */
	int SGR_SGCP_SERVICE_TYPE_OBJECT = 176;

	/**
	 * The meta object id for the '<em>SGr Special Quality Req Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSpecialQualityReqType()
	 * @generated
	 */
	int SGR_SPECIAL_QUALITY_REQ_TYPE = 177;

	/**
	 * The meta object id for the '<em>SGr Sunsp State Codes Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSunspStateCodesTypeObject()
	 * @generated
	 */
	int SGR_SUNSP_STATE_CODES_TYPE_OBJECT = 178;

	/**
	 * The meta object id for the '<em>SGr Transport Services Used List Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrTransportServicesUsedListTypeObject()
	 * @generated
	 */
	int SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT = 179;

	/**
	 * The meta object id for the '<em>SGr Units Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrUnitsObject()
	 * @generated
	 */
	int SGR_UNITS_OBJECT = 180;

	/**
	 * The meta object id for the '<em>Sti HP Opstate Stiebel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.StiHPOpstateStiebelType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getStiHPOpstateStiebelTypeObject()
	 * @generated
	 */
	int STI_HP_OPSTATE_STIEBEL_TYPE_OBJECT = 181;

	/**
	 * The meta object id for the '<em>Sub Profile Type Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSubProfileTypeEnumTypeObject()
	 * @generated
	 */
	int SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT = 182;

	/**
	 * The meta object id for the '<em>TBit Rank</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTBitRank()
	 * @generated
	 */
	int TBIT_RANK = 183;

	/**
	 * The meta object id for the '<em>TBit Rank Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTBitRankObject()
	 * @generated
	 */
	int TBIT_RANK_OBJECT = 184;

	/**
	 * The meta object id for the '<em>TEnum Conversion Fct Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumConversionFct
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumConversionFctObject()
	 * @generated
	 */
	int TENUM_CONVERSION_FCT_OBJECT = 185;

	/**
	 * The meta object id for the '<em>TEnum Exception Code Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumExceptionCodeTypeObject()
	 * @generated
	 */
	int TENUM_EXCEPTION_CODE_TYPE_OBJECT = 186;

	/**
	 * The meta object id for the '<em>TEnum Object Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTEnumObjectTypeObject()
	 * @generated
	 */
	int TENUM_OBJECT_TYPE_OBJECT = 187;

	/**
	 * The meta object id for the '<em>Text Element Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTextElementType()
	 * @generated
	 */
	int TEXT_ELEMENT_TYPE = 188;

	/**
	 * The meta object id for the '<em>TI Pport Nr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTIPportNrType()
	 * @generated
	 */
	int TI_PPORT_NR_TYPE = 189;

	/**
	 * The meta object id for the '<em>TI Pport Nr Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTIPportNrTypeObject()
	 * @generated
	 */
	int TI_PPORT_NR_TYPE_OBJECT = 190;

	/**
	 * The meta object id for the '<em>TSlave ID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTSlaveIDType()
	 * @generated
	 */
	int TSLAVE_ID_TYPE = 191;

	/**
	 * The meta object id for the '<em>TSlave ID Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTSlaveIDTypeObject()
	 * @generated
	 */
	int TSLAVE_ID_TYPE_OBJECT = 192;


	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType <em>Contact API Interface Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact API Interface Desc Type</em>'.
	 * @see com.smartgridready.ns.v0.ContactAPIInterfaceDescType
	 * @generated
	 */
	EClass getContactAPIInterfaceDescType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts <em>Num Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Contacts</em>'.
	 * @see com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getNumContacts()
	 * @see #getContactAPIInterfaceDescType()
	 * @generated
	 */
	EAttribute getContactAPIInterfaceDescType_NumContacts();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Stabilisation Time Ms</em>'.
	 * @see com.smartgridready.ns.v0.ContactAPIInterfaceDescType#getContactStabilisationTimeMs()
	 * @see #getContactAPIInterfaceDescType()
	 * @generated
	 */
	EAttribute getContactAPIInterfaceDescType_ContactStabilisationTimeMs();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.smartgridready.ns.v0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.smartgridready.ns.v0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.DocumentRoot#getBaudRatesSupported <em>Baud Rates Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rates Supported</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getBaudRatesSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BaudRatesSupported();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.DocumentRoot#getByteLenSupported <em>Byte Len Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Len Supported</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getByteLenSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ByteLenSupported();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.DocumentRoot#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modbus Function Codes Supported</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getModbusFunctionCodesSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ModbusFunctionCodesSupported();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getNetConnectionState <em>Net Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net Connection State</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getNetConnectionState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetConnectionState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.DocumentRoot#getParitySupported <em>Parity Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parity Supported</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getParitySupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ParitySupported();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Modbus Data Point Description</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDataPointDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrModbusDataPointDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Modbus Interface Description</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrModbusInterfaceDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrModbusInterfaceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrContactAPIDeviceFrame <em>SGr Contact API Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Contact API Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrContactAPIDeviceFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrContactAPIDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrFunctionalProfileFrame <em>SGr Functional Profile Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Functional Profile Frame</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrFunctionalProfileFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrFunctionalProfileFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrGenDeviceFrame <em>SGr Gen Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Gen Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrGenDeviceFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrGenDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Modbus Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDeviceFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrModbusDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Rest API Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrRestAPIDeviceFrame()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrRestAPIDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrSerialInterfaceCapability <em>SGr Serial Interface Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGr Serial Interface Capability</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getSGrSerialInterfaceCapability()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SGrSerialInterfaceCapability();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.DocumentRoot#getStopBitLenSupported <em>Stop Bit Len Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Bit Len Supported</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getStopBitLenSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StopBitLenSupported();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.DocumentRoot#getTrspServiceModbus <em>Trsp Service Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trsp Service Modbus</em>'.
	 * @see com.smartgridready.ns.v0.DocumentRoot#getTrspServiceModbus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrspServiceModbus();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.FunctionalProfileType <em>Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.FunctionalProfileType
	 * @generated
	 */
	EClass getFunctionalProfileType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.FunctionalProfileType#getProfileNumber <em>Profile Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile Number</em>'.
	 * @see com.smartgridready.ns.v0.FunctionalProfileType#getProfileNumber()
	 * @see #getFunctionalProfileType()
	 * @generated
	 */
	EReference getFunctionalProfileType_ProfileNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpNameList <em>Fp Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fp Name List</em>'.
	 * @see com.smartgridready.ns.v0.FunctionalProfileType#getFpNameList()
	 * @see #getFunctionalProfileType()
	 * @generated
	 */
	EReference getFunctionalProfileType_FpNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpLegibDesc <em>Fp Legib Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp Legib Desc</em>'.
	 * @see com.smartgridready.ns.v0.FunctionalProfileType#getFpLegibDesc()
	 * @see #getFunctionalProfileType()
	 * @generated
	 */
	EReference getFunctionalProfileType_FpLegibDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.FunctionalProfileType#getFpPrgDesc <em>Fp Prg Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp Prg Desc</em>'.
	 * @see com.smartgridready.ns.v0.FunctionalProfileType#getFpPrgDesc()
	 * @see #getFunctionalProfileType()
	 * @generated
	 */
	EReference getFunctionalProfileType_FpPrgDesc();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.HeaderEntry <em>Header Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Entry</em>'.
	 * @see com.smartgridready.ns.v0.HeaderEntry
	 * @generated
	 */
	EClass getHeaderEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.HeaderEntry#getHeaderName <em>Header Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Name</em>'.
	 * @see com.smartgridready.ns.v0.HeaderEntry#getHeaderName()
	 * @see #getHeaderEntry()
	 * @generated
	 */
	EAttribute getHeaderEntry_HeaderName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.HeaderEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.smartgridready.ns.v0.HeaderEntry#getValue()
	 * @see #getHeaderEntry()
	 * @generated
	 */
	EAttribute getHeaderEntry_Value();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.HeaderList <em>Header List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header List</em>'.
	 * @see com.smartgridready.ns.v0.HeaderList
	 * @generated
	 */
	EClass getHeaderList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.HeaderList#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see com.smartgridready.ns.v0.HeaderList#getHeader()
	 * @see #getHeaderList()
	 * @generated
	 */
	EReference getHeaderList_Header();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.IpADDRType <em>Ip ADDR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip ADDR Type</em>'.
	 * @see com.smartgridready.ns.v0.IpADDRType
	 * @generated
	 */
	EClass getIpADDRType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.IpADDRType#getIpV4n1 <em>Ip V4n1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n1</em>'.
	 * @see com.smartgridready.ns.v0.IpADDRType#getIpV4n1()
	 * @see #getIpADDRType()
	 * @generated
	 */
	EAttribute getIpADDRType_IpV4n1();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.IpADDRType#getIpV4n2 <em>Ip V4n2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n2</em>'.
	 * @see com.smartgridready.ns.v0.IpADDRType#getIpV4n2()
	 * @see #getIpADDRType()
	 * @generated
	 */
	EAttribute getIpADDRType_IpV4n2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.IpADDRType#getIpV4n3 <em>Ip V4n3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n3</em>'.
	 * @see com.smartgridready.ns.v0.IpADDRType#getIpV4n3()
	 * @see #getIpADDRType()
	 * @generated
	 */
	EAttribute getIpADDRType_IpV4n3();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.IpADDRType#getIpV4n4 <em>Ip V4n4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n4</em>'.
	 * @see com.smartgridready.ns.v0.IpADDRType#getIpV4n4()
	 * @see #getIpADDRType()
	 * @generated
	 */
	EAttribute getIpADDRType_IpV4n4();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.ModbusJMESPathType <em>Modbus JMES Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modbus JMES Path Type</em>'.
	 * @see com.smartgridready.ns.v0.ModbusJMESPathType
	 * @generated
	 */
	EClass getModbusJMESPathType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.ModbusJMESPathType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.smartgridready.ns.v0.ModbusJMESPathType#getValue()
	 * @see #getModbusJMESPathType()
	 * @generated
	 */
	EAttribute getModbusJMESPathType_Value();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.NetworkConnectionStateType <em>Network Connection State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connection State Type</em>'.
	 * @see com.smartgridready.ns.v0.NetworkConnectionStateType
	 * @generated
	 */
	EClass getNetworkConnectionStateType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.NetworkConnectionStateType#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see com.smartgridready.ns.v0.NetworkConnectionStateType#isIsConnected()
	 * @see #getNetworkConnectionStateType()
	 * @generated
	 */
	EAttribute getNetworkConnectionStateType_IsConnected();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.NetworkConnectionStateType#getNextAttempt <em>Next Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Attempt</em>'.
	 * @see com.smartgridready.ns.v0.NetworkConnectionStateType#getNextAttempt()
	 * @see #getNetworkConnectionStateType()
	 * @generated
	 */
	EAttribute getNetworkConnectionStateType_NextAttempt();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.ResponseQuery <em>Response Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Query</em>'.
	 * @see com.smartgridready.ns.v0.ResponseQuery
	 * @generated
	 */
	EClass getResponseQuery();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.ResponseQuery#getQueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Type</em>'.
	 * @see com.smartgridready.ns.v0.ResponseQuery#getQueryType()
	 * @see #getResponseQuery()
	 * @generated
	 */
	EAttribute getResponseQuery_QueryType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.ResponseQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.smartgridready.ns.v0.ResponseQuery#getQuery()
	 * @see #getResponseQuery()
	 * @generated
	 */
	EAttribute getResponseQuery_Query();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.RestServiceCall <em>Rest Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service Call</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall
	 * @generated
	 */
	EClass getRestServiceCall();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestHeader <em>Request Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Header</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall#getRequestHeader()
	 * @see #getRestServiceCall()
	 * @generated
	 */
	EReference getRestServiceCall_RequestHeader();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestMethod <em>Request Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Method</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall#getRequestMethod()
	 * @see #getRestServiceCall()
	 * @generated
	 */
	EAttribute getRestServiceCall_RequestMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestPath <em>Request Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Path</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall#getRequestPath()
	 * @see #getRestServiceCall()
	 * @generated
	 */
	EAttribute getRestServiceCall_RequestPath();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RestServiceCall#getRequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Body</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall#getRequestBody()
	 * @see #getRestServiceCall()
	 * @generated
	 */
	EAttribute getRestServiceCall_RequestBody();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.RestServiceCall#getResponseQuery <em>Response Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Query</em>'.
	 * @see com.smartgridready.ns.v0.RestServiceCall#getResponseQuery()
	 * @see #getRestServiceCall()
	 * @generated
	 */
	EReference getRestServiceCall_ResponseQuery();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.RTUDevInstanceType <em>RTU Dev Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTU Dev Instance Type</em>'.
	 * @see com.smartgridready.ns.v0.RTUDevInstanceType
	 * @generated
	 */
	EClass getRTUDevInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUDevInstanceType#getDeviceInstName <em>Device Inst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Inst Name</em>'.
	 * @see com.smartgridready.ns.v0.RTUDevInstanceType#getDeviceInstName()
	 * @see #getRTUDevInstanceType()
	 * @generated
	 */
	EAttribute getRTUDevInstanceType_DeviceInstName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUDevInstanceType#getSlaveAddr <em>Slave Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slave Addr</em>'.
	 * @see com.smartgridready.ns.v0.RTUDevInstanceType#getSlaveAddr()
	 * @see #getRTUDevInstanceType()
	 * @generated
	 */
	EAttribute getRTUDevInstanceType_SlaveAddr();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType <em>RT Utrsp Srv Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Utrsp Srv Instance Type</em>'.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType
	 * @generated
	 */
	EClass getRTUtrspSrvInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getBaudRate()
	 * @see #getRTUtrspSrvInstanceType()
	 * @generated
	 */
	EAttribute getRTUtrspSrvInstanceType_BaudRate();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getByteLen <em>Byte Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Len</em>'.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getByteLen()
	 * @see #getRTUtrspSrvInstanceType()
	 * @generated
	 */
	EAttribute getRTUtrspSrvInstanceType_ByteLen();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getParity <em>Parity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parity</em>'.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getParity()
	 * @see #getRTUtrspSrvInstanceType()
	 * @generated
	 */
	EAttribute getRTUtrspSrvInstanceType_Parity();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getStopBitLen <em>Stop Bit Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Bit Len</em>'.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType#getStopBitLen()
	 * @see #getRTUtrspSrvInstanceType()
	 * @generated
	 */
	EAttribute getRTUtrspSrvInstanceType_StopBitLen();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.RTUType <em>RTU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTU Type</em>'.
	 * @see com.smartgridready.ns.v0.RTUType
	 * @generated
	 */
	EClass getRTUType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.RTUType#getRtuTrspSrvInstance <em>Rtu Trsp Srv Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtu Trsp Srv Instance</em>'.
	 * @see com.smartgridready.ns.v0.RTUType#getRtuTrspSrvInstance()
	 * @see #getRTUType()
	 * @generated
	 */
	EReference getRTUType_RtuTrspSrvInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.RTUType#getRtuDevInstance <em>Rtu Dev Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtu Dev Instance</em>'.
	 * @see com.smartgridready.ns.v0.RTUType#getRtuDevInstance()
	 * @see #getRTUType()
	 * @generated
	 */
	EReference getRTUType_RtuDevInstance();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType <em>SGr Access Protection Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Access Protection Enabled Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrAccessProtectionEnabledType
	 * @generated
	 */
	EClass getSGrAccessProtectionEnabledType();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#getModbusException <em>Modbus Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modbus Exception</em>'.
	 * @see com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#getModbusException()
	 * @see #getSGrAccessProtectionEnabledType()
	 * @generated
	 */
	EAttribute getSGrAccessProtectionEnabledType_ModbusException();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled <em>Is Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enabled</em>'.
	 * @see com.smartgridready.ns.v0.SGrAccessProtectionEnabledType#isIsEnabled()
	 * @see #getSGrAccessProtectionEnabledType()
	 * @generated
	 */
	EAttribute getSGrAccessProtectionEnabledType_IsEnabled();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrAttr4GenericType <em>SGr Attr4 Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Attr4 Generic Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType
	 * @generated
	 */
	EClass getSGrAttr4GenericType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxVal()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMinVal()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getSpecQualityRequirement <em>Spec Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Quality Requirement</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getSpecQualityRequirement()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_SpecQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getPrecision()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_Precision();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getStabilityFallback <em>Stability Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stability Fallback</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getStabilityFallback()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EReference getSGrAttr4GenericType_StabilityFallback();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getSmoothTransition <em>Smooth Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Smooth Transition</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getSmoothTransition()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EReference getSGrAttr4GenericType_SmoothTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxLatencyTimeMs <em>Max Latency Time Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Latency Time Ms</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxLatencyTimeMs()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MaxLatencyTimeMs();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getValueType()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Source</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getValueSource()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_ValueSource();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getSampleRate <em>Sample Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Rate</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getSampleRate()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_SampleRate();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getCurtailment <em>Curtailment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtailment</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getCurtailment()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_Curtailment();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMinLoad <em>Min Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Load</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMinLoad()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MinLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxLockTimeMinutes <em>Max Lock Time Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lock Time Minutes</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMaxLockTimeMinutes()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MaxLockTimeMinutes();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getMinRunTimeMinutes <em>Min Run Time Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Run Time Minutes</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getMinRunTimeMinutes()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_MinRunTimeMinutes();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getValueByTimeTableMinutes <em>Value By Time Table Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value By Time Table Minutes</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getValueByTimeTableMinutes()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_ValueByTimeTableMinutes();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getFlexAssistance <em>Flex Assistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flex Assistance</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getFlexAssistance()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EReference getSGrAttr4GenericType_FlexAssistance();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType <em>SGr Attr4 Modbus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Attr4 Modbus Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType
	 * @generated
	 */
	EClass getSGrAttr4ModbusType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getScalingByMulPwr <em>Scaling By Mul Pwr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling By Mul Pwr</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getScalingByMulPwr()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EReference getSGrAttr4ModbusType_ScalingByMulPwr();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement <em>Step By Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step By Increment</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getStepByIncrement()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EAttribute getSGrAttr4ModbusType_StepByIncrement();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf <em>Sunssf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sunssf</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getSunssf()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EAttribute getSGrAttr4ModbusType_Sunssf();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS <em>Poll Latency MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poll Latency MS</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getPollLatencyMS()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EAttribute getSGrAttr4ModbusType_PollLatencyMS();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getAccessProtection <em>Access Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Protection</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getAccessProtection()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EReference getSGrAttr4ModbusType_AccessProtection();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation <em>Layer6 Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer6 Deviation</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getLayer6Deviation()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EAttribute getSGrAttr4ModbusType_Layer6Deviation();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopEnumMapper <em>Iop Enum Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iop Enum Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopEnumMapper()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EReference getSGrAttr4ModbusType_IopEnumMapper();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopBitmapMapper <em>Iop Bitmap Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iop Bitmap Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType#getIopBitmapMapper()
	 * @see #getSGrAttr4ModbusType()
	 * @generated
	 */
	EReference getSGrAttr4ModbusType_IopBitmapMapper();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrAttr4RestAPIType <em>SGr Attr4 Rest API Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Attr4 Rest API Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4RestAPIType
	 * @generated
	 */
	EClass getSGrAttr4RestAPIType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4RestAPIType#getPlaceHolder4futureExtensions <em>Place Holder4future Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place Holder4future Extensions</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4RestAPIType#getPlaceHolder4futureExtensions()
	 * @see #getSGrAttr4RestAPIType()
	 * @generated
	 */
	EAttribute getSGrAttr4RestAPIType_PlaceHolder4futureExtensions();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType <em>SGr Basic Gen Data Point Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Basic Gen Data Point Type Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType
	 * @generated
	 */
	EClass getSGrBasicGenDataPointTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum2bitmapIndex <em>Enum2bitmap Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum2bitmap Index</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum2bitmapIndex()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EReference getSGrBasicGenDataPointTypeType_Enum2bitmapIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int8</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int8();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int16</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int16();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int32</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int32();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int64</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int64();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U <em>Int8 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int8 U</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int8U();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U <em>Int16 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int16 U</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int16U();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U <em>Int32 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int32 U</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int32U();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64U <em>Int64 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int64 U</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64U()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Int64U();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32 <em>Float32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float32</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Float32();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64 <em>Float64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float64</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_Float64();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EReference getSGrBasicGenDataPointTypeType_Enum();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getDateTime()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getString()
	 * @see #getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	EAttribute getSGrBasicGenDataPointTypeType_String();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrBitmapperListType <em>SGr Bitmapper List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Bitmapper List Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType
	 * @generated
	 */
	EClass getSGrBitmapperListType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Bool2 Bit Rank</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getSgrBool2BitRank()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_SgrBool2BitRank();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate <em>Sgr HP Opstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr HP Opstate</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPOpstate()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_SgrHPOpstate();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstateStiebel <em>Sti HP Opstate Stiebel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sti HP Opstate Stiebel</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstateStiebel()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_StiHPOpstateStiebel();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate <em>Sgr HC Opstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr HC Opstate</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHCOpstate()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_SgrHCOpstate();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPActBufferState <em>Sgr HP Act Buffer State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr HP Act Buffer State</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getSgrHPActBufferState()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_SgrHPActBufferState();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrChangeLog <em>SGr Change Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Change Log</em>'.
	 * @see com.smartgridready.ns.v0.SGrChangeLog
	 * @generated
	 */
	EClass getSGrChangeLog();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrChangeLog#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.smartgridready.ns.v0.SGrChangeLog#getVersion()
	 * @see #getSGrChangeLog()
	 * @generated
	 */
	EAttribute getSGrChangeLog_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrChangeLog#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.smartgridready.ns.v0.SGrChangeLog#getDate()
	 * @see #getSGrChangeLog()
	 * @generated
	 */
	EAttribute getSGrChangeLog_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrChangeLog#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.smartgridready.ns.v0.SGrChangeLog#getAuthor()
	 * @see #getSGrChangeLog()
	 * @generated
	 */
	EAttribute getSGrChangeLog_Author();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrChangeLog#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.smartgridready.ns.v0.SGrChangeLog#getComment()
	 * @see #getSGrChangeLog()
	 * @generated
	 */
	EAttribute getSGrChangeLog_Comment();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame <em>SGr Contact API Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Contact API Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.SGrContactAPIDeviceFrame
	 * @generated
	 */
	EClass getSGrContactAPIDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Api Interface Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getContactApiInterfaceDesc()
	 * @see #getSGrContactAPIDeviceFrame()
	 * @generated
	 */
	EReference getSGrContactAPIDeviceFrame_ContactApiInterfaceDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getFpListElement <em>Fp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrContactAPIDeviceFrame#getFpListElement()
	 * @see #getSGrContactAPIDeviceFrame()
	 * @generated
	 */
	EReference getSGrContactAPIDeviceFrame_FpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType <em>SGr Contact API Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Contact API Functional Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType
	 * @generated
	 */
	EClass getSGrContactAPIFunctionalProfileType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType#getDpListElement <em>Dp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrContactAPIFunctionalProfileType#getDpListElement()
	 * @see #getSGrContactAPIFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrContactAPIFunctionalProfileType_DpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrDataPointBaseType <em>SGr Data Point Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Data Point Base Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointBaseType
	 * @generated
	 */
	EClass getSGrDataPointBaseType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDataPointBaseType#getDataPoint <em>Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Point</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointBaseType#getDataPoint()
	 * @see #getSGrDataPointBaseType()
	 * @generated
	 */
	EReference getSGrDataPointBaseType_DataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrDataPointBaseType#getGenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Attribute</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointBaseType#getGenAttribute()
	 * @see #getSGrDataPointBaseType()
	 * @generated
	 */
	EReference getSGrDataPointBaseType_GenAttribute();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType <em>SGr Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Data Point Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType
	 * @generated
	 */
	EClass getSGrDataPointDescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getBasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Data Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getBasicDataType()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrDataPointDescriptionType_BasicDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getArrLen <em>Arr Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arr Len</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getArrLen()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrDataPointDescriptionType_ArrLen();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpNameList <em>Dp Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dp Name List</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpNameList()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrDataPointDescriptionType_DpNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpLegibDesc <em>Dp Legib Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp Legib Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpLegibDesc()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrDataPointDescriptionType_DpLegibDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpPrgDesc <em>Dp Prg Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp Prg Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpPrgDesc()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrDataPointDescriptionType_DpPrgDesc();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDatapointName <em>Datapoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datapoint Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDatapointName()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrDataPointDescriptionType_DatapointName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mro Visibility Indicator</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrDataPointDescriptionType_MroVisibilityIndicator();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection <em>Rwp Datadirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwp Datadirection</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrDataPointDescriptionType_RwpDatadirection();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit()
	 * @see #getSGrDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrDataPointDescriptionType_Unit();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrDeviceBaseType <em>SGr Device Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Device Base Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType
	 * @generated
	 */
	EClass getSGrDeviceBaseType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getReleaseNotes <em>Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Notes</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getReleaseNotes()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EReference getSGrDeviceBaseType_ReleaseNotes();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceProfile <em>Device Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Profile</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceProfile()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EReference getSGrDeviceBaseType_DeviceProfile();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getGenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Attribute</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getGenAttribute()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EReference getSGrDeviceBaseType_GenAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceName()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EAttribute getSGrDeviceBaseType_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl <em>Is Local Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local Control</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EAttribute getSGrDeviceBaseType_IsLocalControl();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID <em>Manufacturer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer ID</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EAttribute getSGrDeviceBaseType_ManufacturerID();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerName <em>Manufacturer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerName()
	 * @see #getSGrDeviceBaseType()
	 * @generated
	 */
	EAttribute getSGrDeviceBaseType_ManufacturerName();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrDeviceProfileType <em>SGr Device Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Device Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType
	 * @generated
	 */
	EClass getSGrDeviceProfileType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getDevNameList <em>Dev Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dev Name List</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getDevNameList()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EReference getSGrDeviceProfileType_DevNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getDevLegibDesc <em>Dev Legib Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dev Legib Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getDevLegibDesc()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EReference getSGrDeviceProfileType_DevLegibDesc();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getTransportService <em>Transport Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Service</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getTransportService()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_TransportService();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getDeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Kind</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getDeviceKind()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_DeviceKind();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getSerialNumber()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_SerialNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getSoftwareRevision <em>Software Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Revision</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getSoftwareRevision()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EReference getSGrDeviceProfileType_SoftwareRevision();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getHardwareRevision <em>Hardware Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hardware Revision</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getHardwareRevision()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EReference getSGrDeviceProfileType_HardwareRevision();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getBrandName <em>Brand Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getBrandName()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_BrandName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getPowerSource <em>Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Source</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getPowerSource()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_PowerSource();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getNominalPower <em>Nominal Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Power</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getNominalPower()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_NominalPower();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getManufSpecIdent <em>Manuf Spec Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manuf Spec Ident</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getManufSpecIdent()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_ManufSpecIdent();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getManufacturerLabel <em>Manufacturer Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer Label</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getManufacturerLabel()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_ManufacturerLabel();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getRemAuthorID <em>Rem Author ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rem Author ID</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getRemAuthorID()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_RemAuthorID();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getDevLevelofOperation <em>Dev Levelof Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Levelof Operation</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getDevLevelofOperation()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EAttribute getSGrDeviceProfileType_DevLevelofOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrDeviceProfileType#getDevPrgDesc <em>Dev Prg Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dev Prg Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType#getDevPrgDesc()
	 * @see #getSGrDeviceProfileType()
	 * @generated
	 */
	EReference getSGrDeviceProfileType_DevPrgDesc();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrEnumListType <em>SGr Enum List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Enum List Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType
	 * @generated
	 */
	EClass getSGrEnumListType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Meas Value Source</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrMeasValueSource()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrMeasValueSource();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource <em>Sgr Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Power Source</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrPowerSource()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrPowerSource();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2 <em>Sgready State Lv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgready State Lv2</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv2()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgreadyStateLv2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1 <em>Sgready State Lv1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgready State Lv1</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgreadyStateLv1()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgreadyStateLv1();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Sunsp State Codes</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrSunspStateCodes()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrSunspStateCodes();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr EVSE State Lv2</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv2()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrEVSEStateLv2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr EVSE State Lv1</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrEVSEStateLv1()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrEVSEStateLv1();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr SGCP Load State Lv2</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPLoadStateLv2()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrSGCPLoadStateLv2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr SGCP Feed In State Lv2</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPFeedInStateLv2()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrSGCPFeedInStateLv2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState <em>Sgr EV State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr EV State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrEVState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrEVState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService <em>Sgr SGCP Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr SGCP Service</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrSGCPService()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrSGCPService();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl <em>Sgr Oblig Lvl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Oblig Lvl</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrObligLvl()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrObligLvl();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState <em>Sgr OCPP State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr OCPP State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrOCPPState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrOCPPState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode <em>Sgr HP Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr HP Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrHPOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrHPOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode <em>Sgr HC Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr HC Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrHCOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrHCOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode <em>Sgr DHW Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr DHW Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getSgrDHWOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_SgrDHWOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode <em>Cta DHW Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cta DHW Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getCtaDHWOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_CtaDHWOpMode();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType <em>SGr Flex Assistance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Flex Assistance Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrFlexAssistanceType
	 * @generated
	 */
	EClass getSGrFlexAssistanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists <em>Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assists</em>'.
	 * @see com.smartgridready.ns.v0.SGrFlexAssistanceType#getAssists()
	 * @see #getSGrFlexAssistanceType()
	 * @generated
	 */
	EAttribute getSGrFlexAssistanceType_Assists();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo <em>Obliged To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obliged To</em>'.
	 * @see com.smartgridready.ns.v0.SGrFlexAssistanceType#getObligedTo()
	 * @see #getSGrFlexAssistanceType()
	 * @generated
	 */
	EAttribute getSGrFlexAssistanceType_ObligedTo();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType <em>SGr Functional Profile Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Functional Profile Base Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileBaseType
	 * @generated
	 */
	EClass getSGrFunctionalProfileBaseType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getFunctionalProfile <em>Functional Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Profile</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getFunctionalProfile()
	 * @see #getSGrFunctionalProfileBaseType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileBaseType_FunctionalProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getGenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Attribute</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileBaseType#getGenAttribute()
	 * @see #getSGrFunctionalProfileBaseType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileBaseType_GenAttribute();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType <em>SGr Functional Profile Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Functional Profile Frame Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileFrameType
	 * @generated
	 */
	EClass getSGrFunctionalProfileFrameType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getReleaseNotes <em>Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Notes</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getReleaseNotes()
	 * @see #getSGrFunctionalProfileFrameType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileFrameType_ReleaseNotes();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getFunctionalProfile <em>Functional Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Profile</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getFunctionalProfile()
	 * @see #getSGrFunctionalProfileFrameType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileFrameType_FunctionalProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getGenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Attribute</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getGenAttribute()
	 * @see #getSGrFunctionalProfileFrameType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileFrameType_GenAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getDpListElement <em>Dp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileFrameType#getDpListElement()
	 * @see #getSGrFunctionalProfileFrameType()
	 * @generated
	 */
	EReference getSGrFunctionalProfileFrameType_DpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrGenDeviceFrame <em>SGr Gen Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Gen Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.SGrGenDeviceFrame
	 * @generated
	 */
	EClass getSGrGenDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrGenDeviceFrame#getFpListElement <em>Fp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrGenDeviceFrame#getFpListElement()
	 * @see #getSGrGenDeviceFrame()
	 * @generated
	 */
	EReference getSGrGenDeviceFrame_FpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrGenFunctionalProfileType <em>SGr Gen Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Gen Functional Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrGenFunctionalProfileType
	 * @generated
	 */
	EClass getSGrGenFunctionalProfileType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrGenFunctionalProfileType#getDpListElement <em>Dp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrGenFunctionalProfileType#getDpListElement()
	 * @see #getSGrGenFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrGenFunctionalProfileType_DpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType <em>SGr Legib Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Legib Documentation Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType
	 * @generated
	 */
	EClass getSGrLegibDocumentationType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getTextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType#getTextElement()
	 * @see #getSGrLegibDocumentationType()
	 * @generated
	 */
	EAttribute getSGrLegibDocumentationType_TextElement();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage()
	 * @see #getSGrLegibDocumentationType()
	 * @generated
	 */
	EAttribute getSGrLegibDocumentationType_Language();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType#getUri()
	 * @see #getSGrLegibDocumentationType()
	 * @generated
	 */
	EAttribute getSGrLegibDocumentationType_Uri();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusBitmapMapperType <em>SGr Modbus Bitmap Mapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Bitmap Mapper Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusBitmapMapperType
	 * @generated
	 */
	EClass getSGrModbusBitmapMapperType();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getModbusBitMapper <em>Modbus Bit Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modbus Bit Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getModbusBitMapper()
	 * @see #getSGrModbusBitmapMapperType()
	 * @generated
	 */
	EAttribute getSGrModbusBitmapMapperType_ModbusBitMapper();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getGenBitMapper <em>Gen Bit Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gen Bit Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getGenBitMapper()
	 * @see #getSGrModbusBitmapMapperType()
	 * @generated
	 */
	EAttribute getSGrModbusBitmapMapperType_GenBitMapper();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType <em>SGr Modbus Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Data Point Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType
	 * @generated
	 */
	EClass getSGrModbusDataPointDescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusDataType <em>Modbus Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus Data Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusDataType()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrModbusDataPointDescriptionType_ModbusDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getArrLen <em>Arr Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arr Len</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getArrLen()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointDescriptionType_ArrLen();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusFirstRegisterReference <em>Modbus First Register Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus First Register Reference</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusFirstRegisterReference()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrModbusDataPointDescriptionType_ModbusFirstRegisterReference();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dp Size Nr Registers</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointDescriptionType_DpSizeNrRegisters();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getBitmask <em>Bitmask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bitmask</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getBitmask()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointDescriptionType_Bitmask();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getMasterFunctionsSupported <em>Master Functions Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Master Functions Supported</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getMasterFunctionsSupported()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointDescriptionType_MasterFunctionsSupported();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusJMESPath <em>Modbus JMES Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus JMES Path</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusJMESPath()
	 * @see #getSGrModbusDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrModbusDataPointDescriptionType_ModbusJMESPath();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusDataPointType <em>SGr Modbus Data Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Data Point Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType
	 * @generated
	 */
	EClass getSGrModbusDataPointType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusDataPoint <em>Modbus Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modbus Data Point</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusDataPoint()
	 * @see #getSGrModbusDataPointType()
	 * @generated
	 */
	EReference getSGrModbusDataPointType_ModbusDataPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime <em>Last Access Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Access Time</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType#getLastAccessTime()
	 * @see #getSGrModbusDataPointType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointType_LastAccessTime();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive <em>Time To Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Live</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType#getTimeToLive()
	 * @see #getSGrModbusDataPointType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointType_TimeToLive();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getBlockCashName <em>Block Cash Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Cash Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType#getBlockCashName()
	 * @see #getSGrModbusDataPointType()
	 * @generated
	 */
	EAttribute getSGrModbusDataPointType_BlockCashName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusAttr <em>Modbus Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modbus Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusAttr()
	 * @see #getSGrModbusDataPointType()
	 * @generated
	 */
	EReference getSGrModbusDataPointType_ModbusAttr();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame
	 * @generated
	 */
	EClass getSGrModbusDeviceFrame();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusAttr <em>Modbus Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusAttr()
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	EReference getSGrModbusDeviceFrame_ModbusAttr();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus Interface Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusInterfaceDesc()
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	EReference getSGrModbusDeviceFrame_ModbusInterfaceDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getFpListElement <em>Fp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame#getFpListElement()
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	EReference getSGrModbusDeviceFrame_FpListElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Sync Block Notification</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame#getTimeSyncBlockNotification()
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	EReference getSGrModbusDeviceFrame_TimeSyncBlockNotification();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getNetworkConnectionState <em>Network Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Connection State</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceFrame#getNetworkConnectionState()
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	EReference getSGrModbusDeviceFrame_NetworkConnectionState();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusEnumMapperType <em>SGr Modbus Enum Mapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Enum Mapper Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusEnumMapperType
	 * @generated
	 */
	EClass getSGrModbusEnumMapperType();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusEnumMapperType#getModbusEnumMapper <em>Modbus Enum Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modbus Enum Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusEnumMapperType#getModbusEnumMapper()
	 * @see #getSGrModbusEnumMapperType()
	 * @generated
	 */
	EAttribute getSGrModbusEnumMapperType_ModbusEnumMapper();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusEnumMapperType#getGenEnumMapper <em>Gen Enum Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gen Enum Mapper</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusEnumMapperType#getGenEnumMapper()
	 * @see #getSGrModbusEnumMapperType()
	 * @generated
	 */
	EAttribute getSGrModbusEnumMapperType_GenEnumMapper();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType <em>SGr Modbus Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Functional Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusFunctionalProfileType
	 * @generated
	 */
	EClass getSGrModbusFunctionalProfileType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getModbusAttr <em>Modbus Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modbus Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getModbusAttr()
	 * @see #getSGrModbusFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrModbusFunctionalProfileType_ModbusAttr();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getDpListElement <em>Dp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusFunctionalProfileType#getDpListElement()
	 * @see #getSGrModbusFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrModbusFunctionalProfileType_DpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType <em>SGr Modbus Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Modbus Interface Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType
	 * @generated
	 */
	EClass getSGrModbusInterfaceDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection <em>Modbus Interface Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modbus Interface Selection</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getModbusInterfaceSelection()
	 * @see #getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusInterfaceDescriptionType_ModbusInterfaceSelection();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusTCPoutOfBox <em>Trsp Srv Modbus TC Pout Of Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trsp Srv Modbus TC Pout Of Box</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusTCPoutOfBox()
	 * @see #getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrModbusInterfaceDescriptionType_TrspSrvModbusTCPoutOfBox();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusRTUoutOfBox <em>Trsp Srv Modbus RT Uout Of Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trsp Srv Modbus RT Uout Of Box</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getTrspSrvModbusRTUoutOfBox()
	 * @see #getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrModbusInterfaceDescriptionType_TrspSrvModbusRTUoutOfBox();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne <em>First Register Address Is One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Register Address Is One</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#isFirstRegisterAddressIsOne()
	 * @see #getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusInterfaceDescriptionType_FirstRegisterAddressIsOne();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getConversionScheme <em>Conversion Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conversion Scheme</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType#getConversionScheme()
	 * @see #getSGrModbusInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrModbusInterfaceDescriptionType_ConversionScheme();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrNamelistType <em>SGr Namelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Namelist Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType
	 * @generated
	 */
	EClass getSGrNamelistType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSLV1Name <em>SLV1 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SLV1 Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSLV1Name()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SLV1Name();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSWorkName <em>SWork Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SWork Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSWorkName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SWorkName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSManufName <em>SManuf Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SManuf Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSManufName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SManufName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSIEC61850Name <em>SIEC61850 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIEC61850 Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSIEC61850Name()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SIEC61850Name();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSSAREFName <em>SSAREF Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSAREF Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSSAREFName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SSAREFName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSEEBUSName <em>SEEBUS Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SEEBUS Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSEEBUSName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SEEBUSName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSSUNSPECName <em>SSUNSPEC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSUNSPEC Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSSUNSPECName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SSUNSPECName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSHPbwpName <em>SH Pbwp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SH Pbwp Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSHPbwpName()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SHPbwpName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrNamelistType#getSEN17609Name <em>SEN17609 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SEN17609 Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrNamelistType#getSEN17609Name()
	 * @see #getSGrNamelistType()
	 * @generated
	 */
	EAttribute getSGrNamelistType_SEN17609Name();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType <em>SGr Profile Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Profile Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType
	 * @generated
	 */
	EClass getSGrProfileDescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileNumber <em>Profile Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileNumber()
	 * @see #getSGrProfileDescriptionType()
	 * @generated
	 */
	EReference getSGrProfileDescriptionType_ProfileNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpNameList <em>Fp Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fp Name List</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpNameList()
	 * @see #getSGrProfileDescriptionType()
	 * @generated
	 */
	EReference getSGrProfileDescriptionType_FpNameList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpLegibDesc <em>Fp Legib Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp Legib Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpLegibDesc()
	 * @see #getSGrProfileDescriptionType()
	 * @generated
	 */
	EReference getSGrProfileDescriptionType_FpLegibDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpPrgDesc <em>Fp Prg Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp Prg Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType#getFpPrgDesc()
	 * @see #getSGrProfileDescriptionType()
	 * @generated
	 */
	EReference getSGrProfileDescriptionType_FpPrgDesc();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileName <em>Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType#getProfileName()
	 * @see #getSGrProfileDescriptionType()
	 * @generated
	 */
	EAttribute getSGrProfileDescriptionType_ProfileName();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrProfilenumberType <em>SGr Profilenumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Profilenumber Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType
	 * @generated
	 */
	EClass getSGrProfilenumberType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrProfilenumberType#getSpecsOwnerId <em>Specs Owner Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specs Owner Id</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType#getSpecsOwnerId()
	 * @see #getSGrProfilenumberType()
	 * @generated
	 */
	EAttribute getSGrProfilenumberType_SpecsOwnerId();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrProfilenumberType#getProfileIdentification <em>Profile Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Identification</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType#getProfileIdentification()
	 * @see #getSGrProfilenumberType()
	 * @generated
	 */
	EAttribute getSGrProfilenumberType_ProfileIdentification();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrProfilenumberType#getSubProfileIdent <em>Sub Profile Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Profile Ident</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType#getSubProfileIdent()
	 * @see #getSGrProfilenumberType()
	 * @generated
	 */
	EAttribute getSGrProfilenumberType_SubProfileIdent();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgr Level Of Operation</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType#getSgrLevelOfOperation()
	 * @see #getSGrProfilenumberType()
	 * @generated
	 */
	EAttribute getSGrProfilenumberType_SgrLevelOfOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrProfilenumberType#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType#getVersionNumber()
	 * @see #getSGrProfilenumberType()
	 * @generated
	 */
	EReference getSGrProfilenumberType_VersionNumber();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrReleaseNotes <em>SGr Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Release Notes</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseNotes
	 * @generated
	 */
	EClass getSGrReleaseNotes();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseNotes#getState()
	 * @see #getSGrReleaseNotes()
	 * @generated
	 */
	EAttribute getSGrReleaseNotes_State();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseNotes#getRemarks()
	 * @see #getSGrReleaseNotes()
	 * @generated
	 */
	EAttribute getSGrReleaseNotes_Remarks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrReleaseNotes#getChangelog <em>Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changelog</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseNotes#getChangelog()
	 * @see #getSGrReleaseNotes()
	 * @generated
	 */
	EReference getSGrReleaseNotes_Changelog();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType <em>SG Rrest API Bearer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SG Rrest API Bearer Type</em>'.
	 * @see com.smartgridready.ns.v0.SGRrestAPIBearerType
	 * @generated
	 */
	EClass getSGRrestAPIBearerType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Call</em>'.
	 * @see com.smartgridready.ns.v0.SGRrestAPIBearerType#getServiceCall()
	 * @see #getSGRrestAPIBearerType()
	 * @generated
	 */
	EReference getSGRrestAPIBearerType_ServiceCall();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType <em>SGr Rest API Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest API Data Point Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType
	 * @generated
	 */
	EClass getSGrRestAPIDataPointDescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getRestServiceCall <em>Rest Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest Service Call</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getRestServiceCall()
	 * @see #getSGrRestAPIDataPointDescriptionType()
	 * @generated
	 */
	EReference getSGrRestAPIDataPointDescriptionType_RestServiceCall();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType#getDataType()
	 * @see #getSGrRestAPIDataPointDescriptionType()
	 * @generated
	 */
	EAttribute getSGrRestAPIDataPointDescriptionType_DataType();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointType <em>SGr Rest API Data Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest API Data Point Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointType
	 * @generated
	 */
	EClass getSGrRestAPIDataPointType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIDataPoint <em>Rest API Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest API Data Point</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIDataPoint()
	 * @see #getSGrRestAPIDataPointType()
	 * @generated
	 */
	EReference getSGrRestAPIDataPointType_RestAPIDataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIAttr <em>Rest API Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest API Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointType#getRestAPIAttr()
	 * @see #getSGrRestAPIDataPointType()
	 * @generated
	 */
	EReference getSGrRestAPIDataPointType_RestAPIAttr();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest API Device Frame</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDeviceFrame
	 * @generated
	 */
	EClass getSGrRestAPIDeviceFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIAttr <em>Rest API Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest API Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIAttr()
	 * @see #getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	EReference getSGrRestAPIDeviceFrame_RestAPIAttr();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest API Interface Desc</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getRestAPIInterfaceDesc()
	 * @see #getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	EReference getSGrRestAPIDeviceFrame_RestAPIInterfaceDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getFpListElement <em>Fp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDeviceFrame#getFpListElement()
	 * @see #getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	EReference getSGrRestAPIDeviceFrame_FpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType <em>SGr Rest API Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest API Functional Profile Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType
	 * @generated
	 */
	EClass getSGrRestAPIFunctionalProfileType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType#getRestAPIAttr <em>Rest API Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest API Attr</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType#getRestAPIAttr()
	 * @see #getSGrRestAPIFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrRestAPIFunctionalProfileType_RestAPIAttr();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType#getDpListElement <em>Dp List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dp List Element</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType#getDpListElement()
	 * @see #getSGrRestAPIFunctionalProfileType()
	 * @generated
	 */
	EReference getSGrRestAPIFunctionalProfileType_DpListElement();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType <em>SGr Rest API Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest API Interface Description Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType
	 * @generated
	 */
	EClass getSGrRestAPIInterfaceDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest API Interface Selection</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrRestAPIInterfaceDescriptionType_RestAPIInterfaceSelection();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV4outOfBox <em>Trsp Srv Rest TCPV 4out Of Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trsp Srv Rest TCPV 4out Of Box</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV4outOfBox()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV4outOfBox();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV6outOfBox <em>Trsp Srv Rest TCPV 6out Of Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trsp Srv Rest TCPV 6out Of Box</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV6outOfBox()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV6outOfBox();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestURIoutOfBox <em>Trsp Srv Rest UR Iout Of Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trsp Srv Rest UR Iout Of Box</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestURIoutOfBox()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrRestAPIInterfaceDescriptionType_TrspSrvRestURIoutOfBox();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest API Authentication Method</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EAttribute getSGrRestAPIInterfaceDescriptionType_RestAPIAuthenticationMethod();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBearer <em>Rest API Bearer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest API Bearer</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBearer()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrRestAPIInterfaceDescriptionType_RestAPIBearer();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBasic <em>Rest API Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest API Basic</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBasic()
	 * @see #getSGrRestAPIInterfaceDescriptionType()
	 * @generated
	 */
	EReference getSGrRestAPIInterfaceDescriptionType_RestAPIBasic();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrRestBasicType <em>SGr Rest Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Rest Basic Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestBasicType
	 * @generated
	 */
	EClass getSGrRestBasicType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestBasicType#getRestBasicUsername <em>Rest Basic Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest Basic Username</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestBasicType#getRestBasicUsername()
	 * @see #getSGrRestBasicType()
	 * @generated
	 */
	EAttribute getSGrRestBasicType_RestBasicUsername();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrRestBasicType#getRestBasicPassword <em>Rest Basic Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest Basic Password</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestBasicType#getRestBasicPassword()
	 * @see #getSGrRestBasicType()
	 * @generated
	 */
	EAttribute getSGrRestBasicType_RestBasicPassword();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrScalingType <em>SGr Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Scaling Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrScalingType
	 * @generated
	 */
	EClass getSGrScalingType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrScalingType#getMultiplicator <em>Multiplicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicator</em>'.
	 * @see com.smartgridready.ns.v0.SGrScalingType#getMultiplicator()
	 * @see #getSGrScalingType()
	 * @generated
	 */
	EAttribute getSGrScalingType_Multiplicator();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrScalingType#getPowerof10 <em>Powerof10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Powerof10</em>'.
	 * @see com.smartgridready.ns.v0.SGrScalingType#getPowerof10()
	 * @see #getSGrScalingType()
	 * @generated
	 */
	EAttribute getSGrScalingType_Powerof10();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType <em>SGr Serial Interface Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Serial Interface Capability Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType
	 * @generated
	 */
	EClass getSGrSerialInterfaceCapabilityType();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getBaudRatesSupported <em>Baud Rates Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Baud Rates Supported</em>'.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getBaudRatesSupported()
	 * @see #getSGrSerialInterfaceCapabilityType()
	 * @generated
	 */
	EAttribute getSGrSerialInterfaceCapabilityType_BaudRatesSupported();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getByteLenSupported <em>Byte Len Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Len Supported</em>'.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getByteLenSupported()
	 * @see #getSGrSerialInterfaceCapabilityType()
	 * @generated
	 */
	EAttribute getSGrSerialInterfaceCapabilityType_ByteLenSupported();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getParitySupported <em>Parity Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parity Supported</em>'.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getParitySupported()
	 * @see #getSGrSerialInterfaceCapabilityType()
	 * @generated
	 */
	EAttribute getSGrSerialInterfaceCapabilityType_ParitySupported();

	/**
	 * Returns the meta object for the attribute list '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getStopBitLenSupported <em>Stop Bit Len Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stop Bit Len Supported</em>'.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType#getStopBitLenSupported()
	 * @see #getSGrSerialInterfaceCapabilityType()
	 * @generated
	 */
	EAttribute getSGrSerialInterfaceCapabilityType_StopBitLenSupported();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType <em>SGr Smooth Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Smooth Transition Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType
	 * @generated
	 */
	EClass getSGrSmoothTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType#getWinTms <em>Win Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Tms</em>'.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType#getWinTms()
	 * @see #getSGrSmoothTransitionType()
	 * @generated
	 */
	EAttribute getSGrSmoothTransitionType_WinTms();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType#getRvrtTms <em>Rvrt Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rvrt Tms</em>'.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType#getRvrtTms()
	 * @see #getSGrSmoothTransitionType()
	 * @generated
	 */
	EAttribute getSGrSmoothTransitionType_RvrtTms();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType#getRmpTms <em>Rmp Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rmp Tms</em>'.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType#getRmpTms()
	 * @see #getSGrSmoothTransitionType()
	 * @generated
	 */
	EAttribute getSGrSmoothTransitionType_RmpTms();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType <em>SGr Stability Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Stability Fallback Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType
	 * @generated
	 */
	EClass getSGrStabilityFallbackType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType#getMaxReceiveTime <em>Max Receive Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Receive Time</em>'.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType#getMaxReceiveTime()
	 * @see #getSGrStabilityFallbackType()
	 * @generated
	 */
	EAttribute getSGrStabilityFallbackType_MaxReceiveTime();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Value</em>'.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType#getInitValue()
	 * @see #getSGrStabilityFallbackType()
	 * @generated
	 */
	EAttribute getSGrStabilityFallbackType_InitValue();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType#getFallbackValue <em>Fallback Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallback Value</em>'.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType#getFallbackValue()
	 * @see #getSGrStabilityFallbackType()
	 * @generated
	 */
	EAttribute getSGrStabilityFallbackType_FallbackValue();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType <em>SGr Time Sync Block Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Time Sync Block Notification Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType
	 * @generated
	 */
	EClass getSGrTimeSyncBlockNotificationType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime <em>Last Access Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Access Time</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_LastAccessTime();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive <em>Time To Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Live</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_TimeToLive();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getFirstAddr <em>First Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Addr</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getFirstAddr()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_FirstAddr();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType <em>Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_RegisterType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getBlockCashName <em>Block Cash Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Cash Name</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getBlockCashName()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_BlockCashName();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize()
	 * @see #getSGrTimeSyncBlockNotificationType()
	 * @generated
	 */
	EAttribute getSGrTimeSyncBlockNotificationType_Size();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.SGrVersionNumberType <em>SGr Version Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGr Version Number Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType
	 * @generated
	 */
	EClass getSGrVersionNumberType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrVersionNumberType#getPrimaryVersionNumber <em>Primary Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Version Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType#getPrimaryVersionNumber()
	 * @see #getSGrVersionNumberType()
	 * @generated
	 */
	EAttribute getSGrVersionNumberType_PrimaryVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrVersionNumberType#getSecondaryVersionNumber <em>Secondary Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Version Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType#getSecondaryVersionNumber()
	 * @see #getSGrVersionNumberType()
	 * @generated
	 */
	EAttribute getSGrVersionNumberType_SecondaryVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrVersionNumberType#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Release Version Number</em>'.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType#getSubReleaseVersionNumber()
	 * @see #getSGrVersionNumberType()
	 * @generated
	 */
	EAttribute getSGrVersionNumberType_SubReleaseVersionNumber();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TCPDevInstanceType <em>TCP Dev Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP Dev Instance Type</em>'.
	 * @see com.smartgridready.ns.v0.TCPDevInstanceType
	 * @generated
	 */
	EClass getTCPDevInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TCPDevInstanceType#getDevInstName <em>Dev Inst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Inst Name</em>'.
	 * @see com.smartgridready.ns.v0.TCPDevInstanceType#getDevInstName()
	 * @see #getTCPDevInstanceType()
	 * @generated
	 */
	EAttribute getTCPDevInstanceType_DevInstName();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TCPDevInstanceType#getDevAddr <em>Dev Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dev Addr</em>'.
	 * @see com.smartgridready.ns.v0.TCPDevInstanceType#getDevAddr()
	 * @see #getTCPDevInstanceType()
	 * @generated
	 */
	EReference getTCPDevInstanceType_DevAddr();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TCPtrspSrvInstanceType <em>TC Ptrsp Srv Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Ptrsp Srv Instance Type</em>'.
	 * @see com.smartgridready.ns.v0.TCPtrspSrvInstanceType
	 * @generated
	 */
	EClass getTCPtrspSrvInstanceType();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TCPType <em>TCP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP Type</em>'.
	 * @see com.smartgridready.ns.v0.TCPType
	 * @generated
	 */
	EClass getTCPType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TCPType#getTcpTrspSrvInstance <em>Tcp Trsp Srv Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tcp Trsp Srv Instance</em>'.
	 * @see com.smartgridready.ns.v0.TCPType#getTcpTrspSrvInstance()
	 * @see #getTCPType()
	 * @generated
	 */
	EReference getTCPType_TcpTrspSrvInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.smartgridready.ns.v0.TCPType#getTcpDevInstance <em>Tcp Dev Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tcp Dev Instance</em>'.
	 * @see com.smartgridready.ns.v0.TCPType#getTcpDevInstance()
	 * @see #getTCPType()
	 * @generated
	 */
	EReference getTCPType_TcpDevInstance();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TPIPModbus <em>TPIP Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPIP Modbus</em>'.
	 * @see com.smartgridready.ns.v0.TPIPModbus
	 * @generated
	 */
	EClass getTPIPModbus();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPIPModbus#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.smartgridready.ns.v0.TPIPModbus#getPort()
	 * @see #getTPIPModbus()
	 * @generated
	 */
	EAttribute getTPIPModbus_Port();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TPIPModbus#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see com.smartgridready.ns.v0.TPIPModbus#getAddress()
	 * @see #getTPIPModbus()
	 * @generated
	 */
	EReference getTPIPModbus_Address();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPIPModbus#getSlaveID <em>Slave ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slave ID</em>'.
	 * @see com.smartgridready.ns.v0.TPIPModbus#getSlaveID()
	 * @see #getTPIPModbus()
	 * @generated
	 */
	EAttribute getTPIPModbus_SlaveID();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TPipV4genAddrType <em>TPip V4gen Addr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPip V4gen Addr Type</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType
	 * @generated
	 */
	EClass getTPipV4genAddrType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4portNr <em>Ip V4port Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4port Nr</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4portNr()
	 * @see #getTPipV4genAddrType()
	 * @generated
	 */
	EAttribute getTPipV4genAddrType_IpV4portNr();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n1 <em>Ip V4n1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n1</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n1()
	 * @see #getTPipV4genAddrType()
	 * @generated
	 */
	EAttribute getTPipV4genAddrType_IpV4n1();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n2 <em>Ip V4n2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n2</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n2()
	 * @see #getTPipV4genAddrType()
	 * @generated
	 */
	EAttribute getTPipV4genAddrType_IpV4n2();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n3 <em>Ip V4n3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n3</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n3()
	 * @see #getTPipV4genAddrType()
	 * @generated
	 */
	EAttribute getTPipV4genAddrType_IpV4n3();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n4 <em>Ip V4n4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip V4n4</em>'.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType#getIpV4n4()
	 * @see #getTPipV4genAddrType()
	 * @generated
	 */
	EAttribute getTPipV4genAddrType_IpV4n4();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TPipV6genAddrType <em>TPip V6gen Addr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPip V6gen Addr Type</em>'.
	 * @see com.smartgridready.ns.v0.TPipV6genAddrType
	 * @generated
	 */
	EClass getTPipV6genAddrType();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPipV6genAddrType#getPrelimStringDef <em>Prelim String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prelim String Def</em>'.
	 * @see com.smartgridready.ns.v0.TPipV6genAddrType#getPrelimStringDef()
	 * @see #getTPipV6genAddrType()
	 * @generated
	 */
	EAttribute getTPipV6genAddrType_PrelimStringDef();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TPRTUModbus <em>TPRTU Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPRTU Modbus</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus
	 * @generated
	 */
	EClass getTPRTUModbus();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr <em>Slave Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slave Addr</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getSlaveAddr()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EAttribute getTPRTUModbus_SlaveAddr();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected <em>Baud Rate Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate Selected</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getBaudRateSelected()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EAttribute getTPRTUModbus_BaudRateSelected();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected <em>Byte Len Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Len Selected</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getByteLenSelected()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EAttribute getTPRTUModbus_ByteLenSelected();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPRTUModbus#getParitySelected <em>Parity Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parity Selected</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getParitySelected()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EAttribute getTPRTUModbus_ParitySelected();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected <em>Stop Bit Len Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Bit Len Selected</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getStopBitLenSelected()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EAttribute getTPRTUModbus_StopBitLenSelected();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TPRTUModbus#getSerialInterfaceCapability <em>Serial Interface Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serial Interface Capability</em>'.
	 * @see com.smartgridready.ns.v0.TPRTUModbus#getSerialInterfaceCapability()
	 * @see #getTPRTUModbus()
	 * @generated
	 */
	EReference getTPRTUModbus_SerialInterfaceCapability();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TrspServiceModbusType <em>Trsp Service Modbus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trsp Service Modbus Type</em>'.
	 * @see com.smartgridready.ns.v0.TrspServiceModbusType
	 * @generated
	 */
	EClass getTrspServiceModbusType();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TrspServiceModbusType#getRtu <em>Rtu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtu</em>'.
	 * @see com.smartgridready.ns.v0.TrspServiceModbusType#getRtu()
	 * @see #getTrspServiceModbusType()
	 * @generated
	 */
	EReference getTrspServiceModbusType_Rtu();

	/**
	 * Returns the meta object for the containment reference '{@link com.smartgridready.ns.v0.TrspServiceModbusType#getTcp <em>Tcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tcp</em>'.
	 * @see com.smartgridready.ns.v0.TrspServiceModbusType#getTcp()
	 * @see #getTrspServiceModbusType()
	 * @generated
	 */
	EReference getTrspServiceModbusType_Tcp();

	/**
	 * Returns the meta object for class '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef <em>TS Gr Modbus Register Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Gr Modbus Register Ref</em>'.
	 * @see com.smartgridready.ns.v0.TSGrModbusRegisterRef
	 * @generated
	 */
	EClass getTSGrModbusRegisterRef();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see com.smartgridready.ns.v0.TSGrModbusRegisterRef#getAddr()
	 * @see #getTSGrModbusRegisterRef()
	 * @generated
	 */
	EAttribute getTSGrModbusRegisterRef_Addr();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank <em>Bit Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Rank</em>'.
	 * @see com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank()
	 * @see #getTSGrModbusRegisterRef()
	 * @generated
	 */
	EAttribute getTSGrModbusRegisterRef_BitRank();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType <em>Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Type</em>'.
	 * @see com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType()
	 * @see #getTSGrModbusRegisterRef()
	 * @generated
	 */
	EAttribute getTSGrModbusRegisterRef_RegisterType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.CtaDHWOpModeType <em>Cta DHW Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cta DHW Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @generated
	 */
	EEnum getCtaDHWOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.EBaudRateType <em>EBaud Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBaud Rate Type</em>'.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @generated
	 */
	EEnum getEBaudRateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.EByteLenType <em>EByte Len Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EByte Len Type</em>'.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @generated
	 */
	EEnum getEByteLenType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.EParityType <em>EParity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EParity Type</em>'.
	 * @see com.smartgridready.ns.v0.EParityType
	 * @generated
	 */
	EEnum getEParityType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.EStopBitLenType <em>EStop Bit Len Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStop Bit Len Type</em>'.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @generated
	 */
	EEnum getEStopBitLenType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.LevelOfOperationType <em>Level Of Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level Of Operation Type</em>'.
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @generated
	 */
	EEnum getLevelOfOperationType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.MasterFunctionsSupportedType <em>Master Functions Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Master Functions Supported Type</em>'.
	 * @see com.smartgridready.ns.v0.MasterFunctionsSupportedType
	 * @generated
	 */
	EEnum getMasterFunctionsSupportedType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.ModbusInterfaceSelectionType <em>Modbus Interface Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modbus Interface Selection Type</em>'.
	 * @see com.smartgridready.ns.v0.ModbusInterfaceSelectionType
	 * @generated
	 */
	EEnum getModbusInterfaceSelectionType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.ProfileTypeEnumType <em>Profile Type Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Type Enum Type</em>'.
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @generated
	 */
	EEnum getProfileTypeEnumType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.ResponseQueryType <em>Response Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Query Type</em>'.
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @generated
	 */
	EEnum getResponseQueryType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrBool2BitRankType <em>SGr Bool2 Bit Rank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Bool2 Bit Rank Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @generated
	 */
	EEnum getSGrBool2BitRankType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrDeviceKindType <em>SGr Device Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Device Kind Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @generated
	 */
	EEnum getSGrDeviceKindType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrDHWOpModeType <em>SGr DHW Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr DHW Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @generated
	 */
	EEnum getSGrDHWOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGReadyStateLv1Type <em>SG Ready State Lv1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SG Ready State Lv1 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @generated
	 */
	EEnum getSGReadyStateLv1Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGReadyStateLv2Type <em>SG Ready State Lv2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SG Ready State Lv2 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @generated
	 */
	EEnum getSGReadyStateLv2Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrEVSEStateLv1Type <em>SGr EVSE State Lv1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr EVSE State Lv1 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @generated
	 */
	EEnum getSGrEVSEStateLv1Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrEVSEStateLv2Type <em>SGr EVSE State Lv2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr EVSE State Lv2 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @generated
	 */
	EEnum getSGrEVSEStateLv2Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrEVStateType <em>SGr EV State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr EV State Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @generated
	 */
	EEnum getSGrEVStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrHCOpModeType <em>SGr HC Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr HC Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @generated
	 */
	EEnum getSGrHCOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SgrHCOpStateType <em>Sgr HC Op State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sgr HC Op State Type</em>'.
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @generated
	 */
	EEnum getSgrHCOpStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrHPActBufferStateType <em>SGr HP Act Buffer State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr HP Act Buffer State Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPActBufferStateType
	 * @generated
	 */
	EEnum getSGrHPActBufferStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrHPOpModeType <em>SGr HP Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr HP Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @generated
	 */
	EEnum getSGrHPOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrHPOpstateType <em>SGr HP Opstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr HP Opstate Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @generated
	 */
	EEnum getSGrHPOpstateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrLanguageType <em>SGr Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Language Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @generated
	 */
	EEnum getSGrLanguageType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrManufacturerIDType <em>SGr Manufacturer ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Manufacturer ID Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @generated
	 */
	EEnum getSGrManufacturerIDType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrMeasValueSourceType <em>SGr Meas Value Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Meas Value Source Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @generated
	 */
	EEnum getSGrMeasValueSourceType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrMeasValueType <em>SGr Meas Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Meas Value Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @generated
	 */
	EEnum getSGrMeasValueType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrModbusLayer6DeviationType <em>SGr Modbus Layer6 Deviation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Modbus Layer6 Deviation Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @generated
	 */
	EEnum getSGrModbusLayer6DeviationType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType <em>SGr MRO Presence Level Indication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr MRO Presence Level Indication Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @generated
	 */
	EEnum getSGrMROPresenceLevelIndicationType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrObligLvlType <em>SGr Oblig Lvl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Oblig Lvl Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @generated
	 */
	EEnum getSGrObligLvlType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrOCPPStateType <em>SGr OCPP State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr OCPP State Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @generated
	 */
	EEnum getSGrOCPPStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrPowerSourceType <em>SGr Power Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Power Source Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @generated
	 */
	EEnum getSGrPowerSourceType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrReleaseState <em>SGr Release State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Release State</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @generated
	 */
	EEnum getSGrReleaseState();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType <em>SGr Rest API Authentication Enum Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Rest API Authentication Enum Method Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @generated
	 */
	EEnum getSGrRestAPIAuthenticationEnumMethodType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrRestAPIdataTypeType <em>SGr Rest AP Idata Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Rest AP Idata Type Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @generated
	 */
	EEnum getSGrRestAPIdataTypeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype <em>SGr Rest API Interface Selectiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Rest API Interface Selectiontype</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @generated
	 */
	EEnum getSGrRestAPIInterfaceSelectiontype();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrRWPType <em>SGr RWP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr RWP Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @generated
	 */
	EEnum getSGrRWPType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type <em>SGr SGCP Feed In State Lv2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr SGCP Feed In State Lv2 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @generated
	 */
	EEnum getSGrSGCPFeedInStateLv2Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type <em>SGr SGCP Load State Lv2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr SGCP Load State Lv2 Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @generated
	 */
	EEnum getSGrSGCPLoadStateLv2Type();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrSGCPServiceType <em>SGr SGCP Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr SGCP Service Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @generated
	 */
	EEnum getSGrSGCPServiceType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrSunspStateCodesType <em>SGr Sunsp State Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Sunsp State Codes Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @generated
	 */
	EEnum getSGrSunspStateCodesType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrTransportServicesUsedListType <em>SGr Transport Services Used List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Transport Services Used List Type</em>'.
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @generated
	 */
	EEnum getSGrTransportServicesUsedListType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SGrUnits <em>SGr Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SGr Units</em>'.
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @generated
	 */
	EEnum getSGrUnits();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.StiHPOpstateStiebelType <em>Sti HP Opstate Stiebel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sti HP Opstate Stiebel Type</em>'.
	 * @see com.smartgridready.ns.v0.StiHPOpstateStiebelType
	 * @generated
	 */
	EEnum getStiHPOpstateStiebelType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.SubProfileTypeEnumType <em>Sub Profile Type Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Profile Type Enum Type</em>'.
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @generated
	 */
	EEnum getSubProfileTypeEnumType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.TEnumConversionFct <em>TEnum Conversion Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TEnum Conversion Fct</em>'.
	 * @see com.smartgridready.ns.v0.TEnumConversionFct
	 * @generated
	 */
	EEnum getTEnumConversionFct();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.TEnumExceptionCodeType <em>TEnum Exception Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TEnum Exception Code Type</em>'.
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @generated
	 */
	EEnum getTEnumExceptionCodeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.TEnumObjectType <em>TEnum Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TEnum Object Type</em>'.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @generated
	 */
	EEnum getTEnumObjectType();

	/**
	 * Returns the meta object for data type '<em>Bitmask Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bitmask Type</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='bitmaskType' baseType='http://www.eclipse.org/emf/2003/XMLType#hexBinary'"
	 * @generated
	 */
	EDataType getBitmaskType();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.CtaDHWOpModeType <em>Cta DHW Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cta DHW Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.CtaDHWOpModeType"
	 *        extendedMetaData="name='ctaDHWOpModeType:Object' baseType='ctaDHWOpModeType'"
	 * @generated
	 */
	EDataType getCtaDHWOpModeTypeObject();

	/**
	 * Returns the meta object for data type '<em>Dp Size Nr Registers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dp Size Nr Registers Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='dpSizeNrRegisters_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getDpSizeNrRegistersType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Dp Size Nr Registers Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dp Size Nr Registers Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='dpSizeNrRegisters_._type:Object' baseType='dpSizeNrRegisters_._type'"
	 * @generated
	 */
	EDataType getDpSizeNrRegistersTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.EBaudRateType <em>EBaud Rate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBaud Rate Type Object</em>'.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @model instanceClass="com.smartgridready.ns.v0.EBaudRateType"
	 *        extendedMetaData="name='eBaudRateType:Object' baseType='eBaudRateType'"
	 * @generated
	 */
	EDataType getEBaudRateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.EByteLenType <em>EByte Len Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Len Type Object</em>'.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @model instanceClass="com.smartgridready.ns.v0.EByteLenType"
	 *        extendedMetaData="name='eByteLenType:Object' baseType='eByteLenType'"
	 * @generated
	 */
	EDataType getEByteLenTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.EParityType <em>EParity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EParity Type Object</em>'.
	 * @see com.smartgridready.ns.v0.EParityType
	 * @model instanceClass="com.smartgridready.ns.v0.EParityType"
	 *        extendedMetaData="name='eParityType:Object' baseType='eParityType'"
	 * @generated
	 */
	EDataType getEParityTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.EStopBitLenType <em>EStop Bit Len Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EStop Bit Len Type Object</em>'.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @model instanceClass="com.smartgridready.ns.v0.EStopBitLenType"
	 *        extendedMetaData="name='eStopBitLenType:Object' baseType='eStopBitLenType'"
	 * @generated
	 */
	EDataType getEStopBitLenTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HttpMethod <em>Http Method Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Http Method Object</em>'.
	 * @see com.smartgridready.ns.v0.HttpMethod
	 * @model instanceClass="com.smartgridready.ns.v0.HttpMethod"
	 *        extendedMetaData="name='HttpMethod:Object' baseType='HttpMethod'"
	 * @generated
	 */
	EDataType getHttpMethodObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n1 Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n1 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n1 Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n1_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n1Type1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n2 Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n2Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n2 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n2 Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n2_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n2Type1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n3 Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n3Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n3 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n3 Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n3_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n3Type1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n4 Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n4_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n4Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ip V4n4 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4n4 Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ipV4n4_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='255'"
	 * @generated
	 */
	EDataType getIpV4n4Type1();

	/**
	 * Returns the meta object for data type '<em>Ip V4port Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4port Nr Type</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='ipV4portNr_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedInt'"
	 * @generated
	 */
	EDataType getIpV4portNrType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Ip V4port Nr Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4port Nr Type Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='ipV4portNr_._type:Object' baseType='ipV4portNr_._type'"
	 * @generated
	 */
	EDataType getIpV4portNrTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.LevelOfOperationType <em>Level Of Operation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Level Of Operation Type Object</em>'.
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @model instanceClass="com.smartgridready.ns.v0.LevelOfOperationType"
	 *        extendedMetaData="name='LevelOfOperationType:Object' baseType='LevelOfOperationType'"
	 * @generated
	 */
	EDataType getLevelOfOperationTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.MasterFunctionsSupportedType <em>Master Functions Supported Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Master Functions Supported Type Object</em>'.
	 * @see com.smartgridready.ns.v0.MasterFunctionsSupportedType
	 * @model instanceClass="com.smartgridready.ns.v0.MasterFunctionsSupportedType"
	 *        extendedMetaData="name='masterFunctionsSupportedType:Object' baseType='masterFunctionsSupportedType'"
	 * @generated
	 */
	EDataType getMasterFunctionsSupportedTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.ModbusInterfaceSelectionType <em>Modbus Interface Selection Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modbus Interface Selection Type Object</em>'.
	 * @see com.smartgridready.ns.v0.ModbusInterfaceSelectionType
	 * @model instanceClass="com.smartgridready.ns.v0.ModbusInterfaceSelectionType"
	 *        extendedMetaData="name='ModbusInterfaceSelectionType:Object' baseType='ModbusInterfaceSelectionType'"
	 * @generated
	 */
	EDataType getModbusInterfaceSelectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Place Holder4future Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Place Holder4future Extensions Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='placeHolder4futureExtensions_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPlaceHolder4futureExtensionsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Prelim String Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prelim String Def Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='prelimStringDef_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPrelimStringDefType();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.ProfileTypeEnumType <em>Profile Type Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Profile Type Enum Type Object</em>'.
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @model instanceClass="com.smartgridready.ns.v0.ProfileTypeEnumType"
	 *        extendedMetaData="name='ProfileTypeEnumType:Object' baseType='ProfileTypeEnumType'"
	 * @generated
	 */
	EDataType getProfileTypeEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.ResponseQueryType <em>Response Query Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Response Query Type Object</em>'.
	 * @see com.smartgridready.ns.v0.ResponseQueryType
	 * @model instanceClass="com.smartgridready.ns.v0.ResponseQueryType"
	 *        extendedMetaData="name='ResponseQueryType:Object' baseType='ResponseQueryType'"
	 * @generated
	 */
	EDataType getResponseQueryTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rest API End Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rest API End Point Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='restAPIEndPointType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRestAPIEndPointType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rest APIJMES Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rest APIJMES Path Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='restAPIJMESPathType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRestAPIJMESPathType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rest Basic Password Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rest Basic Password Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='restBasicPasswordType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRestBasicPasswordType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rest Basic Username Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rest Basic Username Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='restBasicUsernameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRestBasicUsernameType();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrBool2BitRankType <em>SGr Bool2 Bit Rank Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Bool2 Bit Rank Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrBool2BitRankType"
	 *        extendedMetaData="name='SGrBool2BitRankType:Object' baseType='SGrBool2BitRankType'"
	 * @generated
	 */
	EDataType getSGrBool2BitRankTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrDeviceKindType <em>SGr Device Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Device Kind Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrDeviceKindType"
	 *        extendedMetaData="name='SGrDeviceKindType:Object' baseType='SGrDeviceKindType'"
	 * @generated
	 */
	EDataType getSGrDeviceKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrDHWOpModeType <em>SGr DHW Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr DHW Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrDHWOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrDHWOpModeType"
	 *        extendedMetaData="name='SGrDHWOpModeType:Object' baseType='SGrDHWOpModeType'"
	 * @generated
	 */
	EDataType getSGrDHWOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGReadyStateLv1Type <em>SG Ready State Lv1 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SG Ready State Lv1 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGReadyStateLv1Type"
	 *        extendedMetaData="name='SGReadyStateLv1Type:Object' baseType='SGReadyStateLv1Type'"
	 * @generated
	 */
	EDataType getSGReadyStateLv1TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGReadyStateLv2Type <em>SG Ready State Lv2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SG Ready State Lv2 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGReadyStateLv2Type"
	 *        extendedMetaData="name='SGReadyStateLv2Type:Object' baseType='SGReadyStateLv2Type'"
	 * @generated
	 */
	EDataType getSGReadyStateLv2TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrEVSEStateLv1Type <em>SGr EVSE State Lv1 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr EVSE State Lv1 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGrEVSEStateLv1Type"
	 *        extendedMetaData="name='SGrEVSEStateLv1Type:Object' baseType='SGrEVSEStateLv1Type'"
	 * @generated
	 */
	EDataType getSGrEVSEStateLv1TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrEVSEStateLv2Type <em>SGr EVSE State Lv2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr EVSE State Lv2 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGrEVSEStateLv2Type"
	 *        extendedMetaData="name='SGrEVSEStateLv2Type:Object' baseType='SGrEVSEStateLv2Type'"
	 * @generated
	 */
	EDataType getSGrEVSEStateLv2TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrEVStateType <em>SGr EV State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr EV State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrEVStateType"
	 *        extendedMetaData="name='SGrEVStateType:Object' baseType='SGrEVStateType'"
	 * @generated
	 */
	EDataType getSGrEVStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrHCOpModeType <em>SGr HC Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr HC Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrHCOpModeType"
	 *        extendedMetaData="name='SGrHCOpModeType:Object' baseType='SGrHCOpModeType'"
	 * @generated
	 */
	EDataType getSGrHCOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SgrHCOpStateType <em>Sgr HC Op State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sgr HC Op State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @model instanceClass="com.smartgridready.ns.v0.SgrHCOpStateType"
	 *        extendedMetaData="name='sgrHCOpStateType:Object' baseType='sgrHCOpStateType'"
	 * @generated
	 */
	EDataType getSgrHCOpStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrHPActBufferStateType <em>SGr HP Act Buffer State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr HP Act Buffer State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPActBufferStateType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrHPActBufferStateType"
	 *        extendedMetaData="name='SGrHPActBufferStateType:Object' baseType='SGrHPActBufferStateType'"
	 * @generated
	 */
	EDataType getSGrHPActBufferStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrHPOpModeType <em>SGr HP Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr HP Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrHPOpModeType"
	 *        extendedMetaData="name='SGrHPOpModeType:Object' baseType='SGrHPOpModeType'"
	 * @generated
	 */
	EDataType getSGrHPOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrHPOpstateType <em>SGr HP Opstate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr HP Opstate Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrHPOpstateType"
	 *        extendedMetaData="name='SGrHPOpstateType:Object' baseType='SGrHPOpstateType'"
	 * @generated
	 */
	EDataType getSGrHPOpstateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrLanguageType <em>SGr Language Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Language Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrLanguageType"
	 *        extendedMetaData="name='SGrLanguageType:Object' baseType='SGrLanguageType'"
	 * @generated
	 */
	EDataType getSGrLanguageTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrManufacturerIDType <em>SGr Manufacturer ID Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Manufacturer ID Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrManufacturerIDType"
	 *        extendedMetaData="name='SGrManufacturerIDType:Object' baseType='SGrManufacturerIDType'"
	 * @generated
	 */
	EDataType getSGrManufacturerIDTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrMeasValueSourceType <em>SGr Meas Value Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Meas Value Source Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrMeasValueSourceType"
	 *        extendedMetaData="name='SGrMeasValueSourceType:Object' baseType='SGrMeasValueSourceType'"
	 * @generated
	 */
	EDataType getSGrMeasValueSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrMeasValueType <em>SGr Meas Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Meas Value Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrMeasValueType"
	 *        extendedMetaData="name='SGrMeasValueType:Object' baseType='SGrMeasValueType'"
	 * @generated
	 */
	EDataType getSGrMeasValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrModbusLayer6DeviationType <em>SGr Modbus Layer6 Deviation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Modbus Layer6 Deviation Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrModbusLayer6DeviationType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrModbusLayer6DeviationType"
	 *        extendedMetaData="name='SGrModbusLayer6DeviationType:Object' baseType='SGrModbusLayer6DeviationType'"
	 * @generated
	 */
	EDataType getSGrModbusLayer6DeviationTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType <em>SGr MRO Presence Level Indication Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr MRO Presence Level Indication Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType"
	 *        extendedMetaData="name='SGrMROPresenceLevelIndicationType:Object' baseType='SGrMROPresenceLevelIndicationType'"
	 * @generated
	 */
	EDataType getSGrMROPresenceLevelIndicationTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrObligLvlType <em>SGr Oblig Lvl Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Oblig Lvl Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrObligLvlType"
	 *        extendedMetaData="name='SGrObligLvlType:Object' baseType='SGrObligLvlType'"
	 * @generated
	 */
	EDataType getSGrObligLvlTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrOCPPStateType <em>SGr OCPP State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr OCPP State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrOCPPStateType"
	 *        extendedMetaData="name='SGrOCPPStateType:Object' baseType='SGrOCPPStateType'"
	 * @generated
	 */
	EDataType getSGrOCPPStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrPowerSourceType <em>SGr Power Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Power Source Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrPowerSourceType"
	 *        extendedMetaData="name='SGrPowerSourceType:Object' baseType='SGrPowerSourceType'"
	 * @generated
	 */
	EDataType getSGrPowerSourceTypeObject();

	/**
	 * Returns the meta object for data type '<em>SGr Precision Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  Precision defines the accuracy
     * 				of a data point either related to a measurement value, a simulation
     * 				result or of a setpoint value
     * 			
     *  Der Parameter Präzision
     * 				definiert die Genauigkeit eines Messwertes, einer Simulation oder
     * 				einer Stellgrössenumsetzung
     * 			
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>SGr Precision Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='SGrPrecisionType' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.001' maxInclusive='15'"
	 * @generated
	 */
	EDataType getSGrPrecisionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>SGr Precision Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Precision Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='SGrPrecisionType:Object' baseType='SGrPrecisionType'"
	 * @generated
	 */
	EDataType getSGrPrecisionTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrReleaseState <em>SGr Release State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Release State Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @model instanceClass="com.smartgridready.ns.v0.SGrReleaseState"
	 *        extendedMetaData="name='SGrReleaseState:Object' baseType='SGrReleaseState'"
	 * @generated
	 */
	EDataType getSGrReleaseStateObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType <em>SGr Rest API Authentication Enum Method Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Rest API Authentication Enum Method Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType"
	 *        extendedMetaData="name='SGrRestAPIAuthenticationEnumMethodType:Object' baseType='SGrRestAPIAuthenticationEnumMethodType'"
	 * @generated
	 */
	EDataType getSGrRestAPIAuthenticationEnumMethodTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrRestAPIdataTypeType <em>SGr Rest AP Idata Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Rest AP Idata Type Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIdataTypeType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrRestAPIdataTypeType"
	 *        extendedMetaData="name='SGrRestAPIdataTypeType:Object' baseType='SGrRestAPIdataTypeType'"
	 * @generated
	 */
	EDataType getSGrRestAPIdataTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype <em>SGr Rest API Interface Selectiontype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Rest API Interface Selectiontype Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @model instanceClass="com.smartgridready.ns.v0.SGrRestAPIInterfaceSelectiontype"
	 *        extendedMetaData="name='SGrRestAPIInterfaceSelectiontype:Object' baseType='SGrRestAPIInterfaceSelectiontype'"
	 * @generated
	 */
	EDataType getSGrRestAPIInterfaceSelectiontypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrRWPType <em>SGr RWP Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr RWP Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrRWPType"
	 *        extendedMetaData="name='SGrRWPType:Object' baseType='SGrRWPType'"
	 * @generated
	 */
	EDataType getSGrRWPTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type <em>SGr SGCP Feed In State Lv2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr SGCP Feed In State Lv2 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type"
	 *        extendedMetaData="name='SGrSGCPFeedInStateLv2Type:Object' baseType='SGrSGCPFeedInStateLv2Type'"
	 * @generated
	 */
	EDataType getSGrSGCPFeedInStateLv2TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type <em>SGr SGCP Load State Lv2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr SGCP Load State Lv2 Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @model instanceClass="com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type"
	 *        extendedMetaData="name='SGrSGCPLoadStateLv2Type:Object' baseType='SGrSGCPLoadStateLv2Type'"
	 * @generated
	 */
	EDataType getSGrSGCPLoadStateLv2TypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrSGCPServiceType <em>SGr SGCP Service Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr SGCP Service Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrSGCPServiceType"
	 *        extendedMetaData="name='SGrSGCPServiceType:Object' baseType='SGrSGCPServiceType'"
	 * @generated
	 */
	EDataType getSGrSGCPServiceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SGr Special Quality Req Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * the special quality requirement
     * 				describes a test to be applied like a quality certification for
     * 				SmartMeters
     * 			
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>SGr Special Quality Req Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SGrSpecialQualityReqType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSGrSpecialQualityReqType();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrSunspStateCodesType <em>SGr Sunsp State Codes Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Sunsp State Codes Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrSunspStateCodesType"
	 *        extendedMetaData="name='SGrSunspStateCodesType:Object' baseType='SGrSunspStateCodesType'"
	 * @generated
	 */
	EDataType getSGrSunspStateCodesTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrTransportServicesUsedListType <em>SGr Transport Services Used List Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Transport Services Used List Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @model instanceClass="com.smartgridready.ns.v0.SGrTransportServicesUsedListType"
	 *        extendedMetaData="name='SGrTransportServicesUsedListType:Object' baseType='SGrTransportServicesUsedListType'"
	 * @generated
	 */
	EDataType getSGrTransportServicesUsedListTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SGrUnits <em>SGr Units Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SGr Units Object</em>'.
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @model instanceClass="com.smartgridready.ns.v0.SGrUnits"
	 *        extendedMetaData="name='SGrUnits:Object' baseType='SGrUnits'"
	 * @generated
	 */
	EDataType getSGrUnitsObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.StiHPOpstateStiebelType <em>Sti HP Opstate Stiebel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sti HP Opstate Stiebel Type Object</em>'.
	 * @see com.smartgridready.ns.v0.StiHPOpstateStiebelType
	 * @model instanceClass="com.smartgridready.ns.v0.StiHPOpstateStiebelType"
	 *        extendedMetaData="name='stiHPOpstateStiebelType:Object' baseType='stiHPOpstateStiebelType'"
	 * @generated
	 */
	EDataType getStiHPOpstateStiebelTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.SubProfileTypeEnumType <em>Sub Profile Type Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Profile Type Enum Type Object</em>'.
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @model instanceClass="com.smartgridready.ns.v0.SubProfileTypeEnumType"
	 *        extendedMetaData="name='SubProfileTypeEnumType:Object' baseType='SubProfileTypeEnumType'"
	 * @generated
	 */
	EDataType getSubProfileTypeEnumTypeObject();

	/**
	 * Returns the meta object for data type '<em>TBit Rank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rank of a bit data represented with a register. The
     * 				bit rank used to define a bit address (bitAddress = addr x 16 +
     * 				bitRank
     * 			
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>TBit Rank</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="name='tBitRank' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedByte' minInclusive='0' maxInclusive='15'"
	 * @generated
	 */
	EDataType getTBitRank();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>TBit Rank Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBit Rank Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="name='tBitRank:Object' baseType='tBitRank'"
	 * @generated
	 */
	EDataType getTBitRankObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.TEnumConversionFct <em>TEnum Conversion Fct Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEnum Conversion Fct Object</em>'.
	 * @see com.smartgridready.ns.v0.TEnumConversionFct
	 * @model instanceClass="com.smartgridready.ns.v0.TEnumConversionFct"
	 *        extendedMetaData="name='tEnumConversionFct:Object' baseType='tEnumConversionFct'"
	 * @generated
	 */
	EDataType getTEnumConversionFctObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.TEnumExceptionCodeType <em>TEnum Exception Code Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEnum Exception Code Type Object</em>'.
	 * @see com.smartgridready.ns.v0.TEnumExceptionCodeType
	 * @model instanceClass="com.smartgridready.ns.v0.TEnumExceptionCodeType"
	 *        extendedMetaData="name='tEnumExceptionCodeType:Object' baseType='tEnumExceptionCodeType'"
	 * @generated
	 */
	EDataType getTEnumExceptionCodeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.TEnumObjectType <em>TEnum Object Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEnum Object Type Object</em>'.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @model instanceClass="com.smartgridready.ns.v0.TEnumObjectType"
	 *        extendedMetaData="name='tEnumObjectType:Object' baseType='tEnumObjectType'"
	 * @generated
	 */
	EDataType getTEnumObjectTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Element Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='textElement_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='0' maxLength='4000'"
	 * @generated
	 */
	EDataType getTextElementType();

	/**
	 * Returns the meta object for data type '<em>TI Pport Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *   			Modbus Port number, default use is Port 502
     *   		
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>TI Pport Nr Type</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='tIPportNrType' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedInt'"
	 * @generated
	 */
	EDataType getTIPportNrType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>TI Pport Nr Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TI Pport Nr Type Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='tIPportNrType:Object' baseType='tIPportNrType'"
	 * @generated
	 */
	EDataType getTIPportNrTypeObject();

	/**
	 * Returns the meta object for data type '<em>TSlave ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Modbus Slave Address
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>TSlave ID Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='tSlaveIDType' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedShort'"
	 * @generated
	 */
	EDataType getTSlaveIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>TSlave ID Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSlave ID Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='tSlaveIDType:Object' baseType='tSlaveIDType'"
	 * @generated
	 */
	EDataType getTSlaveIDTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	V0Factory getV0Factory();

} //V0Package
