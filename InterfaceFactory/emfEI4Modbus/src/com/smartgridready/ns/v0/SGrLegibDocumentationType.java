/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Legib Documentation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element us used to extend the definitions with
 * 				legible text elements: a short understandbale explanation of the
 * 				items addressed. These elements are used for printed and published
 * 				information
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getTextElement <em>Text Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrLegibDocumentationType()
 * @model extendedMetaData="name='SGrLegibDocumentationType' kind='elementOnly'"
 * @generated
 */
public interface SGrLegibDocumentationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * information to be published
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Element</em>' attribute.
	 * @see #setTextElement(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrLegibDocumentationType_TextElement()
	 * @model dataType="com.smartgridready.ns.v0.TextElementType" required="true"
	 *        extendedMetaData="kind='element' name='textElement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextElement();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getTextElement <em>Text Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Element</em>' attribute.
	 * @see #getTextElement()
	 * @generated
	 */
	void setTextElement(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrLanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * language identifier de, en, fr, it
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(SGrLanguageType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrLegibDocumentationType_Language()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrLanguageType getLanguage();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrLanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(SGrLanguageType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(SGrLanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(SGrLanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI pointong towards additional information
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrLegibDocumentationType_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // SGrLegibDocumentationType
