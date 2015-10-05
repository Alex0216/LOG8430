package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import ca.polymtl.log8430.tp1.Controller.Executer;
import ca.polymtl.log8430.tp1.Model.AbsolutePathCommand;
import ca.polymtl.log8430.tp1.Model.FileNameCommand;
import ca.polymtl.log8430.tp1.Model.FolderNameCommand;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		Executer executer = new Executer();
		
		DirectoryTreeWidget directoryTreeWidget = new DirectoryTreeWidget(executer);
		splitPane.setLeftComponent(directoryTreeWidget);
		
		CommandListWidget commandListWidget = new CommandListWidget(executer);
		commandListWidget.addCommand(new AbsolutePathCommand(""));
		commandListWidget.addCommand(new FileNameCommand(""));
		commandListWidget.addCommand(new FolderNameCommand(""));
		splitPane.setRightComponent(commandListWidget);
	}

}
