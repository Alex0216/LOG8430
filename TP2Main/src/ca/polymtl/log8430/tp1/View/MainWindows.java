package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import tp2main.UsingModel;
import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.TP2Package;

import java.awt.Dimension;

import javax.swing.JFileChooser;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Classe principale du programme, qui contient le MainWindow principal et contient le main.
 * S'occupe d'initialiser les différents widgets.
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class MainWindows {
	
	Master m_executer;
	CommandListWidget m_commandListWidget;
	DirectoryTreeWidget m_directoryTreeWidget;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TP2Package tp = TP2Package.eINSTANCE;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindows window = new MainWindows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(700, 400));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		m_executer = UsingModel.loadContent("My.tp2");
		
		m_directoryTreeWidget = new DirectoryTreeWidget(m_executer);
		splitPane.setLeftComponent(m_directoryTreeWidget);
		
		m_commandListWidget = new CommandListWidget(m_executer);
		
		splitPane.setRightComponent(m_commandListWidget);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Save");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveModel();
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadModel();
			}
		});
		mnFile.add(mntmLoad);
	}
	
	private void saveModel(){
		JFileChooser fileChooser = new JFileChooser();
		
		int returnVal = fileChooser.showSaveDialog(this.frame);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			String path = fileChooser.getSelectedFile().getAbsolutePath();
			if(!path.endsWith(".tp2")){
				path += ".tp2";
			}
			UsingModel.saveContent(path, m_executer);
		}
	}
	
	private void loadModel(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int returnVal = fileChooser.showOpenDialog(this.frame);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			m_executer = UsingModel.loadContent(fileChooser.getSelectedFile().getAbsolutePath());
			m_commandListWidget.updateMaster(m_executer);
			m_directoryTreeWidget.updateMaster(m_executer);
			m_executer.clear();
			m_executer.updateRessource(m_executer.getRessource());
		}
	}

}
