/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Device Description
 * 			
 * Geraet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getDevAttr4Generic <em>Dev Attr4 Generic</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType()
 * @model extendedMetaData="name='SGrDeviceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrDeviceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_DeviceProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Dev Attr4 Generic</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev Attr4 Generic</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_DevAttr4Generic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devAttr4Generic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getDevAttr4Generic();

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrProfilesFrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrProfilesFrameType> getFpListElement();

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_DeviceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deviceName'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @return the value of the '<em>Is Local Control</em>' attribute.
	 * @see #isSetIsLocalControl()
	 * @see #unsetIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLocalControl'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
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
	 * @return the value of the '<em>Manufacturer ID</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrManufacturerIDType
	 * @see #isSetManufacturerID()
	 * @see #unsetManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_ManufacturerID()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manufacturerID'"
	 * @generated
	 */
	SGrManufacturerIDType getManufacturerID();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
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
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturerID()
	 * @see #getManufacturerID()
	 * @see #setManufacturerID(SGrManufacturerIDType)
	 * @generated
	 */
	void unsetManufacturerID();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerID <em>Manufacturer ID</em>}' attribute is set.
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
	 * @return the value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #setManufacturerName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDeviceDescriptionType_ManufacturerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='manufacturerName'"
	 * @generated
	 */
	String getManufacturerName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType#getManufacturerName <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Name</em>' attribute.
	 * @see #getManufacturerName()
	 * @generated
	 */
	void setManufacturerName(String value);

} // SGrDeviceDescriptionType
