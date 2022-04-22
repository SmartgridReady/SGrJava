/**
 */
package ch.smartgridready.ns.s.gr.v0;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This status shows, if a device is connected or not and when next connection attemption should be done.
 *  With an PV Inverter e.g., this may be at the next sunrise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#getNextAttempt <em>Next Attempt</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getConnectionState()
 * @model extendedMetaData="name='ConnectionState' kind='elementOnly'"
 * @generated
 */
public interface ConnectionState extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #setIsConnected(boolean)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getConnectionState_IsConnected()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isConnected' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsConnected();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @generated
	 */
	void setIsConnected(boolean value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	void unsetIsConnected();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#isIsConnected <em>Is Connected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Connected</em>' attribute is set.
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	boolean isSetIsConnected();

	/**
	 * Returns the value of the '<em><b>Next Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Attempt</em>' attribute.
	 * @see #setNextAttempt(XMLGregorianCalendar)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getConnectionState_NextAttempt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='nextAttempt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getNextAttempt();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ConnectionState#getNextAttempt <em>Next Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Attempt</em>' attribute.
	 * @see #getNextAttempt()
	 * @generated
	 */
	void setNextAttempt(XMLGregorianCalendar value);

} // ConnectionState
