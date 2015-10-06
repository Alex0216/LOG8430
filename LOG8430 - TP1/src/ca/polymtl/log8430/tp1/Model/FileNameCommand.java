package ca.polymtl.log8430.tp1.Model;

import java.io.File;

import ca.polymtl.log8430.tp1.Model.Command.TYPE;

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
	public boolean execute() {
		if (!canExecute()) {
			return false;
		}
		
		File file = new File(m_path);

		if(file.exists()){
			if(file.isFile()){
				m_result = "File name is " + file.getName();
			}
		}
		
		this.setChanged();
		this.notifyObservers();
		return true;
	}


}
