package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CommandListWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7471106803594920336L;

	/**
	 * Create the panel.
	 */
	public CommandListWidget() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel CommandListPanel = new JPanel();
		CommandListPanel.setBackground(Color.WHITE);
		CommandListPanel.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(10, 10, 10, 10)));
		add(CommandListPanel, BorderLayout.CENTER);
		CommandListPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		CommandWidget commandWidget = new CommandWidget();
		CommandListPanel.add(commandWidget);
		
		CommandWidget commandWidget_2 = new CommandWidget();
		CommandListPanel.add(commandWidget_2);
		
		CommandWidget commandWidget_1 = new CommandWidget();
		CommandListPanel.add(commandWidget_1);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(10, 20, 10, 20)));
		add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(89, 50));
		bottomPanel.add(btnNewButton, BorderLayout.WEST);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("AutoRun");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		bottomPanel.add(chckbxNewCheckBox, BorderLayout.EAST);

	}

}
