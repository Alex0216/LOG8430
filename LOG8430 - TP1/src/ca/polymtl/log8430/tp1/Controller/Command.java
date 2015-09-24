package ca.polymtl.log8430.tp1.Controller;

public abstract class Command{

	public enum TYPE {
	    FILE, FOLDER 
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
		return TYPE.FILE;
	}
	
	
}
