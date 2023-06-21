/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Gen Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends the base functional profile type with generic data points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrGenFunctionalProfileType#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrGenFunctionalProfileType()
 * @model extendedMetaData="name='SGrGenFunctionalProfileType' kind='elementOnly'"
 * @generated
 */
public interface SGrGenFunctionalProfileType extends SGrFunctionalProfileBaseType {
	/**
	 * Returns the value of the '<em><b>Dp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrGenFunctionalProfileType_DpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointBaseType> getDpListElement();

} // SGrGenFunctionalProfileType
