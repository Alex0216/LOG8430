package ca.polymtl.log8430.tp1.Commands;

import java.io.File;
import java.util.Observable;

/**
 * Classe abstraite repr�sentant une commande.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public abstract class Command extends Observable{

	public enum TYPE {
	    FILE, FOLDER, UNKNOWN 
	}
	protected String m_displayName;
	protected String m_path;
	private String m_result;
	
	/**
	 * Constructeur de la classe abstraite Command.
	 * Initialise le path courant.
	 * @param path	Chemin absolu du fichier/folder courant
	 */
	public Command(String path)
	{
		this.m_path = path;
	}
	
	/**
	 * V�rifie si la commande actuelle peut effectuer son 
	 * ex�cution selon le path actuel (fichier ou folder).
	 * @return true si la command peut s'ex�cuter, sinon false.
	 */
	public abstract boolean canExecute();
	
	/**
	 * Efface le contenu du r�sultat et notifie tous les observers.
	 */
	public void clear() {
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * Ex�cute la commande selon le path actuel, met � jour le r�sultat
	 * et notifie les observers que ce dernier a �t� chang�.
	 * @return true si la command a r�ussi l'ex�cution, sinon false.
	 */
	public abstract boolean execute();
	
	/**
	 * Retourne la fonctionnalit� de la commande
	 * @return La fonctionnalit� de la commande
	 */
	public String getDisplayName()
	{
		return m_displayName;
	}
	
	/**
	 * Retourne le r�sultat correspondant � la commande.
	 * @return Le r�sultat de la commande
	 */
	public String getResult()
	{
		return m_result;
	}
	
	/**
	 * Retourne le type du path actuel de la commande.
	 * Ce type peut �tre soit un fichier, un dossier ou un type inconnu (unknown).
	 * @return Le type du path actuel de la commande.
	 */
	protected TYPE getTypeOfPath(){
		File file = new File(m_path);

		TYPE type = TYPE.UNKNOWN;
		if(file.exists()){
			if(file.isDirectory()){
				type = TYPE.FOLDER;
			}
			else if(file.isFile()){
				type = TYPE.FILE;
			}
		}
		return type;
	}

	/**
	 * Met � jour le path de la commande et notifie les observers.
	 * @param path Le path correspondant � l'emplacement du fichier/folder
	 */
	public void SetPath(String path)
	{
		m_path = path;
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}	
	
	protected void setResultAndNotify(String result)
	{
		m_result= result;
		
		this.setChanged();
		this.notifyObservers();
	}
}
