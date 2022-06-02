/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data Typde definition for a
 * 				Modbus Device Description as an EI (External Interface)
 * 			
 * Geraet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getDevMbAttrReference <em>Dev Mb Attr Reference</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getNetworkConnectionState <em>Network Connection State</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType()
 * @model extendedMetaData="name='SGrModbusDeviceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDeviceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_DeviceProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Dev Mb Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrModbusAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModbusAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: Modbus related and Generic
	 * 						devMbAttrRefernce values are valid for a whole device
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Mb Attr Reference</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_DevMbAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devMbAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusAttrFrameType> getDevMbAttrReference();

	/**
	 * Returns the value of the '<em><b>Modbus Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Interface Desc</em>' containment reference.
	 * @see #setModbusInterfaceDesc(SGrModbusInterfaceDescriptionType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_ModbusInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusInterfaceDescriptionType getModbusInterfaceDesc();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Interface Desc</em>' containment reference.
	 * @see #getModbusInterfaceDesc()
	 * @generated
	 */
	void setModbusInterfaceDesc(SGrModbusInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrModbusProfilesFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusProfilesFrameType> getFpListElement();

	/**
	 * Returns the value of the '<em><b>Network Connection State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Connection State</em>' containment reference.
	 * @see #setNetworkConnectionState(NetworkConnectionStateType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_NetworkConnectionState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='networkConnectionState' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkConnectionStateType getNetworkConnectionState();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getNetworkConnectionState <em>Network Connection State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Connection State</em>' containment reference.
	 * @see #getNetworkConnectionState()
	 * @generated
	 */
	void setNetworkConnectionState(NetworkConnectionStateType value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device Name in the context of the ManufacturerID
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_DeviceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deviceName'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value "false" means "is cloud control device",
	 * 					indicating that this service is based on cloud. "True" indicates
	 * 					that services are provided within the range of the local area.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Local Control</em>' attribute.
	 * @see #isSetIsLocalControl()
	 * @see #unsetIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLocalControl'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local Control</em>' attribute.
	 * @see #isSetIsLocalControl()
	 * @see #unsetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @generated
	 */
	void setIsLocalControl(boolean value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Local Control</em>' attribute is set.
	 * @see #unsetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	boolean isSetIsLocalControl();

	/**
	 * Returns the value of the '<em><b>Manufacturer ID</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SGrManufacturerIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the identifier as enumeration indicates that the
	 * 					manufacturer is related with the organisation and that this
	 * 					external interface is generated by himself
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer ID</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_ManufacturerID()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manufacturerID'"
	 * @generated
	 */
	SGrManufacturerIDType getManufacturerID();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer ID</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #getManufacturerID()
	 * @generated
	 */
	void setManufacturerID(SGrManufacturerIDType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	void unsetManufacturerID();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manufacturer ID</em>' attribute is set.
	 * @see #unsetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	boolean isSetManufacturerID();

	/**
	 * Returns the value of the '<em><b>Manufacturer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the Manufacturer or OEM
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #setManufacturerName(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrModbusDeviceDescriptionType_ManufacturerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manufacturerName'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrModbusDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

} // SGrModbusDeviceDescriptionType
