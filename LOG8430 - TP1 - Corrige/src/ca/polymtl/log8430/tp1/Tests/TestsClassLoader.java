package ca.polymtl.log8430.tp1.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.polymtl.log8430.tp1.Commands.*;
import ca.polymtl.log8430.tp1.Controller.*;

/**
 * Classe de tests s'occupant de tester la fonctionnalité du chargeur dynamique
 * de commandes
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class TestsClassLoader extends AbstractTest{

	
	DynamicCommandLoader m_commandLoader;
	
	
	/**
	 * Initialisation des objets avant l'exécution des tests.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		m_executer = new Executer();
		m_commandLoader = new DynamicCommandLoader();
		ArrayList<Command> commands = m_commandLoader.load("ca.polymtl.log8430.tp1.Commands");
		if (commands != null) {
			for (int i=0;i<commands.size();i++) {
				if (commands.get(i) instanceof AbsolutePathCommand)
						m_absPathCommand = commands.get(i);
				else if (commands.get(i) instanceof FileNameCommand)
						m_fileNameCommand = commands.get(i);				
				else if (commands.get(i) instanceof FolderNameCommand)
						m_folderNameCommand = commands.get(i);
			}
		}		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 *  On teste si les commandes sont bien chargées dynamiquement
	 */
	@Test
	public void basicClassesLoadedNotNull()
	{
		try
		{
			assert(m_absPathCommand != null);
			assert(m_fileNameCommand != null);
			assert(m_folderNameCommand != null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	/**
	 *  On teste si les bonnes commandes ont été chargées
	 */
	@Test
	public void basicClassesLoadedCorrectly()
	{
		try
		{
			assertEquals(m_absPathCommand.getDisplayName(),"Obtenir le chemin absolu du ficher/dossier");
			assertEquals(m_fileNameCommand.getDisplayName(),"Obtenir le nom du fichier");
			assertEquals(m_folderNameCommand.getDisplayName(),"Obtenir le nom du dossier");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
