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

import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.Page;
import ca.polymtl.log8430.model.TP2.PermissionType;
import ca.polymtl.log8430.model.TP2.RessourcesLocale;
import ca.polymtl.log8430.model.TP2.TP2Factory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Widget permettant l'affichage d'un repértoire de fichier sous forme d'arbre
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class DirectoryTreeWidget extends JPanel {

	private static final long serialVersionUID = -7713782190007439530L;
	private Master m_executer;
	private JTree m_directoryTree;
	private JTextField uriTextField;
	
	/**
	 * Constructeur de la classe DirectoryTreeWidget. Cree le panel
	 * correspondantaux au directoryTree.
	 * @param executer	Contrôleur qui gère l'exécution spécifiques de commandes.
	 */
	public DirectoryTreeWidget(Master executer) {
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
				
				updateMasterRessource(completePath);
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
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		uriTextField = new JTextField();
		uriTextField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(uriTextField);
		uriTextField.setColumns(10);
		
		JButton btnCharger = new JButton("Charger");
		btnCharger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateUri();
			}
		});
		panel.add(btnCharger, BorderLayout.EAST);
		setSelectedPath(System.getProperty("user.dir"));

	}
	
	/**
	 * Charge l'URI indiquer dans le textField
	 */
	private void updateUri() {
		String uri = uriTextField.getText();
		
		Page page = TP2Factory.eINSTANCE.createPage();
		
		try {
			URL url = new URL(uri);
			page.setNom(url.getFile());
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(url.openStream()));
			URLConnection conn = url.openConnection();
			page.setTaillePage(conn.getContentLength());
			
		} catch (IOException e) {
			page.setNom(uri);
			page.setTaillePage(-1);
			page.setTitrePage("erreur");
		}
		
		
	}
	
	/**
	 * Met à jour le fichier/folder choisi actuel et le choisi comme
	 * point d'arborescence pour le UI du directoryTree 
	 * @param path
	 */
	public void setSelectedPath(final String path)
	{
		updateMasterRessource(path);
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
	 * @return		Le node courrant du directoryTree
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

	private void updateMasterRessource(String completePath) {
		Path path = Paths.get(completePath);
		RessourcesLocale res;
		if(Files.isDirectory(path)){
			Dossier dos = TP2Factory.eINSTANCE.createDossier();
			dos.setNom(completePath);
			dos.setPermission(PermissionType.READ_AND_WRITE);
			dos.setNombreEnfant(path.toFile().list().length);
			
			res = dos;
		} else {
			Fichier fichier = TP2Factory.eINSTANCE.createFichier();
			fichier.setNom(completePath);
			fichier.setPermission(PermissionType.READ_AND_WRITE);
			try {
				fichier.setTailleFichierOctet(Files.size(path));
			} catch (IOException e) {
				fichier.setTailleFichierOctet(-1);
			}
			
			res = fichier;
		}
		
		m_executer.updateRessource(res);
	}

}
