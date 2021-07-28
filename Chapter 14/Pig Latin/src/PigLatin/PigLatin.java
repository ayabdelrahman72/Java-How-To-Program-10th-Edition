package PigLatin;

public class PigLatin {
      public static void printLatinWord(String englishSentance) {
    	  String [] pigLatin=englishSentance.split(" ");
    	  String temp;
    	  for(int counter=0;counter<pigLatin.length;counter++) {
    		temp=pigLatin[counter].substring(1)+pigLatin[counter].substring(0,1)+"ay";
    			System.out.print(temp+" ");
    		
    	  }
      }
	public static void main(String[] args) {
		printLatinWord("my name is aya");
		
             
	}

}
