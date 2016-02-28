import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Syracuse {

	public int[] suite(int n, int r) {
		int[] s = new int[r];
		s[0] = n;
		for (int i=0; i<r-1; i++) {
			if (s[i]%2 == 0) {
				s[i+1] = s[i]/2;
			}
			else {
				s[i+1] = 3*s[i]+1;
			}
		}
	return s;	
	}
	
	public int[] epreuve(int[] s) {
		int n = s.length;
		int[] t = new int[n-1];
		for (int i=0; i<n-1; i++){
			t[i] = s[i];
		}
		return t;
	}
	
	public void afficherSuite (int[] s) {
		int n = s.length;
		for (int i=0; i<n; i++) {
			System.out.print(s[i] + " ");
		}
	}
	
	public String selectionnerNb() {
		String nombre = JOptionPane.showInputDialog(null, "Veuillez entrer un nombre > 0 pour la première valeur de la suite : ",
				"Epreuve de logique", JOptionPane.QUESTION_MESSAGE);
		return nombre;
	}
	
	public String selectionnerRg() {
		String nombre = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre d'éléments souhaités : ", "Epreuve de logique",
				JOptionPane.QUESTION_MESSAGE);
		return nombre;
	}	
	
	public void creerTxt(int[] liste) {
		File f = new File ("./Ressources/EpreuveLogique2/LanceurLog2.java");
		
		try
		{
			FileWriter fw = new FileWriter(f);
			
			int n = liste.length;
			
			fw.write("public class LanceurLog2 {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("public static void main(String[] args) {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("EpreuveLog2 epreuve = new EpreuveLog2();");
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

	public void creerEpreuve() {
		
		File f = new File(".\\Ressources\\EpreuveLogique2\\Executable.bat");
		if (f.exists()){
			try {
				Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveLogique2\\Executable.bat");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "L'épreuve a bien été créée !", "Confirmation de création",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossible de créer l'épreuve. Réessayez", "Problème de création",
					JOptionPane.ERROR_MESSAGE);
		}
	}
		
}

