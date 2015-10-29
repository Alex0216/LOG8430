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
		boolean canExecute = false;
		if(this.m_path == null || this.m_path.isEmpty()){
			canExecute = false;
		}
		
		TYPE pathType = getTypeOfPath();
		if(pathType == TYPE.FILE){
			canExecute = true;
		}
		
		return canExecute;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String execute() throws Exception{
		if (!canExecute()) {
			throw new Exception("Cannot execute File Name command");
		}
		
		int lastIndexOfBackslash = m_path.lastIndexOf("\\");
		String subString = m_path;
		if(lastIndexOfBackslash != -1)
			subString = m_path.substring(lastIndexOfBackslash+1, m_path.length());
		
		setResultAndNotify("File name is " + subString);
		
		return getResult();
	}


}
