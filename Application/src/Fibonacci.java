import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * <b>Fibonacci est la classe qui permet de générer la suite de Fibonacci, du côté utilisateur et du côté créateur</b>
 * @see EpreuveLog
 * @see Logique
 * @author MrX
 * @version 2.0
 */
public class Fibonacci {
	/**
	 * Calcul de la suite de Fibonacci
	 * @param n1 premier élement de la suite
	 * @param n2 deuxième élement de la suite, n2>n1>0
	 * @param r nombre d'éléments de la suite
     * @return s Tableau qui contient les r valeurs possibles de la suite
     */
	public int[] suite (int n1, int n2, int r) {
		int [] s = new int[r];
		s[0] = n1;
		s[1] = n2;
		for (int i=2; i<r; i++) {
			s[i] = s[i-1] + s[i-2];
		}
		return s;
	}

	/**
	 * Affichage de la suite de Fibonacci
	 * @param s Tableau qui contient les valeurs de la suite
	 * @see Fibonacci#suite(int, int, int)
	 * @return suite, chaine de caractère contenant les valeurs de la suite
     */
	public String afficherSuite (int[] s) {
		int n = s.length;
		String suite = "Votre épreuve est : ";
		String m;
		for (int i=0; i<n-1; i++) {
			m = Integer.toString(s[i]);
			suite = suite + m + " ";
		}
		suite = suite + "?";
		return suite;
	}

	/**
	 * Choix du premier nombre de la suite par le créateur d'épreuve
	 * @return nombre, chaine de caractère contenant le premier terme de la suite
     */
	public String selectionnerNb1() {
		String nombre = JOptionPane.showInputDialog(null, "Veuillez entrer un entier pour la premi�re valeur de la suite", ""
				+ "Epreuve de logique", JOptionPane.QUESTION_MESSAGE);
		return nombre;
	}

	/**
	 * Choix du deuxième nombre de la suite par le créateur d'épreuve
	 * @return nombre, chaine de caractère contenant le deuxième terme de la suite
     */
	public String selectionnerNb2() {
		String nombre = JOptionPane.showInputDialog(null, "Veuillez entrer un entier > 0 pour la deuxi�me valeur de la suite", ""
				+ "Epreuve de logique", JOptionPane.QUESTION_MESSAGE);
		return nombre;
	}

	/**
	 * Choix du rang de la suite par le créateur de l'épreuve
	 * @return nombre, chaine de caractère contenant le rang de la suite
     */
	public String selectionnerRg() {
		String nombre = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre d'�l�ments souhait�s (sup�rieur � 3) : ", ""
				+ "Epreuve de logique", JOptionPane.QUESTION_MESSAGE);
		return nombre;
	}

	/**
	 * Création d'un fichier texte contenant la classe LanceurLog
	 * Cette classe contient la liste des termes de la suite dans un fichier txt qui est utilisée pour la génération de lépreuve du côté utilisateur
	 * @param liste ensemble des termes de la suite de Fibonacci
     */
	public void creerTxt(int[] liste) {
		File f = new File ("./Ressources/EpreuveLogique1/LanceurLog.java");
		
		try
		{
			FileWriter fw = new FileWriter(f);
			
			int n = liste.length;
			
			fw.write("public class LanceurLog {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("public static void main(String[] args) {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("EpreuveLog epreuve = new EpreuveLog();");
			fw.write(String.valueOf(System.getProperty("line.separator")));
				
			fw.write("String suite = ");
			fw.write("\"");
			for (int i=0; i<n-1; i++) {
				fw.write(String.valueOf(liste[i]));
				fw.write(" ");
			}
			fw.write("?");
			fw.write("\";");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("int solution = ");
			fw.write(String.valueOf(liste[n-1]));
			fw.write(";");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("epreuve.creationEpreuve(suite, solution);}}");
			
			//String s = Integer.toString(liste[n-1]);
			
			
			
			//fw.write(String.valueOf("La solution est : "));
			//fw.write(String.valueOf(s));
			
			fw.close();
			
		}
		catch (IOException exception)
		
		{
			System.out.println("Erreur lors de la lecture :" + exception.getMessage());
		}
	}

	/**
	 * Génération du fichier executable Executable.bat
	 *
	 */
	public void creerEpreuve() {
		
		File f = new File(".\\Ressources\\EpreuveLogique1\\Executable.bat");
		if (f.exists()){
			try {
				Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveLogique1\\Executable.bat");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "L'�preuve a bien �t� cr��e !", "Confirmation de cr�ation", 
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossible de cr�er l'�preuve. R�essayez", "Probl�me de cr�ation", 
					JOptionPane.ERROR_MESSAGE);
		}
		// TODO Comprendre la méthode
	}
		
}

