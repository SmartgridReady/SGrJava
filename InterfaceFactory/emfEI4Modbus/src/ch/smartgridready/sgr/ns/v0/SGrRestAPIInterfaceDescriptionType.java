/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV4outOfBox <em>Trsp Srv Rest TCPV 4out Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV6outOfBox <em>Trsp Srv Rest TCPV 6out Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestURIoutOfBox <em>Trsp Srv Rest UR Iout Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBearer <em>Rest API Bearer</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBasic <em>Rest API Basic</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType()
 * @model extendedMetaData="name='SGrRestAPIInterfaceDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIInterfaceDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest API Interface Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceSelectiontype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Interface Selection</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @see #isSetRestAPIInterfaceSelection()
	 * @see #unsetRestAPIInterfaceSelection()
	 * @see #setRestAPIInterfaceSelection(SGrRestAPIInterfaceSelectiontype)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_RestAPIInterfaceSelection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIInterfaceSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestAPIInterfaceSelectiontype getRestAPIInterfaceSelection();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Interface Selection</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceSelectiontype
	 * @see #isSetRestAPIInterfaceSelection()
	 * @see #unsetRestAPIInterfaceSelection()
	 * @see #getRestAPIInterfaceSelection()
	 * @generated
	 */
	void setRestAPIInterfaceSelection(SGrRestAPIInterfaceSelectiontype value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestAPIInterfaceSelection()
	 * @see #getRestAPIInterfaceSelection()
	 * @see #setRestAPIInterfaceSelection(SGrRestAPIInterfaceSelectiontype)
	 * @generated
	 */
	void unsetRestAPIInterfaceSelection();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rest API Interface Selection</em>' attribute is set.
	 * @see #unsetRestAPIInterfaceSelection()
	 * @see #getRestAPIInterfaceSelection()
	 * @see #setRestAPIInterfaceSelection(SGrRestAPIInterfaceSelectiontype)
	 * @generated
	 */
	boolean isSetRestAPIInterfaceSelection();

	/**
	 * Returns the value of the '<em><b>Trsp Srv Rest TCPV 4out Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Srv Rest TCPV 4out Of Box</em>' containment reference.
	 * @see #setTrspSrvRestTCPV4outOfBox(TPipV4genAddrType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV4outOfBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trspSrvRestTCPV4outOfBox' namespace='##targetNamespace'"
	 * @generated
	 */
	TPipV4genAddrType getTrspSrvRestTCPV4outOfBox();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV4outOfBox <em>Trsp Srv Rest TCPV 4out Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Srv Rest TCPV 4out Of Box</em>' containment reference.
	 * @see #getTrspSrvRestTCPV4outOfBox()
	 * @generated
	 */
	void setTrspSrvRestTCPV4outOfBox(TPipV4genAddrType value);

	/**
	 * Returns the value of the '<em><b>Trsp Srv Rest TCPV 6out Of Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Srv Rest TCPV 6out Of Box</em>' containment reference.
	 * @see #setTrspSrvRestTCPV6outOfBox(TPipV6genAddrType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV6outOfBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trspSrvRestTCPV6outOfBox' namespace='##targetNamespace'"
	 * @generated
	 */
	TPipV6genAddrType getTrspSrvRestTCPV6outOfBox();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestTCPV6outOfBox <em>Trsp Srv Rest TCPV 6out Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Srv Rest TCPV 6out Of Box</em>' containment reference.
	 * @see #getTrspSrvRestTCPV6outOfBox()
	 * @generated
	 */
	void setTrspSrvRestTCPV6outOfBox(TPipV6genAddrType value);

	/**
	 * Returns the value of the '<em><b>Trsp Srv Rest UR Iout Of Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Srv Rest UR Iout Of Box</em>' attribute.
	 * @see #setTrspSrvRestURIoutOfBox(String)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_TrspSrvRestURIoutOfBox()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='trspSrvRestURIoutOfBox' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTrspSrvRestURIoutOfBox();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getTrspSrvRestURIoutOfBox <em>Trsp Srv Rest UR Iout Of Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Srv Rest UR Iout Of Box</em>' attribute.
	 * @see #getTrspSrvRestURIoutOfBox()
	 * @generated
	 */
	void setTrspSrvRestURIoutOfBox(String value);

	/**
	 * Returns the value of the '<em><b>Rest API Authentication Method</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.sgr.ns.v0.SGrRestAPIAuthenticationEnumMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Authentication Method</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @see #isSetRestAPIAuthenticationMethod()
	 * @see #unsetRestAPIAuthenticationMethod()
	 * @see #setRestAPIAuthenticationMethod(SGrRestAPIAuthenticationEnumMethodType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_RestAPIAuthenticationMethod()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='restAPIAuthenticationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestAPIAuthenticationEnumMethodType getRestAPIAuthenticationMethod();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Authentication Method</em>' attribute.
	 * @see ch.smartgridready.sgr.ns.v0.SGrRestAPIAuthenticationEnumMethodType
	 * @see #isSetRestAPIAuthenticationMethod()
	 * @see #unsetRestAPIAuthenticationMethod()
	 * @see #getRestAPIAuthenticationMethod()
	 * @generated
	 */
	void setRestAPIAuthenticationMethod(SGrRestAPIAuthenticationEnumMethodType value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestAPIAuthenticationMethod()
	 * @see #getRestAPIAuthenticationMethod()
	 * @see #setRestAPIAuthenticationMethod(SGrRestAPIAuthenticationEnumMethodType)
	 * @generated
	 */
	void unsetRestAPIAuthenticationMethod();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rest API Authentication Method</em>' attribute is set.
	 * @see #unsetRestAPIAuthenticationMethod()
	 * @see #getRestAPIAuthenticationMethod()
	 * @see #setRestAPIAuthenticationMethod(SGrRestAPIAuthenticationEnumMethodType)
	 * @generated
	 */
	boolean isSetRestAPIAuthenticationMethod();

	/**
	 * Returns the value of the '<em><b>Rest API Bearer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Bearer</em>' containment reference.
	 * @see #setRestAPIBearer(SGRrestAPIBearerType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_RestAPIBearer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIBearer' namespace='##targetNamespace'"
	 * @generated
	 */
	SGRrestAPIBearerType getRestAPIBearer();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBearer <em>Rest API Bearer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Bearer</em>' containment reference.
	 * @see #getRestAPIBearer()
	 * @generated
	 */
	void setRestAPIBearer(SGRrestAPIBearerType value);

	/**
	 * Returns the value of the '<em><b>Rest API Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Basic</em>' containment reference.
	 * @see #setRestAPIBasic(SGrRestBasicType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIInterfaceDescriptionType_RestAPIBasic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIBasic' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestBasicType getRestAPIBasic();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType#getRestAPIBasic <em>Rest API Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest API Basic</em>' containment reference.
	 * @see #getRestAPIBasic()
	 * @generated
	 */
	void setRestAPIBasic(SGrRestBasicType value);

} // SGrRestAPIInterfaceDescriptionType
