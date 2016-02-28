import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

public class FenetreJavaScript2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Cr�er l'�preuve");
	private JButton bouton2 = new JButton("Retour au choix d'�preuve");
	
	private JLabel label = new JLabel("<html><br><center><U>Description de l'�preuve</U><br><br>Cette �preuve de "
			+ "JavaScript repose sur l'utilisation des \"checkboxes\".<br><br>"
			+ "Le joueur disposera d'une page HTML. <br><br>"
			+ "Il devra analyser la page et trouver la partie du code � modifier pour que le mot de passe s'affiche. "
			+ "En effet, une condition \"if\" initialement impossible (1==2) n'est pas pass� lorsque l'on coche trois \"checkboxes\" "
			+ "afin d'obtenir le mot de passe.<br><br> "
			+ "Le joueur devra rentrer ce mot de passe pour valider l'�preuve.<br><br>"
			+ "Le cr�ateur de l'�preuve doit choisir un mot de passe � trouver. <br><br><center></html>");
	
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	public FenetreJavaScript2(){
		this.setTitle("Cr�ation d'une �preuve de JavaScript");
		this.setSize(570, 317);
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
			JavaScript2 java2 = new JavaScript2();
			java2.creerHTML();
			java2.creerEpreuve();
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