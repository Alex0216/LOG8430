package ca.polymtl.log8430.tp1.Model;

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
	public void execute() {
		// TODO Auto-generated method stub
		String fileName = m_path;
		int indexFolder = m_path.lastIndexOf("\\");
		if(indexFolder != -1)
		{
			fileName = m_path.substring(indexFolder+1, m_path.length()); 
		}
		int indexType = fileName.lastIndexOf(".");
		if(indexType != -1)
		{
			fileName = fileName.substring(0, indexType);
		}		
		System.out.printf(fileName +"\n");
		m_result = "File name is " + fileName;
	}


}
