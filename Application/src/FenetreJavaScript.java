import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreJavaScript extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Créer l'épreuve");
	private JButton bouton2 = new JButton("Retour au choix d'épreuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'épreuve</U><br><br>Cette épreuve de "
			+ "stéganographie repose sur la capacité à ne pas afficher des éléments du code grâce à l'option \"style=\"display:none;\".<br><br>"
			+ "Le joueur disposera d'une page HTML qui affichera un texte. <br><br>"
			+ "Il devra analyser le code pour trouver deux balises contenant l'option \"style=\"display:none;\" qui contiendront "
			+ "un numéro de ligne et un numéro de colonne.<br><br> Il suffira de trouver le mot correspondant à ces numéros dans le texte, "
			+ "qui correspondra au mot de passe.<br><br>"
			+ "Le joueur devra rentrer ce mot de passe pour valider l'épreuve.<br><br>"
			+ "Le créateur de l'épreuve doit choisir un mot de passe à trouver composé de lettre(s) "
			+ "obligatoirement .<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreJavaScript(){
		this.setTitle("Création d'une épreuve de stéganographie");
		this.setSize(570, 375);
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
			dispose();
			JavaScript java = new JavaScript();
			try {
				String mdp = java.mdp();
				int n1 = java.valeur1();
				int n2 = java.valeur2(n1);
				int c = java.colonne();
				int l = java.ligne();
				java.ecrireHtml();
				String[] tableau = java.liretxt();
				java.ecriretxt(tableau, mdp, n1, n2, c, l);
				File f = new File ("./Ressources/EpreuveStegano3/CandideV2.txt");
				String txt = java.loadFile(f);
				java.ecrireEpreuve(txt);
				java.creerJava(mdp);
				java.creerEpreuve();
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