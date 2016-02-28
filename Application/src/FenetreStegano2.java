import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreStegano2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Créer l'épreuve");
	private JButton bouton2 = new JButton("Retour au choix d'épreuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'épreuve</U><br><br>Cette épreuve de "
			+ "stéganographie consiste à dissimuler un mot de passe de 8 lettres dans 8 trames IP.<br><br>"
			+ "Afin de résoudre cette épreuve, le joueur devra comprendre à partir de l’indice "
			+ "que la position de la lettre cachée dans la trame IP correspond à la valeur décimale du \"Time to live\" qui est en hexadécimale.<br><br> "
			+ "Une fois que la position a été trouvée, il devra juste de convertir les deux caractères ASCII pour trouver chacune "
			+ "des lettres du mot de passe. Il faudra refaire cela pour chacune des 8 trames. <br><br>"
			+ "Le joueur devra rentrer ce mot de passe pour valider l'épreuve.<br><br>"
			+ "Le créateur de l'épreuve doit choisir un mot de passe à trouver de 8 lettres obligatoirement .<br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreStegano2(){
		this.setTitle("Création d'une épreuve de stéganographie");
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
				dispose();
				Stegano2 steg = new Stegano2();
				steg.runStegano2();
				steg.creerEpreuve();
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