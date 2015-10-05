package ca.polymtl.log8430.tp1.Model;

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
	public void execute() {
		// TODO Auto-generated method stub
		String folderName = m_path;
		int indexFolder = m_path.lastIndexOf("\\");
		if(indexFolder != -1)
		{
			folderName = m_path.substring(indexFolder+1, m_path.length()); 
		}
		m_result = "Folder name is " + folderName;	
		this.setChanged();
		this.notifyObservers();
	}
}
