/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.ApiTreeType;
import ch.smartgridready.ns.s.gr.v0.ConnectionState;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Tree Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.ApiTreeTypeImpl#getIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.ApiTreeTypeImpl#getNumFPs <em>Num FPs</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.ApiTreeTypeImpl#getNumDPs <em>Num DPs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiTreeTypeImpl extends MinimalEObjectImpl.Container implements ApiTreeType {
	/**
	 * The cached value of the '{@link #getIsConnected() <em>Is Connected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConnected()
	 * @generated
	 * @ordered
	 */
	protected ConnectionState isConnected;

	/**
	 * The default value of the '{@link #getNumFPs() <em>Num FPs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFPs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_FPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumFPs() <em>Num FPs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFPs()
	 * @generated
	 * @ordered
	 */
	protected int numFPs = NUM_FPS_EDEFAULT;

	/**
	 * This is true if the Num FPs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numFPsESet;

	/**
	 * The cached value of the '{@link #getNumDPs() <em>Num DPs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumDPs()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numDPs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiTreeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getApiTreeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionState getIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConnected(ConnectionState newIsConnected, NotificationChain msgs) {
		ConnectionState oldIsConnected = isConnected;
		isConnected = newIsConnected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.API_TREE_TYPE__IS_CONNECTED, oldIsConnected, newIsConnected);
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
	public void setIsConnected(ConnectionState newIsConnected) {
		if (newIsConnected != isConnected) {
			NotificationChain msgs = null;
			if (isConnected != null)
				msgs = ((InternalEObject)isConnected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.API_TREE_TYPE__IS_CONNECTED, null, msgs);
			if (newIsConnected != null)
				msgs = ((InternalEObject)newIsConnected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.API_TREE_TYPE__IS_CONNECTED, null, msgs);
			msgs = basicSetIsConnected(newIsConnected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.API_TREE_TYPE__IS_CONNECTED, newIsConnected, newIsConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumFPs() {
		return numFPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumFPs(int newNumFPs) {
		int oldNumFPs = numFPs;
		numFPs = newNumFPs;
		boolean oldNumFPsESet = numFPsESet;
		numFPsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.API_TREE_TYPE__NUM_FPS, oldNumFPs, numFPs, !oldNumFPsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNumFPs() {
		int oldNumFPs = numFPs;
		boolean oldNumFPsESet = numFPsESet;
		numFPs = NUM_FPS_EDEFAULT;
		numFPsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.API_TREE_TYPE__NUM_FPS, oldNumFPs, NUM_FPS_EDEFAULT, oldNumFPsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNumFPs() {
		return numFPsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumDPs() {
		if (numDPs == null) {
			numDPs = new EDataTypeEList<Integer>(Integer.class, this, V0Package.API_TREE_TYPE__NUM_DPS);
		}
		return numDPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.API_TREE_TYPE__IS_CONNECTED:
				return basicSetIsConnected(null, msgs);
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
			case V0Package.API_TREE_TYPE__IS_CONNECTED:
				return getIsConnected();
			case V0Package.API_TREE_TYPE__NUM_FPS:
				return getNumFPs();
			case V0Package.API_TREE_TYPE__NUM_DPS:
				return getNumDPs();
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
			case V0Package.API_TREE_TYPE__IS_CONNECTED:
				setIsConnected((ConnectionState)newValue);
				return;
			case V0Package.API_TREE_TYPE__NUM_FPS:
				setNumFPs((Integer)newValue);
				return;
			case V0Package.API_TREE_TYPE__NUM_DPS:
				getNumDPs().clear();
				getNumDPs().addAll((Collection<? extends Integer>)newValue);
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
			case V0Package.API_TREE_TYPE__IS_CONNECTED:
				setIsConnected((ConnectionState)null);
				return;
			case V0Package.API_TREE_TYPE__NUM_FPS:
				unsetNumFPs();
				return;
			case V0Package.API_TREE_TYPE__NUM_DPS:
				getNumDPs().clear();
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
			case V0Package.API_TREE_TYPE__IS_CONNECTED:
				return isConnected != null;
			case V0Package.API_TREE_TYPE__NUM_FPS:
				return isSetNumFPs();
			case V0Package.API_TREE_TYPE__NUM_DPS:
				return numDPs != null && !numDPs.isEmpty();
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
		result.append(" (numFPs: ");
		if (numFPsESet) result.append(numFPs); else result.append("<unset>");
		result.append(", numDPs: ");
		result.append(numDPs);
		result.append(')');
		return result.toString();
	}

} //ApiTreeTypeImpl
