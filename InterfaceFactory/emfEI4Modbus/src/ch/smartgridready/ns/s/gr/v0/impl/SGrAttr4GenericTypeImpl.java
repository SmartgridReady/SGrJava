/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGrAttr4GenericType;
import ch.smartgridready.ns.s.gr.v0.SGrMeasValueSourceType;
import ch.smartgridready.ns.s.gr.v0.SGrMeasValueStateType;
import ch.smartgridready.ns.s.gr.v0.SGrMeasValueTendencyType;
import ch.smartgridready.ns.s.gr.v0.SGrSmoothTransitionType;
import ch.smartgridready.ns.s.gr.v0.SGrStabilityFallbackType;
import ch.smartgridready.ns.s.gr.v0.SGrTimeRangeType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

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
 * An implementation of the model object '<em><b>SGr Attr4 Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getSpecQualityRequirement <em>Spec Quality Requirement</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getStabilityFallback <em>Stability Fallback</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getSmoothTransition <em>Smooth Transition</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMinSendDelta <em>Min Send Delta</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMaxSendTime <em>Max Send Time</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMaxReceiveTime <em>Max Receive Time</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMinSendTime <em>Min Send Time</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMaxLatencyTime <em>Max Latency Time</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getTimeStampLog <em>Time Stamp Log</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getTimeRange <em>Time Range</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getValueState <em>Value State</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getValueTendency <em>Value Tendency</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getCurtailment <em>Curtailment</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMinLoad <em>Min Load</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMaxLockTimeMinutes <em>Max Lock Time Minutes</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getMinRunTimeMinutes <em>Min Run Time Minutes</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrAttr4GenericTypeImpl#getValueByTimeTableMinutes <em>Value By Time Table Minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrAttr4GenericTypeImpl extends MinimalEObjectImpl.Container implements SGrAttr4GenericType {
	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected float maxVal = MAX_VAL_EDEFAULT;

	/**
	 * This is true if the Max Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValESet;

	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected float minVal = MIN_VAL_EDEFAULT;

	/**
	 * This is true if the Min Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValESet;

	/**
	 * The default value of the '{@link #getSpecQualityRequirement() <em>Spec Quality Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecQualityRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_QUALITY_REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecQualityRequirement() <em>Spec Quality Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecQualityRequirement()
	 * @generated
	 * @ordered
	 */
	protected String specQualityRequirement = SPEC_QUALITY_REQUIREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected double precision = PRECISION_EDEFAULT;

	/**
	 * This is true if the Precision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionESet;

	/**
	 * The cached value of the '{@link #getStabilityFallback() <em>Stability Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilityFallback()
	 * @generated
	 * @ordered
	 */
	protected SGrStabilityFallbackType stabilityFallback;

	/**
	 * The cached value of the '{@link #getSmoothTransition() <em>Smooth Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothTransition()
	 * @generated
	 * @ordered
	 */
	protected SGrSmoothTransitionType smoothTransition;

	/**
	 * The default value of the '{@link #getMinSendDelta() <em>Min Send Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSendDelta()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_SEND_DELTA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinSendDelta() <em>Min Send Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSendDelta()
	 * @generated
	 * @ordered
	 */
	protected float minSendDelta = MIN_SEND_DELTA_EDEFAULT;

	/**
	 * This is true if the Min Send Delta attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minSendDeltaESet;

	/**
	 * The default value of the '{@link #getMaxSendTime() <em>Max Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSendTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MAX_SEND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSendTime() <em>Max Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSendTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar maxSendTime = MAX_SEND_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReceiveTime() <em>Max Receive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MAX_RECEIVE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxReceiveTime() <em>Max Receive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar maxReceiveTime = MAX_RECEIVE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSendTime() <em>Min Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSendTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MIN_SEND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinSendTime() <em>Min Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSendTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar minSendTime = MIN_SEND_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLatencyTime() <em>Max Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_LATENCY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLatencyTime() <em>Max Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxLatencyTime = MAX_LATENCY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStampLog() <em>Time Stamp Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStampLog()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_STAMP_LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStampLog() <em>Time Stamp Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStampLog()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeStampLog = TIME_STAMP_LOG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeRange() <em>Time Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRange()
	 * @generated
	 * @ordered
	 */
	protected SGrTimeRangeType timeRange;

	/**
	 * The default value of the '{@link #getValueState() <em>Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueStateType VALUE_STATE_EDEFAULT = SGrMeasValueStateType.NORMAL;

	/**
	 * The cached value of the '{@link #getValueState() <em>Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueState()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueStateType valueState = VALUE_STATE_EDEFAULT;

	/**
	 * This is true if the Value State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueStateESet;

	/**
	 * The default value of the '{@link #getValueTendency() <em>Value Tendency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTendency()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueTendencyType VALUE_TENDENCY_EDEFAULT = SGrMeasValueTendencyType.RISING;

	/**
	 * The cached value of the '{@link #getValueTendency() <em>Value Tendency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTendency()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueTendencyType valueTendency = VALUE_TENDENCY_EDEFAULT;

	/**
	 * This is true if the Value Tendency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueTendencyESet;

	/**
	 * The default value of the '{@link #getValueSource() <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueSourceType VALUE_SOURCE_EDEFAULT = SGrMeasValueSourceType.MEASURED_VALUE;

	/**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueSourceType valueSource = VALUE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Value Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueSourceESet;

	/**
	 * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected static final float SAMPLE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected float sampleRate = SAMPLE_RATE_EDEFAULT;

	/**
	 * This is true if the Sample Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sampleRateESet;

	/**
	 * The default value of the '{@link #getCurtailment() <em>Curtailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailment()
	 * @generated
	 * @ordered
	 */
	protected static final float CURTAILMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurtailment() <em>Curtailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailment()
	 * @generated
	 * @ordered
	 */
	protected float curtailment = CURTAILMENT_EDEFAULT;

	/**
	 * This is true if the Curtailment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curtailmentESet;

	/**
	 * The default value of the '{@link #getMinLoad() <em>Min Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLoad() <em>Min Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLoad()
	 * @generated
	 * @ordered
	 */
	protected float minLoad = MIN_LOAD_EDEFAULT;

	/**
	 * This is true if the Min Load attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minLoadESet;

	/**
	 * The default value of the '{@link #getMaxLockTimeMinutes() <em>Max Lock Time Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLockTimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_LOCK_TIME_MINUTES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxLockTimeMinutes() <em>Max Lock Time Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLockTimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected float maxLockTimeMinutes = MAX_LOCK_TIME_MINUTES_EDEFAULT;

	/**
	 * This is true if the Max Lock Time Minutes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLockTimeMinutesESet;

	/**
	 * The default value of the '{@link #getMinRunTimeMinutes() <em>Min Run Time Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRunTimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_RUN_TIME_MINUTES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinRunTimeMinutes() <em>Min Run Time Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRunTimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected float minRunTimeMinutes = MIN_RUN_TIME_MINUTES_EDEFAULT;

	/**
	 * This is true if the Min Run Time Minutes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minRunTimeMinutesESet;

	/**
	 * The default value of the '{@link #getValueByTimeTableMinutes() <em>Value By Time Table Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueByTimeTableMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_BY_TIME_TABLE_MINUTES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValueByTimeTableMinutes() <em>Value By Time Table Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueByTimeTableMinutes()
	 * @generated
	 * @ordered
	 */
	protected float valueByTimeTableMinutes = VALUE_BY_TIME_TABLE_MINUTES_EDEFAULT;

	/**
	 * This is true if the Value By Time Table Minutes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueByTimeTableMinutesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrAttr4GenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrAttr4GenericType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxVal(float newMaxVal) {
		float oldMaxVal = maxVal;
		maxVal = newMaxVal;
		boolean oldMaxValESet = maxValESet;
		maxValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL, oldMaxVal, maxVal, !oldMaxValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxVal() {
		float oldMaxVal = maxVal;
		boolean oldMaxValESet = maxValESet;
		maxVal = MAX_VAL_EDEFAULT;
		maxValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL, oldMaxVal, MAX_VAL_EDEFAULT, oldMaxValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxVal() {
		return maxValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinVal(float newMinVal) {
		float oldMinVal = minVal;
		minVal = newMinVal;
		boolean oldMinValESet = minValESet;
		minValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL, oldMinVal, minVal, !oldMinValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinVal() {
		float oldMinVal = minVal;
		boolean oldMinValESet = minValESet;
		minVal = MIN_VAL_EDEFAULT;
		minValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL, oldMinVal, MIN_VAL_EDEFAULT, oldMinValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinVal() {
		return minValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecQualityRequirement() {
		return specQualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecQualityRequirement(String newSpecQualityRequirement) {
		String oldSpecQualityRequirement = specQualityRequirement;
		specQualityRequirement = newSpecQualityRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT, oldSpecQualityRequirement, specQualityRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(double newPrecision) {
		double oldPrecision = precision;
		precision = newPrecision;
		boolean oldPrecisionESet = precisionESet;
		precisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION, oldPrecision, precision, !oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPrecision() {
		double oldPrecision = precision;
		boolean oldPrecisionESet = precisionESet;
		precision = PRECISION_EDEFAULT;
		precisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPrecision() {
		return precisionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrStabilityFallbackType getStabilityFallback() {
		return stabilityFallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStabilityFallback(SGrStabilityFallbackType newStabilityFallback, NotificationChain msgs) {
		SGrStabilityFallbackType oldStabilityFallback = stabilityFallback;
		stabilityFallback = newStabilityFallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK, oldStabilityFallback, newStabilityFallback);
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
	public void setStabilityFallback(SGrStabilityFallbackType newStabilityFallback) {
		if (newStabilityFallback != stabilityFallback) {
			NotificationChain msgs = null;
			if (stabilityFallback != null)
				msgs = ((InternalEObject)stabilityFallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK, null, msgs);
			if (newStabilityFallback != null)
				msgs = ((InternalEObject)newStabilityFallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK, null, msgs);
			msgs = basicSetStabilityFallback(newStabilityFallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK, newStabilityFallback, newStabilityFallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSmoothTransitionType getSmoothTransition() {
		return smoothTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmoothTransition(SGrSmoothTransitionType newSmoothTransition, NotificationChain msgs) {
		SGrSmoothTransitionType oldSmoothTransition = smoothTransition;
		smoothTransition = newSmoothTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION, oldSmoothTransition, newSmoothTransition);
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
	public void setSmoothTransition(SGrSmoothTransitionType newSmoothTransition) {
		if (newSmoothTransition != smoothTransition) {
			NotificationChain msgs = null;
			if (smoothTransition != null)
				msgs = ((InternalEObject)smoothTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION, null, msgs);
			if (newSmoothTransition != null)
				msgs = ((InternalEObject)newSmoothTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION, null, msgs);
			msgs = basicSetSmoothTransition(newSmoothTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION, newSmoothTransition, newSmoothTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinSendDelta() {
		return minSendDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSendDelta(float newMinSendDelta) {
		float oldMinSendDelta = minSendDelta;
		minSendDelta = newMinSendDelta;
		boolean oldMinSendDeltaESet = minSendDeltaESet;
		minSendDeltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA, oldMinSendDelta, minSendDelta, !oldMinSendDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinSendDelta() {
		float oldMinSendDelta = minSendDelta;
		boolean oldMinSendDeltaESet = minSendDeltaESet;
		minSendDelta = MIN_SEND_DELTA_EDEFAULT;
		minSendDeltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA, oldMinSendDelta, MIN_SEND_DELTA_EDEFAULT, oldMinSendDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinSendDelta() {
		return minSendDeltaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMaxSendTime() {
		return maxSendTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSendTime(XMLGregorianCalendar newMaxSendTime) {
		XMLGregorianCalendar oldMaxSendTime = maxSendTime;
		maxSendTime = newMaxSendTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_SEND_TIME, oldMaxSendTime, maxSendTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMaxReceiveTime() {
		return maxReceiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveTime(XMLGregorianCalendar newMaxReceiveTime) {
		XMLGregorianCalendar oldMaxReceiveTime = maxReceiveTime;
		maxReceiveTime = newMaxReceiveTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_RECEIVE_TIME, oldMaxReceiveTime, maxReceiveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMinSendTime() {
		return minSendTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSendTime(XMLGregorianCalendar newMinSendTime) {
		XMLGregorianCalendar oldMinSendTime = minSendTime;
		minSendTime = newMinSendTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_TIME, oldMinSendTime, minSendTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxLatencyTime() {
		return maxLatencyTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLatencyTime(BigInteger newMaxLatencyTime) {
		BigInteger oldMaxLatencyTime = maxLatencyTime;
		maxLatencyTime = newMaxLatencyTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME, oldMaxLatencyTime, maxLatencyTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimeStampLog() {
		return timeStampLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStampLog(XMLGregorianCalendar newTimeStampLog) {
		XMLGregorianCalendar oldTimeStampLog = timeStampLog;
		timeStampLog = newTimeStampLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_STAMP_LOG, oldTimeStampLog, timeStampLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrTimeRangeType getTimeRange() {
		return timeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeRange(SGrTimeRangeType newTimeRange, NotificationChain msgs) {
		SGrTimeRangeType oldTimeRange = timeRange;
		timeRange = newTimeRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE, oldTimeRange, newTimeRange);
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
	public void setTimeRange(SGrTimeRangeType newTimeRange) {
		if (newTimeRange != timeRange) {
			NotificationChain msgs = null;
			if (timeRange != null)
				msgs = ((InternalEObject)timeRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE, null, msgs);
			if (newTimeRange != null)
				msgs = ((InternalEObject)newTimeRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE, null, msgs);
			msgs = basicSetTimeRange(newTimeRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE, newTimeRange, newTimeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrMeasValueStateType getValueState() {
		return valueState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueState(SGrMeasValueStateType newValueState) {
		SGrMeasValueStateType oldValueState = valueState;
		valueState = newValueState == null ? VALUE_STATE_EDEFAULT : newValueState;
		boolean oldValueStateESet = valueStateESet;
		valueStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE, oldValueState, valueState, !oldValueStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValueState() {
		SGrMeasValueStateType oldValueState = valueState;
		boolean oldValueStateESet = valueStateESet;
		valueState = VALUE_STATE_EDEFAULT;
		valueStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE, oldValueState, VALUE_STATE_EDEFAULT, oldValueStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValueState() {
		return valueStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrMeasValueTendencyType getValueTendency() {
		return valueTendency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueTendency(SGrMeasValueTendencyType newValueTendency) {
		SGrMeasValueTendencyType oldValueTendency = valueTendency;
		valueTendency = newValueTendency == null ? VALUE_TENDENCY_EDEFAULT : newValueTendency;
		boolean oldValueTendencyESet = valueTendencyESet;
		valueTendencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY, oldValueTendency, valueTendency, !oldValueTendencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValueTendency() {
		SGrMeasValueTendencyType oldValueTendency = valueTendency;
		boolean oldValueTendencyESet = valueTendencyESet;
		valueTendency = VALUE_TENDENCY_EDEFAULT;
		valueTendencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY, oldValueTendency, VALUE_TENDENCY_EDEFAULT, oldValueTendencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValueTendency() {
		return valueTendencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrMeasValueSourceType getValueSource() {
		return valueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueSource(SGrMeasValueSourceType newValueSource) {
		SGrMeasValueSourceType oldValueSource = valueSource;
		valueSource = newValueSource == null ? VALUE_SOURCE_EDEFAULT : newValueSource;
		boolean oldValueSourceESet = valueSourceESet;
		valueSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE, oldValueSource, valueSource, !oldValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValueSource() {
		SGrMeasValueSourceType oldValueSource = valueSource;
		boolean oldValueSourceESet = valueSourceESet;
		valueSource = VALUE_SOURCE_EDEFAULT;
		valueSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE, oldValueSource, VALUE_SOURCE_EDEFAULT, oldValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValueSource() {
		return valueSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSampleRate() {
		return sampleRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSampleRate(float newSampleRate) {
		float oldSampleRate = sampleRate;
		sampleRate = newSampleRate;
		boolean oldSampleRateESet = sampleRateESet;
		sampleRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE, oldSampleRate, sampleRate, !oldSampleRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSampleRate() {
		float oldSampleRate = sampleRate;
		boolean oldSampleRateESet = sampleRateESet;
		sampleRate = SAMPLE_RATE_EDEFAULT;
		sampleRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE, oldSampleRate, SAMPLE_RATE_EDEFAULT, oldSampleRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSampleRate() {
		return sampleRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCurtailment() {
		return curtailment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurtailment(float newCurtailment) {
		float oldCurtailment = curtailment;
		curtailment = newCurtailment;
		boolean oldCurtailmentESet = curtailmentESet;
		curtailmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT, oldCurtailment, curtailment, !oldCurtailmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCurtailment() {
		float oldCurtailment = curtailment;
		boolean oldCurtailmentESet = curtailmentESet;
		curtailment = CURTAILMENT_EDEFAULT;
		curtailmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT, oldCurtailment, CURTAILMENT_EDEFAULT, oldCurtailmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCurtailment() {
		return curtailmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinLoad() {
		return minLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLoad(float newMinLoad) {
		float oldMinLoad = minLoad;
		minLoad = newMinLoad;
		boolean oldMinLoadESet = minLoadESet;
		minLoadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD, oldMinLoad, minLoad, !oldMinLoadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinLoad() {
		float oldMinLoad = minLoad;
		boolean oldMinLoadESet = minLoadESet;
		minLoad = MIN_LOAD_EDEFAULT;
		minLoadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD, oldMinLoad, MIN_LOAD_EDEFAULT, oldMinLoadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinLoad() {
		return minLoadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxLockTimeMinutes() {
		return maxLockTimeMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLockTimeMinutes(float newMaxLockTimeMinutes) {
		float oldMaxLockTimeMinutes = maxLockTimeMinutes;
		maxLockTimeMinutes = newMaxLockTimeMinutes;
		boolean oldMaxLockTimeMinutesESet = maxLockTimeMinutesESet;
		maxLockTimeMinutesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES, oldMaxLockTimeMinutes, maxLockTimeMinutes, !oldMaxLockTimeMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxLockTimeMinutes() {
		float oldMaxLockTimeMinutes = maxLockTimeMinutes;
		boolean oldMaxLockTimeMinutesESet = maxLockTimeMinutesESet;
		maxLockTimeMinutes = MAX_LOCK_TIME_MINUTES_EDEFAULT;
		maxLockTimeMinutesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES, oldMaxLockTimeMinutes, MAX_LOCK_TIME_MINUTES_EDEFAULT, oldMaxLockTimeMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxLockTimeMinutes() {
		return maxLockTimeMinutesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinRunTimeMinutes() {
		return minRunTimeMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRunTimeMinutes(float newMinRunTimeMinutes) {
		float oldMinRunTimeMinutes = minRunTimeMinutes;
		minRunTimeMinutes = newMinRunTimeMinutes;
		boolean oldMinRunTimeMinutesESet = minRunTimeMinutesESet;
		minRunTimeMinutesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES, oldMinRunTimeMinutes, minRunTimeMinutes, !oldMinRunTimeMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinRunTimeMinutes() {
		float oldMinRunTimeMinutes = minRunTimeMinutes;
		boolean oldMinRunTimeMinutesESet = minRunTimeMinutesESet;
		minRunTimeMinutes = MIN_RUN_TIME_MINUTES_EDEFAULT;
		minRunTimeMinutesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES, oldMinRunTimeMinutes, MIN_RUN_TIME_MINUTES_EDEFAULT, oldMinRunTimeMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinRunTimeMinutes() {
		return minRunTimeMinutesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValueByTimeTableMinutes() {
		return valueByTimeTableMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueByTimeTableMinutes(float newValueByTimeTableMinutes) {
		float oldValueByTimeTableMinutes = valueByTimeTableMinutes;
		valueByTimeTableMinutes = newValueByTimeTableMinutes;
		boolean oldValueByTimeTableMinutesESet = valueByTimeTableMinutesESet;
		valueByTimeTableMinutesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES, oldValueByTimeTableMinutes, valueByTimeTableMinutes, !oldValueByTimeTableMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValueByTimeTableMinutes() {
		float oldValueByTimeTableMinutes = valueByTimeTableMinutes;
		boolean oldValueByTimeTableMinutesESet = valueByTimeTableMinutesESet;
		valueByTimeTableMinutes = VALUE_BY_TIME_TABLE_MINUTES_EDEFAULT;
		valueByTimeTableMinutesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES, oldValueByTimeTableMinutes, VALUE_BY_TIME_TABLE_MINUTES_EDEFAULT, oldValueByTimeTableMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValueByTimeTableMinutes() {
		return valueByTimeTableMinutesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK:
				return basicSetStabilityFallback(null, msgs);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION:
				return basicSetSmoothTransition(null, msgs);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE:
				return basicSetTimeRange(null, msgs);
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
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL:
				return getMaxVal();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL:
				return getMinVal();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT:
				return getSpecQualityRequirement();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION:
				return getPrecision();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK:
				return getStabilityFallback();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION:
				return getSmoothTransition();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA:
				return getMinSendDelta();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_SEND_TIME:
				return getMaxSendTime();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_RECEIVE_TIME:
				return getMaxReceiveTime();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_TIME:
				return getMinSendTime();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME:
				return getMaxLatencyTime();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_STAMP_LOG:
				return getTimeStampLog();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE:
				return getTimeRange();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE:
				return getValueState();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY:
				return getValueTendency();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE:
				return getValueSource();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE:
				return getSampleRate();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT:
				return getCurtailment();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD:
				return getMinLoad();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES:
				return getMaxLockTimeMinutes();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES:
				return getMinRunTimeMinutes();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES:
				return getValueByTimeTableMinutes();
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
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL:
				setMaxVal((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL:
				setMinVal((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT:
				setSpecQualityRequirement((String)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION:
				setPrecision((Double)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK:
				setStabilityFallback((SGrStabilityFallbackType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION:
				setSmoothTransition((SGrSmoothTransitionType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA:
				setMinSendDelta((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_SEND_TIME:
				setMaxSendTime((XMLGregorianCalendar)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_RECEIVE_TIME:
				setMaxReceiveTime((XMLGregorianCalendar)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_TIME:
				setMinSendTime((XMLGregorianCalendar)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME:
				setMaxLatencyTime((BigInteger)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_STAMP_LOG:
				setTimeStampLog((XMLGregorianCalendar)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE:
				setTimeRange((SGrTimeRangeType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE:
				setValueState((SGrMeasValueStateType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY:
				setValueTendency((SGrMeasValueTendencyType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE:
				setValueSource((SGrMeasValueSourceType)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE:
				setSampleRate((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT:
				setCurtailment((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD:
				setMinLoad((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES:
				setMaxLockTimeMinutes((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES:
				setMinRunTimeMinutes((Float)newValue);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES:
				setValueByTimeTableMinutes((Float)newValue);
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
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL:
				unsetMaxVal();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL:
				unsetMinVal();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT:
				setSpecQualityRequirement(SPEC_QUALITY_REQUIREMENT_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION:
				unsetPrecision();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK:
				setStabilityFallback((SGrStabilityFallbackType)null);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION:
				setSmoothTransition((SGrSmoothTransitionType)null);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA:
				unsetMinSendDelta();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_SEND_TIME:
				setMaxSendTime(MAX_SEND_TIME_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_RECEIVE_TIME:
				setMaxReceiveTime(MAX_RECEIVE_TIME_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_TIME:
				setMinSendTime(MIN_SEND_TIME_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME:
				setMaxLatencyTime(MAX_LATENCY_TIME_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_STAMP_LOG:
				setTimeStampLog(TIME_STAMP_LOG_EDEFAULT);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE:
				setTimeRange((SGrTimeRangeType)null);
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE:
				unsetValueState();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY:
				unsetValueTendency();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE:
				unsetValueSource();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE:
				unsetSampleRate();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT:
				unsetCurtailment();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD:
				unsetMinLoad();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES:
				unsetMaxLockTimeMinutes();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES:
				unsetMinRunTimeMinutes();
				return;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES:
				unsetValueByTimeTableMinutes();
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
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_VAL:
				return isSetMaxVal();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_VAL:
				return isSetMinVal();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SPEC_QUALITY_REQUIREMENT:
				return SPEC_QUALITY_REQUIREMENT_EDEFAULT == null ? specQualityRequirement != null : !SPEC_QUALITY_REQUIREMENT_EDEFAULT.equals(specQualityRequirement);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__PRECISION:
				return isSetPrecision();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__STABILITY_FALLBACK:
				return stabilityFallback != null;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SMOOTH_TRANSITION:
				return smoothTransition != null;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_DELTA:
				return isSetMinSendDelta();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_SEND_TIME:
				return MAX_SEND_TIME_EDEFAULT == null ? maxSendTime != null : !MAX_SEND_TIME_EDEFAULT.equals(maxSendTime);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_RECEIVE_TIME:
				return MAX_RECEIVE_TIME_EDEFAULT == null ? maxReceiveTime != null : !MAX_RECEIVE_TIME_EDEFAULT.equals(maxReceiveTime);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_SEND_TIME:
				return MIN_SEND_TIME_EDEFAULT == null ? minSendTime != null : !MIN_SEND_TIME_EDEFAULT.equals(minSendTime);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LATENCY_TIME:
				return MAX_LATENCY_TIME_EDEFAULT == null ? maxLatencyTime != null : !MAX_LATENCY_TIME_EDEFAULT.equals(maxLatencyTime);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_STAMP_LOG:
				return TIME_STAMP_LOG_EDEFAULT == null ? timeStampLog != null : !TIME_STAMP_LOG_EDEFAULT.equals(timeStampLog);
			case V0Package.SGR_ATTR4_GENERIC_TYPE__TIME_RANGE:
				return timeRange != null;
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_STATE:
				return isSetValueState();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_TENDENCY:
				return isSetValueTendency();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_SOURCE:
				return isSetValueSource();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__SAMPLE_RATE:
				return isSetSampleRate();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__CURTAILMENT:
				return isSetCurtailment();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_LOAD:
				return isSetMinLoad();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MAX_LOCK_TIME_MINUTES:
				return isSetMaxLockTimeMinutes();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__MIN_RUN_TIME_MINUTES:
				return isSetMinRunTimeMinutes();
			case V0Package.SGR_ATTR4_GENERIC_TYPE__VALUE_BY_TIME_TABLE_MINUTES:
				return isSetValueByTimeTableMinutes();
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
		result.append(" (maxVal: ");
		if (maxValESet) result.append(maxVal); else result.append("<unset>");
		result.append(", minVal: ");
		if (minValESet) result.append(minVal); else result.append("<unset>");
		result.append(", specQualityRequirement: ");
		result.append(specQualityRequirement);
		result.append(", precision: ");
		if (precisionESet) result.append(precision); else result.append("<unset>");
		result.append(", minSendDelta: ");
		if (minSendDeltaESet) result.append(minSendDelta); else result.append("<unset>");
		result.append(", maxSendTime: ");
		result.append(maxSendTime);
		result.append(", maxReceiveTime: ");
		result.append(maxReceiveTime);
		result.append(", minSendTime: ");
		result.append(minSendTime);
		result.append(", maxLatencyTime: ");
		result.append(maxLatencyTime);
		result.append(", timeStampLog: ");
		result.append(timeStampLog);
		result.append(", valueState: ");
		if (valueStateESet) result.append(valueState); else result.append("<unset>");
		result.append(", valueTendency: ");
		if (valueTendencyESet) result.append(valueTendency); else result.append("<unset>");
		result.append(", valueSource: ");
		if (valueSourceESet) result.append(valueSource); else result.append("<unset>");
		result.append(", sampleRate: ");
		if (sampleRateESet) result.append(sampleRate); else result.append("<unset>");
		result.append(", curtailment: ");
		if (curtailmentESet) result.append(curtailment); else result.append("<unset>");
		result.append(", minLoad: ");
		if (minLoadESet) result.append(minLoad); else result.append("<unset>");
		result.append(", maxLockTimeMinutes: ");
		if (maxLockTimeMinutesESet) result.append(maxLockTimeMinutes); else result.append("<unset>");
		result.append(", minRunTimeMinutes: ");
		if (minRunTimeMinutesESet) result.append(minRunTimeMinutes); else result.append("<unset>");
		result.append(", valueByTimeTableMinutes: ");
		if (valueByTimeTableMinutesESet) result.append(valueByTimeTableMinutes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrAttr4GenericTypeImpl
