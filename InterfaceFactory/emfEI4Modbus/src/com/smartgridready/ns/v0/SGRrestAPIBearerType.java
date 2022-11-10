/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SG Rrest API Bearer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getServiceCall <em>Service Call</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGRrestAPIBearerType()
 * @model extendedMetaData="name='SGRrestAPIBearerType' kind='elementOnly'"
 * @generated
 */
public interface SGRrestAPIBearerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Call</em>' containment reference.
	 * @see #setServiceCall(RestServiceCall)
	 * @see com.smartgridready.ns.v0.V0Package#getSGRrestAPIBearerType_ServiceCall()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace'"
	 * @generated
	 */
	RestServiceCall getServiceCall();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType#getServiceCall <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Call</em>' containment reference.
	 * @see #getServiceCall()
	 * @generated
	 */
	void setServiceCall(RestServiceCall value);

} // SGRrestAPIBearerType
