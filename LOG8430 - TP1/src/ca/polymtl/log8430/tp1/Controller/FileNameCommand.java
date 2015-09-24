package ca.polymtl.log8430.tp1.Controller;

public class FileNameCommand extends Command {

	public FileNameCommand(String path) {
		super(path);
		this.displayName = "Obtenir le nom du fichier";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canExecute() {
		boolean canExecute = true;
		if(path == null || path.isEmpty()){
			canExecute = false;
		}
		
		TYPE pathType = getTypeOfPath();
		if(pathType == TYPE.FOLDER){
			canExecute = false;
		}
		
		return canExecute;
	}


}
