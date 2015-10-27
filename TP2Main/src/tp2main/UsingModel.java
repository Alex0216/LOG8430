package tp2main;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.TP2Package;
/**
 * Classe qui fait le loading et saving du modele en XML
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class UsingModel {
	/**
	 * Importer un modele
	 * @param file nom du fichier
	 */
	public static Master loadContent(String file){
		// Register the XMI resource factory for the .tp2 extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tp2", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI.createFileURI(file), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    return (Master) resource.getContents().get(0);
	}

	/**
	 * Sauvegarder le modele
	 * @param file nom du fichier
	 * @param m_executer instance vers l'algorithme maitre
	 */
	public static void saveContent(String absolutePath, Master m_executer) {
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tp2", new XMIResourceFactoryImpl());
		    
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI
		        .createFileURI(absolutePath));
		resource.getContents().add(m_executer);
		try{
			Path path = Paths.get(absolutePath);
			Files.newOutputStream(path);
			resource.save(Files.newOutputStream(path), Collections.EMPTY_MAP);
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
