import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class PanneauSteg extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics2D g){
	
	  String b="";
		String keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (8 caractères composé de "
				+ "lettre(s) et/ou de chiffre(s) OBLIGATOIREMENT) : ", "Epreuve de stéganographie", JOptionPane.QUESTION_MESSAGE);
		
		
		while ((!keyword.matches("[a-zA-Z0-9]+")) || (keyword.length() != 8)){
			JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez entrer un mot de 8 caractères composé de lettre(s) "
					+ "et/ou de chiffre(s).", "Epreuve de stéganographie", JOptionPane.ERROR_MESSAGE);
			keyword = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (8 caractères composé de lettre(s) "
					+ "et/ou de chiffre(s)) : ", "Epreuve de stéganographie", JOptionPane.QUESTION_MESSAGE);
		}
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Veuillez saisir un mot :");
		//String str = sc.nextLine();
		String str = keyword;
	        for(int i = 0; i < str.length(); i++) {
	            int a = (int) str.charAt(i);
	            String binary = Integer.toBinaryString(a);
	            if (binary.length()<8) {
	            	int c=8-binary.length();
	            	for (int j = 0; j < c; j++) {
	            		binary = 0 + binary; 
	            	}
	            }
	            b=b+binary;	        
	            }
	        //System.out.println(b); 
	        String[] Array = b.split("");
	  
    try {
    	
      BufferedImage img = ImageIO.read(new File("./Ressources/EpreuveStegano1/arbre52.png"));
      BufferedImage img2 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillev.png"));
      BufferedImage img3 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillev1.png"));
      BufferedImage img4 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillev2.png"));
      //BufferedImage img5 = ImageIO.read(new File("./EpreuveStegano1/feuillev3.png"));
      //BufferedImage img6 = ImageIO.read(new File("./EpreuveStegano1/feuillev4.png"));
      //BufferedImage img7 = ImageIO.read(new File("./EpreuveStegano1/feuillev5.png"));
      BufferedImage img8 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillev6.png"));
      BufferedImage img9 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillev7.png"));
      BufferedImage img10 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe.png"));
      BufferedImage img11 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe2.png"));
      BufferedImage img12 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe3.png"));
      BufferedImage img13 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe4.png"));
      BufferedImage img14 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe5.png"));
      BufferedImage img15 = ImageIO.read(new File("./Ressources/EpreuveStegano1/feuillespe6.png"));
      
      g.drawImage(img, 0, 0, this);
      if (Array[0].equals("1")){
      g.drawImage(img9, 195, 485+60, this);}
      if (Array[1].equals("1")){
      g.drawImage(img9, 210, 455+60, this);}
      if (Array[2].equals("1")){
      g.drawImage(img9, 258, 460+60, this);}
      if (Array[3].equals("1")){
      g.drawImage(img9, 115, 403+60, this);}
      if (Array[4].equals("1")){
      g.drawImage(img9, 105, 355+60, this);}
      if (Array[5].equals("1")){
      g.drawImage(img9, 153, 350+60, this);}
      if (Array[6].equals("1")){
      g.drawImage(img8, 3, 297+60, this);}
      if (Array[7].equals("1")){
      g.drawImage(img9, 24, 274+60, this);}
      if (Array[8].equals("1")){
      g.drawImage(img9, 24, 232+60, this);}
      if (Array[9].equals("1")){
      g.drawImage(img2, 76, 202+60, this);}
      if (Array[10].equals("1")){
      g.drawImage(img9, 96, 245+60, this);}
      if (Array[11].equals("1")){
      g.drawImage(img9, 68, 140+60, this);}
      if (Array[12].equals("1")){
      g.drawImage(img9, 110, 160+60, this);}
      if (Array[13].equals("1")){
      g.drawImage(img9, 175, 270+60, this);}
      if (Array[14].equals("1")){
      g.drawImage(img4, 222, 283+60, this);}
      if (Array[15].equals("1")){
      g.drawImage(img9, 225, 305+60, this);}
      if (Array[16].equals("1")){
      g.drawImage(img3, 278, 295+60, this);}
      if (Array[17].equals("1")){
      g.drawImage(img2, 334, 319+60, this);}
      if (Array[18].equals("1")){
      g.drawImage(img9, 265, 232+60, this);}
      if (Array[19].equals("1")){
      g.drawImage(img8, 157, 180+60, this);}
      if (Array[20].equals("1")){
      g.drawImage(img9, 147, 155+60, this);}
      if (Array[21].equals("1")){
      g.drawImage(img9, 124, 105+60, this);}
      if (Array[22].equals("1")){
      g.drawImage(img9, 140, 77+60, this);}
      if (Array[23].equals("1")){
      g.drawImage(img9, 218, 142+60, this);}
      if (Array[24].equals("1")){
      g.drawImage(img9, 177, 77+60, this);}
      if (Array[25].equals("1")){
      g.drawImage(img9, 192, 25+60, this);}
      if (Array[26].equals("1")){
      g.drawImage(img9, 230, 22+60, this);}
      if (Array[27].equals("1")){
      g.drawImage(img2, 288, 17+60, this);}
      if (Array[28].equals("1")){
      g.drawImage(img2, 318, 79+60, this);}
      if (Array[29].equals("1")){
      g.drawImage(img2, 336, 150+60, this);}
      if (Array[30].equals("1")){
      g.drawImage(img2, 370, 12+60, this);}
      if (Array[31].equals("1")){
      g.drawImage(img11, 363, 110+60, this);}
      if (Array[32].equals("1")){
      g.drawImage(img2, 417, 45+60, this);}
      if (Array[33].equals("1")){
      g.drawImage(img9, 400, 50, this);}
      if (Array[34].equals("1")){
      g.drawImage(img2, 460, 42, this);}
      if (Array[35].equals("1")){
      g.drawImage(img3, 500, 53, this);}
      if (Array[36].equals("1")){
      g.drawImage(img3, 510, 110, this);}
      if (Array[37].equals("1")){
      g.drawImage(img10, 450, 171, this);}
      if (Array[38].equals("1")){
      g.drawImage(img3, 550, 109, this);}
      if (Array[39].equals("1")){
      g.drawImage(img3, 571, 133, this);}
      if (Array[40].equals("1")){
      g.drawImage(img3, 571, 193, this);}
      if (Array[41].equals("1")){
      g.drawImage(img12, 445, 261, this);}
      if (Array[42].equals("1")){
      g.drawImage(img13, 504, 244, this);}
      if (Array[43].equals("1")){
      g.drawImage(img14, 383, 295, this);}
      if (Array[44].equals("1")){
      g.drawImage(img14, 420, 270, this);}
      if (Array[45].equals("1")){
      g.drawImage(img3, 490, 315, this);}
      if (Array[46].equals("1")){
      g.drawImage(img3, 440, 370, this);}
      if (Array[47].equals("1")){
      g.drawImage(img14, 372, 400, this);}
      if (Array[48].equals("1")){
      g.drawImage(img14, 437, 360, this);}
      if (Array[49].equals("1")){
      g.drawImage(img15, 428, 387, this);}
      if (Array[50].equals("1")){
      g.drawImage(img11, 489, 325, this);}
      if (Array[51].equals("1")){
      g.drawImage(img14, 493, 350, this);}
      if (Array[52].equals("1")){
      g.drawImage(img3, 595, 250, this);}
      if (Array[53].equals("1")){
      g.drawImage(img3, 631, 258, this);}
      if (Array[54].equals("1")){
      g.drawImage(img14, 580, 282, this);}
      if (Array[55].equals("1")){
      g.drawImage(img15, 574, 310, this);}
      if (Array[56].equals("1")){
      g.drawImage(img15, 620, 285, this);}
      if (Array[57].equals("1")){
      g.drawImage(img3, 682, 353, this);}
      if (Array[58].equals("1")){
      g.drawImage(img3, 668, 395, this);}
      if (Array[59].equals("1")){
      g.drawImage(img12, 675, 445, this);}
      if (Array[60].equals("1")){
      g.drawImage(img12, 589, 487, this);}
      if (Array[61].equals("1")){
      g.drawImage(img12, 570, 528, this);}
      if (Array[62].equals("1")){
      g.drawImage(img12, 595, 557, this);}
      if (Array[63].equals("1")){
      g.drawImage(img12, 500, 605, this);}
      
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    File f = new File ("./Ressources/EpreuveStegano1/LanceurStegano1.java");

	try
	{
		FileWriter fw = new FileWriter(f);

		fw.write("public class LanceurStegano1 {");
		fw.write(String.valueOf(System.getProperty("line.separator")));

		fw.write("public static void main(String[] args) {");
		fw.write(String.valueOf(System.getProperty("line.separator")));

		fw.write("EpreuveStegano1 epreuve = new EpreuveStegano1();");
		fw.write(String.valueOf(System.getProperty("line.separator")));
	

		fw.write("String keyword = ");
		fw.write("\"");
		fw.write(keyword);
		fw.write("\";");
		fw.write(String.valueOf(System.getProperty("line.separator")));

		fw.write("epreuve.creationEpreuve(keyword);}}");

		fw.close();

	}
	catch (IOException exception)

	{
		System.out.println("Erreur lors de la lecture :" + exception.getMessage());
	}
 
  }

	public void creerEpreuve() {
		
		File f = new File(".\\Ressources\\EpreuveStegano1\\Executable.bat");
		if (f.exists()){
			try {
				Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveStegano1\\Executable.bat");
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