package communicator.common.helper;
/**
*Copyright(c) 2022 Verein SmartGridready Switzerland
* @generated NOT
*
This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
   the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
   this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;


public class DeviceDescriptionLoader<C> {
		
	private static ComposedAdapterFactory composedAdapterFactory;

	/**
	 * Load an external device description from its EI-XML file.
	 *
	 * @param aBaseDir The path to the folder where the external interface file resides.
	 * @param aDescriptionFile The external interface file name.
	 * @return An instance of the device description for the given EI-XML
	 */
	public C load( String aBaseDir, String aDescriptionFile) {
		return load(aBaseDir, aDescriptionFile, null);
	}

	/**
	 * Load an external device description from its EI-XML file and replace placeholder
	 * tags with the values given by the {@code properties} parameter.
	 * <p>
	 * Example properties:
	 * <p>
	 * <pre>
	 *   Properties properties = new Properties();
	 *   properties.put("ipAddress", "127.0.0.1");
	 *   deviceDescriptionLoader.load( "./EI-XML", "MySGr-Device.xml", properties);
	 * </pre>
	 * will replace {@code {{ipAddress}}} within the EI-XML with  the value 127.0.0.1
	 *
	 * @param aBaseDir The path to the folder where the external interface file resides.
	 * @param aDescriptionFile The external interface file name.
	 * @param properties Key value pairs that replaces tags like {@code {{keyName}}} with the property {@code value}
	 * @return An instance of the device description for the given EI-XML.
	 */
	@SuppressWarnings("unchecked")
	public C load( String aBaseDir, String aDescriptionFile, Properties properties ) {	
		
		try {

			// XML namespace eNS_URI "http://www.smartgridready.com/ns/V0/" map to "com.smartgridready.ns.v0.V0Package" classes.
			EPackage.Registry.INSTANCE.put( com.smartgridready.ns.v0.V0Package.eNS_URI, com.smartgridready.ns.v0.V0Package.eINSTANCE);
			
			// Use XMIResourceFactory to parse *.xml files.
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( )
    			.put("xml", new XMIResourceFactoryImpl() );
 
			AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
					getAdapterFactory(), 
					new BasicCommandStack());
			
			domain.getResourceSet().setPackageRegistry( EPackage.Registry.INSTANCE );			
			
			Resource resource = domain.createResource( aBaseDir + aDescriptionFile );
			
			File deviceDescFile = new File( aBaseDir + aDescriptionFile);
			String deviceDescXml = FileUtils.readFileToString(deviceDescFile, StandardCharsets.UTF_8);
			
			deviceDescXml = replacePropertyPlaceholders(deviceDescXml, properties);
			
			InputStream is = IOUtils.toInputStream(deviceDescXml,  StandardCharsets.UTF_8);			
			resource.load(is, null);
										
			return (C) resource.getAllContents().next();
			
		} catch ( Exception e ) {
			System.out.println( "Error loading XML: " + e);
			return null;
		}
	}
	
	private String replacePropertyPlaceholders(String deviceDescriptionXml, Properties properties) {

		String convertedXml = deviceDescriptionXml;
		if (properties != null) {
			for (Map.Entry<Object, Object> entry : properties.entrySet()) {
				convertedXml = convertedXml.replaceAll("\\{\\{" + entry.getKey() + "\\}\\}", (String)entry.getValue());
			}
		}
		return convertedXml;
	}
	
	
	/**
	 * Return an ComposedAdapterFactory for all registered models
	 * 
	 * @return a ComposedAdapterFactory
	 */
	protected static AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}		
}
