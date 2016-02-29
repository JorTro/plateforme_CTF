import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

/**
 * Fenêtre de l'épreuve crack me pour le créateur de l'épreuve
 */
public class FenetreCrack extends JFrame {
	/**
	 * Fenêtre de l'épreuve crack me pour le créateur de l'épreuve
     * @see CrackMe
     * @author Mr X
     * @version 2.0
	 */
	private static final long serialVersionUID = 1L;

	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Créer l'épreuve");
	private JButton bouton2 = new JButton("Retour au choix d'épreuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'épreuve</U><br><br>Cette épreuve de "
			+ "CrackMe est basée sur une analyse du code assembleur.<br><br> "
			+ "Une liste de mots quelconques contenant toutes les lettres de l'alphabet a été mis dans une liste. "
			+ "Pour écrire le mot de passe dans le code, nous avons copié les caractères correspondant au mot de passe à "
			+ "partir de cette liste de mots.<br>"
			+ "Cela permettra d'empêcher au joueur de lire le mot de passe en clair avec un strings par exemple.<br><br>"
			+ "Le joueur devra trouver ce mot de passe pour valider l'épreuve. "
			+ "Il disposera pour cela d'un exécutable.<br><br>"
			+ "Il devra tout d'abord désassembler cet exécutable pour obtenir le code assembleur.<br><br>"
			+ "Il devra ensuite trouver les lignes correspondant à création du mot du passe pour connaitre les mots quelconques "
			+ "utilisés pour écrire le mot de passe.<br><br>"
			+ "Il devra enfin trouver les lignes correspondant à la déclaration de chacun de ces mots et utiliser un convertisseur "
			+ "hexadécimal pour obtenir les caractères de ces mots.<br><br>"
			+ "Il obtiendra de cette façon le mot de passe.<br><br>"
			+ "La difficulté vient du fait que tous les éléments sont mis dans le registre ESP et qu'il faudra voir à quel endroit "
			+ "de ce registre les éléments ont été mis.<br><br>"
			+ "Le joueur devra rentrer le mot de passe dans l'exécutable pour valider l'épreuve.<br><br>"
			+ "Le créateur de l'épreuve doit choisir le mot de passe souhaité.<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreCrack(){
		this.setTitle("Création d'une épreuve de CrackMe");
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
        /**
         * Bouton qui permet de créer une nouvelle épreuve crack me pour l'utilisateur en récupérant les données rentrées par le créateur
         * @param arg0
         * @see CrackMe
         */
		
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
        /**
         * bouton qui permet de retourner au choix des épreuves
         * @param e
         */
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new Fenetre();
		}
	}

}