/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.TPipV4genAddrType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPip V4gen Addr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPipV4genAddrTypeImpl#getIpV4portNr <em>Ip V4port Nr</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPipV4genAddrTypeImpl#getIpV4n1 <em>Ip V4n1</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPipV4genAddrTypeImpl#getIpV4n2 <em>Ip V4n2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPipV4genAddrTypeImpl#getIpV4n3 <em>Ip V4n3</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPipV4genAddrTypeImpl#getIpV4n4 <em>Ip V4n4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPipV4genAddrTypeImpl extends MinimalEObjectImpl.Container implements TPipV4genAddrType {
	/**
	 * The default value of the '{@link #getIpV4portNr() <em>Ip V4port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4portNr()
	 * @generated
	 * @ordered
	 */
	protected static final long IP_V4PORT_NR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIpV4portNr() <em>Ip V4port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4portNr()
	 * @generated
	 * @ordered
	 */
	protected long ipV4portNr = IP_V4PORT_NR_EDEFAULT;

	/**
	 * This is true if the Ip V4port Nr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ipV4portNrESet;

	/**
	 * The default value of the '{@link #getIpV4n1() <em>Ip V4n1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IP_V4N1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpV4n1() <em>Ip V4n1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ipV4n1 = IP_V4N1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpV4n2() <em>Ip V4n2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IP_V4N2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpV4n2() <em>Ip V4n2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ipV4n2 = IP_V4N2_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpV4n3() <em>Ip V4n3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n3()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IP_V4N3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpV4n3() <em>Ip V4n3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n3()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ipV4n3 = IP_V4N3_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpV4n4() <em>Ip V4n4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n4()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IP_V4N4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpV4n4() <em>Ip V4n4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4n4()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ipV4n4 = IP_V4N4_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPipV4genAddrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTPipV4genAddrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIpV4portNr() {
		return ipV4portNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpV4portNr(long newIpV4portNr) {
		long oldIpV4portNr = ipV4portNr;
		ipV4portNr = newIpV4portNr;
		boolean oldIpV4portNrESet = ipV4portNrESet;
		ipV4portNrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR, oldIpV4portNr, ipV4portNr, !oldIpV4portNrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIpV4portNr() {
		long oldIpV4portNr = ipV4portNr;
		boolean oldIpV4portNrESet = ipV4portNrESet;
		ipV4portNr = IP_V4PORT_NR_EDEFAULT;
		ipV4portNrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR, oldIpV4portNr, IP_V4PORT_NR_EDEFAULT, oldIpV4portNrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIpV4portNr() {
		return ipV4portNrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIpV4n1() {
		return ipV4n1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpV4n1(BigInteger newIpV4n1) {
		BigInteger oldIpV4n1 = ipV4n1;
		ipV4n1 = newIpV4n1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N1, oldIpV4n1, ipV4n1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIpV4n2() {
		return ipV4n2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpV4n2(BigInteger newIpV4n2) {
		BigInteger oldIpV4n2 = ipV4n2;
		ipV4n2 = newIpV4n2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N2, oldIpV4n2, ipV4n2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIpV4n3() {
		return ipV4n3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpV4n3(BigInteger newIpV4n3) {
		BigInteger oldIpV4n3 = ipV4n3;
		ipV4n3 = newIpV4n3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N3, oldIpV4n3, ipV4n3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIpV4n4() {
		return ipV4n4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpV4n4(BigInteger newIpV4n4) {
		BigInteger oldIpV4n4 = ipV4n4;
		ipV4n4 = newIpV4n4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N4, oldIpV4n4, ipV4n4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR:
				return getIpV4portNr();
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N1:
				return getIpV4n1();
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N2:
				return getIpV4n2();
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N3:
				return getIpV4n3();
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N4:
				return getIpV4n4();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR:
				setIpV4portNr((Long)newValue);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N1:
				setIpV4n1((BigInteger)newValue);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N2:
				setIpV4n2((BigInteger)newValue);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N3:
				setIpV4n3((BigInteger)newValue);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N4:
				setIpV4n4((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR:
				unsetIpV4portNr();
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N1:
				setIpV4n1(IP_V4N1_EDEFAULT);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N2:
				setIpV4n2(IP_V4N2_EDEFAULT);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N3:
				setIpV4n3(IP_V4N3_EDEFAULT);
				return;
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N4:
				setIpV4n4(IP_V4N4_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4PORT_NR:
				return isSetIpV4portNr();
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N1:
				return IP_V4N1_EDEFAULT == null ? ipV4n1 != null : !IP_V4N1_EDEFAULT.equals(ipV4n1);
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N2:
				return IP_V4N2_EDEFAULT == null ? ipV4n2 != null : !IP_V4N2_EDEFAULT.equals(ipV4n2);
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N3:
				return IP_V4N3_EDEFAULT == null ? ipV4n3 != null : !IP_V4N3_EDEFAULT.equals(ipV4n3);
			case V0Package.TPIP_V4GEN_ADDR_TYPE__IP_V4N4:
				return IP_V4N4_EDEFAULT == null ? ipV4n4 != null : !IP_V4N4_EDEFAULT.equals(ipV4n4);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ipV4portNr: ");
		if (ipV4portNrESet) result.append(ipV4portNr); else result.append("<unset>");
		result.append(", ipV4n1: ");
		result.append(ipV4n1);
		result.append(", ipV4n2: ");
		result.append(ipV4n2);
		result.append(", ipV4n3: ");
		result.append(ipV4n3);
		result.append(", ipV4n4: ");
		result.append(ipV4n4);
		result.append(')');
		return result.toString();
	}

} //TPipV4genAddrTypeImpl
