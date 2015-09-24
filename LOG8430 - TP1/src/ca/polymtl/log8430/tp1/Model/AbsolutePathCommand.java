package ca.polymtl.log8430.tp1.Model;

public class AbsolutePathCommand extends Command {

	public AbsolutePathCommand(String path) {
		super(path);
		this.displayName = "Obtenir le chemin aboslu du ficher/dossier";
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
		
		return canExecute;
	}

}
