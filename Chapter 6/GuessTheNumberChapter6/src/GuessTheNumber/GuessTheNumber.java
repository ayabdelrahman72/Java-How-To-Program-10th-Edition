package GuessTheNumber;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
     private  final SecureRandom randomNumber= new SecureRandom();
      int rNumber=1+randomNumber.nextInt(1000);
     int continueThegame=1;
     public void guessTheNumber(int number) {
    	 Scanner input = new Scanner(System.in);
 
    	while(number !=-1) {
    	if(rNumber<number) {
    		System.out.print("the number is lower than your guessing : ");
    		number=input.nextInt();	
    	}
    	else if(rNumber>number) {
    		System.out.print("the number is higher than your guessing : ");
         	number=input.nextInt();	
    	}else {
    		System.out.print("Congratulations.You Guessed The number \n If you wanna play again enter another guessing or -1 to end : ");
        	number=input.nextInt();	
        	rNumber=1+randomNumber.nextInt(1000);
    	}
    	}
    	
    	
     }
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		GuessTheNumber obj= new GuessTheNumber();
		 int firstGuessingNumber=input.nextInt();
		 System.out.print("Enter Your First Guessing Number");
		obj.guessTheNumber(firstGuessingNumber);
		

	}

}
