/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrSmoothTransitionType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Smooth Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrSmoothTransitionTypeImpl#getWinTms <em>Win Tms</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrSmoothTransitionTypeImpl#getRvrtTms <em>Rvrt Tms</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrSmoothTransitionTypeImpl#getRmpTms <em>Rmp Tms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrSmoothTransitionTypeImpl extends MinimalEObjectImpl.Container implements SGrSmoothTransitionType {
	/**
	 * The default value of the '{@link #getWinTms() <em>Win Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinTms()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIN_TMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinTms() <em>Win Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinTms()
	 * @generated
	 * @ordered
	 */
	protected BigInteger winTms = WIN_TMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRvrtTms() <em>Rvrt Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvrtTms()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RVRT_TMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRvrtTms() <em>Rvrt Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvrtTms()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rvrtTms = RVRT_TMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmpTms() <em>Rmp Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmpTms()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RMP_TMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRmpTms() <em>Rmp Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmpTms()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rmpTms = RMP_TMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrSmoothTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrSmoothTransitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getWinTms() {
		return winTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinTms(BigInteger newWinTms) {
		BigInteger oldWinTms = winTms;
		winTms = newWinTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS, oldWinTms, winTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRvrtTms() {
		return rvrtTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRvrtTms(BigInteger newRvrtTms) {
		BigInteger oldRvrtTms = rvrtTms;
		rvrtTms = newRvrtTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS, oldRvrtTms, rvrtTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRmpTms() {
		return rmpTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRmpTms(BigInteger newRmpTms) {
		BigInteger oldRmpTms = rmpTms;
		rmpTms = newRmpTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS, oldRmpTms, rmpTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS:
				return getWinTms();
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS:
				return getRvrtTms();
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS:
				return getRmpTms();
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
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS:
				setWinTms((BigInteger)newValue);
				return;
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS:
				setRvrtTms((BigInteger)newValue);
				return;
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS:
				setRmpTms((BigInteger)newValue);
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
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS:
				setWinTms(WIN_TMS_EDEFAULT);
				return;
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS:
				setRvrtTms(RVRT_TMS_EDEFAULT);
				return;
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS:
				setRmpTms(RMP_TMS_EDEFAULT);
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
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__WIN_TMS:
				return WIN_TMS_EDEFAULT == null ? winTms != null : !WIN_TMS_EDEFAULT.equals(winTms);
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RVRT_TMS:
				return RVRT_TMS_EDEFAULT == null ? rvrtTms != null : !RVRT_TMS_EDEFAULT.equals(rvrtTms);
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE__RMP_TMS:
				return RMP_TMS_EDEFAULT == null ? rmpTms != null : !RMP_TMS_EDEFAULT.equals(rmpTms);
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
		result.append(" (winTms: ");
		result.append(winTms);
		result.append(", rvrtTms: ");
		result.append(rvrtTms);
		result.append(", rmpTms: ");
		result.append(rmpTms);
		result.append(')');
		return result.toString();
	}

} //SGrSmoothTransitionTypeImpl
