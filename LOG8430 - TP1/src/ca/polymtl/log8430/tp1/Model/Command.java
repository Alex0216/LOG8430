package ca.polymtl.log8430.tp1.Model;

import java.io.File;
import java.util.Observable;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 * 
 * Classe abstraite représentant une commande.
 *
 */
public abstract class Command extends Observable{

	public enum TYPE {
	    FILE, FOLDER, UNKNOWN 
	}
	protected String m_displayName;
	protected String m_path;
	protected String m_result;
	
	/**
	 * Constructeur de la classe abstraite Command.
	 * Initialise le path courant.
	 * @param path	Chemin absolu du fichier/folder courant
	 */
	public Command(String path)
	{
		this.m_path = path;
	}
	
	
	public abstract boolean canExecute();
	
	/**
	 * Efface le contenu du résultat et notifie tous les observers.
	 */
	public void clear() {
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}
	
	
	public abstract boolean execute();
	
	/**
	 * Retourne la fonctionnalité de la commande
	 * @return La fonctionnalité de la commande
	 */
	public String getDisplayName()
	{
		return m_displayName;
	}
	
	/**
	 * Retourne le résultat correspondant à la commande.
	 * @return Le résultat de la commande
	 */
	public String getResult()
	{
		return m_result;
	}
	
	/**
	 * Retourne le type du path actuel de la commande.
	 * Ce type peut être soit un fichier, un dossier ou un type inconnu (unknown).
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
	 * Met à jour le path de la commande et notifie les observers.
	 * @param path Le path correspondant à l'emplacement du fichier/folder
	 */
	public void SetPath(String path)
	{
		m_path = path;
		m_result = "";
		this.setChanged();
		this.notifyObservers();
	}	
}
