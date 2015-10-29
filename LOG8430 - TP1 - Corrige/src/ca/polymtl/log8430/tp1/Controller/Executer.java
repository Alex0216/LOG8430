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
		if(command != null)
		{
			m_listCommand.add(command);
		}
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
	 */
	public void executeAllCommand() throws Exception
	{
		int errorCount = 0;
		
		for(Command c : m_listCommand)
		{
				try
				{
					c.execute();
				}
				catch (Exception e)
				{
					// Do not throw right now. We want to execute all Commands first.
					errorCount++;
				}
		}
		
		if(errorCount == 1)
		{
			throw new Exception("One exception");
		}
		else if(errorCount > 1)
		{
			throw new Exception("Multiple exceptions");
		}
	}
	
	/**
	 * Exécute une commande spécifique passée en paramètre.
	 * @param command	La commande à exécuter
	 * @return			Le resultat de l'exécution
	 */
	public String executeCommand(Command command) throws Exception 
	{
		if(command != null)
		{
			return command.execute();
		}
		return null;
	}

	/**
	 * Met à jour les path de toutes les commandes, et exécute
	 * toutes les commandes si le mode autoRun est activé.
	 * @param path	Chemin absolu du fichier/folder courant
	 */
	public void updatePath(String path) {
		for(Command c : m_listCommand)
			c.SetPath(path);
		if(m_autoRun)
		{
			try
			{
				executeAllCommand();
			}
			catch(Exception e)
			{
				
			}

		}

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
