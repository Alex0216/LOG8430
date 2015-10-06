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
	
	public boolean executeAllCommand()
	{
		boolean errorFlag = false;
		for(Command c : m_listCommand)
			if(c.canExecute())
				errorFlag |= c.execute();
		return errorFlag;
	}
	
	public boolean executeCommand(Command command) 
	{
		return command.execute();
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
