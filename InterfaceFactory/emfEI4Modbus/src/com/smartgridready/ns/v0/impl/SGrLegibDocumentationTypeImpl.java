/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrLanguageType;
import com.smartgridready.ns.v0.SGrLegibDocumentationType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Legib Documentation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrLegibDocumentationTypeImpl#getTextElement <em>Text Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrLegibDocumentationTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrLegibDocumentationTypeImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrLegibDocumentationTypeImpl extends MinimalEObjectImpl.Container implements SGrLegibDocumentationType {
	/**
	 * The default value of the '{@link #getTextElement() <em>Text Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElement()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextElement() <em>Text Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElement()
	 * @generated
	 * @ordered
	 */
	protected String textElement = TEXT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final SGrLanguageType LANGUAGE_EDEFAULT = SGrLanguageType.DE;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected SGrLanguageType language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrLegibDocumentationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrLegibDocumentationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextElement() {
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextElement(String newTextElement) {
		String oldTextElement = textElement;
		textElement = newTextElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT, oldTextElement, textElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrLanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(SGrLanguageType newLanguage) {
		SGrLanguageType oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguage() {
		SGrLanguageType oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT:
				return getTextElement();
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE:
				return getLanguage();
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__URI:
				return getUri();
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
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT:
				setTextElement((String)newValue);
				return;
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE:
				setLanguage((SGrLanguageType)newValue);
				return;
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__URI:
				setUri((String)newValue);
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
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT:
				setTextElement(TEXT_ELEMENT_EDEFAULT);
				return;
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__URI:
				setUri(URI_EDEFAULT);
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
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__TEXT_ELEMENT:
				return TEXT_ELEMENT_EDEFAULT == null ? textElement != null : !TEXT_ELEMENT_EDEFAULT.equals(textElement);
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__LANGUAGE:
				return isSetLanguage();
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (textElement: ");
		result.append(textElement);
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //SGrLegibDocumentationTypeImpl
