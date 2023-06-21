/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;

import com.smartgridready.ns.v0.util.V0Validator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V0PackageImpl extends EPackageImpl implements V0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "v0.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrAttr4GenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrBasicGenDataPointTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrBitmapperListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrChangeLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDataPointBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDataPointDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDeviceBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDeviceProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrEnumListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrFlexAssistanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrFunctionalProfileBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrGenDeviceFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrGenFunctionalProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrLegibDocumentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrNamelistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrProfileDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrProfilenumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrReleaseNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrScalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrSmoothTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrStabilityFallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrVersionNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ctaDomHotWOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ctaHCOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ctaHPOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ctaHPOpStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovBufferStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovDomHotWOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovDomHotWStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovHCOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovHCOpStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovHPActBufferStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovHPOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovHPOpStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovSGReadySrcSelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hovTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelOfOperationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum profileTypeEnumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrBool2BitRankTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrDeviceKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sgReadyStateLv1TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sgReadyStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVSEStateLv1TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVSEStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrHCOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sgrHCOpStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrHPOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrHPOpstateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrLanguageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrManufacturerIDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMeasValueSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMeasValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMROPresenceLevelIndicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrObligLvlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrOCPPStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrPowerSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrReleaseStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrRWPTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPFeedInStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPLoadStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSunspStateCodesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrTransportServicesUsedListTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stiHPOpstateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subProfileTypeEnumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ctaDomHotWOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ctaHCOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ctaHPOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ctaHPOpStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovBufferStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovDomHotWOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovDomHotWStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovHCOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovHCOpStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovHPActBufferStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovHPOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovHPOpStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovSGReadySrcSelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hovTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelOfOperationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType profileTypeEnumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrBool2BitRankTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrDeviceKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sgReadyStateLv1TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sgReadyStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVSEStateLv1TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVSEStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrHCOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sgrHCOpStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrHPOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrHPOpstateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrLanguageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrManufacturerIDTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMeasValueSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMeasValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMROPresenceLevelIndicationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrObligLvlTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrOCPPStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPowerSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPrecisionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPrecisionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrReleaseStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrRWPTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPFeedInStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPLoadStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPServiceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSpecialQualityReqTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSunspStateCodesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrTransportServicesUsedListTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrUnitsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stiHPOpstateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subProfileTypeEnumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textElementTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.smartgridready.ns.v0.V0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private V0PackageImpl() {
		super(eNS_URI, V0Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link V0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static V0Package init() {
		if (isInited) return (V0Package)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI);

		// Obtain or create and register package
		Object registeredV0Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		V0PackageImpl theV0Package = registeredV0Package instanceof V0PackageImpl ? (V0PackageImpl)registeredV0Package : new V0PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theV0Package.loadPackage();

		// Fix loaded packages
		theV0Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theV0Package,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return V0Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theV0Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(V0Package.eNS_URI, theV0Package);
		return theV0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(8);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SGrGenDeviceFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrAttr4GenericType() {
		if (sGrAttr4GenericTypeEClass == null) {
			sGrAttr4GenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(33);
		}
		return sGrAttr4GenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MaxVal() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MinVal() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_SpecQualityRequirement() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_Precision() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrAttr4GenericType_StabilityFallback() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrAttr4GenericType_SmoothTransition() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MaxLatencyTimeMs() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_ValueType() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_ValueSource() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_SampleRate() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_Curtailment() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MinLoad() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MaxLockTimeMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_MinRunTimeMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_ValueByTimeTableMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrAttr4GenericType_FlexAssistance() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrAttr4GenericType_UnitConversionMultiplicator() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrBasicGenDataPointTypeType() {
		if (sGrBasicGenDataPointTypeTypeEClass == null) {
			sGrBasicGenDataPointTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(34);
		}
		return sGrBasicGenDataPointTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrBasicGenDataPointTypeType_Enum2bitmapIndex() {
        return (EReference)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Boolean() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int8() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int16() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int32() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int64() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int8U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int16U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int32U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Int64U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Float32() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_Float64() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrBasicGenDataPointTypeType_Enum() {
        return (EReference)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_DateTime() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBasicGenDataPointTypeType_String() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrBitmapperListType() {
		if (sGrBitmapperListTypeEClass == null) {
			sGrBitmapperListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(35);
		}
		return sGrBitmapperListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBitmapperListType_SgrBool2BitRank() {
        return (EAttribute)getSGrBitmapperListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBitmapperListType_SgrHPOpstate() {
        return (EAttribute)getSGrBitmapperListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBitmapperListType_SgrHCOpstate() {
        return (EAttribute)getSGrBitmapperListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBitmapperListType_HovHPActBufferState() {
        return (EAttribute)getSGrBitmapperListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrBitmapperListType_StiHPOpstate() {
        return (EAttribute)getSGrBitmapperListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrChangeLog() {
		if (sGrChangeLogEClass == null) {
			sGrChangeLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(38);
		}
		return sGrChangeLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrChangeLog_Version() {
        return (EAttribute)getSGrChangeLog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrChangeLog_Date() {
        return (EAttribute)getSGrChangeLog().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrChangeLog_Author() {
        return (EAttribute)getSGrChangeLog().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrChangeLog_Comment() {
        return (EAttribute)getSGrChangeLog().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrDataPointBaseType() {
		if (sGrDataPointBaseTypeEClass == null) {
			sGrDataPointBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(39);
		}
		return sGrDataPointBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointBaseType_DataPoint() {
        return (EReference)getSGrDataPointBaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointBaseType_GenAttribute() {
        return (EReference)getSGrDataPointBaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrDataPointDescriptionType() {
		if (sGrDataPointDescriptionTypeEClass == null) {
			sGrDataPointDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(40);
		}
		return sGrDataPointDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointDescriptionType_BasicDataType() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDataPointDescriptionType_ArrLen() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointDescriptionType_DpNameList() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointDescriptionType_DpLegibDesc() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDataPointDescriptionType_DpPrgDesc() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDataPointDescriptionType_DatapointName() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDataPointDescriptionType_MroVisibilityIndicator() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDataPointDescriptionType_RwpDatadirection() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDataPointDescriptionType_Unit() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrDeviceBaseType() {
		if (sGrDeviceBaseTypeEClass == null) {
			sGrDeviceBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(41);
		}
		return sGrDeviceBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceBaseType_ReleaseNotes() {
        return (EReference)getSGrDeviceBaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceBaseType_DeviceProfile() {
        return (EReference)getSGrDeviceBaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceBaseType_GenAttribute() {
        return (EReference)getSGrDeviceBaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceBaseType_DeviceName() {
        return (EAttribute)getSGrDeviceBaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceBaseType_IsLocalControl() {
        return (EAttribute)getSGrDeviceBaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceBaseType_ManufacturerID() {
        return (EAttribute)getSGrDeviceBaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceBaseType_ManufacturerName() {
        return (EAttribute)getSGrDeviceBaseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrDeviceProfileType() {
		if (sGrDeviceProfileTypeEClass == null) {
			sGrDeviceProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(44);
		}
		return sGrDeviceProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceProfileType_DevNameList() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceProfileType_DevLegibDesc() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_TransportService() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_DeviceKind() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_SerialNumber() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceProfileType_SoftwareRevision() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceProfileType_HardwareRevision() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_BrandName() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_PowerSource() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_NominalPower() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_ManufSpecIdent() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_ManufacturerLabel() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_RemAuthorID() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrDeviceProfileType_DevLevelofOperation() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrDeviceProfileType_DevPrgDesc() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrEnumListType() {
		if (sGrEnumListTypeEClass == null) {
			sGrEnumListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(49);
		}
		return sGrEnumListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrMeasValueSource() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrPowerSource() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgreadyStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgreadyStateLv1() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrSunspStateCodes() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrEVSEStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrEVSEStateLv1() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrSGCPLoadStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrSGCPFeedInStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrEVState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrSGCPService() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrObligLvl() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrOCPPState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrHPOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_SgrHCOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_CtaDomHotWOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_CtaHPOpState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_CtaHPOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_CtaHCOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovHPOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovHCOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovSGReadySrcSel() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovBufferState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovHCOpState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovDomHotWOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovDomHotWState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrEnumListType_HovHPOpState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrFlexAssistanceType() {
		if (sGrFlexAssistanceTypeEClass == null) {
			sGrFlexAssistanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(56);
		}
		return sGrFlexAssistanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrFlexAssistanceType_Assists() {
        return (EAttribute)getSGrFlexAssistanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrFlexAssistanceType_ObligedTo() {
        return (EAttribute)getSGrFlexAssistanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrFunctionalProfileBaseType() {
		if (sGrFunctionalProfileBaseTypeEClass == null) {
			sGrFunctionalProfileBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(57);
		}
		return sGrFunctionalProfileBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrFunctionalProfileBaseType_FunctionalProfile() {
        return (EReference)getSGrFunctionalProfileBaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrFunctionalProfileBaseType_GenAttribute() {
        return (EReference)getSGrFunctionalProfileBaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrGenDeviceFrame() {
		if (sGrGenDeviceFrameEClass == null) {
			sGrGenDeviceFrameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(58);
		}
		return sGrGenDeviceFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrGenDeviceFrame_FpListElement() {
        return (EReference)getSGrGenDeviceFrame().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrGenFunctionalProfileType() {
		if (sGrGenFunctionalProfileTypeEClass == null) {
			sGrGenFunctionalProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(59);
		}
		return sGrGenFunctionalProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrGenFunctionalProfileType_DpListElement() {
        return (EReference)getSGrGenFunctionalProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrLegibDocumentationType() {
		if (sGrLegibDocumentationTypeEClass == null) {
			sGrLegibDocumentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(70);
		}
		return sGrLegibDocumentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrLegibDocumentationType_TextElement() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrLegibDocumentationType_Language() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrLegibDocumentationType_Uri() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrNamelistType() {
		if (sGrNamelistTypeEClass == null) {
			sGrNamelistTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(79);
		}
		return sGrNamelistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SLV1Name() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SWorkName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SManufName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SIEC61850Name() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SSAREFName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SEEBUSName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SSUNSPECName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SHPbwpName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrNamelistType_SEN17609Name() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrProfileDescriptionType() {
		if (sGrProfileDescriptionTypeEClass == null) {
			sGrProfileDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(88);
		}
		return sGrProfileDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrProfileDescriptionType_ProfileNumber() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrProfileDescriptionType_FpNameList() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrProfileDescriptionType_FpLegibDesc() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrProfileDescriptionType_FpPrgDesc() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrProfileDescriptionType_ProfileName() {
        return (EAttribute)getSGrProfileDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrProfilenumberType() {
		if (sGrProfilenumberTypeEClass == null) {
			sGrProfilenumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(89);
		}
		return sGrProfilenumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrProfilenumberType_SpecsOwnerId() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrProfilenumberType_ProfileIdentification() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrProfilenumberType_SubProfileIdent() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrProfilenumberType_SgrLevelOfOperation() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrProfilenumberType_VersionNumber() {
        return (EReference)getSGrProfilenumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrReleaseNotes() {
		if (sGrReleaseNotesEClass == null) {
			sGrReleaseNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(90);
		}
		return sGrReleaseNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrReleaseNotes_State() {
        return (EAttribute)getSGrReleaseNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrReleaseNotes_Remarks() {
        return (EAttribute)getSGrReleaseNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGrReleaseNotes_Changelog() {
        return (EReference)getSGrReleaseNotes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrScalingType() {
		if (sGrScalingTypeEClass == null) {
			sGrScalingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(95);
		}
		return sGrScalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrScalingType_Multiplicator() {
        return (EAttribute)getSGrScalingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrScalingType_Powerof10() {
        return (EAttribute)getSGrScalingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrSmoothTransitionType() {
		if (sGrSmoothTransitionTypeEClass == null) {
			sGrSmoothTransitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(102);
		}
		return sGrSmoothTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrSmoothTransitionType_WinTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrSmoothTransitionType_RvrtTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrSmoothTransitionType_RmpTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrStabilityFallbackType() {
		if (sGrStabilityFallbackTypeEClass == null) {
			sGrStabilityFallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(104);
		}
		return sGrStabilityFallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrStabilityFallbackType_MaxReceiveTime() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrStabilityFallbackType_InitValue() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrStabilityFallbackType_FallbackValue() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrVersionNumberType() {
		if (sGrVersionNumberTypeEClass == null) {
			sGrVersionNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(111);
		}
		return sGrVersionNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrVersionNumberType_PrimaryVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrVersionNumberType_SecondaryVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrVersionNumberType_SubReleaseVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCtaDomHotWOpModeType() {
		if (ctaDomHotWOpModeTypeEEnum == null) {
			ctaDomHotWOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(0);
		}
		return ctaDomHotWOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCtaHCOpModeType() {
		if (ctaHCOpModeTypeEEnum == null) {
			ctaHCOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(2);
		}
		return ctaHCOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCtaHPOpModeType() {
		if (ctaHPOpModeTypeEEnum == null) {
			ctaHPOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(4);
		}
		return ctaHPOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCtaHPOpStateType() {
		if (ctaHPOpStateTypeEEnum == null) {
			ctaHPOpStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(6);
		}
		return ctaHPOpStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovBufferStateType() {
		if (hovBufferStateTypeEEnum == null) {
			hovBufferStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(9);
		}
		return hovBufferStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovDomHotWOpModeType() {
		if (hovDomHotWOpModeTypeEEnum == null) {
			hovDomHotWOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(11);
		}
		return hovDomHotWOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovDomHotWStateType() {
		if (hovDomHotWStateTypeEEnum == null) {
			hovDomHotWStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(13);
		}
		return hovDomHotWStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovHCOpModeType() {
		if (hovHCOpModeTypeEEnum == null) {
			hovHCOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(15);
		}
		return hovHCOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovHCOpStateType() {
		if (hovHCOpStateTypeEEnum == null) {
			hovHCOpStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(17);
		}
		return hovHCOpStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovHPActBufferStateType() {
		if (hovHPActBufferStateTypeEEnum == null) {
			hovHPActBufferStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(19);
		}
		return hovHPActBufferStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovHPOpModeType() {
		if (hovHPOpModeTypeEEnum == null) {
			hovHPOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(21);
		}
		return hovHPOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovHPOpStateType() {
		if (hovHPOpStateTypeEEnum == null) {
			hovHPOpStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(23);
		}
		return hovHPOpStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovSGReadySrcSelType() {
		if (hovSGReadySrcSelTypeEEnum == null) {
			hovSGReadySrcSelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(25);
		}
		return hovSGReadySrcSelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHovType() {
		if (hovTypeEEnum == null) {
			hovTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(27);
		}
		return hovTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelOfOperationType() {
		if (levelOfOperationTypeEEnum == null) {
			levelOfOperationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(29);
		}
		return levelOfOperationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProfileTypeEnumType() {
		if (profileTypeEnumTypeEEnum == null) {
			profileTypeEnumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(31);
		}
		return profileTypeEnumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrBool2BitRankType() {
		if (sGrBool2BitRankTypeEEnum == null) {
			sGrBool2BitRankTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(36);
		}
		return sGrBool2BitRankTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrDeviceKindType() {
		if (sGrDeviceKindTypeEEnum == null) {
			sGrDeviceKindTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(42);
		}
		return sGrDeviceKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGReadyStateLv1Type() {
		if (sgReadyStateLv1TypeEEnum == null) {
			sgReadyStateLv1TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(45);
		}
		return sgReadyStateLv1TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGReadyStateLv2Type() {
		if (sgReadyStateLv2TypeEEnum == null) {
			sgReadyStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(47);
		}
		return sgReadyStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrEVSEStateLv1Type() {
		if (sGrEVSEStateLv1TypeEEnum == null) {
			sGrEVSEStateLv1TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(50);
		}
		return sGrEVSEStateLv1TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrEVSEStateLv2Type() {
		if (sGrEVSEStateLv2TypeEEnum == null) {
			sGrEVSEStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(52);
		}
		return sGrEVSEStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrEVStateType() {
		if (sGrEVStateTypeEEnum == null) {
			sGrEVStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(54);
		}
		return sGrEVStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrHCOpModeType() {
		if (sGrHCOpModeTypeEEnum == null) {
			sGrHCOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(60);
		}
		return sGrHCOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSgrHCOpStateType() {
		if (sgrHCOpStateTypeEEnum == null) {
			sgrHCOpStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(62);
		}
		return sgrHCOpStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrHPOpModeType() {
		if (sGrHPOpModeTypeEEnum == null) {
			sGrHPOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(64);
		}
		return sGrHPOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrHPOpstateType() {
		if (sGrHPOpstateTypeEEnum == null) {
			sGrHPOpstateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(66);
		}
		return sGrHPOpstateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrLanguageType() {
		if (sGrLanguageTypeEEnum == null) {
			sGrLanguageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(68);
		}
		return sGrLanguageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrManufacturerIDType() {
		if (sGrManufacturerIDTypeEEnum == null) {
			sGrManufacturerIDTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(71);
		}
		return sGrManufacturerIDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrMeasValueSourceType() {
		if (sGrMeasValueSourceTypeEEnum == null) {
			sGrMeasValueSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(73);
		}
		return sGrMeasValueSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrMeasValueType() {
		if (sGrMeasValueTypeEEnum == null) {
			sGrMeasValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(75);
		}
		return sGrMeasValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrMROPresenceLevelIndicationType() {
		if (sGrMROPresenceLevelIndicationTypeEEnum == null) {
			sGrMROPresenceLevelIndicationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(77);
		}
		return sGrMROPresenceLevelIndicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrObligLvlType() {
		if (sGrObligLvlTypeEEnum == null) {
			sGrObligLvlTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(80);
		}
		return sGrObligLvlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrOCPPStateType() {
		if (sGrOCPPStateTypeEEnum == null) {
			sGrOCPPStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(82);
		}
		return sGrOCPPStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrPowerSourceType() {
		if (sGrPowerSourceTypeEEnum == null) {
			sGrPowerSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(84);
		}
		return sGrPowerSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrReleaseState() {
		if (sGrReleaseStateEEnum == null) {
			sGrReleaseStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(91);
		}
		return sGrReleaseStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrRWPType() {
		if (sGrRWPTypeEEnum == null) {
			sGrRWPTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(93);
		}
		return sGrRWPTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrSGCPFeedInStateLv2Type() {
		if (sGrSGCPFeedInStateLv2TypeEEnum == null) {
			sGrSGCPFeedInStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(96);
		}
		return sGrSGCPFeedInStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrSGCPLoadStateLv2Type() {
		if (sGrSGCPLoadStateLv2TypeEEnum == null) {
			sGrSGCPLoadStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(98);
		}
		return sGrSGCPLoadStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrSGCPServiceType() {
		if (sGrSGCPServiceTypeEEnum == null) {
			sGrSGCPServiceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(100);
		}
		return sGrSGCPServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrSunspStateCodesType() {
		if (sGrSunspStateCodesTypeEEnum == null) {
			sGrSunspStateCodesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(105);
		}
		return sGrSunspStateCodesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrTransportServicesUsedListType() {
		if (sGrTransportServicesUsedListTypeEEnum == null) {
			sGrTransportServicesUsedListTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(107);
		}
		return sGrTransportServicesUsedListTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSGrUnits() {
		if (sGrUnitsEEnum == null) {
			sGrUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(109);
		}
		return sGrUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStiHPOpstateType() {
		if (stiHPOpstateTypeEEnum == null) {
			stiHPOpstateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(112);
		}
		return stiHPOpstateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubProfileTypeEnumType() {
		if (subProfileTypeEnumTypeEEnum == null) {
			subProfileTypeEnumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(114);
		}
		return subProfileTypeEnumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCtaDomHotWOpModeTypeObject() {
		if (ctaDomHotWOpModeTypeObjectEDataType == null) {
			ctaDomHotWOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(1);
		}
		return ctaDomHotWOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCtaHCOpModeTypeObject() {
		if (ctaHCOpModeTypeObjectEDataType == null) {
			ctaHCOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(3);
		}
		return ctaHCOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCtaHPOpModeTypeObject() {
		if (ctaHPOpModeTypeObjectEDataType == null) {
			ctaHPOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(5);
		}
		return ctaHPOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCtaHPOpStateTypeObject() {
		if (ctaHPOpStateTypeObjectEDataType == null) {
			ctaHPOpStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(7);
		}
		return ctaHPOpStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovBufferStateTypeObject() {
		if (hovBufferStateTypeObjectEDataType == null) {
			hovBufferStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(10);
		}
		return hovBufferStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovDomHotWOpModeTypeObject() {
		if (hovDomHotWOpModeTypeObjectEDataType == null) {
			hovDomHotWOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(12);
		}
		return hovDomHotWOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovDomHotWStateTypeObject() {
		if (hovDomHotWStateTypeObjectEDataType == null) {
			hovDomHotWStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(14);
		}
		return hovDomHotWStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovHCOpModeTypeObject() {
		if (hovHCOpModeTypeObjectEDataType == null) {
			hovHCOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(16);
		}
		return hovHCOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovHCOpStateTypeObject() {
		if (hovHCOpStateTypeObjectEDataType == null) {
			hovHCOpStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(18);
		}
		return hovHCOpStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovHPActBufferStateTypeObject() {
		if (hovHPActBufferStateTypeObjectEDataType == null) {
			hovHPActBufferStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(20);
		}
		return hovHPActBufferStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovHPOpModeTypeObject() {
		if (hovHPOpModeTypeObjectEDataType == null) {
			hovHPOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(22);
		}
		return hovHPOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovHPOpStateTypeObject() {
		if (hovHPOpStateTypeObjectEDataType == null) {
			hovHPOpStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(24);
		}
		return hovHPOpStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovSGReadySrcSelTypeObject() {
		if (hovSGReadySrcSelTypeObjectEDataType == null) {
			hovSGReadySrcSelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(26);
		}
		return hovSGReadySrcSelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHovTypeObject() {
		if (hovTypeObjectEDataType == null) {
			hovTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(28);
		}
		return hovTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLevelOfOperationTypeObject() {
		if (levelOfOperationTypeObjectEDataType == null) {
			levelOfOperationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(30);
		}
		return levelOfOperationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProfileTypeEnumTypeObject() {
		if (profileTypeEnumTypeObjectEDataType == null) {
			profileTypeEnumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(32);
		}
		return profileTypeEnumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrBool2BitRankTypeObject() {
		if (sGrBool2BitRankTypeObjectEDataType == null) {
			sGrBool2BitRankTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(37);
		}
		return sGrBool2BitRankTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrDeviceKindTypeObject() {
		if (sGrDeviceKindTypeObjectEDataType == null) {
			sGrDeviceKindTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(43);
		}
		return sGrDeviceKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGReadyStateLv1TypeObject() {
		if (sgReadyStateLv1TypeObjectEDataType == null) {
			sgReadyStateLv1TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(46);
		}
		return sgReadyStateLv1TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGReadyStateLv2TypeObject() {
		if (sgReadyStateLv2TypeObjectEDataType == null) {
			sgReadyStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(48);
		}
		return sgReadyStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrEVSEStateLv1TypeObject() {
		if (sGrEVSEStateLv1TypeObjectEDataType == null) {
			sGrEVSEStateLv1TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(51);
		}
		return sGrEVSEStateLv1TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrEVSEStateLv2TypeObject() {
		if (sGrEVSEStateLv2TypeObjectEDataType == null) {
			sGrEVSEStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(53);
		}
		return sGrEVSEStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrEVStateTypeObject() {
		if (sGrEVStateTypeObjectEDataType == null) {
			sGrEVStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(55);
		}
		return sGrEVStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrHCOpModeTypeObject() {
		if (sGrHCOpModeTypeObjectEDataType == null) {
			sGrHCOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(61);
		}
		return sGrHCOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSgrHCOpStateTypeObject() {
		if (sgrHCOpStateTypeObjectEDataType == null) {
			sgrHCOpStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(63);
		}
		return sgrHCOpStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrHPOpModeTypeObject() {
		if (sGrHPOpModeTypeObjectEDataType == null) {
			sGrHPOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(65);
		}
		return sGrHPOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrHPOpstateTypeObject() {
		if (sGrHPOpstateTypeObjectEDataType == null) {
			sGrHPOpstateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(67);
		}
		return sGrHPOpstateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrLanguageTypeObject() {
		if (sGrLanguageTypeObjectEDataType == null) {
			sGrLanguageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(69);
		}
		return sGrLanguageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrManufacturerIDTypeObject() {
		if (sGrManufacturerIDTypeObjectEDataType == null) {
			sGrManufacturerIDTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(72);
		}
		return sGrManufacturerIDTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrMeasValueSourceTypeObject() {
		if (sGrMeasValueSourceTypeObjectEDataType == null) {
			sGrMeasValueSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(74);
		}
		return sGrMeasValueSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrMeasValueTypeObject() {
		if (sGrMeasValueTypeObjectEDataType == null) {
			sGrMeasValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(76);
		}
		return sGrMeasValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrMROPresenceLevelIndicationTypeObject() {
		if (sGrMROPresenceLevelIndicationTypeObjectEDataType == null) {
			sGrMROPresenceLevelIndicationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(78);
		}
		return sGrMROPresenceLevelIndicationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrObligLvlTypeObject() {
		if (sGrObligLvlTypeObjectEDataType == null) {
			sGrObligLvlTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(81);
		}
		return sGrObligLvlTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrOCPPStateTypeObject() {
		if (sGrOCPPStateTypeObjectEDataType == null) {
			sGrOCPPStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(83);
		}
		return sGrOCPPStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrPowerSourceTypeObject() {
		if (sGrPowerSourceTypeObjectEDataType == null) {
			sGrPowerSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(85);
		}
		return sGrPowerSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrPrecisionType() {
		if (sGrPrecisionTypeEDataType == null) {
			sGrPrecisionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(86);
		}
		return sGrPrecisionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrPrecisionTypeObject() {
		if (sGrPrecisionTypeObjectEDataType == null) {
			sGrPrecisionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(87);
		}
		return sGrPrecisionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrReleaseStateObject() {
		if (sGrReleaseStateObjectEDataType == null) {
			sGrReleaseStateObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(92);
		}
		return sGrReleaseStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrRWPTypeObject() {
		if (sGrRWPTypeObjectEDataType == null) {
			sGrRWPTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(94);
		}
		return sGrRWPTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrSGCPFeedInStateLv2TypeObject() {
		if (sGrSGCPFeedInStateLv2TypeObjectEDataType == null) {
			sGrSGCPFeedInStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(97);
		}
		return sGrSGCPFeedInStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrSGCPLoadStateLv2TypeObject() {
		if (sGrSGCPLoadStateLv2TypeObjectEDataType == null) {
			sGrSGCPLoadStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(99);
		}
		return sGrSGCPLoadStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrSGCPServiceTypeObject() {
		if (sGrSGCPServiceTypeObjectEDataType == null) {
			sGrSGCPServiceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(101);
		}
		return sGrSGCPServiceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrSpecialQualityReqType() {
		if (sGrSpecialQualityReqTypeEDataType == null) {
			sGrSpecialQualityReqTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(103);
		}
		return sGrSpecialQualityReqTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrSunspStateCodesTypeObject() {
		if (sGrSunspStateCodesTypeObjectEDataType == null) {
			sGrSunspStateCodesTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(106);
		}
		return sGrSunspStateCodesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrTransportServicesUsedListTypeObject() {
		if (sGrTransportServicesUsedListTypeObjectEDataType == null) {
			sGrTransportServicesUsedListTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(108);
		}
		return sGrTransportServicesUsedListTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSGrUnitsObject() {
		if (sGrUnitsObjectEDataType == null) {
			sGrUnitsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(110);
		}
		return sGrUnitsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStiHPOpstateTypeObject() {
		if (stiHPOpstateTypeObjectEDataType == null) {
			stiHPOpstateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(113);
		}
		return stiHPOpstateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubProfileTypeEnumTypeObject() {
		if (subProfileTypeEnumTypeObjectEDataType == null) {
			subProfileTypeEnumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(115);
		}
		return subProfileTypeEnumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextElementType() {
		if (textElementTypeEDataType == null) {
			textElementTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(116);
		}
		return textElementTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0Factory getV0Factory() {
		return (V0Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("com.smartgridready.ns.v0." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //V0PackageImpl
