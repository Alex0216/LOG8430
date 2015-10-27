package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import ca.polymtl.log8430.tp1.Commands.Command;
import ca.polymtl.log8430.tp1.Commands.DynamicCommandLoader;
import ca.polymtl.log8430.tp1.Controller.Executer;

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
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		Executer executer = new Executer();
		
		DirectoryTreeWidget directoryTreeWidget = new DirectoryTreeWidget(executer);
		splitPane.setLeftComponent(directoryTreeWidget);
		
		CommandListWidget commandListWidget = new CommandListWidget(executer);
		// Ajoute les commandes dynamiquement dans le dossier ca/polymtl/log8430/tp1/commands du build
		DynamicCommandLoader loader = new DynamicCommandLoader();
		ArrayList<Command> commands = loader.load("ca.polymtl.log8430.tp1.Commands");
		if (commands != null) {
			for (int i=0;i<commands.size();i++) {
				commandListWidget.addCommand(commands.get(i));
			}
		}

		splitPane.setRightComponent(commandListWidget);
	}

}
