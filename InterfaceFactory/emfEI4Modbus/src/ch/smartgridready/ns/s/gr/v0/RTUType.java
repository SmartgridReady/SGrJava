/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTU Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.RTUType#getRtuTrspSrvInstance <em>Rtu Trsp Srv Instance</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.RTUType#getRtuDevInstance <em>Rtu Dev Instance</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUType()
 * @model extendedMetaData="name='RTUType' kind='elementOnly'"
 * @generated
 */
public interface RTUType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rtu Trsp Srv Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtu Trsp Srv Instance</em>' containment reference.
	 * @see #setRtuTrspSrvInstance(RTUtrspSrvInstanceType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUType_RtuTrspSrvInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rtuTrspSrvInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	RTUtrspSrvInstanceType getRtuTrspSrvInstance();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.RTUType#getRtuTrspSrvInstance <em>Rtu Trsp Srv Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtu Trsp Srv Instance</em>' containment reference.
	 * @see #getRtuTrspSrvInstance()
	 * @generated
	 */
	void setRtuTrspSrvInstance(RTUtrspSrvInstanceType value);

	/**
	 * Returns the value of the '<em><b>Rtu Dev Instance</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtu Dev Instance</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getRTUType_RtuDevInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rtuDevInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RTUDevInstanceType> getRtuDevInstance();

} // RTUType
