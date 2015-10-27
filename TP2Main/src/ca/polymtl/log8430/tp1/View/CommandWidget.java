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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ca.polymtl.log8430.model.TP2.AbstractCommand;

/**
 * Classe de vue qui gère les widgets pour une commande en particulier. Agit comme 
 * observer pour cette commande, et met à jour le UI quand nécessaire.
 * 
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class CommandWidget extends JPanel {

	private static final long serialVersionUID = 7500239859227616232L;
	private JButton btnCommand;
	private JLabel lblResult;
	private AbstractCommand m_command;

	/**
	 * Constructeur de la classe CommandWidget. Cree le panel
	 * correspondantaux widgets d'une commande en particulier. La commande
	 * sera l'observé, et CommandWidget sera l'observeur.
	 * @param executer	La commande qui sera lié aux widgets. 
	 */
	public CommandWidget(AbstractCommand command) {
		
		m_command = command;
		EContentAdapter adapter = new EContentAdapter() {
		      public void notifyChanged(Notification notification) {
		        super.notifyChanged(notification);
		        update();
		      }
		    };
		    
		m_command.eAdapters().add(adapter);
		    
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		btnCommand = new JButton("New button");
		btnCommand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(m_command != null && btnCommand.isEnabled())
				{
					m_command.execute();
				}
			}
		});
		add(btnCommand);
		btnCommand.setEnabled(false);
		btnCommand.setText(command.getCommandName());
		
		lblResult = new JLabel("");
		lblResult.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblResult);

	}

	/**
	 * Lorsque la commande notify les observers, cette fonction est appelée,
	 * mettant à jour le UI du bouton et du label résultat. S'occupe aussi de mettre
	 * enable le bouton si la commande peut s'exécuter par rapport au path actuel.
	 */
	public void update() {
		lblResult.setText(m_command.getResult());
		btnCommand.setText(m_command.getCommandName());
		btnCommand.setEnabled(m_command.canExecute());
	}

}
