/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.ContactAPIInterfaceDescType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact API Interface Desc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.ContactAPIInterfaceDescTypeImpl#getNumContacts <em>Num Contacts</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.ContactAPIInterfaceDescTypeImpl#getContactStabilisationTimeMs <em>Contact Stabilisation Time Ms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactAPIInterfaceDescTypeImpl extends MinimalEObjectImpl.Container implements ContactAPIInterfaceDescType {
	/**
	 * The default value of the '{@link #getNumContacts() <em>Num Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumContacts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CONTACTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumContacts() <em>Num Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumContacts()
	 * @generated
	 * @ordered
	 */
	protected int numContacts = NUM_CONTACTS_EDEFAULT;

	/**
	 * This is true if the Num Contacts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numContactsESet;

	/**
	 * The default value of the '{@link #getContactStabilisationTimeMs() <em>Contact Stabilisation Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactStabilisationTimeMs()
	 * @generated
	 * @ordered
	 */
	protected static final long CONTACT_STABILISATION_TIME_MS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getContactStabilisationTimeMs() <em>Contact Stabilisation Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactStabilisationTimeMs()
	 * @generated
	 * @ordered
	 */
	protected long contactStabilisationTimeMs = CONTACT_STABILISATION_TIME_MS_EDEFAULT;

	/**
	 * This is true if the Contact Stabilisation Time Ms attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contactStabilisationTimeMsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactAPIInterfaceDescTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getContactAPIInterfaceDescType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumContacts() {
		return numContacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumContacts(int newNumContacts) {
		int oldNumContacts = numContacts;
		numContacts = newNumContacts;
		boolean oldNumContactsESet = numContactsESet;
		numContactsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS, oldNumContacts, numContacts, !oldNumContactsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumContacts() {
		int oldNumContacts = numContacts;
		boolean oldNumContactsESet = numContactsESet;
		numContacts = NUM_CONTACTS_EDEFAULT;
		numContactsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS, oldNumContacts, NUM_CONTACTS_EDEFAULT, oldNumContactsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumContacts() {
		return numContactsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getContactStabilisationTimeMs() {
		return contactStabilisationTimeMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactStabilisationTimeMs(long newContactStabilisationTimeMs) {
		long oldContactStabilisationTimeMs = contactStabilisationTimeMs;
		contactStabilisationTimeMs = newContactStabilisationTimeMs;
		boolean oldContactStabilisationTimeMsESet = contactStabilisationTimeMsESet;
		contactStabilisationTimeMsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS, oldContactStabilisationTimeMs, contactStabilisationTimeMs, !oldContactStabilisationTimeMsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContactStabilisationTimeMs() {
		long oldContactStabilisationTimeMs = contactStabilisationTimeMs;
		boolean oldContactStabilisationTimeMsESet = contactStabilisationTimeMsESet;
		contactStabilisationTimeMs = CONTACT_STABILISATION_TIME_MS_EDEFAULT;
		contactStabilisationTimeMsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS, oldContactStabilisationTimeMs, CONTACT_STABILISATION_TIME_MS_EDEFAULT, oldContactStabilisationTimeMsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContactStabilisationTimeMs() {
		return contactStabilisationTimeMsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS:
				return getNumContacts();
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS:
				return getContactStabilisationTimeMs();
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
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS:
				setNumContacts((Integer)newValue);
				return;
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS:
				setContactStabilisationTimeMs((Long)newValue);
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
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS:
				unsetNumContacts();
				return;
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS:
				unsetContactStabilisationTimeMs();
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
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__NUM_CONTACTS:
				return isSetNumContacts();
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE__CONTACT_STABILISATION_TIME_MS:
				return isSetContactStabilisationTimeMs();
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
		result.append(" (numContacts: ");
		if (numContactsESet) result.append(numContacts); else result.append("<unset>");
		result.append(", contactStabilisationTimeMs: ");
		if (contactStabilisationTimeMsESet) result.append(contactStabilisationTimeMs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ContactAPIInterfaceDescTypeImpl
