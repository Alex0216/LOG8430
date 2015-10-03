package ca.polymtl.log8430.tp1.Model;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 * 
 * 
 *
 */
public class FileNameCommand extends Command {

	public FileNameCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le nom du fichier";
	}

	@Override
	public boolean canExecute() {
		boolean canExecute = true;
		if(this.m_path == null || this.m_path.isEmpty()){
			canExecute = false;
		}
		
		TYPE pathType = getTypeOfPath();
		if(pathType == TYPE.FOLDER){
			canExecute = false;
		}
		
		return canExecute;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}


}
