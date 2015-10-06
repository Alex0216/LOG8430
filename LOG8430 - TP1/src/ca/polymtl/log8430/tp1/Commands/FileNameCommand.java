package ca.polymtl.log8430.tp1.Commands;

/**
 * Implémentation concrète de la classe Command. Cette commande donne le nom du fichier courant.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class FileNameCommand extends Command {

	/**
	 * Constructeur de la classe FileNameCommand.
	 * @param path Chemin correspondant au fichier/folder actuel
	 */
	public FileNameCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le nom du fichier";
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
		if(pathType == TYPE.FOLDER){
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
		
		int lastIndexOfBackslash = m_path.lastIndexOf("\\");
		String subString = m_path;
		if(lastIndexOfBackslash != -1)
			subString = m_path.substring(lastIndexOfBackslash+1, m_path.length());
		
		m_result= "File name is " + subString;
		
		this.setChanged();
		this.notifyObservers();
		return true;
	}


}
