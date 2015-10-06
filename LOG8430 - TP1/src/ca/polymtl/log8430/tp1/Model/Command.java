package ca.polymtl.log8430.tp1.Model;

import java.io.File;
import java.util.Observable;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 * 
 * Classe abstraite représentant une commande.
 *
 */
public abstract class Command extends Observable{

	public enum TYPE {
	    FILE, FOLDER, UNKNOWN 
	}
	protected String m_displayName;
	protected String m_path;
	protected String m_result;
	
	public Command(String path)
	{
		this.m_path = path;
	}
	
	public abstract boolean canExecute();
	
	public void clear() {
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}
	
	public abstract boolean execute();
	
	public String getDisplayName()
	{
		return m_displayName;
	}
	public String getResult()
	{
		return m_result;
	}
	
	protected TYPE getTypeOfPath(){
		File file = new File(m_path);

		TYPE type = TYPE.UNKNOWN;
		if(file.exists()){
			if(file.isDirectory()){
				type = TYPE.FOLDER;
			}
			else if(file.isFile()){
				type = TYPE.FILE;
			}
		}
		return type;
	}

	public void SetPath(String path)
	{
		m_path = path;
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}	
}
