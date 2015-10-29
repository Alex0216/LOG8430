package ca.polymtl.log8430.tp1.Tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import ca.polymtl.log8430.tp1.Commands.AbsolutePathCommand;
import ca.polymtl.log8430.tp1.Commands.Command;
import ca.polymtl.log8430.tp1.Commands.FileNameCommand;
import ca.polymtl.log8430.tp1.Commands.FolderNameCommand;
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
	String m_rootPath;
	
	/**
	 * Initialisation des objets avant l'exécution des tests
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		try
		{
			m_rootPath = System.getProperty("user.dir");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
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
			m_executer.updatePath(m_rootPath + "\\LOG8430");
			try
			{
				m_executer.executeCommand(m_absPathCommand);
				assertEquals(m_absPathCommand.getResult(), m_rootPath + "\\LOG8430");
			}
			catch (Exception e)
			{
				fail("Test shouldn't have thrown an exception");
			}
			
 
			m_executer.updatePath(m_rootPath + "\\LOG8430.java");
			try
			{
				m_executer.executeCommand(m_absPathCommand);
				assertEquals(m_absPathCommand.getResult(), m_rootPath + "\\LOG8430.java");  
			}
			catch (Exception e)
			{
				fail("Test shouldn't have thrown an exception");
			}

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
			m_executer.updatePath(m_rootPath + "\\LOG8430.java");
			try
			{
				m_executer.executeCommand(m_fileNameCommand);
				assertEquals(m_fileNameCommand.getResult(), "File name is LOG8430.java"); 
			}
			catch (Exception e)
			{
				fail("It is a file, it should have passed.");
			}
			
			m_executer.updatePath("Bob.txt.java");
			try
			{
				m_executer.executeCommand(m_fileNameCommand);
				fail("It is a file, it should have passed.");
			}
			catch (Exception e)
			{
				// Test pass
			}
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
			m_executer.updatePath(m_rootPath + "\\b_o_b");
			try
			{
				m_executer.executeCommand(m_folderNameCommand);
				assertEquals(m_folderNameCommand.getResult(), "Folder name is b_o_b"); 
			}
			catch(Exception e)
			{
				fail("Command should have passed. The folder is valid");
			}
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
			m_executer.updatePath(m_rootPath + "\\LOG8430.java");
			try
			{
				m_executer.executeAllCommand();
				fail("Not all command were executed");
			}
			catch(Exception e)
			{
				// Test pass
			}
			assertEquals(m_absPathCommand.getResult(), m_rootPath + "\\LOG8430.java"); 
			assertEquals(m_fileNameCommand.getResult(), "File name is LOG8430.java");
			
			m_executer.updatePath(m_rootPath + "\\LOG8430");
			try
			{
				m_executer.executeAllCommand();
				fail("Not all command should have been executed");
			}
			catch(Exception e)
			{
				// Test pass
			}
			assertEquals(m_absPathCommand.getResult(), m_rootPath + "\\LOG8430"); 
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
			m_executer.updatePath(m_rootPath + "\\b_o_b.java");
			try
			{
				m_executer.executeCommand(m_folderNameCommand);
				fail("The command should not have been executed on a file");
			}
			catch(Exception e)
			{
				// Test pass
			}
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
			try
			{
				m_executer.executeCommand(m_fileNameCommand);
				fail("Not all command should have been executed");
			}
			catch(Exception e)
			{
				// Test pass
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}	
}
