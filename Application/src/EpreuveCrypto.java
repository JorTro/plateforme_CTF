import javax.swing.JOptionPane;

public class EpreuveCrypto {

public void creationEpreuve(String clue1, String clue2, String keyword) {
		
		Boolean b1 = false;
		
		while (!b1) {
		
			String reponse = JOptionPane.showInputDialog(null, "Le mariage nihiliste de Blaise !" + "\n\n" 
			+ "Le nom de la liste contenant les numéros de chaque invité russe est (sachant qu'Ingrid est en couple avec Joris) : "
			+ "" + clue1 + "\n" 
					+ "Cherchez les invités russes portant les numéros suivants : " + clue2 + "\n" 
			+ "Après avoir placé ces invités, un seul mot rentre en tête de Blaise : EPREUVE" + "\n\n" 
					+ "Entrez votre réponse : ", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
			
			reponse = reponse.toUpperCase();
			
			while (!reponse.matches("[A-Z]+")){
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de cryptographie"
						+ "", JOptionPane.ERROR_MESSAGE);
				reponse = JOptionPane.showInputDialog(null, "Le mariage nihiliste de Blaise !" + "\n\n" 
				+ "Le nom de la liste contenant les numéros de chaque invité russe est (sachant qu'Ingrid est en couple avec Joris) : " 
						+ clue1 + "\n" + "Cherchez les invités russes portant les numéros suivants : " + clue2 + "\n" 
				+ "Après avoir placé ces invités, un seul mot rentre en tête de Blaise : EPREUVE" + "\n\n" 
						+ "Entrez votre réponse : ", "Epreuve de cryptographie", JOptionPane.QUESTION_MESSAGE);
			}
			
			if(reponse.equals(keyword)) {
				JOptionPane.showMessageDialog(null, "Epreuve réussie !", "Epreuve de cryptographie", JOptionPane.INFORMATION_MESSAGE);
				b1 = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Mauvaise réponse. Essayez encore.", "Epreuve de cryptographie"
						+ "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
