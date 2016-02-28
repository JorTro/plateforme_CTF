import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreCrack extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Créer l'épreuve");
	private JButton bouton2 = new JButton("Retour au choix d'épreuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'épreuve</U><br><br>Cette épreuve de "
			+ "CrackMe est bas�e sur une analyse du code assembleur.<br><br> "
			+ "Une liste de mots quelconques contenant toutes les lettres de l'alphabet a été mis dans une liste. "
			+ "Pour écrire le mot de passe dans le code, nous avons copié les caractères correspondant au mot de passe à "
			+ "partir de cette liste de mots.<br>"
			+ "Cela permettra d'empêcher au joueur de lire le mot de passe en clair avec un strings par exemple.<br><br>"
			+ "Le joueur devra trouver ce mot de passe pour valider l'épreuve. "
			+ "Il disposera pour cela d'un exécutable.<br><br>"
			+ "Il devra tout d'abord désassembler cet exécutable pour obtenir le code assembleur.<br><br>"
			+ "Il devra ensuite trouver les lignes correspondant à création du mot du passe pour connaitre les mots quelconques "
			+ "utilisés pour écrire le mot de passe.<br><br>"
			+ "Il devra enfin trouver les lignes correspondant � la d�claration de chacun de ces mots et utiliser un convertisseur "
			+ "hexad�cimal pour obtenir les caract�res de ces mots.<br><br>"
			+ "Il obtiendra de cette fa�on le mot de passe.<br><br>"
			+ "La difficult� vient du fait que tous les �l�ments sont mis dans le registre ESP et qu'il faudra voir � quel endroit "
			+ "de ce registre les �l�ments ont �t� mis.<br><br>"
			+ "Le joueur devra rentrer le mot de passe dans l'ex�cutable pour valider l'�preuve.<br><br>"
			+ "Le cr�ateur de l'�preuve doit choisir le mot de passe souhait�.<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreCrack(){
		this.setTitle("Cr�ation d'une �preuve de CrackMe");
		this.setSize(750, 525);
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
			CrackMe crack = new CrackMe();
			dispose();
			String[] mot = crack.selectionnerMot();
			String[][] epreuve = crack.intermediaire(mot);
			crack.creerTxt(epreuve);
			crack.creerEpreuve();
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