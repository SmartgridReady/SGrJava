/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrRestBasicType#getRestBasicUsername <em>Rest Basic Username</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrRestBasicType#getRestBasicPassword <em>Rest Basic Password</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestBasicType()
 * @model extendedMetaData="name='SGrRestBasicType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestBasicType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest Basic Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Basic Username</em>' attribute.
	 * @see #setRestBasicUsername(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestBasicType_RestBasicUsername()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.RestBasicUsernameType" required="true"
	 *        extendedMetaData="kind='element' name='restBasicUsername' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRestBasicUsername();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrRestBasicType#getRestBasicUsername <em>Rest Basic Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Basic Username</em>' attribute.
	 * @see #getRestBasicUsername()
	 * @generated
	 */
	void setRestBasicUsername(String value);

	/**
	 * Returns the value of the '<em><b>Rest Basic Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Basic Password</em>' attribute.
	 * @see #setRestBasicPassword(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrRestBasicType_RestBasicPassword()
	 * @model dataType="ch.smartgridready.ns.s.gr.v0.RestBasicPasswordType" required="true"
	 *        extendedMetaData="kind='element' name='restBasicPassword' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRestBasicPassword();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrRestBasicType#getRestBasicPassword <em>Rest Basic Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Basic Password</em>' attribute.
	 * @see #getRestBasicPassword()
	 * @generated
	 */
	void setRestBasicPassword(String value);

} // SGrRestBasicType
