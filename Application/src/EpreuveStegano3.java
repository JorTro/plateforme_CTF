import javax.swing.JOptionPane;

public class EpreuveStegano3 {

public void creationEpreuve(String keyword) {
		
		Boolean b1 = false;
		
		while (!b1) {
		
			String reponse = JOptionPane.showInputDialog(null, "Il ne faut pas se fier aux apparences !" 
			+ "\n\n" + "Entrez votre réponse : ", "Epreuve de Stéganographie n°3", JOptionPane.QUESTION_MESSAGE);

			while (!reponse.matches("[a-zA-Z]+")){
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de Stéganographie n°3",
						JOptionPane.ERROR_MESSAGE);
				reponse = JOptionPane.showInputDialog(null, "Il ne faut pas se fier aux apparences !" 
						+ "Entrez votre réponse : ", "Epreuve de Stéganographie n°3", JOptionPane.QUESTION_MESSAGE);
			}

			if(reponse.equals(keyword)) {
				JOptionPane.showMessageDialog(null, "Epreuve réussie !", "Epreuve de Stéganographie n°3"
						+ "", JOptionPane.INFORMATION_MESSAGE);
				b1 = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Mauvaise réponse. Essayez encore.", "Epreuve de Stéganographie n°3"
						+ "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}