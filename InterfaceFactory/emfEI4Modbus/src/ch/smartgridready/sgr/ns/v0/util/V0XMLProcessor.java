/**
 */
package ch.smartgridready.sgr.ns.v0.util;

import ch.smartgridready.sgr.ns.v0.V0Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class V0XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		V0Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the V0ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new V0ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new V0ResourceFactoryImpl());
		}
		return registrations;
	}

} //V0XMLProcessor
