/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Tree Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getNumFPs <em>Num FPs</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getNumDPs <em>Num DPs</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getApiTreeType()
 * @model extendedMetaData="name='apiTreeType' kind='elementOnly'"
 * @generated
 */
public interface ApiTreeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' containment reference.
	 * @see #setIsConnected(ConnectionState)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getApiTreeType_IsConnected()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='isConnected' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionState getIsConnected();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getIsConnected <em>Is Connected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' containment reference.
	 * @see #getIsConnected()
	 * @generated
	 */
	void setIsConnected(ConnectionState value);

	/**
	 * Returns the value of the '<em><b>Num FPs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num FPs</em>' attribute.
	 * @see #isSetNumFPs()
	 * @see #unsetNumFPs()
	 * @see #setNumFPs(int)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getApiTreeType_NumFPs()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='numFPs' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumFPs();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getNumFPs <em>Num FPs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num FPs</em>' attribute.
	 * @see #isSetNumFPs()
	 * @see #unsetNumFPs()
	 * @see #getNumFPs()
	 * @generated
	 */
	void setNumFPs(int value);

	/**
	 * Unsets the value of the '{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getNumFPs <em>Num FPs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumFPs()
	 * @see #getNumFPs()
	 * @see #setNumFPs(int)
	 * @generated
	 */
	void unsetNumFPs();

	/**
	 * Returns whether the value of the '{@link ch.smartgridready.ns.s.gr.v0.ApiTreeType#getNumFPs <em>Num FPs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num FPs</em>' attribute is set.
	 * @see #unsetNumFPs()
	 * @see #getNumFPs()
	 * @see #setNumFPs(int)
	 * @generated
	 */
	boolean isSetNumFPs();

	/**
	 * Returns the value of the '<em><b>Num DPs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num DPs</em>' attribute list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getApiTreeType_NumDPs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='numDPs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Integer> getNumDPs();

} // ApiTreeType
