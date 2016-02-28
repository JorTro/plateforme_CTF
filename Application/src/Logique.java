//import java.io.*;
//import java.util.*;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Logique {

	public void runLogique() {
		
		Fibonacci S = new Fibonacci();
		String valeur1, valeur2, rang;
		Boolean b1 = false, b2 = false, b3 = false;
		int n1=0, n2=0, r=0;
		int [] s;
		
		valeur1 = S.selectionnerNb1(); // Lance la boîte de dialogue pour rentrer la valeur souhaitée
		
		if(valeur1 == null) {
			System.exit(0);
		}
		
		while(!b1){
			try {
				n1 = Integer.parseInt(valeur1);
				b1 = true;
			}
			catch (NumberFormatException e) {
				if(valeur1 == null) {
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
						JOptionPane.ERROR_MESSAGE);
				valeur1 = S.selectionnerNb1();
			}
		}
		
		valeur2 = S.selectionnerNb2(); // Lance la boîte de dialogue pour rentrer la valeur souhaitée
		
		if(valeur2 == null) {
			System.exit(0);
		}
		
		while(!b2){
			try {
				n2 = Integer.parseInt(valeur2);
				if(n2>0) {
					b2 = true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
							JOptionPane.ERROR_MESSAGE);
					valeur2 = S.selectionnerNb2();
				}
			}
			catch (NumberFormatException e) {
				if(valeur2 == null) {
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez réessayer.", "Epreuve de logique",
						JOptionPane.ERROR_MESSAGE);
				valeur2 = S.selectionnerNb2();
			}
		}
		
		rang = S.selectionnerRg(); // Lance la boîte de dialogue pour rentrer la valeur souhaitée
		
		if(rang == null) {
			System.exit(0);
		}
		
		while(!b3){
			try {
				r = Integer.parseInt(rang);
				if (r>3) {
					b3 = true;
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
		
		s = S.suite(n1, n2, r); // Création de la suite
		//S.afficherSuite(s);
		S.creerTxt(s);
		S.creerEpreuve();

	}

}