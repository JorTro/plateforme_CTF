import javax.swing.JOptionPane;

public class EpreuveStegano1 {

public void creationEpreuve(String keyword) {
		
		Boolean b1 = false;
		
		while (!b1) {
		
			String reponse = JOptionPane.showInputDialog(null, "Il faut aller au bout des choses !" 
			+ "\n\n" + "Entrez votre réponse : ", "Epreuve de stéganographie n°1", JOptionPane.QUESTION_MESSAGE);

			while (!reponse.matches("[a-zA-Z0-9]+") || (reponse.length() != 8)){
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de stéganographie n°1",
						JOptionPane.ERROR_MESSAGE);
				reponse = JOptionPane.showInputDialog(null, "Il faut aller au bout des choses !" 
						+ "Entrez votre réponse : ", "Epreuve de stéganographie n°1", JOptionPane.QUESTION_MESSAGE);
			}

			if(reponse.equals(keyword)) {
				JOptionPane.showMessageDialog(null, "Epreuve réussie !", "Epreuve de stéganographie n°1"
						+ "", JOptionPane.INFORMATION_MESSAGE);
				b1 = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Mauvaise réponse. Essayez encore.", "Epreuve de stéganographie n°1"
						+ "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}