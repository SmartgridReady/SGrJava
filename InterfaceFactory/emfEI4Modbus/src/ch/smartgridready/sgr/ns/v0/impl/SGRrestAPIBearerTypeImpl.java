/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.RestAPIJMESPathType1;
import ch.smartgridready.sgr.ns.v0.SGRrestAPIBearerType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SG Rrest API Bearer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGRrestAPIBearerTypeImpl#getRestAPIEndPoint <em>Rest API End Point</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGRrestAPIBearerTypeImpl#getRestAPIJMESPath <em>Rest APIJMES Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGRrestAPIBearerTypeImpl extends MinimalEObjectImpl.Container implements SGRrestAPIBearerType {
	/**
	 * The default value of the '{@link #getRestAPIEndPoint() <em>Rest API End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_API_END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestAPIEndPoint() <em>Rest API End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIEndPoint()
	 * @generated
	 * @ordered
	 */
	protected String restAPIEndPoint = REST_API_END_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestAPIJMESPath() <em>Rest APIJMES Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIJMESPath()
	 * @generated
	 * @ordered
	 */
	protected RestAPIJMESPathType1 restAPIJMESPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGRrestAPIBearerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGRrestAPIBearerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestAPIEndPoint() {
		return restAPIEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIEndPoint(String newRestAPIEndPoint) {
		String oldRestAPIEndPoint = restAPIEndPoint;
		restAPIEndPoint = newRestAPIEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SG_RREST_API_BEARER_TYPE__REST_API_END_POINT, oldRestAPIEndPoint, restAPIEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestAPIJMESPathType1 getRestAPIJMESPath() {
		return restAPIJMESPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestAPIJMESPath(RestAPIJMESPathType1 newRestAPIJMESPath, NotificationChain msgs) {
		RestAPIJMESPathType1 oldRestAPIJMESPath = restAPIJMESPath;
		restAPIJMESPath = newRestAPIJMESPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH, oldRestAPIJMESPath, newRestAPIJMESPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIJMESPath(RestAPIJMESPathType1 newRestAPIJMESPath) {
		if (newRestAPIJMESPath != restAPIJMESPath) {
			NotificationChain msgs = null;
			if (restAPIJMESPath != null)
				msgs = ((InternalEObject)restAPIJMESPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH, null, msgs);
			if (newRestAPIJMESPath != null)
				msgs = ((InternalEObject)newRestAPIJMESPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH, null, msgs);
			msgs = basicSetRestAPIJMESPath(newRestAPIJMESPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH, newRestAPIJMESPath, newRestAPIJMESPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH:
				return basicSetRestAPIJMESPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_API_END_POINT:
				return getRestAPIEndPoint();
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH:
				return getRestAPIJMESPath();
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
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_API_END_POINT:
				setRestAPIEndPoint((String)newValue);
				return;
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH:
				setRestAPIJMESPath((RestAPIJMESPathType1)newValue);
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
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_API_END_POINT:
				setRestAPIEndPoint(REST_API_END_POINT_EDEFAULT);
				return;
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH:
				setRestAPIJMESPath((RestAPIJMESPathType1)null);
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
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_API_END_POINT:
				return REST_API_END_POINT_EDEFAULT == null ? restAPIEndPoint != null : !REST_API_END_POINT_EDEFAULT.equals(restAPIEndPoint);
			case V0Package.SG_RREST_API_BEARER_TYPE__REST_APIJMES_PATH:
				return restAPIJMESPath != null;
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
		result.append(" (restAPIEndPoint: ");
		result.append(restAPIEndPoint);
		result.append(')');
		return result.toString();
	}

} //SGRrestAPIBearerTypeImpl
