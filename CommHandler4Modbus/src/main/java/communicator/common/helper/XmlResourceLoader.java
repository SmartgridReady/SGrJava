package communicator.common.helper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class XmlResourceLoader<T> {

    private static final AdapterFactoryEditingDomain domain;

    static {
        // XML namespace eNS_URI "http://www.smartgridready.com/ns/V0/" map to "com.smartgridready.ns.v0.V0Package" classes.
        EPackage.Registry.INSTANCE.put(com.smartgridready.ns.v0.V0Package.eNS_URI, com.smartgridready.ns.v0.V0Package.eINSTANCE);

        // Use XMIResourceFactory to parse *.xml files.
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xml", new XMIResourceFactoryImpl());

		AdapterFactory adapterFactory =	new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        domain = new AdapterFactoryEditingDomain(
                adapterFactory, 
                new BasicCommandStack());
        
        domain.getResourceSet().setPackageRegistry(EPackage.Registry.INSTANCE);
    }

    @SuppressWarnings({"unchecked", "unused"})
    public T load(String resourcePath, String xmlContent, boolean validate) throws IOException {

        // TODO I think it is it OK to use always the same resource name since we do not store the resource back the filesystem.
        Resource resource = domain.createResource("eid.xml");

		try (InputStream is = IOUtils.toInputStream(xmlContent,  StandardCharsets.UTF_8)) {
			resource.load(is, null);
		} catch (IOException e) {
			// ignore value errors unless validation enabled
            if (validate) {
                throw e;
            }
		}

        if (!resource.isLoaded()) {
			throw new IOException(String.format("Resource '%s' could not be loaded", resource.getURI()));
		}

        T result = (T) resource.getAllContents().next();

		resource.unload();

		return result;
    }
}
