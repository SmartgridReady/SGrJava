/**
 */
package com.smartgridready.ns.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Time Sync Block Notification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getFirstAddr <em>First Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType <em>Register Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getBlockCashName <em>Block Cash Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType()
 * @model extendedMetaData="name='SGrTimeSyncBlockNotificationType' kind='elementOnly'"
 * @generated
 */
public interface SGrTimeSyncBlockNotificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Access Time</em>' attribute.
	 * @see #isSetLastAccessTime()
	 * @see #unsetLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_LastAccessTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='lastAccessTime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getLastAccessTime();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Access Time</em>' attribute.
	 * @see #isSetLastAccessTime()
	 * @see #unsetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @generated
	 */
	void setLastAccessTime(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @generated
	 */
	void unsetLastAccessTime();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getLastAccessTime <em>Last Access Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Access Time</em>' attribute is set.
	 * @see #unsetLastAccessTime()
	 * @see #getLastAccessTime()
	 * @see #setLastAccessTime(long)
	 * @generated
	 */
	boolean isSetLastAccessTime();

	/**
	 * Returns the value of the '<em><b>Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #setTimeToLive(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_TimeToLive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='timeToLive' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTimeToLive();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Live</em>' attribute.
	 * @see #isSetTimeToLive()
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @generated
	 */
	void setTimeToLive(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive <em>Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	void unsetTimeToLive();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getTimeToLive <em>Time To Live</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time To Live</em>' attribute is set.
	 * @see #unsetTimeToLive()
	 * @see #getTimeToLive()
	 * @see #setTimeToLive(long)
	 * @generated
	 */
	boolean isSetTimeToLive();

	/**
	 * Returns the value of the '<em><b>First Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Addr</em>' attribute.
	 * @see #setFirstAddr(BigInteger)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_FirstAddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='firstAddr' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFirstAddr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getFirstAddr <em>First Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Addr</em>' attribute.
	 * @see #getFirstAddr()
	 * @generated
	 */
	void setFirstAddr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Register Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.TEnumObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see #isSetRegisterType()
	 * @see #unsetRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_RegisterType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='registerType' namespace='##targetNamespace'"
	 * @generated
	 */
	TEnumObjectType getRegisterType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see #isSetRegisterType()
	 * @see #unsetRegisterType()
	 * @see #getRegisterType()
	 * @generated
	 */
	void setRegisterType(TEnumObjectType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegisterType()
	 * @see #getRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @generated
	 */
	void unsetRegisterType();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getRegisterType <em>Register Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Register Type</em>' attribute is set.
	 * @see #unsetRegisterType()
	 * @see #getRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @generated
	 */
	boolean isSetRegisterType();

	/**
	 * Returns the value of the '<em><b>Block Cash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Cash Name</em>' attribute.
	 * @see #setBlockCashName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_BlockCashName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='blockCashName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBlockCashName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getBlockCashName <em>Block Cash Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Cash Name</em>' attribute.
	 * @see #getBlockCashName()
	 * @generated
	 */
	void setBlockCashName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(int)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrTimeSyncBlockNotificationType_Size()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	boolean isSetSize();

} // SGrTimeSyncBlockNotificationType
