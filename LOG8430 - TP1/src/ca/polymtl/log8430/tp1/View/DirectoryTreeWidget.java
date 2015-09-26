package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class DirectoryTreeWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7713782190007439530L;

	/**
	 * Create the panel.
	 */
	public DirectoryTreeWidget() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(10, 10));
		
		JTree tree = new JTree();
		tree.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(10, 10, 10, 10)));
		tree.setBackground(Color.WHITE);
		add(tree, BorderLayout.CENTER);
		
		JButton btnSelectFileOrFolder = new JButton("Select a file or folder");
		btnSelectFileOrFolder.setPreferredSize(new Dimension(131, 50));
		add(btnSelectFileOrFolder, BorderLayout.SOUTH);

	}

}
