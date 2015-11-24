package webserver;

import org.eclipse.emf.ecore.EObject;
import org.json.simple.JSONObject;

import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.Page;
import ca.polymtl.log8430.model.TP2.TP2Factory;
import ca.polymtl.log8430.model.TP2.TP2Package;

public class EMFParserJSON {
	
	public EMFParserJSON() {
		
	}
	
	public EObject createObjectFromJSON(JSONObject o) {
		if(o == null) {
			return null;
		}
		String type = (String) o.get("type");
		
		if(type == null) {
			return null;
		}
		
		if(type.equals("dossier")) {
			return createDossierFromJSON(o);
		}
		else if (type.equals("fichier")){
			return createFichierFromJSON(o);
		}
		else if (type.equals("page")){
			return createPageFromJSON(o);
		}
		return null;
	}
	
	private EObject createDossierFromJSON(JSONObject o) {
		Dossier newDossier = (Dossier)TP2Factory.eINSTANCE.create(TP2Package.eINSTANCE.getDossier());
		
		try {
			newDossier.setNom((String)o.get("nom"));
			newDossier.setNombreEnfant(((Long)o.get("enfants")).intValue());
			newDossier.setCheminAbsolu((String)o.get("chemin"));
			newDossier.setTailleOctet((long)o.get("taille"));
			return newDossier;
		} catch(Exception e) {
			System.out.println("Erreur pendant la creation d'un dossier. JSON attributes.");
			return null;
		}
	}
	
	private EObject createFichierFromJSON(JSONObject o) {
		Fichier newFichier = (Fichier)TP2Factory.eINSTANCE.create(TP2Package.eINSTANCE.getFichier());
		
		try {
			newFichier.setNom((String)o.get("nom"));
			newFichier.setCheminAbsolu((String)o.get("chemin"));
			newFichier.setTailleOctet((long)o.get("taille"));
			return newFichier;
		} catch(Exception e) {
			System.out.println("Erreur pendant la creation d'un fichier. JSON attributes.");
			return null;
		}
	}
	
	private EObject createPageFromJSON(JSONObject o) {
		Page newPage = (Page)TP2Factory.eINSTANCE.create(TP2Package.eINSTANCE.getPage());
		
		try {

			newPage.setTitrePage((String)o.get("titre"));
			newPage.setNom((String)o.get("nom"));
			newPage.setTaillePage(((Long)o.get("taillePage")).intValue());
			newPage.setTailleOctet((long)o.get("taille"));
			newPage.setURL((String)o.get("url"));
			return newPage;
		} catch(Exception e) {
			System.out.println("Erreur pendant la creation d'un fichier. JSON attributes.");
			return null;
		}
	}

}
