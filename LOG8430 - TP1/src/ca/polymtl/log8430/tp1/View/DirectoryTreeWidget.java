package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import ca.polymtl.log8430.tp1.Controller.Executer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 * 
 * Widget permettant l'affichage d'un repértoire de fichier sous forme d'arbre
 *
 */
public class DirectoryTreeWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7713782190007439530L;
	private Executer m_executer;
	private JTree m_directoryTree;
	/**
	 * Create the panel.
	 */
	public DirectoryTreeWidget(Executer executer) {
		m_executer = executer;
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(10, 10));
		
		m_directoryTree = new JTree(new DefaultTreeModel(getDirectoryTree(null, new File("."))));
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

	}
	
	public void setSelectedPath(String path)
	{
		m_executer.updatePath(path);
		m_directoryTree.setModel(new DefaultTreeModel(getDirectoryTree(null, new File(path))));
	}
	
	/**
	 * Basé sur l'algorithme trouvé à http://www.java2s.com/Code/Java/File-Input-Output/DisplayafilesysteminaJTreeview.htm
	 * @param top
	 * @param dir
	 * @return
	 */
	private DefaultMutableTreeNode getDirectoryTree(DefaultMutableTreeNode top, File dir)
	{
		
		DefaultMutableTreeNode currentNode = new DefaultMutableTreeNode(dir.getName());
		
		if(top != null)//null si c'est le root directory
		{
			top.add(currentNode);
		}
		
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
		
		return currentNode;
	}
	
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
