/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Contact API Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Data Typdefinition for a
 * 				AnyAPI_ Device Description as an EI (External Interface)
 * 			
 * Geraet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getDevAttr4Generic <em>Dev Attr4 Generic</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType()
 * @model extendedMetaData="name='SGrContactAPIDeviceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrContactAPIDeviceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_DeviceProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Dev Attr4 Generic</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  ContactsAPI_AttrFrameTypes contains only the
	 * 						generic branch of SGr attributes
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Attr4 Generic</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_DevAttr4Generic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devAttr4Generic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getDevAttr4Generic();

	/**
	 * Returns the value of the '<em><b>Contact Api Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Api Interface Desc</em>' containment reference.
	 * @see #setContactApiInterfaceDesc(ContactAPIInterfaceDescType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_ContactApiInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contactApiInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactAPIInterfaceDescType getContactApiInterfaceDesc();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getContactApiInterfaceDesc <em>Contact Api Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Api Interface Desc</em>' containment reference.
	 * @see #getContactApiInterfaceDesc()
	 * @generated
	 */
	void setContactApiInterfaceDesc(ContactAPIInterfaceDescType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrProfilesFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrProfilesFrameType> getFpListElement();

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
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_DeviceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deviceName'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLocalControl'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrManufacturerIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  the identifier as enumeration indicates that the
	 * 					manufacturer is related with the organisation and that this
	 * 					external interface is generated by himself
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer ID</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_ManufacturerID()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manufacturerID'"
	 * @generated
	 */
	SGrManufacturerIDType getManufacturerID();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer ID</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #getManufacturerID()
	 * @generated
	 */
	void setManufacturerID(SGrManufacturerIDType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	void unsetManufacturerID();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute is set.
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
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrContactAPIDeviceDescriptionType_ManufacturerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manufacturerName'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrContactAPIDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

} // SGrContactAPIDeviceDescriptionType
