/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrChangeLog;
import com.smartgridready.ns.v0.SGrReleaseNotes;
import com.smartgridready.ns.v0.SGrReleaseState;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Release Notes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrReleaseNotesImpl#getState <em>State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrReleaseNotesImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrReleaseNotesImpl#getChangelog <em>Changelog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrReleaseNotesImpl extends MinimalEObjectImpl.Container implements SGrReleaseNotes {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrReleaseState STATE_EDEFAULT = SGrReleaseState.DRAFT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SGrReleaseState state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangelog() <em>Changelog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangelog()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrChangeLog> changelog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrReleaseNotesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrReleaseNotes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrReleaseState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SGrReleaseState newState) {
		SGrReleaseState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RELEASE_NOTES__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		SGrReleaseState oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_RELEASE_NOTES__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RELEASE_NOTES__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrChangeLog> getChangelog() {
		if (changelog == null) {
			changelog = new EObjectContainmentEList<SGrChangeLog>(SGrChangeLog.class, this, V0Package.SGR_RELEASE_NOTES__CHANGELOG);
		}
		return changelog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_RELEASE_NOTES__CHANGELOG:
				return ((InternalEList<?>)getChangelog()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_RELEASE_NOTES__STATE:
				return getState();
			case V0Package.SGR_RELEASE_NOTES__REMARKS:
				return getRemarks();
			case V0Package.SGR_RELEASE_NOTES__CHANGELOG:
				return getChangelog();
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
			case V0Package.SGR_RELEASE_NOTES__STATE:
				setState((SGrReleaseState)newValue);
				return;
			case V0Package.SGR_RELEASE_NOTES__REMARKS:
				setRemarks((String)newValue);
				return;
			case V0Package.SGR_RELEASE_NOTES__CHANGELOG:
				getChangelog().clear();
				getChangelog().addAll((Collection<? extends SGrChangeLog>)newValue);
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
			case V0Package.SGR_RELEASE_NOTES__STATE:
				unsetState();
				return;
			case V0Package.SGR_RELEASE_NOTES__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case V0Package.SGR_RELEASE_NOTES__CHANGELOG:
				getChangelog().clear();
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
			case V0Package.SGR_RELEASE_NOTES__STATE:
				return isSetState();
			case V0Package.SGR_RELEASE_NOTES__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case V0Package.SGR_RELEASE_NOTES__CHANGELOG:
				return changelog != null && !changelog.isEmpty();
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
		result.append(" (state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //SGrReleaseNotesImpl
