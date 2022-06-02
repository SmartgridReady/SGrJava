/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TCPType#getTcpTrspSrvInstance <em>Tcp Trsp Srv Instance</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TCPType#getTcpDevInstance <em>Tcp Dev Instance</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTCPType()
 * @model extendedMetaData="name='TCPType' kind='elementOnly'"
 * @generated
 */
public interface TCPType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tcp Trsp Srv Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcp Trsp Srv Instance</em>' containment reference.
	 * @see #setTcpTrspSrvInstance(TCPtrspSrvInstanceType)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTCPType_TcpTrspSrvInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tcpTrspSrvInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	TCPtrspSrvInstanceType getTcpTrspSrvInstance();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TCPType#getTcpTrspSrvInstance <em>Tcp Trsp Srv Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcp Trsp Srv Instance</em>' containment reference.
	 * @see #getTcpTrspSrvInstance()
	 * @generated
	 */
	void setTcpTrspSrvInstance(TCPtrspSrvInstanceType value);

	/**
	 * Returns the value of the '<em><b>Tcp Dev Instance</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.TCPDevInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcp Dev Instance</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTCPType_TcpDevInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tcpDevInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCPDevInstanceType> getTcpDevInstance();

} // TCPType
