package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import tp2main.UsingModel;
import ca.polymtl.log8430.model.TP2.Master;
import ca.polymtl.log8430.model.TP2.TP2Package;


/**
 * Classe principale du programme, qui contient le MainWindow principal et contient le main.
 * S'occupe d'initialiser les différents widgets.
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class MainWindows {

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		Master executer = UsingModel.loadContent("My.tp2");
		
		DirectoryTreeWidget directoryTreeWidget = new DirectoryTreeWidget(executer);
		splitPane.setLeftComponent(directoryTreeWidget);
		
		CommandListWidget commandListWidget = new CommandListWidget(executer);
		

		splitPane.setRightComponent(commandListWidget);
	}

}
