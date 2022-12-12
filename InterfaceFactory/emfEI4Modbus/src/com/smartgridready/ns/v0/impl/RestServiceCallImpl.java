/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.HeaderList;
import com.smartgridready.ns.v0.HttpMethod;
import com.smartgridready.ns.v0.ResponseQuery;
import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Service Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl#getRequestPath <em>Request Path</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl#getRequestBody <em>Request Body</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.RestServiceCallImpl#getResponseQuery <em>Response Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestServiceCallImpl extends MinimalEObjectImpl.Container implements RestServiceCall {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderList requestHeader;

	/**
	 * The default value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod REQUEST_METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod requestMethod = REQUEST_METHOD_EDEFAULT;

	/**
	 * This is true if the Request Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestMethodESet;

	/**
	 * The default value of the '{@link #getRequestPath() <em>Request Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestPath() <em>Request Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPath()
	 * @generated
	 * @ordered
	 */
	protected String requestPath = REQUEST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestBody() <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBody()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestBody() <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBody()
	 * @generated
	 * @ordered
	 */
	protected String requestBody = REQUEST_BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponseQuery() <em>Response Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseQuery()
	 * @generated
	 * @ordered
	 */
	protected ResponseQuery responseQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestServiceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getRestServiceCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderList getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(HeaderList newRequestHeader, NotificationChain msgs) {
		HeaderList oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__REQUEST_HEADER, oldRequestHeader, newRequestHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(HeaderList newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.REST_SERVICE_CALL__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.REST_SERVICE_CALL__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__REQUEST_HEADER, newRequestHeader, newRequestHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getRequestMethod() {
		return requestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestMethod(HttpMethod newRequestMethod) {
		HttpMethod oldRequestMethod = requestMethod;
		requestMethod = newRequestMethod == null ? REQUEST_METHOD_EDEFAULT : newRequestMethod;
		boolean oldRequestMethodESet = requestMethodESet;
		requestMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__REQUEST_METHOD, oldRequestMethod, requestMethod, !oldRequestMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestMethod() {
		HttpMethod oldRequestMethod = requestMethod;
		boolean oldRequestMethodESet = requestMethodESet;
		requestMethod = REQUEST_METHOD_EDEFAULT;
		requestMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.REST_SERVICE_CALL__REQUEST_METHOD, oldRequestMethod, REQUEST_METHOD_EDEFAULT, oldRequestMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestMethod() {
		return requestMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestPath() {
		return requestPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestPath(String newRequestPath) {
		String oldRequestPath = requestPath;
		requestPath = newRequestPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__REQUEST_PATH, oldRequestPath, requestPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestBody() {
		return requestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestBody(String newRequestBody) {
		String oldRequestBody = requestBody;
		requestBody = newRequestBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__REQUEST_BODY, oldRequestBody, requestBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseQuery getResponseQuery() {
		return responseQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseQuery(ResponseQuery newResponseQuery, NotificationChain msgs) {
		ResponseQuery oldResponseQuery = responseQuery;
		responseQuery = newResponseQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__RESPONSE_QUERY, oldResponseQuery, newResponseQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseQuery(ResponseQuery newResponseQuery) {
		if (newResponseQuery != responseQuery) {
			NotificationChain msgs = null;
			if (responseQuery != null)
				msgs = ((InternalEObject)responseQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.REST_SERVICE_CALL__RESPONSE_QUERY, null, msgs);
			if (newResponseQuery != null)
				msgs = ((InternalEObject)newResponseQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.REST_SERVICE_CALL__RESPONSE_QUERY, null, msgs);
			msgs = basicSetResponseQuery(newResponseQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.REST_SERVICE_CALL__RESPONSE_QUERY, newResponseQuery, newResponseQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.REST_SERVICE_CALL__REQUEST_HEADER:
				return basicSetRequestHeader(null, msgs);
			case V0Package.REST_SERVICE_CALL__RESPONSE_QUERY:
				return basicSetResponseQuery(null, msgs);
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
			case V0Package.REST_SERVICE_CALL__REQUEST_HEADER:
				return getRequestHeader();
			case V0Package.REST_SERVICE_CALL__REQUEST_METHOD:
				return getRequestMethod();
			case V0Package.REST_SERVICE_CALL__REQUEST_PATH:
				return getRequestPath();
			case V0Package.REST_SERVICE_CALL__REQUEST_BODY:
				return getRequestBody();
			case V0Package.REST_SERVICE_CALL__RESPONSE_QUERY:
				return getResponseQuery();
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
			case V0Package.REST_SERVICE_CALL__REQUEST_HEADER:
				setRequestHeader((HeaderList)newValue);
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_METHOD:
				setRequestMethod((HttpMethod)newValue);
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_PATH:
				setRequestPath((String)newValue);
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_BODY:
				setRequestBody((String)newValue);
				return;
			case V0Package.REST_SERVICE_CALL__RESPONSE_QUERY:
				setResponseQuery((ResponseQuery)newValue);
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
			case V0Package.REST_SERVICE_CALL__REQUEST_HEADER:
				setRequestHeader((HeaderList)null);
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_METHOD:
				unsetRequestMethod();
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_PATH:
				setRequestPath(REQUEST_PATH_EDEFAULT);
				return;
			case V0Package.REST_SERVICE_CALL__REQUEST_BODY:
				setRequestBody(REQUEST_BODY_EDEFAULT);
				return;
			case V0Package.REST_SERVICE_CALL__RESPONSE_QUERY:
				setResponseQuery((ResponseQuery)null);
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
			case V0Package.REST_SERVICE_CALL__REQUEST_HEADER:
				return requestHeader != null;
			case V0Package.REST_SERVICE_CALL__REQUEST_METHOD:
				return isSetRequestMethod();
			case V0Package.REST_SERVICE_CALL__REQUEST_PATH:
				return REQUEST_PATH_EDEFAULT == null ? requestPath != null : !REQUEST_PATH_EDEFAULT.equals(requestPath);
			case V0Package.REST_SERVICE_CALL__REQUEST_BODY:
				return REQUEST_BODY_EDEFAULT == null ? requestBody != null : !REQUEST_BODY_EDEFAULT.equals(requestBody);
			case V0Package.REST_SERVICE_CALL__RESPONSE_QUERY:
				return responseQuery != null;
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
		result.append(" (requestMethod: ");
		if (requestMethodESet) result.append(requestMethod); else result.append("<unset>");
		result.append(", requestPath: ");
		result.append(requestPath);
		result.append(", requestBody: ");
		result.append(requestBody);
		result.append(')');
		return result.toString();
	}

} //RestServiceCallImpl
