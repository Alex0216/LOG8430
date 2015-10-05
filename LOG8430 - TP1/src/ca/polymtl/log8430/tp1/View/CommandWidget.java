package ca.polymtl.log8430.tp1.View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import ca.polymtl.log8430.tp1.Model.Command;

public class CommandWidget extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7500239859227616232L;
	private JButton btnCommand;
	private JLabel lblResult;
	private Command m_command;

	/**
	 * Create the panel.
	 */
	public CommandWidget(Command command) {
		
		m_command = command;
		
		m_command.addObserver(this);
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		btnCommand = new JButton("New button");
		btnCommand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(m_command != null)
				{
					m_command.execute();
				}
			}
		});
		add(btnCommand);
		btnCommand.setEnabled(false);
		
		lblResult = new JLabel("");
		lblResult.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblResult);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		lblResult.setText(m_command.getResult());
		btnCommand.setText(m_command.getDisplayName());
		btnCommand.setEnabled(m_command.canExecute());
	}

}
