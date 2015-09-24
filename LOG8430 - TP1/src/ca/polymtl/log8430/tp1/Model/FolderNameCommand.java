package ca.polymtl.log8430.tp1.Model;


public class FolderNameCommand extends Command {
	
	public FolderNameCommand(String path) {
		super(path);
		this.displayName = "Obtenir le nom du dossier";
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canExecute() {
		boolean canExecute = true;
		if(this.path == null || this.path.isEmpty()){
			canExecute = false;
		}
		
		TYPE pathType = getTypeOfPath();
		if(pathType == TYPE.FILE){
			canExecute = false;
		}
		
		return canExecute;
	}

}
