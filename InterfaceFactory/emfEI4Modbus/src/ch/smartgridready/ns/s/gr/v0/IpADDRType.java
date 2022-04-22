/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip ADDR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modbus device address
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n1 <em>Ip V4n1</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n2 <em>Ip V4n2</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n3 <em>Ip V4n3</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n4 <em>Ip V4n4</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getIpADDRType()
 * @model extendedMetaData="name='ipADDRType' kind='elementOnly'"
 * @generated
 */
public interface IpADDRType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip V4n1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4n1</em>' attribute.
	 * @see #setIpV4n1(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getIpADDRType_IpV4n1()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.IpV4n1Type1" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n1();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n1 <em>Ip V4n1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4n1</em>' attribute.
	 * @see #getIpV4n1()
	 * @generated
	 */
	void setIpV4n1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ip V4n2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4n2</em>' attribute.
	 * @see #setIpV4n2(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getIpADDRType_IpV4n2()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.IpV4n2Type1" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n2();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n2 <em>Ip V4n2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4n2</em>' attribute.
	 * @see #getIpV4n2()
	 * @generated
	 */
	void setIpV4n2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ip V4n3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4n3</em>' attribute.
	 * @see #setIpV4n3(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getIpADDRType_IpV4n3()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.IpV4n3Type1" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n3' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n3();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n3 <em>Ip V4n3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4n3</em>' attribute.
	 * @see #getIpV4n3()
	 * @generated
	 */
	void setIpV4n3(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ip V4n4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4n4</em>' attribute.
	 * @see #setIpV4n4(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getIpADDRType_IpV4n4()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.IpV4n4Type1" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n4' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n4();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.IpADDRType#getIpV4n4 <em>Ip V4n4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4n4</em>' attribute.
	 * @see #getIpV4n4()
	 * @generated
	 */
	void setIpV4n4(BigInteger value);

} // IpADDRType
