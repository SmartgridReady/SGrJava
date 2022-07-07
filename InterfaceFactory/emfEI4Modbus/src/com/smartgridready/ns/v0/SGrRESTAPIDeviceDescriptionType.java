/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr RESTAPI Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Data Typdefinition for a REST
 * 				Device Description as an EI (External Interace)
 * 			
 * Geraet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getDevRestAPIAttrReference <em>Dev Rest API Attr Reference</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType()
 * @model extendedMetaData="name='SGrRESTAPIDeviceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrRESTAPIDeviceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_DeviceProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Dev Rest API Attr Reference</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIAttrFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RestAPIAttrFrameTypes contain two branches of
	 * 						SmartGridready attributes: REST related and Generic
	 * 						devAttrReference values are valid for a whole device
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Rest API Attr Reference</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_DevRestAPIAttrReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devRestAPIAttrReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIAttrFrameType> getDevRestAPIAttrReference();

	/**
	 * Returns the value of the '<em><b>Rest API Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Interface Desc</em>' containment reference.
	 * @see #setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_RestAPIInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestAPIInterfaceDescriptionType getRestAPIInterfaceDesc();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Interface Desc</em>' containment reference.
	 * @see #getRestAPIInterfaceDesc()
	 * @generated
	 */
	void setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrRestAPIProfilesFrameType> getFpListElement();

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Device Name in the context of the ManufacturerID
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_DeviceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deviceName'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getDeviceName <em>Device Name</em>}' attribute.
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
	 *  Value "false" means "is cloud control device",
	 * 					indicating that this service is based on cloud. "True" indicates
	 * 					that services are provided within the range of the local area.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Local Control</em>' attribute.
	 * @see #isSetIsLocalControl()
	 * @see #unsetIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLocalControl'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrManufacturerIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  the identifier as enumeration indicates that the
	 * 					manufacturer is related with the organisation and that this
	 * 					external interface is generated by himself
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer ID</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_ManufacturerID()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manufacturerID'"
	 * @generated
	 */
	SGrManufacturerIDType getManufacturerID();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer ID</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #getManufacturerID()
	 * @generated
	 */
	void setManufacturerID(SGrManufacturerIDType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	void unsetManufacturerID();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute is set.
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
	 *  Name of the Manufacturer or OEM
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #setManufacturerName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrRESTAPIDeviceDescriptionType_ManufacturerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manufacturerName'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

} // SGrRESTAPIDeviceDescriptionType
