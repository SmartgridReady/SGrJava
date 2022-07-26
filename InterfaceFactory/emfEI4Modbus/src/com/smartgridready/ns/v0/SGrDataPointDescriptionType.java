/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Data Point Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  This schema sheet serves the
 * 				generation of the data point for to define a single data point, its
 * 				type and links to potential attributes.
 * 			
 *  Dieses Schema dient der
 * 				Erzeugung eines einzelnen Datenpunktes zur Definition des Datentyps
 * 				und der Verbindung mit möglichen Attributen.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getBasicDataType <em>Basic Data Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpNameList <em>Dp Name List</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpLegibDesc <em>Dp Legib Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDatapointName <em>Datapoint Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection <em>Rwp Datadirection</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType()
 * @model extendedMetaData="name='SGrDataPointDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrDataPointDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Data Type</em>' containment reference.
	 * @see #setBasicDataType(SGrBasicGenDataPointTypeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_BasicDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='basicDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrBasicGenDataPointTypeType getBasicDataType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getBasicDataType <em>Basic Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Data Type</em>' containment reference.
	 * @see #getBasicDataType()
	 * @generated
	 */
	void setBasicDataType(SGrBasicGenDataPointTypeType value);

	/**
	 * Returns the value of the '<em><b>Dp Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Name List</em>' containment reference.
	 * @see #setDpNameList(SGrNamelistType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_DpNameList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dpNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrNamelistType getDpNameList();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDpNameList <em>Dp Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dp Name List</em>' containment reference.
	 * @see #getDpNameList()
	 * @generated
	 */
	void setDpNameList(SGrNamelistType value);

	/**
	 * Returns the value of the '<em><b>Dp Legib Desc</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrLegibDocumentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     				this is the public explanation of the functionlity
	 *     				of this Datapoint
	 *     			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dp Legib Desc</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_DpLegibDesc()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='dpLegibDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrLegibDocumentationType> getDpLegibDesc();

	/**
	 * Returns the value of the '<em><b>Datapoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Bezeichnung des Datenpunktes: «Schlagwort», welches
	 * 					die Bedeutung identifiziert. Diese Bezeichnung gilt neben der
	 * 					Indexnummer als Definition für den SmartGridready Namespace für die
	 * 					maschinenlesbaren Daten.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datapoint Name</em>' attribute.
	 * @see #setDatapointName(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_DatapointName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='datapointName'"
	 * @generated
	 */
	String getDatapointName();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getDatapointName <em>Datapoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapoint Name</em>' attribute.
	 * @see #getDatapointName()
	 * @generated
	 */
	void setDatapointName(String value);

	/**
	 * Returns the value of the '<em><b>Mro Visibility Indicator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  MRO (Relevanz) Die Gewichtung der Variable bezüglich
	 * 					des Nutzens M = muss (mandatory) Datenpunkt R = empfohlener
	 * 					(recommended) Datenpunkt O = optionaler Datenpunkt
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mro Visibility Indicator</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see #isSetMroVisibilityIndicator()
	 * @see #unsetMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_MroVisibilityIndicator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mroVisibilityIndicator'"
	 * @generated
	 */
	SGrMROPresenceLevelIndicationType getMroVisibilityIndicator();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mro Visibility Indicator</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrMROPresenceLevelIndicationType
	 * @see #isSetMroVisibilityIndicator()
	 * @see #unsetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @generated
	 */
	void setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @generated
	 */
	void unsetMroVisibilityIndicator();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getMroVisibilityIndicator <em>Mro Visibility Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mro Visibility Indicator</em>' attribute is set.
	 * @see #unsetMroVisibilityIndicator()
	 * @see #getMroVisibilityIndicator()
	 * @see #setMroVisibilityIndicator(SGrMROPresenceLevelIndicationType)
	 * @generated
	 */
	boolean isSetMroVisibilityIndicator();

	/**
	 * Returns the value of the '<em><b>Rwp Datadirection</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrRWPType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RWP (Eigenschaft des Datenpunktes) bezeichnet die
	 * 					Datenrichtung und die Datenhaltung R = lesen aus Sicht des
	 * 					Profilnutzers W = schreiben aus Sicht der Profilnutzers P =
	 * 					persistente Speicherung der Daten
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rwp Datadirection</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see #isSetRwpDatadirection()
	 * @see #unsetRwpDatadirection()
	 * @see #setRwpDatadirection(SGrRWPType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_RwpDatadirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rwpDatadirection'"
	 * @generated
	 */
	SGrRWPType getRwpDatadirection();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection <em>Rwp Datadirection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rwp Datadirection</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrRWPType
	 * @see #isSetRwpDatadirection()
	 * @see #unsetRwpDatadirection()
	 * @see #getRwpDatadirection()
	 * @generated
	 */
	void setRwpDatadirection(SGrRWPType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection <em>Rwp Datadirection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRwpDatadirection()
	 * @see #getRwpDatadirection()
	 * @see #setRwpDatadirection(SGrRWPType)
	 * @generated
	 */
	void unsetRwpDatadirection();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getRwpDatadirection <em>Rwp Datadirection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rwp Datadirection</em>' attribute is set.
	 * @see #unsetRwpDatadirection()
	 * @see #getRwpDatadirection()
	 * @see #setRwpDatadirection(SGrRWPType)
	 * @generated
	 */
	boolean isSetRwpDatadirection();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.SGrUnits}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(SGrUnits)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrDataPointDescriptionType_Unit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	SGrUnits getUnit();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see com.smartgridready.ns.v0.SGrUnits
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(SGrUnits value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(SGrUnits)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(SGrUnits)
	 * @generated
	 */
	boolean isSetUnit();

} // SGrDataPointDescriptionType
