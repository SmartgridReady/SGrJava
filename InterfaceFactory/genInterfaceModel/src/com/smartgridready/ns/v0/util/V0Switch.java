/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package
 * @generated
 */
public class V0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0Switch() {
		if (modelPackage == null) {
			modelPackage = V0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case V0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ATTR4_GENERIC_TYPE: {
				SGrAttr4GenericType sGrAttr4GenericType = (SGrAttr4GenericType)theEObject;
				T result = caseSGrAttr4GenericType(sGrAttr4GenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE: {
				SGrBasicGenDataPointTypeType sGrBasicGenDataPointTypeType = (SGrBasicGenDataPointTypeType)theEObject;
				T result = caseSGrBasicGenDataPointTypeType(sGrBasicGenDataPointTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_BITMAPPER_LIST_TYPE: {
				SGrBitmapperListType sGrBitmapperListType = (SGrBitmapperListType)theEObject;
				T result = caseSGrBitmapperListType(sGrBitmapperListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CHANGE_LOG: {
				SGrChangeLog sGrChangeLog = (SGrChangeLog)theEObject;
				T result = caseSGrChangeLog(sGrChangeLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINT_BASE_TYPE: {
				SGrDataPointBaseType sGrDataPointBaseType = (SGrDataPointBaseType)theEObject;
				T result = caseSGrDataPointBaseType(sGrDataPointBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE: {
				SGrDataPointDescriptionType sGrDataPointDescriptionType = (SGrDataPointDescriptionType)theEObject;
				T result = caseSGrDataPointDescriptionType(sGrDataPointDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DEVICE_BASE_TYPE: {
				SGrDeviceBaseType sGrDeviceBaseType = (SGrDeviceBaseType)theEObject;
				T result = caseSGrDeviceBaseType(sGrDeviceBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DEVICE_PROFILE_TYPE: {
				SGrDeviceProfileType sGrDeviceProfileType = (SGrDeviceProfileType)theEObject;
				T result = caseSGrDeviceProfileType(sGrDeviceProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ENUM_LIST_TYPE: {
				SGrEnumListType sGrEnumListType = (SGrEnumListType)theEObject;
				T result = caseSGrEnumListType(sGrEnumListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE: {
				SGrFlexAssistanceType sGrFlexAssistanceType = (SGrFlexAssistanceType)theEObject;
				T result = caseSGrFlexAssistanceType(sGrFlexAssistanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_FUNCTIONAL_PROFILE_BASE_TYPE: {
				SGrFunctionalProfileBaseType sGrFunctionalProfileBaseType = (SGrFunctionalProfileBaseType)theEObject;
				T result = caseSGrFunctionalProfileBaseType(sGrFunctionalProfileBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_GEN_DEVICE_FRAME: {
				SGrGenDeviceFrame sGrGenDeviceFrame = (SGrGenDeviceFrame)theEObject;
				T result = caseSGrGenDeviceFrame(sGrGenDeviceFrame);
				if (result == null) result = caseSGrDeviceBaseType(sGrGenDeviceFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_GEN_FUNCTIONAL_PROFILE_TYPE: {
				SGrGenFunctionalProfileType sGrGenFunctionalProfileType = (SGrGenFunctionalProfileType)theEObject;
				T result = caseSGrGenFunctionalProfileType(sGrGenFunctionalProfileType);
				if (result == null) result = caseSGrFunctionalProfileBaseType(sGrGenFunctionalProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE: {
				SGrLegibDocumentationType sGrLegibDocumentationType = (SGrLegibDocumentationType)theEObject;
				T result = caseSGrLegibDocumentationType(sGrLegibDocumentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_NAMELIST_TYPE: {
				SGrNamelistType sGrNamelistType = (SGrNamelistType)theEObject;
				T result = caseSGrNamelistType(sGrNamelistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE: {
				SGrProfileDescriptionType sGrProfileDescriptionType = (SGrProfileDescriptionType)theEObject;
				T result = caseSGrProfileDescriptionType(sGrProfileDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_PROFILENUMBER_TYPE: {
				SGrProfilenumberType sGrProfilenumberType = (SGrProfilenumberType)theEObject;
				T result = caseSGrProfilenumberType(sGrProfilenumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_RELEASE_NOTES: {
				SGrReleaseNotes sGrReleaseNotes = (SGrReleaseNotes)theEObject;
				T result = caseSGrReleaseNotes(sGrReleaseNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_SCALING_TYPE: {
				SGrScalingType sGrScalingType = (SGrScalingType)theEObject;
				T result = caseSGrScalingType(sGrScalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE: {
				SGrSmoothTransitionType sGrSmoothTransitionType = (SGrSmoothTransitionType)theEObject;
				T result = caseSGrSmoothTransitionType(sGrSmoothTransitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_STABILITY_FALLBACK_TYPE: {
				SGrStabilityFallbackType sGrStabilityFallbackType = (SGrStabilityFallbackType)theEObject;
				T result = caseSGrStabilityFallbackType(sGrStabilityFallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_VERSION_NUMBER_TYPE: {
				SGrVersionNumberType sGrVersionNumberType = (SGrVersionNumberType)theEObject;
				T result = caseSGrVersionNumberType(sGrVersionNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Attr4 Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Attr4 Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrAttr4GenericType(SGrAttr4GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Basic Gen Data Point Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Basic Gen Data Point Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrBasicGenDataPointTypeType(SGrBasicGenDataPointTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Bitmapper List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Bitmapper List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrBitmapperListType(SGrBitmapperListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Change Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Change Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrChangeLog(SGrChangeLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Data Point Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Data Point Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDataPointBaseType(SGrDataPointBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Data Point Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Data Point Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDataPointDescriptionType(SGrDataPointDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Device Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Device Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDeviceBaseType(SGrDeviceBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Device Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Device Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDeviceProfileType(SGrDeviceProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Enum List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Enum List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrEnumListType(SGrEnumListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Flex Assistance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Flex Assistance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrFlexAssistanceType(SGrFlexAssistanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Functional Profile Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Functional Profile Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrFunctionalProfileBaseType(SGrFunctionalProfileBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Gen Device Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Gen Device Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrGenDeviceFrame(SGrGenDeviceFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Gen Functional Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Gen Functional Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrGenFunctionalProfileType(SGrGenFunctionalProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Legib Documentation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Legib Documentation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrLegibDocumentationType(SGrLegibDocumentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Namelist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Namelist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrNamelistType(SGrNamelistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Profile Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Profile Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrProfileDescriptionType(SGrProfileDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Profilenumber Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Profilenumber Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrProfilenumberType(SGrProfilenumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Release Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Release Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrReleaseNotes(SGrReleaseNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrScalingType(SGrScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Smooth Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Smooth Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrSmoothTransitionType(SGrSmoothTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Stability Fallback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Stability Fallback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrStabilityFallbackType(SGrStabilityFallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Version Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Version Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrVersionNumberType(SGrVersionNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //V0Switch
