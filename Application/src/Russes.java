import java.util.Scanner;

public class Russes {

	public static void main(String[] args) {
		
		System.out.println("Entrez le mot de passe voulu :");
	    Scanner sc = new Scanner(System.in);
	    String key = parseString(sc);
	    String[][] Table=cipherTable(key);
	    printTable(Table);	
	}
	
	public static String parseString(Scanner s){
	    String parse = s.nextLine();
	    parse = parse.toUpperCase();
	    parse = parse.replaceAll("[^A-Z]", "");
	    parse = parse.replace("J", "I");
	    return parse;
	  }
		
	private static void printTable(String[][] table) {
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table.length; j++){
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String[][] cipherTable(String key){
			    String[][] playfairTable = new String[5][5];
			    String keyString = key + "ABCDEFGHIKLMNOPQRSTUVWXYZ";
			    
			    // fill string array with empty string
			    for(int i = 0; i < 5; i++)
			      for(int j = 0; j < 5; j++)
			        playfairTable[i][j] = "";
			    
			    for(int k = 0; k < keyString.length(); k++){
			      boolean repeat = false;
			      boolean used = false;
			      for(int i = 0; i < 5; i++){
			        for(int j = 0; j < 5; j++){
			          if(playfairTable[i][j].equals("" + keyString.charAt(k))){
			            repeat = true;
			          }else if(playfairTable[i][j].equals("") && !repeat && !used){
			            playfairTable[i][j] = "" + keyString.charAt(k);
			            used = true;
			          }
			        }
			      }
			    }
			    return playfairTable;
		}	
	}
