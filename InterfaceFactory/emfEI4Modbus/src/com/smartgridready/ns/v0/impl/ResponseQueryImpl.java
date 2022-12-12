/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.ResponseQuery;
import com.smartgridready.ns.v0.ResponseQueryType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.ResponseQueryImpl#getQueryType <em>Query Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.ResponseQueryImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseQueryImpl extends MinimalEObjectImpl.Container implements ResponseQuery {
	/**
	 * The default value of the '{@link #getQueryType() <em>Query Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryType()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseQueryType QUERY_TYPE_EDEFAULT = ResponseQueryType.JMES_PATH_EXPRESSION;

	/**
	 * The cached value of the '{@link #getQueryType() <em>Query Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryType()
	 * @generated
	 * @ordered
	 */
	protected ResponseQueryType queryType = QUERY_TYPE_EDEFAULT;

	/**
	 * This is true if the Query Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryTypeESet;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getResponseQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseQueryType getQueryType() {
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryType(ResponseQueryType newQueryType) {
		ResponseQueryType oldQueryType = queryType;
		queryType = newQueryType == null ? QUERY_TYPE_EDEFAULT : newQueryType;
		boolean oldQueryTypeESet = queryTypeESet;
		queryTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RESPONSE_QUERY__QUERY_TYPE, oldQueryType, queryType, !oldQueryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryType() {
		ResponseQueryType oldQueryType = queryType;
		boolean oldQueryTypeESet = queryTypeESet;
		queryType = QUERY_TYPE_EDEFAULT;
		queryTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RESPONSE_QUERY__QUERY_TYPE, oldQueryType, QUERY_TYPE_EDEFAULT, oldQueryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryType() {
		return queryTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RESPONSE_QUERY__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.RESPONSE_QUERY__QUERY_TYPE:
				return getQueryType();
			case V0Package.RESPONSE_QUERY__QUERY:
				return getQuery();
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
			case V0Package.RESPONSE_QUERY__QUERY_TYPE:
				setQueryType((ResponseQueryType)newValue);
				return;
			case V0Package.RESPONSE_QUERY__QUERY:
				setQuery((String)newValue);
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
			case V0Package.RESPONSE_QUERY__QUERY_TYPE:
				unsetQueryType();
				return;
			case V0Package.RESPONSE_QUERY__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case V0Package.RESPONSE_QUERY__QUERY_TYPE:
				return isSetQueryType();
			case V0Package.RESPONSE_QUERY__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
		result.append(" (queryType: ");
		if (queryTypeESet) result.append(queryType); else result.append("<unset>");
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //ResponseQueryImpl
