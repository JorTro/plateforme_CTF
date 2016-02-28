import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreCrypto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Créer l'épreuve");
	private JButton bouton2 = new JButton("Retour au choix d'épreuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'épreuve</U><br><br>Cette épreuve de "
			+ "cryptographie repose sur une combinaison du carré de Polybe et de la table de Vigenère.<br><br>"
			+ "Le joueur disposera de trois indices.<br><br>Le premier est le mot-clé pour remplir le carré de Polybe.<br>"
			+ "Le second est le message codé par ce carré.<br>Le message décodé et le troisième indice sont les deux "
			+ "mots-clés à utiliser dans la table de Vigenère pour obtenir le mot de passe.<br><br>"
			+ "Le joueur devra rentrer ce mot de passe pour valider l'épreuve.<br><br>"
			+ "Le créateur de l'épreuve doit choisir le premier indice et le mot de passe à trouver.<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreCrypto(){
		this.setTitle("Création d'une épreuve de cryptographie");
		this.setSize(550, 345);
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
			Crypto crypt = new Crypto();
			dispose();
			crypt.runCrypto();
			crypt.creerEpreuve();
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