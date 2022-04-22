/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCP Dev Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.TCPDevInstanceType#getDevInstName <em>Dev Inst Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.TCPDevInstanceType#getDevAddr <em>Dev Addr</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getTCPDevInstanceType()
 * @model extendedMetaData="name='TCPDevInstanceType' kind='elementOnly'"
 * @generated
 */
public interface TCPDevInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dev Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev Inst Name</em>' attribute.
	 * @see #setDevInstName(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getTCPDevInstanceType_DevInstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='devInstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDevInstName();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.TCPDevInstanceType#getDevInstName <em>Dev Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Inst Name</em>' attribute.
	 * @see #getDevInstName()
	 * @generated
	 */
	void setDevInstName(String value);

	/**
	 * Returns the value of the '<em><b>Dev Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev Addr</em>' containment reference.
	 * @see #setDevAddr(TPIPModbus)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getTCPDevInstanceType_DevAddr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='devAddr' namespace='##targetNamespace'"
	 * @generated
	 */
	TPIPModbus getDevAddr();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.TCPDevInstanceType#getDevAddr <em>Dev Addr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Addr</em>' containment reference.
	 * @see #getDevAddr()
	 * @generated
	 */
	void setDevAddr(TPIPModbus value);

} // TCPDevInstanceType
