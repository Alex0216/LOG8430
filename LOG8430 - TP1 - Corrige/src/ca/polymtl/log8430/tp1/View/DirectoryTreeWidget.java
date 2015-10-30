package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingWorker;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import ca.polymtl.log8430.tp1.Controller.Executer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

/**
 * Widget permettant l'affichage d'un repértoire de fichier sous forme d'arbre
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class DirectoryTreeWidget extends JPanel {

	private static final long serialVersionUID = -7713782190007439530L;
	private Executer m_executer;
	private JTree m_directoryTree;
	
	/**
	 * Constructeur de la classe DirectoryTreeWidget. Cree le panel
	 * correspondantaux au directoryTree.
	 * @param executer	Contrôleur qui gère l'exécution spécifiques de commandes.
	 */
	public DirectoryTreeWidget(Executer executer) {
		m_executer = executer;
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(10, 10));
		
		m_directoryTree = new JTree(new DefaultTreeModel(getDirectoryTree(null, new File("."))));
		m_directoryTree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
				if(m_directoryTree.getSelectionPath() == null)
					return;
				
				String completePath = "";
				for(Object part : m_directoryTree.getSelectionPath().getPath())
				{
					completePath += part.toString() + "\\";
				}
				//enlever le dernier \\
				completePath = completePath.substring(0, completePath.length()-1);
				if(m_executer != null)
				{
					m_executer.updatePath(completePath);
				}
			}
		});
		m_directoryTree.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(10, 10, 10, 10)));
		m_directoryTree.setBackground(Color.WHITE);
		add(m_directoryTree, BorderLayout.CENTER);
		
		JButton btnSelectFileOrFolder = new JButton("Select a file or folder");
		btnSelectFileOrFolder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chooseFolder();
			}
		});
		btnSelectFileOrFolder.setPreferredSize(new Dimension(131, 50));
		add(btnSelectFileOrFolder, BorderLayout.SOUTH);
		setSelectedPath(System.getProperty("user.dir"));

	}
	
	/**
	 * Met à jour le fichier/folder choisi actuel et le choisi comme
	 * point d'arborescence pour le UI du directoryTree 
	 * @param path Assigne le nouveau path
	 */
	public void setSelectedPath(final String path)
	{
		if(m_executer != null)
		{
			m_executer.updatePath(path);
		}
		m_directoryTree.setModel(new DefaultTreeModel(getDirectoryTree(null, new File(path))));
		
		SwingWorker<DefaultTreeModel, Void> worker = new SwingWorker<DefaultTreeModel, Void>(){
			@Override
			public DefaultTreeModel doInBackground()
			{
				DefaultTreeModel model = new DefaultTreeModel(getDirectoryTree(null, new File(path)));
				return model;
			}
			
			@Override
			protected void done() {
	           try {
	               m_directoryTree.setModel(get());
	           } catch (Exception ignore) {
	           }
	       }
		};
		
		worker.execute();
	}
	
	/**
	 * Fonction récursive basée sur l'algorithme trouvé à 
	 * http://www.java2s.com/Code/Java/File-Input-Output/DisplayafilesysteminaJTreeview.htm
	 * @param top	Le node en haut du directoryTree courant.
	 * @param dir	Le dossier du directoryTree
	 * @return		Le node courant du directoryTree
	 */
	private DefaultMutableTreeNode getDirectoryTree(DefaultMutableTreeNode top, File dir)
	{
		
		DefaultMutableTreeNode currentNode;
		
		if(top != null)//null si c'est le root directory
		{
			currentNode = new DefaultMutableTreeNode(dir.getName());
			top.add(currentNode);
		}
		else
		{
			currentNode = new DefaultMutableTreeNode(dir.getAbsolutePath());
		}
		
		if(dir != null)
		{
			if(!dir.isDirectory())
				return currentNode;
			
			
			if(dir.listFiles() != null)
			{
				for(File f : dir.listFiles())
				{
					if(f.canRead())
						getDirectoryTree(currentNode, f);
				}
			}
		}
		
		return currentNode;
	}
	
	/**
	 * Ouvre un JFileChoose dans le but de choisir un fichier/folder.
	 * Le fichier/fodler sélectionné sera le nouveau path et sera pris comme point de
	 * référence pour le directoryTree.
	 */
	public void chooseFolder()
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int returnVal = fileChooser.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			setSelectedPath(fileChooser.getSelectedFile().getAbsolutePath());
		}
	}

}
