import javax.swing.JOptionPane;

public class EpreuveStegano2 {

public void creationEpreuve(String keyword) {
		
		Boolean b1 = false;
		
		while (!b1) {
		
			String reponse = JOptionPane.showInputDialog(null, "Combien de temps mettrez-vous ?" 
			+ "\n\n" + "Entrez votre r�ponse : ", "Epreuve de st�ganographie n�2", JOptionPane.QUESTION_MESSAGE);

			while ((!reponse.matches("[a-zA-Z]+")) || (reponse.length() != 8)){
				JOptionPane.showMessageDialog(null, "Valeur entr�e invalide. Veuillez r�essayer.", "Epreuve de st�ganographie n�2",
						JOptionPane.ERROR_MESSAGE);
				reponse = JOptionPane.showInputDialog(null, "Combien de temps mettrez-vous ?" 
						+ "\n\n" + "Entrez votre r�ponse : ", "Epreuve de st�ganographie n�2", JOptionPane.QUESTION_MESSAGE);
			}

			if(reponse.equals(keyword)) {
				JOptionPane.showMessageDialog(null, "Epreuve r�ussie !", "Epreuve de st�ganographie n�2"
						+ "", JOptionPane.INFORMATION_MESSAGE);
				b1 = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Mauvaise r�ponse. Essayez encore.", "Epreuve de st�ganographie n�2"
						+ "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}