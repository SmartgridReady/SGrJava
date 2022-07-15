/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Sync Block Notification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getBlockNumber <em>Block Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getTimeoutMs <em>Timeout Ms</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getTimeSyncBlockNotificationType()
 * @model extendedMetaData="name='timeSyncBlockNotificationType' kind='elementOnly'"
 * @generated
 */
public interface TimeSyncBlockNotificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Number</em>' attribute.
	 * @see #isSetBlockNumber()
	 * @see #unsetBlockNumber()
	 * @see #setBlockNumber(int)
	 * @see com.smartgridready.ns.v0.V0Package#getTimeSyncBlockNotificationType_BlockNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='blockNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getBlockNumber();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getBlockNumber <em>Block Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Number</em>' attribute.
	 * @see #isSetBlockNumber()
	 * @see #unsetBlockNumber()
	 * @see #getBlockNumber()
	 * @generated
	 */
	void setBlockNumber(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getBlockNumber <em>Block Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockNumber()
	 * @see #getBlockNumber()
	 * @see #setBlockNumber(int)
	 * @generated
	 */
	void unsetBlockNumber();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getBlockNumber <em>Block Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block Number</em>' attribute is set.
	 * @see #unsetBlockNumber()
	 * @see #getBlockNumber()
	 * @see #setBlockNumber(int)
	 * @generated
	 */
	boolean isSetBlockNumber();

	/**
	 * Returns the value of the '<em><b>Timeout Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Ms</em>' attribute.
	 * @see #isSetTimeoutMs()
	 * @see #unsetTimeoutMs()
	 * @see #setTimeoutMs(int)
	 * @see com.smartgridready.ns.v0.V0Package#getTimeSyncBlockNotificationType_TimeoutMs()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='timeoutMs' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTimeoutMs();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getTimeoutMs <em>Timeout Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Ms</em>' attribute.
	 * @see #isSetTimeoutMs()
	 * @see #unsetTimeoutMs()
	 * @see #getTimeoutMs()
	 * @generated
	 */
	void setTimeoutMs(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getTimeoutMs <em>Timeout Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeoutMs()
	 * @see #getTimeoutMs()
	 * @see #setTimeoutMs(int)
	 * @generated
	 */
	void unsetTimeoutMs();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType#getTimeoutMs <em>Timeout Ms</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout Ms</em>' attribute is set.
	 * @see #unsetTimeoutMs()
	 * @see #getTimeoutMs()
	 * @see #setTimeoutMs(int)
	 * @generated
	 */
	boolean isSetTimeoutMs();

} // TimeSyncBlockNotificationType
