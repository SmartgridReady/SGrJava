/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Version Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a three digit version mumber system.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getPrimaryVersionNumber <em>Primary Version Number</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSecondaryVersionNumber <em>Secondary Version Number</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrVersionNumberType()
 * @model extendedMetaData="name='SGrVersionNumberType' kind='elementOnly'"
 * @generated
 */
public interface SGrVersionNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Version Number</em>' attribute.
	 * @see #isSetPrimaryVersionNumber()
	 * @see #unsetPrimaryVersionNumber()
	 * @see #setPrimaryVersionNumber(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrVersionNumberType_PrimaryVersionNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='primaryVersionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPrimaryVersionNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getPrimaryVersionNumber <em>Primary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Version Number</em>' attribute.
	 * @see #isSetPrimaryVersionNumber()
	 * @see #unsetPrimaryVersionNumber()
	 * @see #getPrimaryVersionNumber()
	 * @generated
	 */
	void setPrimaryVersionNumber(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getPrimaryVersionNumber <em>Primary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimaryVersionNumber()
	 * @see #getPrimaryVersionNumber()
	 * @see #setPrimaryVersionNumber(int)
	 * @generated
	 */
	void unsetPrimaryVersionNumber();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getPrimaryVersionNumber <em>Primary Version Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Primary Version Number</em>' attribute is set.
	 * @see #unsetPrimaryVersionNumber()
	 * @see #getPrimaryVersionNumber()
	 * @see #setPrimaryVersionNumber(int)
	 * @generated
	 */
	boolean isSetPrimaryVersionNumber();

	/**
	 * Returns the value of the '<em><b>Secondary Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Version Number</em>' attribute.
	 * @see #isSetSecondaryVersionNumber()
	 * @see #unsetSecondaryVersionNumber()
	 * @see #setSecondaryVersionNumber(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrVersionNumberType_SecondaryVersionNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='secondaryVersionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSecondaryVersionNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSecondaryVersionNumber <em>Secondary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Version Number</em>' attribute.
	 * @see #isSetSecondaryVersionNumber()
	 * @see #unsetSecondaryVersionNumber()
	 * @see #getSecondaryVersionNumber()
	 * @generated
	 */
	void setSecondaryVersionNumber(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSecondaryVersionNumber <em>Secondary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondaryVersionNumber()
	 * @see #getSecondaryVersionNumber()
	 * @see #setSecondaryVersionNumber(int)
	 * @generated
	 */
	void unsetSecondaryVersionNumber();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSecondaryVersionNumber <em>Secondary Version Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Secondary Version Number</em>' attribute is set.
	 * @see #unsetSecondaryVersionNumber()
	 * @see #getSecondaryVersionNumber()
	 * @see #setSecondaryVersionNumber(int)
	 * @generated
	 */
	boolean isSetSecondaryVersionNumber();

	/**
	 * Returns the value of the '<em><b>Sub Release Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Release Version Number</em>' attribute.
	 * @see #isSetSubReleaseVersionNumber()
	 * @see #unsetSubReleaseVersionNumber()
	 * @see #setSubReleaseVersionNumber(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrVersionNumberType_SubReleaseVersionNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='subReleaseVersionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSubReleaseVersionNumber();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Release Version Number</em>' attribute.
	 * @see #isSetSubReleaseVersionNumber()
	 * @see #unsetSubReleaseVersionNumber()
	 * @see #getSubReleaseVersionNumber()
	 * @generated
	 */
	void setSubReleaseVersionNumber(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubReleaseVersionNumber()
	 * @see #getSubReleaseVersionNumber()
	 * @see #setSubReleaseVersionNumber(int)
	 * @generated
	 */
	void unsetSubReleaseVersionNumber();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrVersionNumberType#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Release Version Number</em>' attribute is set.
	 * @see #unsetSubReleaseVersionNumber()
	 * @see #getSubReleaseVersionNumber()
	 * @see #setSubReleaseVersionNumber(int)
	 * @generated
	 */
	boolean isSetSubReleaseVersionNumber();

} // SGrVersionNumberType
