package ca.polymtl.log8430.tp1.Model;

import java.io.File;

public abstract class Command{

	public enum TYPE {
	    FILE, FOLDER, UNKNOWN 
	}
	protected String path;
	protected String displayName;
	
	public Command(String path)
	{
		this.path = path;
	}
	
	public abstract void execute();
	public abstract boolean canExecute();
	
	protected TYPE getTypeOfPath(){
		File file = new File(path);

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
	
	
}
