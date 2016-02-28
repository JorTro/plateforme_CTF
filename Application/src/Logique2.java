//import java.io.*;
//import java.util.*;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Logique2 {

	public void runLogique() {
		
		Syracuse S = new Syracuse();
		String valeur, rang;
		Boolean b1 = false;
		Boolean b2 = false;
		int n=0, r=0;
		int [] s;
		
		valeur = S.selectionnerNb(); // Lance la boîte de dialogue pour rentrer la valeur souhaitée
		
		if(valeur == null) {
			System.exit(0);
		}
		
		while(!b1){
			try {
				n = Integer.parseInt(valeur);
				if (n>0) {
					b1 = true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
							JOptionPane.ERROR_MESSAGE);
					valeur = S.selectionnerNb();
				}
			}
			catch (NumberFormatException e) {
				if(valeur == null) {
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
						JOptionPane.ERROR_MESSAGE);
				valeur = S.selectionnerNb();
			}
		}
			
		rang = S.selectionnerRg();
		
		if(rang == null) {
			System.exit(0);
		}
		
		while(!b2){
			try {
				r = Integer.parseInt(rang);
				if (r>0) {
					b2 = true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
							JOptionPane.ERROR_MESSAGE);
					rang = S.selectionnerRg();
				}
			}
			catch (NumberFormatException e) {
				if(rang == null) {
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
						JOptionPane.ERROR_MESSAGE);
				rang = S.selectionnerRg();
			}
		}
		
		s = S.suite(n, r); // Création de la suite
		//s = S.epreuve(s);
		//S.afficherSuite(s);
		S.creerTxt(s);
		S.creerEpreuve();
	}
}