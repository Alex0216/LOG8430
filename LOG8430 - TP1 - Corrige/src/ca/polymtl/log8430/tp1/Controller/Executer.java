package ca.polymtl.log8430.tp1.Controller;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import ca.polymtl.log8430.tp1.Commands.Command;

/**
 * Classe contr�leur qui s'occupe de mettre � jour les path des commandes,
 * d'effacer leur r�sultat ou de tous les ex�cuter.
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
	 * @param command	la nouvelle command � ajouter.
	 */
	public void addCommand(Command command)
	{
		if(command != null)
		{
			m_listCommand.add(command);
		}
	}
	
	/**
	 * Enl�ve toutes les commandes de la liste de commande.
	 */
	public void clear()
	{
		for(Command c : m_listCommand)
		{
			c.clear();
		}
	}
	
	/**
	 * Ex�cute toutes les commandes existantes dans la liste de commande qui peuvent s'ex�cuter selon le type du path.
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
	 * Ex�cute une commande sp�cifique pass�e en param�tre.
	 * @param command	La commande � ex�cuter
	 * @return			Le resultat de l'ex�cution
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
	 * Met � jour les path de toutes les commandes, et ex�cute
	 * toutes les commandes si le mode autoRun est activ�.
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
	 * Met le mode autoRun � true ou false. Si true,
	 * � chaque updatePath, l'ex�cution de toutes les commandes se deront automatiquement.
	 * @param selected	true pour activer le mode autoRun, sinon false.
	 */
	public void setAutoRun(boolean selected) {
		m_autoRun = selected;		
	}
	
	

}
