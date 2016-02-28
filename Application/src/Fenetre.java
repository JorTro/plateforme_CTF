import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Panneau panneau = new Panneau();
	//private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Epreuve de cryptographie");
	private JButton bouton2 = new JButton("Epreuve de stégano n°1");
	private JButton bouton3 = new JButton("Epreuve de stégano n°2");
	private JButton bouton4 = new JButton("Epreuve de stégano n°3");
	private JButton bouton5 = new JButton("Epreuve de CrackMe");
	private JButton bouton6 = new JButton("Epreuve de JavaScript");
	private JButton bouton7 = new JButton("Epreuve de logique n°1");
	private JButton bouton8 = new JButton("Epreuve de logique n°2");
	
	//private JLabel label = new JLabel("");
	private JPanel pan2 = new JPanel();
	int i = 0;
	int j = 0;
	
	public Fenetre(){
		this.setTitle("Plateforme de création d'épreuves CTF");
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setAlwaysOnTop(true);
		
		bouton.addActionListener(new BoutonListener());
		bouton2.addActionListener(new Bouton2Listener());
		bouton3.addActionListener(new Bouton3Listener());
		bouton4.addActionListener(new Bouton4Listener());
		bouton5.addActionListener(new Bouton5Listener());
		bouton6.addActionListener(new Bouton6Listener());
		bouton7.addActionListener(new Bouton7Listener());
		bouton8.addActionListener(new Bouton8Listener());
		
		GridLayout g = new GridLayout();
		g.setColumns(2);
		g.setRows(4);
		g.setHgap(5);
		g.setVgap(5);
		
		pan2.setLayout(g);
		//pan.add(panneau, BorderLayout.CENTER);
		
		//label.setHorizontalAlignment(JLabel.CENTER);
		
		pan2.add(bouton);
		pan2.add(bouton2);
		pan2.add(bouton3);
		pan2.add(bouton4);
		pan2.add(bouton5);
		pan2.add(bouton6);
		pan2.add(bouton7);
		pan2.add(bouton8);
		
		//pan.add(label);
		//pan.add(pan2);

		this.setContentPane(pan2);
		
		this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreCrypto();
		}
		
	}
	
	class Bouton2Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreStegano();
		}
		
	}
	
	class Bouton3Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreStegano2();
		}
		
	}

	class Bouton4Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreJavaScript();
		}
	}
	
	class Bouton5Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreCrack();
		}
	}
	
	
	class Bouton6Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreJavaScript2();
		}
	}

	
	class Bouton7Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreLogique();
		}
		
	}
	
	class Bouton8Listener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			new FenetreLogique2();
		}
		
	}
	
}