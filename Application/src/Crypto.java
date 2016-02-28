import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;




import javax.swing.JOptionPane;


public class Crypto {

	public void runCrypto() {
		
		String keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (uniquement des lettres) : "
				+ "", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
		
		while (!keyword.matches("[A-Za-z]+")){
			JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de cryptographie"
					+ "", JOptionPane.ERROR_MESSAGE);
			keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (uniquement des lettres) : "
					+ "", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
		}
		
		keyword = keyword.toUpperCase();
	    //Vigenere.motCode(keyword);
	    	    
	    // Le mot clé pour Vigenere est EPREUVE
	    String st=Vigenere.correspondEpreuve(keyword);
	    String s= Playfair.CorrectString(st);
		
		String clue1 = JOptionPane.showInputDialog(null, "Veuillez entrer votre premier indice (uniquement des lettres)"
				+ "", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
		
		while (!clue1.matches("[A-Za-z]+")){
			JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de cryptographie"
					+ "", JOptionPane.ERROR_MESSAGE);
			clue1 = JOptionPane.showInputDialog(null, "Veuillez entrer votre premier indice (uniquement des lettres)"
					+ "", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
		}

		clue1 = clue1.toUpperCase();
		String clue2= Playfair.deuxiemeIndice(clue1, s);
		
		File f = new File ("./Ressources/EpreuveCrypto/LanceurCrypto.java");
		
		try
		{
			FileWriter fw = new FileWriter(f);
			
			fw.write("public class LanceurCrypto {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("public static void main(String[] args) {");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("EpreuveCrypto epreuve = new EpreuveCrypto();");
			fw.write(String.valueOf(System.getProperty("line.separator")));
				
			fw.write("String clue1 = ");
			fw.write("\"");
			fw.write(clue1);
			fw.write("\";");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("clue1 = clue1.toUpperCase();");
			
			fw.write("String clue2 = ");
			fw.write("\"");
			fw.write(clue2);
			fw.write("\";");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("String keyword = ");
			fw.write("\"");
			fw.write(keyword);
			fw.write("\";");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("keyword.toUpperCase();");
			fw.write(String.valueOf(System.getProperty("line.separator")));
			
			fw.write("epreuve.creationEpreuve(clue1, clue2, keyword);}}");
			
			fw.close();
			
		}
		catch (IOException exception)
		
		{
			System.out.println("Erreur lors de la lecture :" + exception.getMessage());
		}
		

	}
	
	public void creerEpreuve() {
		
		File f = new File(".\\Ressources\\EpreuveCrypto\\Executable.bat");
		if (f.exists()){
			try {
				Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveCrypto\\Executable.bat");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "L'épreuve a bien été créée !", "Confirmation de création"
						+ "", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossible de créer l'épreuve. Réessayez", "Problème de création"
					+ "", JOptionPane.ERROR_MESSAGE);
		}
	}
}

