/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Device Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevNameList <em>Dev Name List</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevLegibDesc <em>Dev Legib Desc</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getTransportService <em>Transport Service</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDeviceKind <em>Device Kind</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getSoftwareRevision <em>Software Revision</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getHardwareRevision <em>Hardware Revision</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getPowerSource <em>Power Source</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getNominalPower <em>Nominal Power</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getManufSpecIdent <em>Manuf Spec Ident</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getManufacturerLabel <em>Manufacturer Label</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getRemAuthorID <em>Rem Author ID</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevLevelofOperation <em>Dev Levelof Operation</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType()
 * @model extendedMetaData="name='SGrDeviceProfileType' kind='elementOnly'"
 * @generated
 */
public interface SGrDeviceProfileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dev Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ontology naming support
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Name List</em>' containment reference.
	 * @see #setDevNameList(SGrNamelistType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_DevNameList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistType getDevNameList();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevNameList <em>Dev Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Name List</em>' containment reference.
	 * @see #getDevNameList()
	 * @generated
	 */
	void setDevNameList(SGrNamelistType value);

	/**
	 * Returns the value of the '<em><b>Dev Legib Desc</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrLegibDocumentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  this is the published information related to this
	 * 						device
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Legib Desc</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_DevLegibDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='devLegibDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getDevLegibDesc();

	/**
	 * Returns the value of the '<em><b>Transport Service</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrTransportServicesUsedListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Service</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrTransportServicesUsedListType
	 * @see #isSetTransportService()
	 * @see #unsetTransportService()
	 * @see #setTransportService(SGrTransportServicesUsedListType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_TransportService()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='transportService' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrTransportServicesUsedListType getTransportService();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getTransportService <em>Transport Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Service</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrTransportServicesUsedListType
	 * @see #isSetTransportService()
	 * @see #unsetTransportService()
	 * @see #getTransportService()
	 * @generated
	 */
	void setTransportService(SGrTransportServicesUsedListType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getTransportService <em>Transport Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportService()
	 * @see #getTransportService()
	 * @see #setTransportService(SGrTransportServicesUsedListType)
	 * @generated
	 */
	void unsetTransportService();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getTransportService <em>Transport Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Service</em>' attribute is set.
	 * @see #unsetTransportService()
	 * @see #getTransportService()
	 * @see #setTransportService(SGrTransportServicesUsedListType)
	 * @generated
	 */
	boolean isSetTransportService();

	/**
	 * Returns the value of the '<em><b>Device Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrDeviceKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Kind</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrDeviceKindType
	 * @see #isSetDeviceKind()
	 * @see #unsetDeviceKind()
	 * @see #setDeviceKind(SGrDeviceKindType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_DeviceKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceKind' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceKindType getDeviceKind();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDeviceKind <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Kind</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrDeviceKindType
	 * @see #isSetDeviceKind()
	 * @see #unsetDeviceKind()
	 * @see #getDeviceKind()
	 * @generated
	 */
	void setDeviceKind(SGrDeviceKindType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDeviceKind <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceKind()
	 * @see #getDeviceKind()
	 * @see #setDeviceKind(SGrDeviceKindType)
	 * @generated
	 */
	void unsetDeviceKind();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDeviceKind <em>Device Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Kind</em>' attribute is set.
	 * @see #unsetDeviceKind()
	 * @see #getDeviceKind()
	 * @see #setDeviceKind(SGrDeviceKindType)
	 * @generated
	 */
	boolean isSetDeviceKind();

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_SerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='serialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSerialNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Software Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Revision</em>' containment reference.
	 * @see #setSoftwareRevision(SGrVersionNumberType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_SoftwareRevision()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='softwareRevision' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrVersionNumberType getSoftwareRevision();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getSoftwareRevision <em>Software Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Revision</em>' containment reference.
	 * @see #getSoftwareRevision()
	 * @generated
	 */
	void setSoftwareRevision(SGrVersionNumberType value);

	/**
	 * Returns the value of the '<em><b>Hardware Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Revision</em>' containment reference.
	 * @see #setHardwareRevision(SGrVersionNumberType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_HardwareRevision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hardwareRevision' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrVersionNumberType getHardwareRevision();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getHardwareRevision <em>Hardware Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Revision</em>' containment reference.
	 * @see #getHardwareRevision()
	 * @generated
	 */
	void setHardwareRevision(SGrVersionNumberType value);

	/**
	 * Returns the value of the '<em><b>Brand Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * branding information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brand Name</em>' attribute.
	 * @see #setBrandName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_BrandName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='brandName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBrandName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getBrandName <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand Name</em>' attribute.
	 * @see #getBrandName()
	 * @generated
	 */
	void setBrandName(String value);

	/**
	 * Returns the value of the '<em><b>Power Source</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.SGrPowerSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * power supply type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Source</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrPowerSourceType
	 * @see #isSetPowerSource()
	 * @see #unsetPowerSource()
	 * @see #setPowerSource(SGrPowerSourceType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_PowerSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='powerSource' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrPowerSourceType getPowerSource();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getPowerSource <em>Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Source</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.SGrPowerSourceType
	 * @see #isSetPowerSource()
	 * @see #unsetPowerSource()
	 * @see #getPowerSource()
	 * @generated
	 */
	void setPowerSource(SGrPowerSourceType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getPowerSource <em>Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerSource()
	 * @see #getPowerSource()
	 * @see #setPowerSource(SGrPowerSourceType)
	 * @generated
	 */
	void unsetPowerSource();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getPowerSource <em>Power Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Source</em>' attribute is set.
	 * @see #unsetPowerSource()
	 * @see #getPowerSource()
	 * @see #setPowerSource(SGrPowerSourceType)
	 * @generated
	 */
	boolean isSetPowerSource();

	/**
	 * Returns the value of the '<em><b>Nominal Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nominal Power of the device (installation)
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Power</em>' attribute.
	 * @see #setNominalPower(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_NominalPower()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='nominalPower' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNominalPower();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getNominalPower <em>Nominal Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Power</em>' attribute.
	 * @see #getNominalPower()
	 * @generated
	 */
	void setNominalPower(String value);

	/**
	 * Returns the value of the '<em><b>Manuf Spec Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specififaction identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manuf Spec Ident</em>' attribute.
	 * @see #setManufSpecIdent(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_ManufSpecIdent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='manufSpecIdent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManufSpecIdent();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getManufSpecIdent <em>Manuf Spec Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manuf Spec Ident</em>' attribute.
	 * @see #getManufSpecIdent()
	 * @generated
	 */
	void setManufSpecIdent(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the label of the device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Label</em>' attribute.
	 * @see #setManufacturerLabel(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_ManufacturerLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='manufacturerLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManufacturerLabel();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getManufacturerLabel <em>Manufacturer Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Label</em>' attribute.
	 * @see #getManufacturerLabel()
	 * @generated
	 */
	void setManufacturerLabel(String value);

	/**
	 * Returns the value of the '<em><b>Rem Author ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * author of this sheet may add remarks / non disclamer
	 * 						statements
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Author ID</em>' attribute.
	 * @see #setRemAuthorID(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_RemAuthorID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='remAuthorID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemAuthorID();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getRemAuthorID <em>Rem Author ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem Author ID</em>' attribute.
	 * @see #getRemAuthorID()
	 * @generated
	 */
	void setRemAuthorID(String value);

	/**
	 * Returns the value of the '<em><b>Dev Levelof Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  defines the SGr Label Leve 1...6 of the highest
	 * 						level functional profile of this device
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Levelof Operation</em>' attribute.
	 * @see #isSetDevLevelofOperation()
	 * @see #unsetDevLevelofOperation()
	 * @see #setDevLevelofOperation(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceProfileType_DevLevelofOperation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='devLevelofOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDevLevelofOperation();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevLevelofOperation <em>Dev Levelof Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Levelof Operation</em>' attribute.
	 * @see #isSetDevLevelofOperation()
	 * @see #unsetDevLevelofOperation()
	 * @see #getDevLevelofOperation()
	 * @generated
	 */
	void setDevLevelofOperation(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevLevelofOperation <em>Dev Levelof Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDevLevelofOperation()
	 * @see #getDevLevelofOperation()
	 * @see #setDevLevelofOperation(int)
	 * @generated
	 */
	void unsetDevLevelofOperation();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType#getDevLevelofOperation <em>Dev Levelof Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dev Levelof Operation</em>' attribute is set.
	 * @see #unsetDevLevelofOperation()
	 * @see #getDevLevelofOperation()
	 * @see #setDevLevelofOperation(int)
	 * @generated
	 */
	boolean isSetDevLevelofOperation();

} // SGrDeviceProfileType
