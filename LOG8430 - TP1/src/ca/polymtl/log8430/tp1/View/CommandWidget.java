package ca.polymtl.log8430.tp1.View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CommandWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7500239859227616232L;

	/**
	 * Create the panel.
	 */
	public CommandWidget() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);

	}

}
