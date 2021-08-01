package SearchingStrings;

import java.util.Arrays;
import java.util.Scanner;



public class SearchingStrings {
	public static void main(String[] args) {
		int  []alphabet = new int[25];
		Arrays.fill(alphabet, 0);
		String text;
		Scanner input = new Scanner(System.in);
		text=input.next();
		input.close();
		for(int counter =0;counter<text.length();counter++) {
			    alphabet[text.toLowerCase().charAt(counter)%97]+=1;  
		}
		for(int counter =97;counter<122;counter++) {
		    System.out.println((char)counter+" : "+ alphabet[counter%97] );
		   
		
	}
}}
