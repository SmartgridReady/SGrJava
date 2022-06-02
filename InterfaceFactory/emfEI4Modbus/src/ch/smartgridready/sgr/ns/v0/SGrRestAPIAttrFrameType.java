/**
 */
package ch.smartgridready.sgr.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Rest API Attr Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.SGrRestAPIAttrFrameType#getRestAPIAttr <em>Rest API Attr</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIAttrFrameType()
 * @model extendedMetaData="name='SGrRestAPIAttrFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrRestAPIAttrFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIAttrFrameType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

	/**
	 * Returns the value of the '<em><b>Rest API Attr</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.sgr.ns.v0.SGrAttr4RestAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest API Attr</em>' containment reference list.
	 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIAttrFrameType_RestAPIAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restAPIAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4RestAPIType> getRestAPIAttr();

} // SGrRestAPIAttrFrameType
