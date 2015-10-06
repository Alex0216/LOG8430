package ca.polymtl.log8430.tp1.Controller;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import ca.polymtl.log8430.tp1.Commands.Command;

/**
 * Classe contrôleur qui s'occupe de mettre à jour les path des commandes,
 * d'effacer leur résultat ou de tous les exécuter.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class Executer {
	
	ArrayList<Command> m_listCommand;
	boolean m_autoRun = false;
	
	/**
	 * Constructeur de la classe Executer
	 * @throws URISyntaxException 
	 * @throws MalformedURLException 
	 */
	public Executer()
	{
		m_listCommand = new ArrayList<Command>();
		try{
		System.out.println(new URL("classpath:ca/polymtl/log8430/tp1/resource.extension").toURI().toString());
		} catch(Exception e){}
	}

	/**
	 * Ajoute une nouvelle commande dans la liste de commandes
	 * @param command	la nouvelle command à ajouter.
	 */
	public void addCommand(Command command)
	{
		m_listCommand.add(command);
	}
	
	/**
	 * Enlève toutes les commandes de la liste de commande.
	 */
	public void clear()
	{
		for(Command c : m_listCommand)
		{
			c.clear();
		}
	}
	
	/**
	 * Exécute toutes les commandes existantes dans la liste de commande qui peuvent s'exécuter selon le type du path.
	 * @return true si toutes les commandes qui peuvent s'exécuter ont réussi l'exécution, sinon false.
	 */
	public boolean executeAllCommand()
	{
		boolean errorFlag = false;
		for(Command c : m_listCommand)
			if(c.canExecute())
				errorFlag |= !c.execute();
		return !errorFlag;
	}
	
	/**
	 * Exécute une commande spécifique passée en paramètre.
	 * @param command	La commande à exécuter
	 * @return			true si la commande a réssi l'exécution, sinon false.
	 */
	public boolean executeCommand(Command command) 
	{
		return command.execute();
	}

	/**
	 * Met à jour les path de toutes les commandes, et exécute
	 * toutes les commandes si le mode autoRun est activé.
	 * @param path
	 */
	public void updatePath(String path) {
		for(Command c : m_listCommand)
			c.SetPath(path);
		if(m_autoRun)
			executeAllCommand();
	}

	/**
	 * Met le mode autoRun à true ou false. Si true,
	 * à chaque updatePath, l'exécution de toutes les commandes se deront automatiquement.
	 * @param selected	true pour activer le mode autoRun, sinon false.
	 */
	public void setAutoRun(boolean selected) {
		m_autoRun = selected;		
	}
	
	

}
