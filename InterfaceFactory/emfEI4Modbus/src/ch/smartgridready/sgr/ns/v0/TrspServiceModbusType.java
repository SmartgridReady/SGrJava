/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trsp Service Modbus Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TrspServiceModbusType#getRtu <em>Rtu</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TrspServiceModbusType#getTcp <em>Tcp</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTrspServiceModbusType()
 * @model extendedMetaData="name='TrspServiceModbusType' kind='elementOnly'"
 * @generated
 */
public interface TrspServiceModbusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rtu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtu</em>' containment reference.
	 * @see #setRtu(RTUType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTrspServiceModbusType_Rtu()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rtu' namespace='##targetNamespace'"
	 * @generated
	 */
	RTUType getRtu();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TrspServiceModbusType#getRtu <em>Rtu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtu</em>' containment reference.
	 * @see #getRtu()
	 * @generated
	 */
	void setRtu(RTUType value);

	/**
	 * Returns the value of the '<em><b>Tcp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcp</em>' containment reference.
	 * @see #setTcp(TCPType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTrspServiceModbusType_Tcp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tcp' namespace='##targetNamespace'"
	 * @generated
	 */
	TCPType getTcp();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TrspServiceModbusType#getTcp <em>Tcp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcp</em>' containment reference.
	 * @see #getTcp()
	 * @generated
	 */
	void setTcp(TCPType value);

} // TrspServiceModbusType
