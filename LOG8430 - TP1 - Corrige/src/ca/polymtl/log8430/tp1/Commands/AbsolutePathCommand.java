package ca.polymtl.log8430.tp1.Commands;

/**
 * Implémentation concrète de la classe Command. Cette commande donne le chemin
 * absolue d'un fichier/dossier
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class AbsolutePathCommand extends Command {

	/**
	 * Constructeur de la classe AbsolutePathCommand.
	 * @param path Chemin correspondant au fichier/folder actuel
	 */
	public AbsolutePathCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le chemin absolu du ficher/dossier";
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
		return canExecute;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String execute() throws Exception{
		if (!canExecute()) {
			throw new Exception("Cannot execute Absolute path command");
		}
		setResultAndNotify(m_path);
		return getResult();
	}
}
