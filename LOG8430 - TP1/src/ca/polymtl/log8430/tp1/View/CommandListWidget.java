package ca.polymtl.log8430.tp1.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import ca.polymtl.log8430.tp1.Commands.Command;
import ca.polymtl.log8430.tp1.Controller.Executer;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * Classe de vue qui correspond à la liste de widgets reliés aux commandes.
 * Cette classe permet l'ajout de nouvelles commandes.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class CommandListWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7471106803594920336L;
	private JCheckBox chckbxAutoRun;
	private JPanel m_commandListPanel;
	private Executer m_executer;

	/**
	 * Constructeur de la classe CommandListWidget. Cree le panel
	 * correspondant à la liste de widget des commandes.
	 * @param executer	Contrôleur qui gère l'exécution spécifiques de commandes.
	 */
	public CommandListWidget(Executer executer) {
		m_executer = executer;
		setLayout(new BorderLayout(0, 0));
		
		m_commandListPanel = new JPanel();
		m_commandListPanel.setBackground(Color.WHITE);
		m_commandListPanel.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(10, 10, 10, 10)));
		add(m_commandListPanel, BorderLayout.CENTER);
		m_commandListPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(10, 20, 10, 20)));
		add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(m_executer != null)
				{
					m_executer.clear();
				}
			}
		});
		btnClear.setPreferredSize(new Dimension(89, 50));
		bottomPanel.add(btnClear, BorderLayout.WEST);
		
		chckbxAutoRun = new JCheckBox("AutoRun");
		chckbxAutoRun.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				m_executer.setAutoRun(chckbxAutoRun.isSelected());
			}
		});
		chckbxAutoRun.setBackground(Color.WHITE);
		bottomPanel.add(chckbxAutoRun, BorderLayout.EAST);

	}
	
	/**
	 * Ajoute une commande à la liste de commande du widget et de l'exécuteur.
	 * @param command	La nouvelle commande à ajouter.
	 */
	public void addCommand(Command command)
	{
		CommandWidget commandWidget = new CommandWidget(command);
		m_commandListPanel.add(commandWidget);
		m_executer.addCommand(command);
	}

}
