/**
 */
package ch.smartgridready.sgr.ns.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPip V4gen Addr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * generic IPV4 device address
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4portNr <em>Ip V4port Nr</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n1 <em>Ip V4n1</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n2 <em>Ip V4n2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n3 <em>Ip V4n3</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n4 <em>Ip V4n4</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType()
 * @model extendedMetaData="name='tPipV4genAddrType' kind='elementOnly'"
 * @generated
 */
public interface TPipV4genAddrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip V4port Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4port Nr</em>' attribute.
	 * @see #isSetIpV4portNr()
	 * @see #unsetIpV4portNr()
	 * @see #setIpV4portNr(long)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType_IpV4portNr()
	 * @model unsettable="true" dataType="ch.smartgridready.sgr.ns.v0.IpV4portNrType" required="true"
	 *        extendedMetaData="kind='element' name='ipV4portNr' namespace='##targetNamespace'"
	 * @generated
	 */
	long getIpV4portNr();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4portNr <em>Ip V4port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4port Nr</em>' attribute.
	 * @see #isSetIpV4portNr()
	 * @see #unsetIpV4portNr()
	 * @see #getIpV4portNr()
	 * @generated
	 */
	void setIpV4portNr(long value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4portNr <em>Ip V4port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIpV4portNr()
	 * @see #getIpV4portNr()
	 * @see #setIpV4portNr(long)
	 * @generated
	 */
	void unsetIpV4portNr();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4portNr <em>Ip V4port Nr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ip V4port Nr</em>' attribute is set.
	 * @see #unsetIpV4portNr()
	 * @see #getIpV4portNr()
	 * @see #setIpV4portNr(long)
	 * @generated
	 */
	boolean isSetIpV4portNr();

	/**
	 * Returns the value of the '<em><b>Ip V4n1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4n1</em>' attribute.
	 * @see #setIpV4n1(BigInteger)
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType_IpV4n1()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.IpV4n1Type" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n1();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n1 <em>Ip V4n1</em>}' attribute.
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
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType_IpV4n2()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.IpV4n2Type" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n2();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n2 <em>Ip V4n2</em>}' attribute.
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
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType_IpV4n3()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.IpV4n3Type" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n3' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n3();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n3 <em>Ip V4n3</em>}' attribute.
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
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getTPipV4genAddrType_IpV4n4()
	 * @model dataType="ch.smartgridready.sgr.ns.v0.IpV4n4Type" required="true"
	 *        extendedMetaData="kind='element' name='ipV4n4' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIpV4n4();

	/**
	 * Sets the value of the '{@link ch.smartgridready.sgr.ns.v0.TPipV4genAddrType#getIpV4n4 <em>Ip V4n4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4n4</em>' attribute.
	 * @see #getIpV4n4()
	 * @generated
	 */
	void setIpV4n4(BigInteger value);

} // TPipV4genAddrType
