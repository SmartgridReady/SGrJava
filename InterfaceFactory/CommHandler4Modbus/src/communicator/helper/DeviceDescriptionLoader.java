package communicator.helper;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;


public class DeviceDescriptionLoader<C> {
	
	private static ComposedAdapterFactory composedAdapterFactory;		
	
	public C load( String aBaseDir, String aDescriptionFile ) {	
		
		try {
									
			EPackage.Registry.INSTANCE.put( ch.smartgridready.ns.s.gr.v0.V0Package.eNS_URI, ch.smartgridready.ns.s.gr.v0.V0Package.eINSTANCE);
			

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( )
    			.put("xml", new XMIResourceFactoryImpl() );

			AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
					getAdapterFactory(), 
					new BasicCommandStack());
			
			
			domain.getResourceSet().setPackageRegistry( EPackage.Registry.INSTANCE );			
			Resource resource = domain.createResource( aBaseDir + aDescriptionFile );
			resource.load(null);
			
			C sgrDeviceDescription = (C) resource.getAllContents().next();
			
			return sgrDeviceDescription;
			
		} catch ( Exception e ) {
			System.out.println( "Error loading XML: " + e);
			return null;
		}
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
