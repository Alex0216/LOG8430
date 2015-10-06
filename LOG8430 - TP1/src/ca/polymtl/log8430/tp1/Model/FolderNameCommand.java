package ca.polymtl.log8430.tp1.Model;

import java.io.File;

/**
 * Implémentation concrète de la classe Command. Cette commande donne le nom du folder courant.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class FolderNameCommand extends Command {
	
	/**
	 * Constructeur de la classe FolderNameCommand.
	 * @param path Chemin correspondant au fichier/folder actuel
	 */
	public FolderNameCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le nom du dossier";
	}
	
	/**
	 * {@inheritDoc}
	 */
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

	/**
	 * {@inheritDoc}
	 */
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
