/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * scaled_value = value * multiplicator * 10^powerof10
 * 				This type is used for to convert intereger datapoint values into
 * 				floats only
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getMultiplicator <em>Multiplicator</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getPowerof10 <em>Powerof10</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrScalingType()
 * @model extendedMetaData="name='SGrScalingType' kind='elementOnly'"
 * @generated
 */
public interface SGrScalingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicator</em>' attribute.
	 * @see #isSetMultiplicator()
	 * @see #unsetMultiplicator()
	 * @see #setMultiplicator(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrScalingType_Multiplicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='multiplicator' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMultiplicator();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getMultiplicator <em>Multiplicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicator</em>' attribute.
	 * @see #isSetMultiplicator()
	 * @see #unsetMultiplicator()
	 * @see #getMultiplicator()
	 * @generated
	 */
	void setMultiplicator(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getMultiplicator <em>Multiplicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicator()
	 * @see #getMultiplicator()
	 * @see #setMultiplicator(int)
	 * @generated
	 */
	void unsetMultiplicator();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getMultiplicator <em>Multiplicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicator</em>' attribute is set.
	 * @see #unsetMultiplicator()
	 * @see #getMultiplicator()
	 * @see #setMultiplicator(int)
	 * @generated
	 */
	boolean isSetMultiplicator();

	/**
	 * Returns the value of the '<em><b>Powerof10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powerof10</em>' attribute.
	 * @see #isSetPowerof10()
	 * @see #unsetPowerof10()
	 * @see #setPowerof10(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrScalingType_Powerof10()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='powerof10' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPowerof10();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getPowerof10 <em>Powerof10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powerof10</em>' attribute.
	 * @see #isSetPowerof10()
	 * @see #unsetPowerof10()
	 * @see #getPowerof10()
	 * @generated
	 */
	void setPowerof10(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getPowerof10 <em>Powerof10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerof10()
	 * @see #getPowerof10()
	 * @see #setPowerof10(int)
	 * @generated
	 */
	void unsetPowerof10();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrScalingType#getPowerof10 <em>Powerof10</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Powerof10</em>' attribute is set.
	 * @see #unsetPowerof10()
	 * @see #getPowerof10()
	 * @see #setPowerof10(int)
	 * @generated
	 */
	boolean isSetPowerof10();

} // SGrScalingType
