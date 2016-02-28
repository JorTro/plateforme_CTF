import javax.swing.JOptionPane;

public class EpreuveJavaScript {

public void creationEpreuve(String keyword) {
		
		Boolean b1 = false;
		
		while (!b1) {
		
			String reponse = JOptionPane.showInputDialog(null, "Il vous faut changer votre condition !" 
			+ "\n\n" + "Entrez votre réponse : ", "Epreuve de JavaScript", JOptionPane.QUESTION_MESSAGE);

			while (!reponse.matches("[a-zA-Z0-9]+")){
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de JavaScript",
						JOptionPane.ERROR_MESSAGE);
				reponse = JOptionPane.showInputDialog(null, "Il vous faut changer votre condition !" 
						+ "Entrez votre réponse : ", "Epreuve de JavaScript", JOptionPane.QUESTION_MESSAGE);
			}

			if(reponse.equals(keyword)) {
				JOptionPane.showMessageDialog(null, "Epreuve réussie !", "Epreuve de JavaScript"
						+ "", JOptionPane.INFORMATION_MESSAGE);
				b1 = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Mauvaise réponse. Essayez encore.", "Epreuve de JavaScript"
						+ "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}