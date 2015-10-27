package ca.polymtl.log8430.tp1.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.polymtl.log8430.tp1.Commands.*;
import ca.polymtl.log8430.tp1.Controller.*;

/**
 * Classe de tests s'occupant de tester la fonctionnalité des différentes commandes
 * avvec une instanciation simple.
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class TestsCommandes extends AbstractTest{
	
	/**
	 * Initialisation des objets avant l'exécution des tests
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		m_executer = new Executer();
		m_absPathCommand = new AbsolutePathCommand(null);
		m_fileNameCommand = new FileNameCommand(null);
		m_folderNameCommand = new FolderNameCommand(null);
	}

	
}
