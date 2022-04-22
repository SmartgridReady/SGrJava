/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Smooth Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The time behavior of a transition from a power
 * 				adjustment (positive as well as negative) can be determined by
 * 				several time values, so that this starts with a random time delay,
 * 				changes via a ramp and an expiry time with return to the initial
 * 				value.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getWinTms <em>Win Tms</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getRvrtTms <em>Rvrt Tms</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getRmpTms <em>Rmp Tms</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrSmoothTransitionType()
 * @model extendedMetaData="name='SGrSmoothTransitionType' kind='elementOnly'"
 * @generated
 */
public interface SGrSmoothTransitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Win Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates a time window in which the new operating
	 * 						mode is started randomly. The time window begins with the start
	 * 						command of the operating mode. The value 0 means immediate
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Win Tms</em>' attribute.
	 * @see #setWinTms(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrSmoothTransitionType_WinTms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='winTms' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWinTms();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getWinTms <em>Win Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Tms</em>' attribute.
	 * @see #getWinTms()
	 * @generated
	 */
	void setWinTms(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Rvrt Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * determines how long the operating mode should be
	 * 						active. When the time has elapsed, the operating mode is
	 * 						automatically terminated. If rvrtTms = 0 (standard value), the
	 * 						operating mode remains active until a new command is received.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rvrt Tms</em>' attribute.
	 * @see #setRvrtTms(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrSmoothTransitionType_RvrtTms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='rvrtTms' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRvrtTms();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getRvrtTms <em>Rvrt Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rvrt Tms</em>' attribute.
	 * @see #getRvrtTms()
	 * @generated
	 */
	void setRvrtTms(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Rmp Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies how quickly the changes should be made.
	 * 						The corresponding value is gradually changed from the old to the
	 * 						new value in the specified time.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rmp Tms</em>' attribute.
	 * @see #setRmpTms(BigInteger)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrSmoothTransitionType_RmpTms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='rmpTms' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRmpTms();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType#getRmpTms <em>Rmp Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmp Tms</em>' attribute.
	 * @see #getRmpTms()
	 * @generated
	 */
	void setRmpTms(BigInteger value);

} // SGrSmoothTransitionType
