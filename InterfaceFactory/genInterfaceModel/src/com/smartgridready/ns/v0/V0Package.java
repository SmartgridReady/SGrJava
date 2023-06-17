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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.DocumentRootImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>SGr Gen Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SGR_GEN_DEVICE_FRAME = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrAttr4GenericTypeImpl <em>SGr Attr4 Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrAttr4GenericTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrAttr4GenericType()
	 * @generated
	 */
	int SGR_ATTR4_GENERIC_TYPE = 1;

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
	 * The feature id for the '<em><b>Unit Conversion Multiplicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE__UNIT_CONVERSION_MULTIPLICATOR = 16;

	/**
	 * The number of structural features of the '<em>SGr Attr4 Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>SGr Attr4 Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ATTR4_GENERIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl <em>SGr Basic Gen Data Point Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBasicGenDataPointTypeType()
	 * @generated
	 */
	int SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE = 2;

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
	int SGR_BITMAPPER_LIST_TYPE = 3;

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
	 * The feature id for the '<em><b>Sgr HC Opstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE = 2;

	/**
	 * The feature id for the '<em><b>Hov HP Act Buffer State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__HOV_HP_ACT_BUFFER_STATE = 3;

	/**
	 * The feature id for the '<em><b>Sti HP Opstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE = 4;

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
	int SGR_CHANGE_LOG = 4;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDataPointBaseTypeImpl <em>SGr Data Point Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDataPointBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDataPointBaseType()
	 * @generated
	 */
	int SGR_DATA_POINT_BASE_TYPE = 5;

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
	int SGR_DATA_POINT_DESCRIPTION_TYPE = 6;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDeviceBaseTypeImpl <em>SGr Device Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDeviceBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceBaseType()
	 * @generated
	 */
	int SGR_DEVICE_BASE_TYPE = 7;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl <em>SGr Device Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceProfileType()
	 * @generated
	 */
	int SGR_DEVICE_PROFILE_TYPE = 8;

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
	int SGR_ENUM_LIST_TYPE = 9;

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
	 * The feature id for the '<em><b>Cta DHW Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__CTA_DHW_OP_MODE = 15;

	/**
	 * The feature id for the '<em><b>Cta HP Op State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE = 16;

	/**
	 * The feature id for the '<em><b>Cta HP Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE = 17;

	/**
	 * The feature id for the '<em><b>Cta HC Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE = 18;

	/**
	 * The feature id for the '<em><b>Hov HP Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE = 19;

	/**
	 * The feature id for the '<em><b>Hov HC Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE = 20;

	/**
	 * The feature id for the '<em><b>Hov SG Ready Src Sel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL = 21;

	/**
	 * The feature id for the '<em><b>Hov Buffer State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE = 22;

	/**
	 * The feature id for the '<em><b>Hov HC Op State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE = 23;

	/**
	 * The feature id for the '<em><b>Hov Dom Hot WOp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE = 24;

	/**
	 * The feature id for the '<em><b>Hov Dom Hot WState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE = 25;

	/**
	 * The feature id for the '<em><b>Hov HP Op State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE = 26;

	/**
	 * The number of structural features of the '<em>SGr Enum List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGR_ENUM_LIST_TYPE_FEATURE_COUNT = 27;

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
	int SGR_FLEX_ASSISTANCE_TYPE = 10;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrFunctionalProfileBaseTypeImpl <em>SGr Functional Profile Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrFunctionalProfileBaseTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrFunctionalProfileBaseType()
	 * @generated
	 */
	int SGR_FUNCTIONAL_PROFILE_BASE_TYPE = 11;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrGenDeviceFrameImpl <em>SGr Gen Device Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrGenDeviceFrameImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrGenDeviceFrame()
	 * @generated
	 */
	int SGR_GEN_DEVICE_FRAME = 12;

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
	int SGR_GEN_FUNCTIONAL_PROFILE_TYPE = 13;

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
	int SGR_LEGIB_DOCUMENTATION_TYPE = 14;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrNamelistTypeImpl <em>SGr Namelist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrNamelistTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrNamelistType()
	 * @generated
	 */
	int SGR_NAMELIST_TYPE = 15;

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
	int SGR_PROFILE_DESCRIPTION_TYPE = 16;

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
	int SGR_PROFILENUMBER_TYPE = 17;

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
	int SGR_RELEASE_NOTES = 18;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrScalingTypeImpl <em>SGr Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrScalingTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrScalingType()
	 * @generated
	 */
	int SGR_SCALING_TYPE = 19;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrSmoothTransitionTypeImpl <em>SGr Smooth Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrSmoothTransitionTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSmoothTransitionType()
	 * @generated
	 */
	int SGR_SMOOTH_TRANSITION_TYPE = 20;

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
	int SGR_STABILITY_FALLBACK_TYPE = 21;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl <em>SGr Version Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrVersionNumberType()
	 * @generated
	 */
	int SGR_VERSION_NUMBER_TYPE = 22;

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
	 * The meta object id for the '{@link com.smartgridready.ns.v0.CtaDHWOpModeType <em>Cta DHW Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaDHWOpModeType()
	 * @generated
	 */
	int CTA_DHW_OP_MODE_TYPE = 23;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.CtaHCOpModeType <em>Cta HC Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHCOpModeType()
	 * @generated
	 */
	int CTA_HC_OP_MODE_TYPE = 24;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.CtaHPOpModeType <em>Cta HP Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHPOpModeType()
	 * @generated
	 */
	int CTA_HP_OP_MODE_TYPE = 25;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.CtaHPOpStateType <em>Cta HP Op State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHPOpStateType()
	 * @generated
	 */
	int CTA_HP_OP_STATE_TYPE = 26;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovBufferStateType <em>Hov Buffer State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovBufferStateType()
	 * @generated
	 */
	int HOV_BUFFER_STATE_TYPE = 27;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovDomHotWOpModeType <em>Hov Dom Hot WOp Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovDomHotWOpModeType()
	 * @generated
	 */
	int HOV_DOM_HOT_WOP_MODE_TYPE = 28;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovDomHotWStateType <em>Hov Dom Hot WState Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovDomHotWStateType()
	 * @generated
	 */
	int HOV_DOM_HOT_WSTATE_TYPE = 29;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovHCOpModeType <em>Hov HC Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHCOpModeType()
	 * @generated
	 */
	int HOV_HC_OP_MODE_TYPE = 30;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovHCOpStateType <em>Hov HC Op State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHCOpStateType()
	 * @generated
	 */
	int HOV_HC_OP_STATE_TYPE = 31;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovHPActBufferStateType <em>Hov HP Act Buffer State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPActBufferStateType()
	 * @generated
	 */
	int HOV_HP_ACT_BUFFER_STATE_TYPE = 32;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovHPOpModeType <em>Hov HP Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPOpModeType()
	 * @generated
	 */
	int HOV_HP_OP_MODE_TYPE = 33;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovHPOpStateType <em>Hov HP Op State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPOpStateType()
	 * @generated
	 */
	int HOV_HP_OP_STATE_TYPE = 34;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovSGReadySrcSelType <em>Hov SG Ready Src Sel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovSGReadySrcSelType()
	 * @generated
	 */
	int HOV_SG_READY_SRC_SEL_TYPE = 35;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.HovType <em>Hov Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovType()
	 * @generated
	 */
	int HOV_TYPE = 36;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.LevelOfOperationType <em>Level Of Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getLevelOfOperationType()
	 * @generated
	 */
	int LEVEL_OF_OPERATION_TYPE = 37;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.ProfileTypeEnumType <em>Profile Type Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getProfileTypeEnumType()
	 * @generated
	 */
	int PROFILE_TYPE_ENUM_TYPE = 38;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrBool2BitRankType <em>SGr Bool2 Bit Rank Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBool2BitRankType()
	 * @generated
	 */
	int SGR_BOOL2_BIT_RANK_TYPE = 39;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrDeviceKindType <em>SGr Device Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceKindType()
	 * @generated
	 */
	int SGR_DEVICE_KIND_TYPE = 40;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGReadyStateLv1Type <em>SG Ready State Lv1 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv1Type()
	 * @generated
	 */
	int SG_READY_STATE_LV1_TYPE = 41;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGReadyStateLv2Type <em>SG Ready State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv2Type()
	 * @generated
	 */
	int SG_READY_STATE_LV2_TYPE = 42;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVSEStateLv1Type <em>SGr EVSE State Lv1 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv1Type()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV1_TYPE = 43;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVSEStateLv2Type <em>SGr EVSE State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv2Type()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV2_TYPE = 44;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrEVStateType <em>SGr EV State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVStateType()
	 * @generated
	 */
	int SGR_EV_STATE_TYPE = 45;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHCOpModeType <em>SGr HC Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHCOpModeType()
	 * @generated
	 */
	int SGR_HC_OP_MODE_TYPE = 46;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SgrHCOpStateType <em>Sgr HC Op State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSgrHCOpStateType()
	 * @generated
	 */
	int SGR_HC_OP_STATE_TYPE = 47;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHPOpModeType <em>SGr HP Op Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpModeType()
	 * @generated
	 */
	int SGR_HP_OP_MODE_TYPE = 48;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrHPOpstateType <em>SGr HP Opstate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpstateType()
	 * @generated
	 */
	int SGR_HP_OPSTATE_TYPE = 49;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrLanguageType <em>SGr Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrLanguageType()
	 * @generated
	 */
	int SGR_LANGUAGE_TYPE = 50;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrManufacturerIDType <em>SGr Manufacturer ID Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrManufacturerIDType()
	 * @generated
	 */
	int SGR_MANUFACTURER_ID_TYPE = 51;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMeasValueSourceType <em>SGr Meas Value Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueSourceType()
	 * @generated
	 */
	int SGR_MEAS_VALUE_SOURCE_TYPE = 52;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMeasValueType <em>SGr Meas Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueType()
	 * @generated
	 */
	int SGR_MEAS_VALUE_TYPE = 53;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType <em>SGr MRO Presence Level Indication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMROPresenceLevelIndicationType()
	 * @generated
	 */
	int SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE = 54;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrObligLvlType <em>SGr Oblig Lvl Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrObligLvlType()
	 * @generated
	 */
	int SGR_OBLIG_LVL_TYPE = 55;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrOCPPStateType <em>SGr OCPP State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrOCPPStateType()
	 * @generated
	 */
	int SGR_OCPP_STATE_TYPE = 56;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrPowerSourceType <em>SGr Power Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPowerSourceType()
	 * @generated
	 */
	int SGR_POWER_SOURCE_TYPE = 57;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrReleaseState <em>SGr Release State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrReleaseState()
	 * @generated
	 */
	int SGR_RELEASE_STATE = 58;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrRWPType <em>SGr RWP Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRWPType()
	 * @generated
	 */
	int SGR_RWP_TYPE = 59;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type <em>SGr SGCP Feed In State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPFeedInStateLv2Type()
	 * @generated
	 */
	int SGR_SGCP_FEED_IN_STATE_LV2_TYPE = 60;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type <em>SGr SGCP Load State Lv2 Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPLoadStateLv2Type()
	 * @generated
	 */
	int SGR_SGCP_LOAD_STATE_LV2_TYPE = 61;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSGCPServiceType <em>SGr SGCP Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPServiceType()
	 * @generated
	 */
	int SGR_SGCP_SERVICE_TYPE = 62;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrSunspStateCodesType <em>SGr Sunsp State Codes Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSunspStateCodesType()
	 * @generated
	 */
	int SGR_SUNSP_STATE_CODES_TYPE = 63;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrTransportServicesUsedListType <em>SGr Transport Services Used List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrTransportServicesUsedListType()
	 * @generated
	 */
	int SGR_TRANSPORT_SERVICES_USED_LIST_TYPE = 64;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SGrUnits <em>SGr Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrUnits()
	 * @generated
	 */
	int SGR_UNITS = 65;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.StiHPOpstateType <em>Sti HP Opstate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getStiHPOpstateType()
	 * @generated
	 */
	int STI_HP_OPSTATE_TYPE = 66;

	/**
	 * The meta object id for the '{@link com.smartgridready.ns.v0.SubProfileTypeEnumType <em>Sub Profile Type Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSubProfileTypeEnumType()
	 * @generated
	 */
	int SUB_PROFILE_TYPE_ENUM_TYPE = 67;

	/**
	 * The meta object id for the '<em>Cta DHW Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaDHWOpModeTypeObject()
	 * @generated
	 */
	int CTA_DHW_OP_MODE_TYPE_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Cta HC Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHCOpModeTypeObject()
	 * @generated
	 */
	int CTA_HC_OP_MODE_TYPE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Cta HP Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHPOpModeTypeObject()
	 * @generated
	 */
	int CTA_HP_OP_MODE_TYPE_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Cta HP Op State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getCtaHPOpStateTypeObject()
	 * @generated
	 */
	int CTA_HP_OP_STATE_TYPE_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Hov Buffer State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovBufferStateTypeObject()
	 * @generated
	 */
	int HOV_BUFFER_STATE_TYPE_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Hov Dom Hot WOp Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovDomHotWOpModeTypeObject()
	 * @generated
	 */
	int HOV_DOM_HOT_WOP_MODE_TYPE_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Hov Dom Hot WState Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovDomHotWStateTypeObject()
	 * @generated
	 */
	int HOV_DOM_HOT_WSTATE_TYPE_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Hov HC Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHCOpModeTypeObject()
	 * @generated
	 */
	int HOV_HC_OP_MODE_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Hov HC Op State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHCOpStateTypeObject()
	 * @generated
	 */
	int HOV_HC_OP_STATE_TYPE_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Hov HP Act Buffer State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPActBufferStateTypeObject()
	 * @generated
	 */
	int HOV_HP_ACT_BUFFER_STATE_TYPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Hov HP Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPOpModeTypeObject()
	 * @generated
	 */
	int HOV_HP_OP_MODE_TYPE_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Hov HP Op State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovHPOpStateTypeObject()
	 * @generated
	 */
	int HOV_HP_OP_STATE_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Hov SG Ready Src Sel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovSGReadySrcSelTypeObject()
	 * @generated
	 */
	int HOV_SG_READY_SRC_SEL_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Hov Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.HovType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getHovTypeObject()
	 * @generated
	 */
	int HOV_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Level Of Operation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.LevelOfOperationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getLevelOfOperationTypeObject()
	 * @generated
	 */
	int LEVEL_OF_OPERATION_TYPE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Profile Type Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getProfileTypeEnumTypeObject()
	 * @generated
	 */
	int PROFILE_TYPE_ENUM_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>SGr Bool2 Bit Rank Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrBool2BitRankType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrBool2BitRankTypeObject()
	 * @generated
	 */
	int SGR_BOOL2_BIT_RANK_TYPE_OBJECT = 84;

	/**
	 * The meta object id for the '<em>SGr Device Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrDeviceKindType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrDeviceKindTypeObject()
	 * @generated
	 */
	int SGR_DEVICE_KIND_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>SG Ready State Lv1 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv1TypeObject()
	 * @generated
	 */
	int SG_READY_STATE_LV1_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>SG Ready State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGReadyStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGReadyStateLv2TypeObject()
	 * @generated
	 */
	int SG_READY_STATE_LV2_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>SGr EVSE State Lv1 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv1Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv1TypeObject()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV1_TYPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>SGr EVSE State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVSEStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVSEStateLv2TypeObject()
	 * @generated
	 */
	int SGR_EVSE_STATE_LV2_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>SGr EV State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrEVStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrEVStateTypeObject()
	 * @generated
	 */
	int SGR_EV_STATE_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>SGr HC Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHCOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHCOpModeTypeObject()
	 * @generated
	 */
	int SGR_HC_OP_MODE_TYPE_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Sgr HC Op State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SgrHCOpStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSgrHCOpStateTypeObject()
	 * @generated
	 */
	int SGR_HC_OP_STATE_TYPE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>SGr HP Op Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpModeType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpModeTypeObject()
	 * @generated
	 */
	int SGR_HP_OP_MODE_TYPE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>SGr HP Opstate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrHPOpstateTypeObject()
	 * @generated
	 */
	int SGR_HP_OPSTATE_TYPE_OBJECT = 94;

	/**
	 * The meta object id for the '<em>SGr Language Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrLanguageTypeObject()
	 * @generated
	 */
	int SGR_LANGUAGE_TYPE_OBJECT = 95;

	/**
	 * The meta object id for the '<em>SGr Manufacturer ID Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrManufacturerIDTypeObject()
	 * @generated
	 */
	int SGR_MANUFACTURER_ID_TYPE_OBJECT = 96;

	/**
	 * The meta object id for the '<em>SGr Meas Value Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueSourceTypeObject()
	 * @generated
	 */
	int SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT = 97;

	/**
	 * The meta object id for the '<em>SGr Meas Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMeasValueType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMeasValueTypeObject()
	 * @generated
	 */
	int SGR_MEAS_VALUE_TYPE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>SGr MRO Presence Level Indication Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrMROPresenceLevelIndicationTypeObject()
	 * @generated
	 */
	int SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>SGr Oblig Lvl Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrObligLvlType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrObligLvlTypeObject()
	 * @generated
	 */
	int SGR_OBLIG_LVL_TYPE_OBJECT = 100;

	/**
	 * The meta object id for the '<em>SGr OCPP State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrOCPPStateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrOCPPStateTypeObject()
	 * @generated
	 */
	int SGR_OCPP_STATE_TYPE_OBJECT = 101;

	/**
	 * The meta object id for the '<em>SGr Power Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrPowerSourceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPowerSourceTypeObject()
	 * @generated
	 */
	int SGR_POWER_SOURCE_TYPE_OBJECT = 102;

	/**
	 * The meta object id for the '<em>SGr Precision Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPrecisionType()
	 * @generated
	 */
	int SGR_PRECISION_TYPE = 103;

	/**
	 * The meta object id for the '<em>SGr Precision Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrPrecisionTypeObject()
	 * @generated
	 */
	int SGR_PRECISION_TYPE_OBJECT = 104;

	/**
	 * The meta object id for the '<em>SGr Release State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrReleaseState
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrReleaseStateObject()
	 * @generated
	 */
	int SGR_RELEASE_STATE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>SGr RWP Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrRWPTypeObject()
	 * @generated
	 */
	int SGR_RWP_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>SGr SGCP Feed In State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPFeedInStateLv2TypeObject()
	 * @generated
	 */
	int SGR_SGCP_FEED_IN_STATE_LV2_TYPE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>SGr SGCP Load State Lv2 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPLoadStateLv2TypeObject()
	 * @generated
	 */
	int SGR_SGCP_LOAD_STATE_LV2_TYPE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>SGr SGCP Service Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSGCPServiceType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSGCPServiceTypeObject()
	 * @generated
	 */
	int SGR_SGCP_SERVICE_TYPE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>SGr Special Quality Req Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSpecialQualityReqType()
	 * @generated
	 */
	int SGR_SPECIAL_QUALITY_REQ_TYPE = 110;

	/**
	 * The meta object id for the '<em>SGr Sunsp State Codes Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrSunspStateCodesType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrSunspStateCodesTypeObject()
	 * @generated
	 */
	int SGR_SUNSP_STATE_CODES_TYPE_OBJECT = 111;

	/**
	 * The meta object id for the '<em>SGr Transport Services Used List Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrTransportServicesUsedListType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrTransportServicesUsedListTypeObject()
	 * @generated
	 */
	int SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>SGr Units Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSGrUnitsObject()
	 * @generated
	 */
	int SGR_UNITS_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Sti HP Opstate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getStiHPOpstateTypeObject()
	 * @generated
	 */
	int STI_HP_OPSTATE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Sub Profile Type Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.smartgridready.ns.v0.SubProfileTypeEnumType
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getSubProfileTypeEnumTypeObject()
	 * @generated
	 */
	int SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Text Element Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.smartgridready.ns.v0.impl.V0PackageImpl#getTextElementType()
	 * @generated
	 */
	int TEXT_ELEMENT_TYPE = 116;


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
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrAttr4GenericType#getUnitConversionMultiplicator <em>Unit Conversion Multiplicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Conversion Multiplicator</em>'.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType#getUnitConversionMultiplicator()
	 * @see #getSGrAttr4GenericType()
	 * @generated
	 */
	EAttribute getSGrAttr4GenericType_UnitConversionMultiplicator();

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
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState <em>Hov HP Act Buffer State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov HP Act Buffer State</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getHovHPActBufferState()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_HovHPActBufferState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate <em>Sti HP Opstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sti HP Opstate</em>'.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType#getStiHPOpstate()
	 * @see #getSGrBitmapperListType()
	 * @generated
	 */
	EAttribute getSGrBitmapperListType_StiHPOpstate();

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
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState <em>Cta HP Op State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cta HP Op State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_CtaHPOpState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode <em>Cta HP Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cta HP Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getCtaHPOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_CtaHPOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode <em>Cta HC Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cta HC Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getCtaHCOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_CtaHCOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode <em>Hov HP Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov HP Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovHPOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode <em>Hov HC Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov HC Op Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovHCOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov SG Ready Src Sel</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovSGReadySrcSel()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovSGReadySrcSel();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState <em>Hov Buffer State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov Buffer State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovBufferState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovBufferState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState <em>Hov HC Op State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov HC Op State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovHCOpState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovHCOpState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov Dom Hot WOp Mode</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWOpMode()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovDomHotWOpMode();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState <em>Hov Dom Hot WState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov Dom Hot WState</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovDomHotWState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovDomHotWState();

	/**
	 * Returns the meta object for the attribute '{@link com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState <em>Hov HP Op State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hov HP Op State</em>'.
	 * @see com.smartgridready.ns.v0.SGrEnumListType#getHovHPOpState()
	 * @see #getSGrEnumListType()
	 * @generated
	 */
	EAttribute getSGrEnumListType_HovHPOpState();

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
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.CtaDHWOpModeType <em>Cta DHW Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cta DHW Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.CtaDHWOpModeType
	 * @generated
	 */
	EEnum getCtaDHWOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.CtaHCOpModeType <em>Cta HC Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cta HC Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @generated
	 */
	EEnum getCtaHCOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.CtaHPOpModeType <em>Cta HP Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cta HP Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @generated
	 */
	EEnum getCtaHPOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.CtaHPOpStateType <em>Cta HP Op State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cta HP Op State Type</em>'.
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @generated
	 */
	EEnum getCtaHPOpStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovBufferStateType <em>Hov Buffer State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov Buffer State Type</em>'.
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @generated
	 */
	EEnum getHovBufferStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovDomHotWOpModeType <em>Hov Dom Hot WOp Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov Dom Hot WOp Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @generated
	 */
	EEnum getHovDomHotWOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovDomHotWStateType <em>Hov Dom Hot WState Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov Dom Hot WState Type</em>'.
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @generated
	 */
	EEnum getHovDomHotWStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovHCOpModeType <em>Hov HC Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov HC Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @generated
	 */
	EEnum getHovHCOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovHCOpStateType <em>Hov HC Op State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov HC Op State Type</em>'.
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @generated
	 */
	EEnum getHovHCOpStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovHPActBufferStateType <em>Hov HP Act Buffer State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov HP Act Buffer State Type</em>'.
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @generated
	 */
	EEnum getHovHPActBufferStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovHPOpModeType <em>Hov HP Op Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov HP Op Mode Type</em>'.
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @generated
	 */
	EEnum getHovHPOpModeType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovHPOpStateType <em>Hov HP Op State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov HP Op State Type</em>'.
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @generated
	 */
	EEnum getHovHPOpStateType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovSGReadySrcSelType <em>Hov SG Ready Src Sel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov SG Ready Src Sel Type</em>'.
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @generated
	 */
	EEnum getHovSGReadySrcSelType();

	/**
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.HovType <em>Hov Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hov Type</em>'.
	 * @see com.smartgridready.ns.v0.HovType
	 * @generated
	 */
	EEnum getHovType();

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
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.ProfileTypeEnumType <em>Profile Type Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Type Enum Type</em>'.
	 * @see com.smartgridready.ns.v0.ProfileTypeEnumType
	 * @generated
	 */
	EEnum getProfileTypeEnumType();

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
	 * Returns the meta object for enum '{@link com.smartgridready.ns.v0.StiHPOpstateType <em>Sti HP Opstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sti HP Opstate Type</em>'.
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @generated
	 */
	EEnum getStiHPOpstateType();

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
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.CtaHCOpModeType <em>Cta HC Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cta HC Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.CtaHCOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.CtaHCOpModeType"
	 *        extendedMetaData="name='ctaHCOpModeType:Object' baseType='ctaHCOpModeType'"
	 * @generated
	 */
	EDataType getCtaHCOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.CtaHPOpModeType <em>Cta HP Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cta HP Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.CtaHPOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.CtaHPOpModeType"
	 *        extendedMetaData="name='ctaHPOpModeType:Object' baseType='ctaHPOpModeType'"
	 * @generated
	 */
	EDataType getCtaHPOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.CtaHPOpStateType <em>Cta HP Op State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cta HP Op State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.CtaHPOpStateType
	 * @model instanceClass="com.smartgridready.ns.v0.CtaHPOpStateType"
	 *        extendedMetaData="name='ctaHPOpStateType:Object' baseType='ctaHPOpStateType'"
	 * @generated
	 */
	EDataType getCtaHPOpStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovBufferStateType <em>Hov Buffer State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov Buffer State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovBufferStateType
	 * @model instanceClass="com.smartgridready.ns.v0.HovBufferStateType"
	 *        extendedMetaData="name='hovBufferStateType:Object' baseType='hovBufferStateType'"
	 * @generated
	 */
	EDataType getHovBufferStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovDomHotWOpModeType <em>Hov Dom Hot WOp Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov Dom Hot WOp Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovDomHotWOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.HovDomHotWOpModeType"
	 *        extendedMetaData="name='hovDomHotWOpModeType:Object' baseType='hovDomHotWOpModeType'"
	 * @generated
	 */
	EDataType getHovDomHotWOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovDomHotWStateType <em>Hov Dom Hot WState Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov Dom Hot WState Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovDomHotWStateType
	 * @model instanceClass="com.smartgridready.ns.v0.HovDomHotWStateType"
	 *        extendedMetaData="name='hovDomHotWStateType:Object' baseType='hovDomHotWStateType'"
	 * @generated
	 */
	EDataType getHovDomHotWStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovHCOpModeType <em>Hov HC Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov HC Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovHCOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.HovHCOpModeType"
	 *        extendedMetaData="name='hovHCOpModeType:Object' baseType='hovHCOpModeType'"
	 * @generated
	 */
	EDataType getHovHCOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovHCOpStateType <em>Hov HC Op State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov HC Op State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovHCOpStateType
	 * @model instanceClass="com.smartgridready.ns.v0.HovHCOpStateType"
	 *        extendedMetaData="name='hovHCOpStateType:Object' baseType='hovHCOpStateType'"
	 * @generated
	 */
	EDataType getHovHCOpStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovHPActBufferStateType <em>Hov HP Act Buffer State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov HP Act Buffer State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovHPActBufferStateType
	 * @model instanceClass="com.smartgridready.ns.v0.HovHPActBufferStateType"
	 *        extendedMetaData="name='hovHPActBufferStateType:Object' baseType='hovHPActBufferStateType'"
	 * @generated
	 */
	EDataType getHovHPActBufferStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovHPOpModeType <em>Hov HP Op Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov HP Op Mode Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovHPOpModeType
	 * @model instanceClass="com.smartgridready.ns.v0.HovHPOpModeType"
	 *        extendedMetaData="name='hovHPOpModeType:Object' baseType='hovHPOpModeType'"
	 * @generated
	 */
	EDataType getHovHPOpModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovHPOpStateType <em>Hov HP Op State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov HP Op State Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovHPOpStateType
	 * @model instanceClass="com.smartgridready.ns.v0.HovHPOpStateType"
	 *        extendedMetaData="name='hovHPOpStateType:Object' baseType='hovHPOpStateType'"
	 * @generated
	 */
	EDataType getHovHPOpStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovSGReadySrcSelType <em>Hov SG Ready Src Sel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov SG Ready Src Sel Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovSGReadySrcSelType
	 * @model instanceClass="com.smartgridready.ns.v0.HovSGReadySrcSelType"
	 *        extendedMetaData="name='hovSGReadySrcSelType:Object' baseType='hovSGReadySrcSelType'"
	 * @generated
	 */
	EDataType getHovSGReadySrcSelTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.HovType <em>Hov Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hov Type Object</em>'.
	 * @see com.smartgridready.ns.v0.HovType
	 * @model instanceClass="com.smartgridready.ns.v0.HovType"
	 *        extendedMetaData="name='hovType:Object' baseType='hovType'"
	 * @generated
	 */
	EDataType getHovTypeObject();

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
	 * Returns the meta object for data type '{@link com.smartgridready.ns.v0.StiHPOpstateType <em>Sti HP Opstate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sti HP Opstate Type Object</em>'.
	 * @see com.smartgridready.ns.v0.StiHPOpstateType
	 * @model instanceClass="com.smartgridready.ns.v0.StiHPOpstateType"
	 *        extendedMetaData="name='stiHPOpstateType:Object' baseType='stiHPOpstateType'"
	 * @generated
	 */
	EDataType getStiHPOpstateTypeObject();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	V0Factory getV0Factory();

} //V0Package
