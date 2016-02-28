import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreStegano extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Cr�er l'�preuve");
	private JButton bouton2 = new JButton("Retour au choix d'�preuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'�preuve</U><br><br>Cette �preuve de "
			+ "st�ganographie repose sur le codage ASCII.<br><br>"
			+ "Le joueur disposera d'une image repr�sentant un arbre � 64 branches qui correspondent � 64 �l�ments binaires. "
			+ "Le sens de lecture de l'arbre correspond au sens horaire en partant de la gauche de l'arbre. "
			+ "Si une branche poss�de une feuille, l'�l�ment binaire est � 1, sinon il est � 0. <br><br>"
			+ "Ainsi, ces 64 �l�ments binaires permettent d'obtenir le mot de passe de 8 caract�res. <br><br>"
			+ "Le joueur devra rentrer ce mot de passe pour valider l'�preuve.<br><br>"
			+ "Le cr�ateur de l'�preuve doit choisir un mot de passe � trouver compos� 8 lettre(s) et/ou chiffre(s) "
			+ "obligatoirement .<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreStegano(){
		this.setTitle("Cr�ation d'une �preuve de st�ganographie");
		this.setSize(550, 330);
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
			try {
				dispose();
				new Stegano();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dispose();
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