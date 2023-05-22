/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Device Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for device
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType()
 * @model extendedMetaData="name='SGrDeviceBaseType' kind='elementOnly'"
 * @generated
 */
public interface SGrDeviceBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Notes</em>' containment reference.
	 * @see #setReleaseNotes(SGrReleaseNotes)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_ReleaseNotes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='releaseNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrReleaseNotes getReleaseNotes();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getReleaseNotes <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Notes</em>' containment reference.
	 * @see #getReleaseNotes()
	 * @generated
	 */
	void setReleaseNotes(SGrReleaseNotes value);

	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_DeviceProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference.
	 * @see #setGenAttribute(SGrAttr4GenericType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrAttr4GenericType getGenAttribute();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getGenAttribute <em>Gen Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Attribute</em>' containment reference.
	 * @see #getGenAttribute()
	 * @generated
	 */
	void setGenAttribute(SGrAttr4GenericType value);

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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_DeviceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deviceName'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLocalControl'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl <em>Is Local Control</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
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
	 * the identifier as enumeration indicates that the
	 * 					manufacturer is related with the organisation and that this
	 * 					external interface is generated by himself
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer ID</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_ManufacturerID()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manufacturerID'"
	 * @generated
	 */
	SGrManufacturerIDType getManufacturerID();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	void unsetManufacturerID();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerID <em>Manufacturer ID</em>}' attribute is set.
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceBaseType_ManufacturerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manufacturerName'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceBaseType#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

} // SGrDeviceBaseType
