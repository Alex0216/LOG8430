package ca.polymtl.log8430.tp1.Model;

import java.io.File;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 *
 */
public class FolderNameCommand extends Command {
	
	public FolderNameCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le nom du dossier";
	}
	
	@Override
	public boolean canExecute() {
		boolean canExecute = true;
		if(this.m_path == null || this.m_path.isEmpty()){
			canExecute = false;
		}
		
		TYPE pathType = getTypeOfPath();
		if(pathType == TYPE.FILE){
			canExecute = false;
		}
		
		return canExecute;
	}

	@Override
	public boolean execute() {
		if (!canExecute()) {
			return false;
		}
		File file = new File(m_path);

		if(file.exists()){
			if(file.isDirectory()){
				m_result = "Folder name is " + file.getName();
			}
		}
		this.setChanged();
		this.notifyObservers();
		return true;
	}
}
