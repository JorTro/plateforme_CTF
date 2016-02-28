import java.io.*;

import javax.swing.JOptionPane;

public class Stegano2 {
	
public void runStegano2(){
	
	String trad[][] = new String[52][2];
	trad[0][0] = "A";
	trad[0][1] = "41";
	trad[1][0] = "B";
	trad[1][1] = "42";
	trad[2][0] = "C";
	trad[2][1] = "43";
	trad[3][0] = "D";
	trad[3][1] = "44";
	trad[4][0] = "E";
	trad[4][1] = "45";
	trad[5][0] = "F";
	trad[5][1] = "46";
	trad[6][0] = "G";
	trad[6][1] = "47";
	trad[7][0] = "H";
	trad[7][1] = "48";
	trad[8][0] = "I";
	trad[8][1] = "49";
	trad[9][0] = "J";
	trad[9][1] = "4A";
	trad[10][0] = "K";
	trad[10][1] = "4B";
	trad[11][0] = "L";
	trad[11][1] = "4C";
	trad[12][0] = "M";
	trad[12][1] = "4D";
	trad[13][0] = "N";
	trad[13][1] = "4E";
	trad[14][0] = "O";
	trad[14][1] = "4F";
	trad[15][0] = "P";
	trad[15][1] = "50";
	trad[16][0] = "Q";
	trad[16][1] = "51";
	trad[17][0] = "R";
	trad[17][1] = "52";
	trad[18][0] = "S";
	trad[18][1] = "53";
	trad[19][0] = "T";
	trad[19][1] = "54";	
	trad[20][0] = "U";
	trad[20][1] = "55";
	trad[21][0] = "V";
	trad[21][1] = "56";
	trad[22][0] = "W";
	trad[22][1] = "57";
	trad[23][0] = "X";
	trad[23][1] = "58";
	trad[24][0] = "Y";
	trad[24][1] = "59";
	trad[25][0] = "Z";
	trad[25][1] = "5A";
	
	trad[26][0] = "a";
	trad[26][1] = "61";
	trad[27][0] = "b";
	trad[27][1] = "62";
	trad[28][0] = "c";
	trad[28][1] = "63";
	trad[29][0] = "d";
	trad[29][1] = "64";
	trad[30][0] = "e";
	trad[30][1] = "65";
	trad[31][0] = "f";
	trad[31][1] = "66";
	trad[32][0] = "g";
	trad[32][1] = "67";
	trad[33][0] = "h";
	trad[33][1] = "68";
	trad[34][0] = "i";
	trad[34][1] = "69";
	trad[35][0] = "j";
	trad[35][1] = "6A";
	trad[36][0] = "k";
	trad[36][1] = "6B";
	trad[37][0] = "l";
	trad[37][1] = "6C";
	trad[38][0] = "m";
	trad[38][1] = "6D";
	trad[39][0] = "n";
	trad[39][1] = "6E";
	trad[40][0] = "o";
	trad[40][1] = "6F";
	trad[41][0] = "p";
	trad[41][1] = "70";
	trad[42][0] = "q";
	trad[42][1] = "71";
	trad[43][0] = "r";
	trad[43][1] = "72";
	trad[44][0] = "s";
	trad[44][1] = "73";
	trad[45][0] = "t";
	trad[45][1] = "74";	
	trad[46][0] = "u";
	trad[46][1] = "75";
	trad[47][0] = "v";
	trad[47][1] = "76";
	trad[48][0] = "w";
	trad[48][1] = "77";
	trad[49][0] = "x";
	trad[49][1] = "78";
	trad[50][0] = "y";
	trad[50][1] = "79";
	trad[51][0] = "z";
	trad[51][1] = "7A";
	
	
	String [] trameIP = new String[]{"00","00","00","24","d4","ba","68","e7","ac","22","0b","d6","ca","03","08","00","45","00","00","10","00","3c","08","12","00","00","2a","01","00","00","c0","a8","00","18","ad","c2","00","20","28","6f","08","00","44","70","00","01","08","eb","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP1 = new String[]{"00","00","ac","22","0b","d6","ca","03","00","24","d4","ba","68","e7","08","00","45","00","00","10","00","3c","03","b8","00","00","23","01","e8","17","ad","c2","28","6f","c0","a8","00","20","00","18","00","00","4c","70","00","01","08","eb","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP2 = new String[]{"00","00","00","24","d4","ba","68","e7","ac","22","0b","d6","ca","03","08","00","45","00","00","10","00","3c","6f","94","00","00","04","01","00","00","c0","a8","00","18","d8","3a","00","20","d3","24","08","00","44","68","00","01","08","f3","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP3 = new String[]{"00","00","ac","22","0b","d6","ca","03","00","24","d4","ba","68","e7","08","00","45","00","00","10","00","3c","00","00","00","00","1b","01","1a","a2","d8","3a","d3","24","c0","a8","00","20","00","18","00","00","4c","68","00","01","08","f3","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP4 = new String[]{"00","00","00","24","d4","ba","68","e7","ac","22","0b","d6","ca","03","08","00","45","00","00","10","00","3c","41","35","00","00","1e","01","00","00","c0","a8","00","18","1f","0d","00","20","5b","02","08","00","44","64","00","01","08","f7","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP5 = new String[]{"00","00","ac","22","0b","d6","ca","03","00","24","d4","ba","68","e7","08","00","45","00","00","10","00","3c","d9","83","00","00","0f","01","50","6e","1f","0d","5b","02","c0","a8","00","20","00","18","00","00","4c","64","00","01","08","f3","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP6 = new String[]{"00","00","00","24","d4","ba","68","e7","ac","22","0b","d6","ca","03","08","00","45","00","00","10","00","3c","0b","a6","00","00","1f","01","00","00","c0","a8","00","18","8e","ec","00","20","42","81","08","00","44","5f","00","01","08","fc","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	String [] trameIP7 = new String[]{"00","00","00","24","d4","ba","68","e7","ac","22","0b","d6","ca","03","08","00","45","00","00","10","00","3c","1b","17","00","00","16","01","00","00","c0","a8","00","18","a7","e3","00","20","22","6a","08","00","44","5d","00","01","08","fe","61","62","63","64","65","66","00","30","67","68","69","6a","6b","6c","6d","6e","6f","70","71","72","73","74","75","76","00","40","77","61","62","63","64","65","66","67","68","69"};
	
	//Scanner sc = new Scanner(System.in);
	
	//System.out.println("Veuillez saisir un mot de 8 lettres :");
	
	//String str = sc.nextLine();
	
	String str = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (8 lettres OBLIGATOIREMENT) : "
			+ "", "Epreuve de stéganographie", JOptionPane.QUESTION_MESSAGE);
	
	
	while ((!str.matches("[a-zA-Z]+")) || (str.length() != 8)){
		JOptionPane.showMessageDialog(null, "Valeur entrée invalide. Veuillez entrer un mot de 8 lettres.",
				"Epreuve de stéganographie", JOptionPane.ERROR_MESSAGE);
		str = JOptionPane.showInputDialog(null, "Entrez le mot de passe que vous désirez (8 lettres OBLIGATOIREMENT) : ",
				"Epreuve de stéganographie", JOptionPane.QUESTION_MESSAGE);
	}
	
	String[] strArray = str.split("");
	
	System.arraycopy(strArray,0,trameIP,47,1);//"2a"
	System.arraycopy(strArray,1,trameIP1,40,1);//"23"
	System.arraycopy(strArray,2,trameIP2,5,1);//"04"
	System.arraycopy(strArray,3,trameIP3,30,1);//"1b"
	System.arraycopy(strArray,4,trameIP4,33,1);//"1e"
	System.arraycopy(strArray,5,trameIP5,16,1);//"10"
	System.arraycopy(strArray,6,trameIP6,34,1);//"20"
	System.arraycopy(strArray,7,trameIP7,25,1);//"16"
	
	File f1 = new File ("./Ressources/EpreuveStegano2/EpreuveStegano2.txt");
	
	try
	{
		    FileWriter fw = new FileWriter(f1);
		    	    
		    
		for(int ind = 0; ind <= 1; ind++){
		
			fw.write(trameIP[ind]);
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP[ind]);
		
			fw.write(" ");
		
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP[ind] );
		}
		fw.write(" ");
		for(int ind = 20; ind <= 35; ind++){
			
			fw.write(trameIP[ind] );
			fw.write(" ");
		}	
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 46; ind++){
			
			fw.write(trameIP[ind]);
			fw.write(" ");
		}
		for(int ind = 47; ind <= 47; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
			fw.write(" ");
		}
		
		for(int ind = 48; ind <= 53; ind++){
			
			fw.write(trameIP[ind]);
			fw.write(" ");		
		}		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 69; ind++){
			
			fw.write(trameIP[ind]);
			fw.write(" ");		
		}
			
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		
		

		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP1[ind]);	
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");
		
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 20; ind <= 35; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 38; ind <= 39; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");
		}
		for(int ind = 40; ind <= 40; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP1[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
			fw.write(" ");
		}
			
		for(int ind = 41; ind <= 53; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		
	    
		
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP2[ind]);
		}
		fw.write(" ");
		for(int ind = 2; ind <= 4; ind++){
			
			fw.write(trameIP2[ind]);
			fw.write(" ");
		}
		for(int ind = 5; ind <= 5; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP2[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
		    fw.write(" ");
		}
		
		for(int ind = 6; ind <= 17; ind++){
			
			fw.write(trameIP2[ind]);
			fw.write(" ");	
		}		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP2[ind]);
		}
		fw.write(" ");
		for(int ind = 20; ind <= 35; ind++){
			
			fw.write(trameIP2[ind]);
			fw.write(" ");
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP2[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP2[ind]);
			fw.write(" ");
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		
		
		
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		
		
		

		
		
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP3[ind]);
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP3[ind]);
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP3[ind]);
		}
		fw.write(" ");
		for(int ind = 20; ind <= 29; ind++){
			
			fw.write(trameIP3[ind]);
			fw.write(" ");	
		}
		for(int ind = 30; ind <= 30; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP3[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
		    fw.write(" ");
		}
		
		for(int ind = 31; ind <= 35; ind++){
			
			fw.write(trameIP3[ind]);
			fw.write(" ");		
		}	
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP3[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP3[ind]);
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		

		
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP4[ind]);
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP4[ind]);
			fw.write(" ");	
		
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP4[ind]);
		}
		fw.write(" ");
		for(int ind = 20; ind <= 32; ind++){
			
			fw.write(trameIP4[ind]);
			fw.write(" ");	
		}
		for(int ind = 33; ind <= 33; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP4[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
			fw.write(" ");
		}						
		for(int ind = 34; ind <= 35; ind++){
			
			fw.write(trameIP4[ind]);
			fw.write(" ");			
		}	
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP4[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP4[ind]);
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
			
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		
		

		
		
		
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP5[ind]);
		}
		fw.write(" ");
		for(int ind = 2; ind <= 15; ind++){
			
			fw.write(trameIP5[ind]);
			fw.write(" ");	
		}
		for(int ind = 16; ind <= 16; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP5[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
		    fw.write(" ");
		}
		
		for(int ind = 17; ind <= 17; ind++){
			
			fw.write(trameIP5[ind]);
			fw.write(" ");		
		}		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP5[ind]);
		}
		fw.write(" ");
		for(int ind = 20; ind <= 35; ind++){
			
			fw.write(trameIP5[ind]);
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP5[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP5[ind]);
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
			
			
			
			
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
			

			
		
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP6[ind]);
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP6[ind]);
			fw.write(" ");	
		
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP6[ind]);	
		}
		fw.write(" ");
		for(int ind = 20; ind <= 33; ind++){
			
			fw.write(trameIP6[ind]);
			fw.write(" ");	
		}
		for(int ind = 34; ind <= 34; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP6[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
		    fw.write(" ");
		}
			
		for(int ind = 35; ind <= 35; ind++){
			
			fw.write(trameIP6[ind]);
			fw.write(" ");		
		}	
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP6[ind]);	
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP6[ind]);
			fw.write(" ");	
		}
		
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
			
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
		

			
		for(int ind = 0; ind <= 1; ind++){
			
			fw.write(trameIP7[ind]);
		
		}
		fw.write(" ");
		for(int ind = 2; ind <= 17; ind++){
			
			fw.write(trameIP7[ind]);
			fw.write(" ");	
		
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 18; ind <= 19; ind++){
			
			fw.write(trameIP7[ind]);
		}
		fw.write(" ");
		for(int ind = 20; ind <= 24; ind++){
			
			fw.write(trameIP7[ind]);
			fw.write(" ");	
		}
		for(int ind = 25; ind <= 25; ind++){
			int var;
			for( var = 0; var <= 51; var++){
				if (trameIP7[ind].equals(trad[var][0])){
					fw.write(trad[var][1]);
				}
			}
		
			fw.write(" ");
		}
				
		for(int ind = 26; ind <= 35; ind++){
			
			fw.write(trameIP7[ind]);
			fw.write(" ");		
		}	
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 36; ind <= 37; ind++){
			
			fw.write(trameIP7[ind]);
		}
		fw.write(" ");
		for(int ind = 38; ind <= 53; ind++){
			
			fw.write(trameIP7[ind]);
			fw.write(" ");	
		}				
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 54; ind <= 55; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 56; ind <= 71; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
		fw.write(String.valueOf(System.getProperty("line.separator")));
		for(int ind = 72; ind <= 73; ind++){
			
			fw.write(trameIP1[ind]);	
		}
		fw.write(" ");
		for(int ind = 74; ind <= 83; ind++){
			
			fw.write(trameIP1[ind]);	
			fw.write(" ");	
		}
				
		fw.write(String.valueOf(System.getProperty("line.separator")));
		fw.write(String.valueOf(System.getProperty("line.separator")));
			
		fw.close();
	    
	}
	catch (IOException exception){
		System.out.println("Erreur lors de la lecture :" + exception.getMessage());
	}
				    
	File f = new File ("./Ressources/EpreuveStegano2/LanceurStegano2.java");

	try
	{
		FileWriter fw = new FileWriter(f);

		fw.write("public class LanceurStegano2 {");
		fw.write(String.valueOf(System.getProperty("line.separator")));

		fw.write("public static void main(String[] args) {");
		fw.write(String.valueOf(System.getProperty("line.separator")));

		fw.write("EpreuveStegano2 epreuve = new EpreuveStegano2();");
		fw.write(String.valueOf(System.getProperty("line.separator")));
	

		fw.write("String keyword = ");
		fw.write("\"");
		fw.write(str);
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
	
	File f = new File(".\\Ressources\\EpreuveStegano2\\Executable.bat");
	if (f.exists()){
		try {
			Runtime.getRuntime().exec("cmd /c start .\\Ressources\\EpreuveStegano2\\Executable.bat");
			try {
				Thread.sleep(2500);
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