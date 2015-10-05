package ca.polymtl.log8430.tp1.Model;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 * 
 * Implémentation concrète de la classe Command. Cette commande donne le chemin
 * absolue d'un fichier/dossier
 *
 */
public class AbsolutePathCommand extends Command {

	public AbsolutePathCommand(String path) {
		super(path);
		this.m_displayName = "Obtenir le chemin absolu du ficher/dossier";
	}
	
	@Override
	public boolean canExecute() {
		boolean canExecute = true;
		if(this.m_path == null || this.m_path.isEmpty()){
			canExecute = false;
		}
		return canExecute;
	}

	@Override
	public void execute() {
		m_result = m_path;
		this.setChanged();
		this.notifyObservers();
	}
}
