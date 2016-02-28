import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreLogique extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Cr�er l'�preuve");
	private JButton bouton2 = new JButton("Retour au choix d'�preuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'�preuve</U><br><br>Cette �preuve de "
			+ "logique repose sur la c�l�bre suite de Fibonacci.<br><br>Il s'agit d'une suite lin�aire d'ordre 2 qui "
			+ "fonctionne de la mani�re suivante : <br>U(n+2) = U(n+1) + U(n)<br><br>"
			+ "Le joueur disposera du d�but de la suite et devra trouver l'�l�ment suivant.<br><br>"
			+ "Le joueur devra rentrer cet �l�ment pour valider l'�preuve.<br><br>"
			+ "Le cr�ateur de l'�preuve doit choisir les deux premiers �l�ments de la suite et le nombre d'�l�ments souhait�s.<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreLogique(){
		this.setTitle("Cr�ation d'une �preuve de logique");
		this.setSize(500, 315);
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
			Logique log = new Logique();
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