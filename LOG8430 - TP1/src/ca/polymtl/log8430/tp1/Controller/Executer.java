package ca.polymtl.log8430.tp1.Controller;
import java.util.ArrayList;

import ca.polymtl.log8430.tp1.Model.Command;

public class Executer {
	
	ArrayList<Command> m_listCommand;
	boolean m_autoRun = false;
	
	public Executer()
	{
		m_listCommand = new ArrayList<Command>();
	}
	
	public void addCommand(Command command)
	{
		m_listCommand.add(command);
	}
	
	public void clear()
	{
		for(Command c : m_listCommand)
		{
			c.clear();
		}
	}
	
	public int executeAllCommand()
	{
		for(Command c : m_listCommand)
			if(c.canExecute())
				c.execute();
		return 0;
	}
	
	public void executeCommand(Command command) 
	{
		command.execute();
	}
	
	public void updatePath(String path) {
		for(Command c : m_listCommand)
			c.SetPath(path);
		if(m_autoRun)
			executeAllCommand();
	}

	public void setAutoRun(boolean selected) {
		m_autoRun = selected;		
	}

	

}
