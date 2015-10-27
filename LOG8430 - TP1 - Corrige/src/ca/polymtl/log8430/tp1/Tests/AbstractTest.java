package ca.polymtl.log8430.tp1.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ca.polymtl.log8430.tp1.Commands.Command;
import ca.polymtl.log8430.tp1.Controller.Executer;

/**
 * Classe abstraite de tests s'occupant de tester la fonctionnalité des commandes
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public abstract class AbstractTest {
	
	Command m_fileNameCommand;
	Command m_folderNameCommand;
	Command m_absPathCommand;
	Executer m_executer;
	
	/**
	 *  On teste ques les classes loades dynamiquement ont les memes proprietes que les classes normales,
	 *  c-a-d qu'ils donnent les bons resultats.
	 */
	@Test
	public void absolutePathValid()
	{
		try
		{
			m_executer.addCommand(m_absPathCommand);
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430");
			m_executer.executeCommand(m_absPathCommand);
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430"); 
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430.java");
			m_executer.executeCommand(m_absPathCommand);
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430.java");  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Teste si la commande qui retourne le nom d'un fichier marche correctement.
	 * Le test sera un succès si le string résultant correspond à la phrase:
	 * "File name is " + nomFichier
	 */
	@Test
	public void fileNameValid()
	{
		try
		{
			m_executer.addCommand(m_fileNameCommand);
			m_executer.updatePath("C:\\Users\\Mathieu.arg\\Desktop\\LOG8430.java");
			m_executer.executeCommand(m_fileNameCommand);
			assertEquals(m_fileNameCommand.getResult(), "File name is LOG8430.java"); 
			m_executer.updatePath("Bob.txt.java");
			m_executer.executeCommand(m_fileNameCommand);
			assertEquals(m_fileNameCommand.getResult(), "File name is Bob.txt.java");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	/**
	 * Teste si la commande qui retourne le nom d'un folder marche correctement.
	 * Le test sera un succès si le string résultant correspond à la phrase:
	 * "Folder name is " + nomFolder
	 */
	@Test
	public void folderNameValid()
	{
		try
		{
			m_executer.addCommand(m_folderNameCommand);
			m_executer.updatePath("C:\\koko\\D_e_s_ktop\\b_o_b");
			m_executer.executeCommand(m_folderNameCommand);
			assertEquals(m_folderNameCommand.getResult(), "Folder name is b_o_b"); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	/**
	 * Teste si les commandes marchent correctement après un executeAllCommand
	 */
	@Test
	public void executeAllCommandValid()
	{
		try
		{
			m_executer.addCommand(m_absPathCommand);
			m_executer.addCommand(m_fileNameCommand);
			m_executer.addCommand(m_folderNameCommand);
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430.java");
			boolean result = m_executer.executeAllCommand();
			assert(result == false);
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430.java"); 
			assertEquals(m_fileNameCommand.getResult(), "File name is LOG8430.java");
			
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430");
			result = m_executer.executeAllCommand();
			assert(result == false);
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430"); 
			assertEquals(m_folderNameCommand.getResult(), "Folder name is LOG8430");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Teste si la commande qui retourne le nom d'un folder retourne bien
	 * une exécution invalide(false) si le le type du path ne correspond
	 * pas à un folder.
	 */
	@Test
	public void folderNameWrongType()
	{
		try
		{
			m_executer.addCommand(m_folderNameCommand);
			m_executer.updatePath("C:\\koko\\D_e_s_ktop\\b_o_b.java");
			assert(m_executer.executeCommand(m_folderNameCommand) == false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	/**
	 * Teste si la commande qui retourne le nom d'un fichier retourne bien
	 * une exécution invalide(false) si le le type du path ne correspond
	 * pas à un fichier.
	 */
	@Test
	public void fileNameWrongType()
	{
		try
		{
			m_executer.addCommand(m_fileNameCommand);
			m_executer.updatePath("C:\\koko\\D_e_s_ktop\\b_o_b");
			assert(m_executer.executeCommand(m_folderNameCommand) == false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}	
}
