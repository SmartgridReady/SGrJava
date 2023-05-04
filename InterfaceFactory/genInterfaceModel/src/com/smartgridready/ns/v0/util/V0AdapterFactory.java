/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package
 * @generated
 */
public class V0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = V0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected V0Switch<Adapter> modelSwitch =
		new V0Switch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseSGrAttr4GenericType(SGrAttr4GenericType object) {
				return createSGrAttr4GenericTypeAdapter();
			}
			@Override
			public Adapter caseSGrBasicGenDataPointTypeType(SGrBasicGenDataPointTypeType object) {
				return createSGrBasicGenDataPointTypeTypeAdapter();
			}
			@Override
			public Adapter caseSGrBitmapperListType(SGrBitmapperListType object) {
				return createSGrBitmapperListTypeAdapter();
			}
			@Override
			public Adapter caseSGrChangeLog(SGrChangeLog object) {
				return createSGrChangeLogAdapter();
			}
			@Override
			public Adapter caseSGrDataPointBaseType(SGrDataPointBaseType object) {
				return createSGrDataPointBaseTypeAdapter();
			}
			@Override
			public Adapter caseSGrDataPointDescriptionType(SGrDataPointDescriptionType object) {
				return createSGrDataPointDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrDeviceBaseType(SGrDeviceBaseType object) {
				return createSGrDeviceBaseTypeAdapter();
			}
			@Override
			public Adapter caseSGrDeviceProfileType(SGrDeviceProfileType object) {
				return createSGrDeviceProfileTypeAdapter();
			}
			@Override
			public Adapter caseSGrEnumListType(SGrEnumListType object) {
				return createSGrEnumListTypeAdapter();
			}
			@Override
			public Adapter caseSGrFlexAssistanceType(SGrFlexAssistanceType object) {
				return createSGrFlexAssistanceTypeAdapter();
			}
			@Override
			public Adapter caseSGrFunctionalProfileBaseType(SGrFunctionalProfileBaseType object) {
				return createSGrFunctionalProfileBaseTypeAdapter();
			}
			@Override
			public Adapter caseSGrGenDeviceFrame(SGrGenDeviceFrame object) {
				return createSGrGenDeviceFrameAdapter();
			}
			@Override
			public Adapter caseSGrGenFunctionalProfileType(SGrGenFunctionalProfileType object) {
				return createSGrGenFunctionalProfileTypeAdapter();
			}
			@Override
			public Adapter caseSGrLegibDocumentationType(SGrLegibDocumentationType object) {
				return createSGrLegibDocumentationTypeAdapter();
			}
			@Override
			public Adapter caseSGrNamelistType(SGrNamelistType object) {
				return createSGrNamelistTypeAdapter();
			}
			@Override
			public Adapter caseSGrProfileDescriptionType(SGrProfileDescriptionType object) {
				return createSGrProfileDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrProfilenumberType(SGrProfilenumberType object) {
				return createSGrProfilenumberTypeAdapter();
			}
			@Override
			public Adapter caseSGrReleaseNotes(SGrReleaseNotes object) {
				return createSGrReleaseNotesAdapter();
			}
			@Override
			public Adapter caseSGrScalingType(SGrScalingType object) {
				return createSGrScalingTypeAdapter();
			}
			@Override
			public Adapter caseSGrSmoothTransitionType(SGrSmoothTransitionType object) {
				return createSGrSmoothTransitionTypeAdapter();
			}
			@Override
			public Adapter caseSGrStabilityFallbackType(SGrStabilityFallbackType object) {
				return createSGrStabilityFallbackTypeAdapter();
			}
			@Override
			public Adapter caseSGrVersionNumberType(SGrVersionNumberType object) {
				return createSGrVersionNumberTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrAttr4GenericType <em>SGr Attr4 Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType
	 * @generated
	 */
	public Adapter createSGrAttr4GenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType <em>SGr Basic Gen Data Point Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType
	 * @generated
	 */
	public Adapter createSGrBasicGenDataPointTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrBitmapperListType <em>SGr Bitmapper List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrBitmapperListType
	 * @generated
	 */
	public Adapter createSGrBitmapperListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrChangeLog <em>SGr Change Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrChangeLog
	 * @generated
	 */
	public Adapter createSGrChangeLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDataPointBaseType <em>SGr Data Point Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDataPointBaseType
	 * @generated
	 */
	public Adapter createSGrDataPointBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType <em>SGr Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType
	 * @generated
	 */
	public Adapter createSGrDataPointDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDeviceBaseType <em>SGr Device Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDeviceBaseType
	 * @generated
	 */
	public Adapter createSGrDeviceBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDeviceProfileType <em>SGr Device Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType
	 * @generated
	 */
	public Adapter createSGrDeviceProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrEnumListType <em>SGr Enum List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrEnumListType
	 * @generated
	 */
	public Adapter createSGrEnumListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType <em>SGr Flex Assistance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrFlexAssistanceType
	 * @generated
	 */
	public Adapter createSGrFlexAssistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrFunctionalProfileBaseType <em>SGr Functional Profile Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrFunctionalProfileBaseType
	 * @generated
	 */
	public Adapter createSGrFunctionalProfileBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrGenDeviceFrame <em>SGr Gen Device Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrGenDeviceFrame
	 * @generated
	 */
	public Adapter createSGrGenDeviceFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrGenFunctionalProfileType <em>SGr Gen Functional Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrGenFunctionalProfileType
	 * @generated
	 */
	public Adapter createSGrGenFunctionalProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType <em>SGr Legib Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType
	 * @generated
	 */
	public Adapter createSGrLegibDocumentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrNamelistType <em>SGr Namelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrNamelistType
	 * @generated
	 */
	public Adapter createSGrNamelistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType <em>SGr Profile Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType
	 * @generated
	 */
	public Adapter createSGrProfileDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrProfilenumberType <em>SGr Profilenumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType
	 * @generated
	 */
	public Adapter createSGrProfilenumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrReleaseNotes <em>SGr Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrReleaseNotes
	 * @generated
	 */
	public Adapter createSGrReleaseNotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrScalingType <em>SGr Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrScalingType
	 * @generated
	 */
	public Adapter createSGrScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType <em>SGr Smooth Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType
	 * @generated
	 */
	public Adapter createSGrSmoothTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType <em>SGr Stability Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType
	 * @generated
	 */
	public Adapter createSGrStabilityFallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrVersionNumberType <em>SGr Version Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType
	 * @generated
	 */
	public Adapter createSGrVersionNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //V0AdapterFactory
