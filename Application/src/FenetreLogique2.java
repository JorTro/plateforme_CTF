import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreLogique2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Cr�er l'�preuve");
	private JButton bouton2 = new JButton("Retour au choix d'�preuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'�preuve</U><br><br>Cette �preuve de "
			+ "logique repose sur la suite de Syracuse.<br><br> Cette suite fonctionne de la mani�re suivante :<br><br>"
			+ "On choisit un entier strictement positif comme premier �l�ment de la suite.<br>"
			+ "S'il est pair, on le divise par deux pour obtenir l'�l�ment suivant.<br>"
			+ "S'il est impair, on le multiplie par trois et on ajoute un pour obtenir l'�l�ment suivant.<br>"
			+ "On obtient la suite en r�it�rant cette op�ration<br><br>"
			+ "Le joueur disposera du d�but de la suite et devra trouver l'�l�ment suivant.<br><br>"
			+ "Le joueur devra rentrer cet �l�ment pour valider l'�preuve.<br><br>"
			+ "Le cr�ateur de l'�preuve doit choisir le premier �l�ment de la suite et le nombre d'�l�ments souhait�s.<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreLogique2(){
		this.setTitle("Cr�ation d'une �preuve de logique");
		this.setSize(520, 380);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		
		bouton.addActionListener(new BoutonListener());
		bouton2.addActionListener(new Bouton2Listener());
		
		pan.setLayout(new BoxLayout(pan, BoxLayout.LINE_AXIS));
		pan.add(bouton);
		pan.add(bouton2);
		//pan.add(panneau, BorderLayout.CENTER);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		pan2.setLayout(new BoxLayout(pan2, BoxLayout.LINE_AXIS));
		pan2.add(label);
		
		
		pan3.setLayout(new BoxLayout(pan3, BoxLayout.PAGE_AXIS));
		pan3.add(pan2);
		pan3.add(pan);

		this.setContentPane(pan3);
		
		this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			Logique2 log = new Logique2();
			dispose();
			log.runLogique();
			new Fenetre();
		}
	}
	
	class Bouton2Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new Fenetre();
		}
	}

}