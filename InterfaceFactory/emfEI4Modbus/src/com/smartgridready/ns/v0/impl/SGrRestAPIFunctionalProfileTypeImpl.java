/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4RestAPIType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointType;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Rest API Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIFunctionalProfileTypeImpl#getRestAPIAttr <em>Rest API Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrRestAPIFunctionalProfileTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIFunctionalProfileTypeImpl extends SGrFunctionalProfileBaseTypeImpl implements SGrRestAPIFunctionalProfileType {
	/**
	 * The cached value of the '{@link #getRestAPIAttr() <em>Rest API Attr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrAttr4RestAPIType> restAPIAttr;

	/**
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIDataPointType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIFunctionalProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIFunctionalProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrAttr4RestAPIType> getRestAPIAttr() {
		if (restAPIAttr == null) {
			restAPIAttr = new EObjectContainmentEList<SGrAttr4RestAPIType>(SGrAttr4RestAPIType.class, this, V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR);
		}
		return restAPIAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrRestAPIDataPointType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrRestAPIDataPointType>(SGrRestAPIDataPointType.class, this, V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT);
		}
		return dpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR:
				return ((InternalEList<?>)getRestAPIAttr()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return ((InternalEList<?>)getDpListElement()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR:
				return getRestAPIAttr();
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return getDpListElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
				getRestAPIAttr().addAll((Collection<? extends SGrAttr4RestAPIType>)newValue);
				return;
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrRestAPIDataPointType>)newValue);
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
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR:
				getRestAPIAttr().clear();
				return;
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
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
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__REST_API_ATTR:
				return restAPIAttr != null && !restAPIAttr.isEmpty();
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrRestAPIFunctionalProfileTypeImpl
