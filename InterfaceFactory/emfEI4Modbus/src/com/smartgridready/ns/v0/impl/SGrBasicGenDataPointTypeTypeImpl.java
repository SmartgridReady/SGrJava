/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.V0Package;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Basic Gen Data Point Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#isBit <em>Bit</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt8 <em>Int8</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt16 <em>Int16</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt32 <em>Int32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt64 <em>Int64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt8U <em>Int8 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt16U <em>Int16 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt32U <em>Int32 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getInt64U <em>Int64 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getFloat32 <em>Float32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getFloat64 <em>Float64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrBasicGenDataPointTypeTypeImpl extends MinimalEObjectImpl.Container implements SGrBasicGenDataPointTypeType {
	/**
	 * The default value of the '{@link #isBit() <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBit() <em>Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBit()
	 * @generated
	 * @ordered
	 */
	protected boolean bit = BIT_EDEFAULT;

	/**
	 * This is true if the Bit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitESet;

	/**
	 * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_ = BOOLEAN_EDEFAULT;

	/**
	 * This is true if the Boolean attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanESet;

	/**
	 * The default value of the '{@link #getInt8() <em>Int8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt8()
	 * @generated
	 * @ordered
	 */
	protected static final byte INT8_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getInt8() <em>Int8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt8()
	 * @generated
	 * @ordered
	 */
	protected byte int8 = INT8_EDEFAULT;

	/**
	 * This is true if the Int8 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int8ESet;

	/**
	 * The default value of the '{@link #getInt16() <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt16()
	 * @generated
	 * @ordered
	 */
	protected static final short INT16_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt16() <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt16()
	 * @generated
	 * @ordered
	 */
	protected short int16 = INT16_EDEFAULT;

	/**
	 * This is true if the Int16 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int16ESet;

	/**
	 * The default value of the '{@link #getInt32() <em>Int32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt32()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INT32_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInt32() <em>Int32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt32()
	 * @generated
	 * @ordered
	 */
	protected BigInteger int32 = INT32_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt64() <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt64()
	 * @generated
	 * @ordered
	 */
	protected static final long INT64_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInt64() <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt64()
	 * @generated
	 * @ordered
	 */
	protected long int64 = INT64_EDEFAULT;

	/**
	 * This is true if the Int64 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int64ESet;

	/**
	 * The default value of the '{@link #getInt8U() <em>Int8 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt8U()
	 * @generated
	 * @ordered
	 */
	protected static final short INT8_U_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt8U() <em>Int8 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt8U()
	 * @generated
	 * @ordered
	 */
	protected short int8U = INT8_U_EDEFAULT;

	/**
	 * This is true if the Int8 U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int8UESet;

	/**
	 * The default value of the '{@link #getInt16U() <em>Int16 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt16U()
	 * @generated
	 * @ordered
	 */
	protected static final int INT16_U_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt16U() <em>Int16 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt16U()
	 * @generated
	 * @ordered
	 */
	protected int int16U = INT16_U_EDEFAULT;

	/**
	 * This is true if the Int16 U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int16UESet;

	/**
	 * The default value of the '{@link #getInt32U() <em>Int32 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt32U()
	 * @generated
	 * @ordered
	 */
	protected static final long INT32_U_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInt32U() <em>Int32 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt32U()
	 * @generated
	 * @ordered
	 */
	protected long int32U = INT32_U_EDEFAULT;

	/**
	 * This is true if the Int32 U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean int32UESet;

	/**
	 * The default value of the '{@link #getInt64U() <em>Int64 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt64U()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INT64_U_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInt64U() <em>Int64 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt64U()
	 * @generated
	 * @ordered
	 */
	protected BigInteger int64U = INT64_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat32() <em>Float32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat32()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT32_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat32() <em>Float32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat32()
	 * @generated
	 * @ordered
	 */
	protected float float32 = FLOAT32_EDEFAULT;

	/**
	 * This is true if the Float32 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean float32ESet;

	/**
	 * The default value of the '{@link #getFloat64() <em>Float64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat64()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOAT64_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFloat64() <em>Float64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat64()
	 * @generated
	 * @ordered
	 */
	protected double float64 = FLOAT64_EDEFAULT;

	/**
	 * This is true if the Float64 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean float64ESet;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected SGrEnumListType enum_;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrBasicGenDataPointTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrBasicGenDataPointTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBit() {
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBit(boolean newBit) {
		boolean oldBit = bit;
		bit = newBit;
		boolean oldBitESet = bitESet;
		bitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT, oldBit, bit, !oldBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBit() {
		boolean oldBit = bit;
		boolean oldBitESet = bitESet;
		bit = BIT_EDEFAULT;
		bitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT, oldBit, BIT_EDEFAULT, oldBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBit() {
		return bitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolean(boolean newBoolean) {
		boolean oldBoolean = boolean_;
		boolean_ = newBoolean;
		boolean oldBooleanESet = booleanESet;
		booleanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN, oldBoolean, boolean_, !oldBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoolean() {
		boolean oldBoolean = boolean_;
		boolean oldBooleanESet = booleanESet;
		boolean_ = BOOLEAN_EDEFAULT;
		booleanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN, oldBoolean, BOOLEAN_EDEFAULT, oldBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoolean() {
		return booleanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte getInt8() {
		return int8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt8(byte newInt8) {
		byte oldInt8 = int8;
		int8 = newInt8;
		boolean oldInt8ESet = int8ESet;
		int8ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, oldInt8, int8, !oldInt8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt8() {
		byte oldInt8 = int8;
		boolean oldInt8ESet = int8ESet;
		int8 = INT8_EDEFAULT;
		int8ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, oldInt8, INT8_EDEFAULT, oldInt8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt8() {
		return int8ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getInt16() {
		return int16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt16(short newInt16) {
		short oldInt16 = int16;
		int16 = newInt16;
		boolean oldInt16ESet = int16ESet;
		int16ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, oldInt16, int16, !oldInt16ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt16() {
		short oldInt16 = int16;
		boolean oldInt16ESet = int16ESet;
		int16 = INT16_EDEFAULT;
		int16ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, oldInt16, INT16_EDEFAULT, oldInt16ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt16() {
		return int16ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getInt32() {
		return int32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt32(BigInteger newInt32) {
		BigInteger oldInt32 = int32;
		int32 = newInt32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, oldInt32, int32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInt64() {
		return int64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt64(long newInt64) {
		long oldInt64 = int64;
		int64 = newInt64;
		boolean oldInt64ESet = int64ESet;
		int64ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, oldInt64, int64, !oldInt64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt64() {
		long oldInt64 = int64;
		boolean oldInt64ESet = int64ESet;
		int64 = INT64_EDEFAULT;
		int64ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, oldInt64, INT64_EDEFAULT, oldInt64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt64() {
		return int64ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getInt8U() {
		return int8U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt8U(short newInt8U) {
		short oldInt8U = int8U;
		int8U = newInt8U;
		boolean oldInt8UESet = int8UESet;
		int8UESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U, oldInt8U, int8U, !oldInt8UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt8U() {
		short oldInt8U = int8U;
		boolean oldInt8UESet = int8UESet;
		int8U = INT8_U_EDEFAULT;
		int8UESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U, oldInt8U, INT8_U_EDEFAULT, oldInt8UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt8U() {
		return int8UESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInt16U() {
		return int16U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt16U(int newInt16U) {
		int oldInt16U = int16U;
		int16U = newInt16U;
		boolean oldInt16UESet = int16UESet;
		int16UESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, oldInt16U, int16U, !oldInt16UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt16U() {
		int oldInt16U = int16U;
		boolean oldInt16UESet = int16UESet;
		int16U = INT16_U_EDEFAULT;
		int16UESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, oldInt16U, INT16_U_EDEFAULT, oldInt16UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt16U() {
		return int16UESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInt32U() {
		return int32U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt32U(long newInt32U) {
		long oldInt32U = int32U;
		int32U = newInt32U;
		boolean oldInt32UESet = int32UESet;
		int32UESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U, oldInt32U, int32U, !oldInt32UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInt32U() {
		long oldInt32U = int32U;
		boolean oldInt32UESet = int32UESet;
		int32U = INT32_U_EDEFAULT;
		int32UESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U, oldInt32U, INT32_U_EDEFAULT, oldInt32UESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInt32U() {
		return int32UESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getInt64U() {
		return int64U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt64U(BigInteger newInt64U) {
		BigInteger oldInt64U = int64U;
		int64U = newInt64U;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U, oldInt64U, int64U));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getFloat32() {
		return float32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloat32(float newFloat32) {
		float oldFloat32 = float32;
		float32 = newFloat32;
		boolean oldFloat32ESet = float32ESet;
		float32ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, oldFloat32, float32, !oldFloat32ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFloat32() {
		float oldFloat32 = float32;
		boolean oldFloat32ESet = float32ESet;
		float32 = FLOAT32_EDEFAULT;
		float32ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, oldFloat32, FLOAT32_EDEFAULT, oldFloat32ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFloat32() {
		return float32ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloat64() {
		return float64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloat64(double newFloat64) {
		double oldFloat64 = float64;
		float64 = newFloat64;
		boolean oldFloat64ESet = float64ESet;
		float64ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, oldFloat64, float64, !oldFloat64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFloat64() {
		double oldFloat64 = float64;
		boolean oldFloat64ESet = float64ESet;
		float64 = FLOAT64_EDEFAULT;
		float64ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, oldFloat64, FLOAT64_EDEFAULT, oldFloat64ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFloat64() {
		return float64ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrEnumListType getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum(SGrEnumListType newEnum, NotificationChain msgs) {
		SGrEnumListType oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM, oldEnum, newEnum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(SGrEnumListType newEnum) {
		if (newEnum != enum_) {
			NotificationChain msgs = null;
			if (enum_ != null)
				msgs = ((InternalEObject)enum_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM, null, msgs);
			if (newEnum != null)
				msgs = ((InternalEObject)newEnum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM, null, msgs);
			msgs = basicSetEnum(newEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM, newEnum, newEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTime(XMLGregorianCalendar newDateTime) {
		XMLGregorianCalendar oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM:
				return basicSetEnum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT:
				return isBit();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN:
				return isBoolean();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8:
				return getInt8();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16:
				return getInt16();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32:
				return getInt32();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64:
				return getInt64();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U:
				return getInt8U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U:
				return getInt16U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U:
				return getInt32U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U:
				return getInt64U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32:
				return getFloat32();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64:
				return getFloat64();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM:
				return getEnum();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME:
				return getDateTime();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING:
				return getString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT:
				setBit((Boolean)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8:
				setInt8((Byte)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16:
				setInt16((Short)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32:
				setInt32((BigInteger)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64:
				setInt64((Long)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U:
				setInt8U((Short)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U:
				setInt16U((Integer)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U:
				setInt32U((Long)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U:
				setInt64U((BigInteger)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32:
				setFloat32((Float)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64:
				setFloat64((Double)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM:
				setEnum((SGrEnumListType)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME:
				setDateTime((XMLGregorianCalendar)newValue);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING:
				setString((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT:
				unsetBit();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN:
				unsetBoolean();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8:
				unsetInt8();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16:
				unsetInt16();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32:
				setInt32(INT32_EDEFAULT);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64:
				unsetInt64();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U:
				unsetInt8U();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U:
				unsetInt16U();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U:
				unsetInt32U();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U:
				setInt64U(INT64_U_EDEFAULT);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32:
				unsetFloat32();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64:
				unsetFloat64();
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM:
				setEnum((SGrEnumListType)null);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING:
				setString(STRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BIT:
				return isSetBit();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN:
				return isSetBoolean();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8:
				return isSetInt8();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16:
				return isSetInt16();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32:
				return INT32_EDEFAULT == null ? int32 != null : !INT32_EDEFAULT.equals(int32);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64:
				return isSetInt64();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U:
				return isSetInt8U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U:
				return isSetInt16U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U:
				return isSetInt32U();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U:
				return INT64_U_EDEFAULT == null ? int64U != null : !INT64_U_EDEFAULT.equals(int64U);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32:
				return isSetFloat32();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64:
				return isSetFloat64();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__ENUM:
				return enum_ != null;
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bit: ");
		if (bitESet) result.append(bit); else result.append("<unset>");
		result.append(", boolean: ");
		if (booleanESet) result.append(boolean_); else result.append("<unset>");
		result.append(", int8: ");
		if (int8ESet) result.append(int8); else result.append("<unset>");
		result.append(", int16: ");
		if (int16ESet) result.append(int16); else result.append("<unset>");
		result.append(", int32: ");
		result.append(int32);
		result.append(", int64: ");
		if (int64ESet) result.append(int64); else result.append("<unset>");
		result.append(", int8U: ");
		if (int8UESet) result.append(int8U); else result.append("<unset>");
		result.append(", int16U: ");
		if (int16UESet) result.append(int16U); else result.append("<unset>");
		result.append(", int32U: ");
		if (int32UESet) result.append(int32U); else result.append("<unset>");
		result.append(", int64U: ");
		result.append(int64U);
		result.append(", float32: ");
		if (float32ESet) result.append(float32); else result.append("<unset>");
		result.append(", float64: ");
		if (float64ESet) result.append(float64); else result.append("<unset>");
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(", string: ");
		result.append(string);
		result.append(')');
		return result.toString();
	}

} //SGrBasicGenDataPointTypeTypeImpl
