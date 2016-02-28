import java.util.Scanner;

	public class Playfair{
	 
	  private static String [][] table;
	  
 	  public static String deuxiemeIndice (String keyword, String motDePasse) {
		  
		    while(keyword.equals(""))
		    System.out.println();
		    table = cipherTable(keyword);
		    
		    printTable(table);
		    String a=motDePasse;
		    String b=convertirMotDePasse(table, a);
		    System.out.println(b);
		    return b;
	  }
	  
	  
	  public static String convertirMotDePasse (String playfair[][], String motDePasse) {
		  String[] splitArray = motDePasse.split("");
		  int lmot=motDePasse.length();
		  String m=null;
		  String k=null;
		  String l=null;
		  for (int a=0; a<lmot;a++) {
			  for (int i=0; i<5; i++) {
				  for (int j=0; j<5; j++) {
					  if (splitArray[a].equals(playfair[i][j])) {
						  k=Integer.toString(i+1);
						  l=Integer.toString(j+1);
						  k=k+l; 
					  }  
				  }
			  }
			  if (a==0) {m=k+" ";}
			  else {m=m+k+" ";}
		  }
		  return m;
	  }

	  public static String parseString(Scanner s){
		  String parse = s.nextLine();
		  parse = parse.toUpperCase();
		  parse = parse.replaceAll("[^A-Z]", "");
		  //parse = parse.replace("J", "I");
		  return parse;
	  }
	  
	  public static String CorrectString(String s){
		    s = s.toUpperCase();
		    s = s.replaceAll("[^A-Z]", "");
		    s = s.replace("J", "I");
		    return s;
		  }
	  
	  private static String[][] cipherTable(String key){
	    key=key.replace("J", "I");
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
	  
	  // prints the cipher table out for the user
	  private static void printTable(String[][] printedTable){
	    System.out.println("This is the cipher table from the given keyword.");
	    System.out.println();
	    
	    for(int i = 0; i < 5; i++){
	      for(int j = 0; j < 5; j++){
	        System.out.print(printedTable[i][j]+" ");
	      }
	      System.out.println();
	    }
	    System.out.println();
	  }
	}
