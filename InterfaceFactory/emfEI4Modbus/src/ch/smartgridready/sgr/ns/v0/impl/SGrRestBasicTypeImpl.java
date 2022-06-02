/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGrRestBasicType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Rest Basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestBasicTypeImpl#getRestBasicUsername <em>Rest Basic Username</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestBasicTypeImpl#getRestBasicPassword <em>Rest Basic Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestBasicTypeImpl extends MinimalEObjectImpl.Container implements SGrRestBasicType {
	/**
	 * The default value of the '{@link #getRestBasicUsername() <em>Rest Basic Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestBasicUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_BASIC_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestBasicUsername() <em>Rest Basic Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestBasicUsername()
	 * @generated
	 * @ordered
	 */
	protected String restBasicUsername = REST_BASIC_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestBasicPassword() <em>Rest Basic Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestBasicPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_BASIC_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestBasicPassword() <em>Rest Basic Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestBasicPassword()
	 * @generated
	 * @ordered
	 */
	protected String restBasicPassword = REST_BASIC_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestBasicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestBasicType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestBasicUsername() {
		return restBasicUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestBasicUsername(String newRestBasicUsername) {
		String oldRestBasicUsername = restBasicUsername;
		restBasicUsername = newRestBasicUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME, oldRestBasicUsername, restBasicUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestBasicPassword() {
		return restBasicPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestBasicPassword(String newRestBasicPassword) {
		String oldRestBasicPassword = restBasicPassword;
		restBasicPassword = newRestBasicPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD, oldRestBasicPassword, restBasicPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME:
				return getRestBasicUsername();
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD:
				return getRestBasicPassword();
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
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME:
				setRestBasicUsername((String)newValue);
				return;
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD:
				setRestBasicPassword((String)newValue);
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
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME:
				setRestBasicUsername(REST_BASIC_USERNAME_EDEFAULT);
				return;
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD:
				setRestBasicPassword(REST_BASIC_PASSWORD_EDEFAULT);
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
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_USERNAME:
				return REST_BASIC_USERNAME_EDEFAULT == null ? restBasicUsername != null : !REST_BASIC_USERNAME_EDEFAULT.equals(restBasicUsername);
			case V0Package.SGR_REST_BASIC_TYPE__REST_BASIC_PASSWORD:
				return REST_BASIC_PASSWORD_EDEFAULT == null ? restBasicPassword != null : !REST_BASIC_PASSWORD_EDEFAULT.equals(restBasicPassword);
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
		result.append(" (restBasicUsername: ");
		result.append(restBasicUsername);
		result.append(", restBasicPassword: ");
		result.append(restBasicPassword);
		result.append(')');
		return result.toString();
	}

} //SGrRestBasicTypeImpl
