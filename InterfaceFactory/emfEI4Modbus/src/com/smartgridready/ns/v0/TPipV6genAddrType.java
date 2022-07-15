/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPip V6gen Addr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * generic IPV6 device address, prelimnary, untested
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.TPipV6genAddrType#getPrelimStringDef <em>Prelim String Def</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getTPipV6genAddrType()
 * @model extendedMetaData="name='tPipV6genAddrType' kind='elementOnly'"
 * @generated
 */
public interface TPipV6genAddrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Prelim String Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prelim String Def</em>' attribute.
	 * @see #setPrelimStringDef(String)
	 * @see com.smartgridready.ns.v0.V0Package#getTPipV6genAddrType_PrelimStringDef()
	 * @model dataType="com.smartgridready.ns.v0.PrelimStringDefType" required="true"
	 *        extendedMetaData="kind='element' name='prelimStringDef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrelimStringDef();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TPipV6genAddrType#getPrelimStringDef <em>Prelim String Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prelim String Def</em>' attribute.
	 * @see #getPrelimStringDef()
	 * @generated
	 */
	void setPrelimStringDef(String value);

} // TPipV6genAddrType
