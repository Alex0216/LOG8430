package ca.polymtl.log8430.tp1.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.polymtl.log8430.tp1.Commands.*;
import ca.polymtl.log8430.tp1.Controller.*;
public class TestsClassLoader {

	Executer m_executer;
	DynamicCommandLoader m_commandLoader;
	Command m_fileNameCommand;
	Command m_folderNameCommand;
	Command m_absPathCommand;
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

	// On teste si les classes sont bien loades dynamiquement
	@Test
	public void basicClassesLoadedCorrectly()
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
	// On teste ques les classes loades dynamiquement ont les memes proprietes que les classes normales,
	// c-a-d qu'ils donnent les bons resultats.
	public void absolutePathValide()
	{
		try
		{
			m_executer.addCommand(m_absPathCommand);
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430");
			m_executer.executeCommand(m_absPathCommand);
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430"); 
			m_executer.updatePath("C:\\Users\\Mathieu\\Desktop\\LOG8430.java");
			m_executer.executeAllCommand();
			assertEquals(m_absPathCommand.getResult(), "C:\\Users\\Mathieu\\Desktop\\LOG8430.java"); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	@Test
	public void fileNameValide()
	{
		try
		{
			m_executer.addCommand(m_fileNameCommand);
			m_executer.updatePath("C:\\Users\\Mathieu.arg\\Desktop\\LOG8430.java");
			m_executer.executeCommand(m_fileNameCommand);
			assertEquals(m_fileNameCommand.getResult(), "File name is LOG8430.java"); 
			m_executer.updatePath("Bob.txt.java");
			m_executer.executeAllCommand();
			assertEquals(m_fileNameCommand.getResult(), "Bob.txt.java"); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	@Test
	public void folderNameValide()
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
	
	@Test
	public void folderNameMauvaisType()
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
	
	@Test
	public void fileNameMauvaisType()
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
	
	@Test
	public void executeAll()
	{
		try
		{
			m_executer.addCommand(m_fileNameCommand);
			m_executer.addCommand(m_folderNameCommand);
			m_executer.addCommand(m_absPathCommand);
			m_executer.updatePath("C:\\koko\\D_e_s_ktop\\ffe");
			boolean result = m_executer.executeAllCommand();
			assert(result == false);
			assertEquals(m_folderNameCommand.getResult(), "Folder name is ffe");
			assertEquals(m_absPathCommand.getResult(), "C:\\koko\\D_e_s_ktop\\ffe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
}
