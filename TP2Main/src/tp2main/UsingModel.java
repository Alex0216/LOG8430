package tp2main;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.TP2Package;

public class UsingModel {

	public static void main(String[] args) {
		
		TP2Package tp = TP2Package.eINSTANCE;
		UsingModel model = new UsingModel();
		
		
		Master master = model.loadContent("My.tp2");

		System.out.println("Hello");
	}

	
	public static Master loadContent(String file){
		// Register the XMI resource factory for the .tp2 extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tp2", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI("My.tp2"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    return (Master) resource.getContents().get(0);
	}

}
