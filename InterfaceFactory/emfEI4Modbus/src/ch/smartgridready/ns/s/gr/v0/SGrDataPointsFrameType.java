/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrDataPointsFrameType#getDpAttr4Generic <em>Dp Attr4 Generic</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDataPointsFrameType()
 * @model extendedMetaData="name='SGrDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference.
	 * @see #setDataPoint(SGrDataPointDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDataPointDescriptionType getDataPoint();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrDataPointsFrameType#getDataPoint <em>Data Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Point</em>' containment reference.
	 * @see #getDataPoint()
	 * @generated
	 */
	void setDataPoint(SGrDataPointDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Dp Attr4 Generic</b></em>' containment reference list.
	 * The list contents are of type {@link ch.smartgridready.ns.s.gr.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Attr4 Generic</em>' containment reference list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDataPointsFrameType_DpAttr4Generic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dpAttr4Generic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getDpAttr4Generic();

} // SGrDataPointsFrameType
