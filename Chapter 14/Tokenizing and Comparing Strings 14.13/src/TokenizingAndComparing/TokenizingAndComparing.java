package TokenizingAndComparing;

import java.util.Scanner;

public class TokenizingAndComparing {

	public static void main(String[] args) {
		String text="my banana is yellow but my ball is red";
		String [] tokens;
		tokens=text.split(" ");
		for(String token : tokens) {
			//System.out.println(token);
			if(token.startsWith("b")==true) {
				System.out.println(token);
			}
		}
		

	}

}
