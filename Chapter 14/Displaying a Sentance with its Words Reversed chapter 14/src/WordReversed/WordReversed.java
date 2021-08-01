package WordReversed;

public class WordReversed {

	public static void main(String[] args) {
		//First solution using StringBuilder to reverse the order of tokens and the tokens itself
		StringBuilder buffer= new StringBuilder("My name is aya");
		buffer.reverse();
		System.out.println(buffer);
		
		
		//Second Solution using String class to reverse the tokens itself NOT its order
		String s1= new String("My name is aya");
		String [] tokens=s1.split(" ");
		for(String token :tokens) {
			for(int counter =token.length()-1;counter>=0;counter--) {
				System.out.print(token.charAt(counter));
			}
			System.out.print(" ");
		}
		System.out.println();
		
		//Third Solution using String Class to reverse the order of the tokens 
		String s2= new String("My name is aya");
		String [] tokens2=s2.split(" ");
		for(int counter =tokens2.length-1;counter >=0 ;counter--) {
			   System.out.print(tokens[counter]+" ");
		}

	}

}
