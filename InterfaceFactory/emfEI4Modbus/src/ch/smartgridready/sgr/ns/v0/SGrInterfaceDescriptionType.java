/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#getTechnologyUsed <em>Technology Used</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#isIsLocalControl <em>Is Local Control</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrInterfaceDescriptionType()
 * @model extendedMetaData="name='SGrInterfaceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrInterfaceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Technology Used</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SGrTransportServicesUsedListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Used</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrTransportServicesUsedListType
	 * @see #isSetTechnologyUsed()
	 * @see #unsetTechnologyUsed()
	 * @see #setTechnologyUsed(SGrTransportServicesUsedListType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrInterfaceDescriptionType_TechnologyUsed()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='technologyUsed' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrTransportServicesUsedListType getTechnologyUsed();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#getTechnologyUsed <em>Technology Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Used</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrTransportServicesUsedListType
	 * @see #isSetTechnologyUsed()
	 * @see #unsetTechnologyUsed()
	 * @see #getTechnologyUsed()
	 * @generated
	 */
	void setTechnologyUsed(SGrTransportServicesUsedListType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#getTechnologyUsed <em>Technology Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTechnologyUsed()
	 * @see #getTechnologyUsed()
	 * @see #setTechnologyUsed(SGrTransportServicesUsedListType)
	 * @generated
	 */
	void unsetTechnologyUsed();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#getTechnologyUsed <em>Technology Used</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Technology Used</em>' attribute is set.
	 * @see #unsetTechnologyUsed()
	 * @see #getTechnologyUsed()
	 * @see #setTechnologyUsed(SGrTransportServicesUsedListType)
	 * @generated
	 */
	boolean isSetTechnologyUsed();

	/**
	 * Returns the value of the '<em><b>Is Local Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local Control</em>' attribute.
	 * @see #isSetIsLocalControl()
	 * @see #unsetIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrInterfaceDescriptionType_IsLocalControl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='IsLocalControl' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsLocalControl();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	void unsetIsLocalControl();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrInterfaceDescriptionType#isIsLocalControl <em>Is Local Control</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Local Control</em>' attribute is set.
	 * @see #unsetIsLocalControl()
	 * @see #isIsLocalControl()
	 * @see #setIsLocalControl(boolean)
	 * @generated
	 */
	boolean isSetIsLocalControl();

} // SGrInterfaceDescriptionType
