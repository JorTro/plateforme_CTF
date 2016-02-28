import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/** Classe du CrackMe
*/

public class CrackMe {

	public String[][] intermediaire(String[] keyword) {
		
		int longueur = keyword.length;
		String[][] crack = new String[longueur][2];
		String[][] tableau = {
				{"R", "O", "U", "L", "E", "R"},
				{"S", "A", "P", "H", "I", "R"},
				{"D", "O", "R", "M", "I", "R"},
				{"V", "A", "L", "S", "E", "S"},
				{"T", "O", "P", "A", "Z", "E"},
				{"B", "I", "J", "O", "U", "X"},
				{"X", "Y", "L", "O", "P", "H"},
				{"C", "O", "U", "C", "O", "U"},
				{"F", "O", "L", "I", "E", "S"},
				{"G", "O", "U", "R", "M", "A"},
				{"H", "I", "B", "O", "U", "X"},
				{"J", "O", "L", "I", "E", "S"},
				{"K", "A", "Y", "A", "K", "S"},
				{"L", "O", "U", "T", "R", "E"},
				{"Q", "U", "E", "L", "L", "E"},
				{"W", "A", "G", "O", "N", "S"}
		};
		
		String [] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"
				+ "", "V", "W", "X", "Y", "Z"};
		
		for (int i=0; i<longueur; i++){
	
			for (int j=0; j<16; j++){
				for (int k=0; k<6; k++){
					if (keyword[i].equals(tableau[j][k])) {
						crack[i][0] = alphabet[j];
						crack[i][1] = Integer.toString(k);
					}
				}
			}
		}
		
		return crack;
		
	}
	
	public String[] selectionnerMot(){
		String keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous d�sirez en MAJUSCULE : ", "Epreuve de "
				+ "CrackMe", JOptionPane.QUESTION_MESSAGE);
		while (!keyword.matches("[A-Z]+")){
			JOptionPane.showMessageDialog(null, "Valeur entr�e invalide. Veuillez r�essayer.", "Epreuve de cryptographie"
					+ "", JOptionPane.ERROR_MESSAGE);
			keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous d�sirez en MAJUSCULE : "
					+ "", "Epreuve de CrackMe", JOptionPane.QUESTION_MESSAGE);
		}
		String[] splitArray = keyword.split("");		
		return splitArray;
	}
	
	public void creerTxt (String [][] crack){
		
		int n = crack.length;
		int m = n+1;
		File f = new File ("./Ressources/EpreuveCrackMe/EpreuveCrackMe.c");
		
		try
		{
			FileWriter fw = new FileWriter(f);
			
			fw.write("#include <stdio.h>\n");
			fw.write("#include <stdlib.h>\n");
			fw.write("#include <string.h>\n");
			fw.write("typedef enum { false, true } bool;\n");
			
			fw.write("int main(){\n\n");
			
			fw.write("int bo = true;\n char proposition[26]; char epreuve[] = \"Resolvez ce CrackMe ! Trouvez le mot de passe !\";\n");
				
			fw.write("char A[] = \"ROULER\";\n char B[] = \"SAPHIR\";\n char C[] = \"DORMIR\";\n char D[] = \"VALSES\";\n");
			fw.write("char E[] = \"TOPAZE\";\n char F[] = \"BIJOUX\";\n char G[] = \"XYLOPH\";\n char H[] = \"COUCOU\";\n");
			fw.write("char I[] = \"FOLIES\";\n char J[] = \"GOURMA\";\n char K[] = \"HIBOUX\";\n char L[] = \"JOLIES\";\n");
			fw.write("char M[] = \"KAYAKS\";\n char N[] = \"LOUTRE\";\n char O[] = \"QUELLE\";\n char P[] = \"WAGONS\";\n");
			fw.write("char mdp[" + m + "];\n");
			
			for (int i=0; i<n; i++){
				fw.write("mdp[" + i + "]=" + crack[i][0] +"[" + crack[i][1] + "];\n");
			}
			
			fw.write("mdp[" + n + "] = \'\\");
			fw.write("0\';\n");
			
			
			/*fw.write("printf(\"%s");
			fw.write("\\");
			fw.write("n\", mdp);\n");*/
			
			fw.write("char ok[] = \"Bonne reponse !\";\n char non[] = \"Mauvaise reponse ! Reessayez !\";\n");
			
			fw.write("printf(\"%s");
			fw.write("\\");
			fw.write("n\", epreuve);\n");
			
			fw.write("while(bo){\n scanf(\"%s\", proposition);\n");
			
			fw.write("if (strlen(proposition) != strlen(mdp)){\n printf(\"%s");
			fw.write("\\");
			fw.write("n\", non); }\n");
			
			fw.write("else if ( strcmp(proposition, mdp)==0){\n printf(\"%s");
			fw.write("\\");
			fw.write("n\", ok); bo = false; }\n");
			
			fw.write("else {\n printf(\"%s");
			fw.write("\\");
			fw.write("n\", non);\n } }\n return EXIT_SUCCESS; }");
			
			fw.close();
			
		}
		catch (IOException exception)
		
		{
			System.out.println("Erreur lors de la lecture :" + exception.getMessage());
		}
	}
	
	public void creerEpreuve() {
		
		File f = new File(".\\Ressources\\EpreuveCrackMe\\Executable.bat");
		if (f.exists()){
			try {
				Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveCrackMe\\Executable.bat");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "L'�preuve a bien �t� cr��e !", "Confirmation de cr�ation"
						+ "", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Impossible de cr�er l'�preuve. R�essayez", "Probl�me de cr�ation"
					+ "", JOptionPane.ERROR_MESSAGE);
		}
	}
}
