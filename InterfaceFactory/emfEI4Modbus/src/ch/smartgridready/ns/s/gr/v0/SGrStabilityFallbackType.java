/**
 */
package ch.smartgridready.ns.s.gr.v0;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Stability Fallback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A consumer or a generating system receives the permit
 * 				for a load change for a certain period of time. This time is always
 * 				set to 0 each time a confirmation message is received (HeartBeat).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getMaxReceiveTime <em>Max Receive Time</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getFallbackValue <em>Fallback Value</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrStabilityFallbackType()
 * @model extendedMetaData="name='SGrStabilityFallbackType' kind='elementOnly'"
 * @generated
 */
public interface SGrStabilityFallbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Receive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Receive Time</em>' attribute.
	 * @see #setMaxReceiveTime(XMLGregorianCalendar)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrStabilityFallbackType_MaxReceiveTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time" required="true"
	 *        extendedMetaData="kind='element' name='maxReceiveTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMaxReceiveTime();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getMaxReceiveTime <em>Max Receive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Time</em>' attribute.
	 * @see #getMaxReceiveTime()
	 * @generated
	 */
	void setMaxReceiveTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the reference variable at the start of the
	 * 						process cycle. Unit: inherited
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Value</em>' attribute.
	 * @see #isSetInitValue()
	 * @see #unsetInitValue()
	 * @see #setInitValue(float)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrStabilityFallbackType_InitValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='initValue' namespace='##targetNamespace'"
	 * @generated
	 */
	float getInitValue();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getInitValue <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' attribute.
	 * @see #isSetInitValue()
	 * @see #unsetInitValue()
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(float value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getInitValue <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitValue()
	 * @see #getInitValue()
	 * @see #setInitValue(float)
	 * @generated
	 */
	void unsetInitValue();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getInitValue <em>Init Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Init Value</em>' attribute is set.
	 * @see #unsetInitValue()
	 * @see #getInitValue()
	 * @see #setInitValue(float)
	 * @generated
	 */
	boolean isSetInitValue();

	/**
	 * Returns the value of the '<em><b>Fallback Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the reference variable in the event of a
	 * 						communication failure . Unit:inherited
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fallback Value</em>' attribute.
	 * @see #isSetFallbackValue()
	 * @see #unsetFallbackValue()
	 * @see #setFallbackValue(float)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrStabilityFallbackType_FallbackValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='fallbackValue' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFallbackValue();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getFallbackValue <em>Fallback Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback Value</em>' attribute.
	 * @see #isSetFallbackValue()
	 * @see #unsetFallbackValue()
	 * @see #getFallbackValue()
	 * @generated
	 */
	void setFallbackValue(float value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getFallbackValue <em>Fallback Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFallbackValue()
	 * @see #getFallbackValue()
	 * @see #setFallbackValue(float)
	 * @generated
	 */
	void unsetFallbackValue();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType#getFallbackValue <em>Fallback Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fallback Value</em>' attribute is set.
	 * @see #unsetFallbackValue()
	 * @see #getFallbackValue()
	 * @see #setFallbackValue(float)
	 * @generated
	 */
	boolean isSetFallbackValue();

} // SGrStabilityFallbackType
