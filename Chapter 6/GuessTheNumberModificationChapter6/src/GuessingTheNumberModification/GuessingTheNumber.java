package GuessingTheNumberModification;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingTheNumber {
     private  final SecureRandom randomNumber= new SecureRandom();
      int rNumber=1+randomNumber.nextInt(1000);
     int continueThegame=1;
     public void guessTheNumber(int number) {
    	 Scanner input = new Scanner(System.in);
    	 int numberOfGuessing=0;
 
    	while(number !=-1) {
    	if(rNumber<number) {
    		System.out.print("the number is lower than your guessing : ");
    		numberOfGuessing+=1;
    		number=input.nextInt();	
    	}
    	else if(rNumber>number) {
    		System.out.print("the number is higher than your guessing : ");
    		numberOfGuessing+=1;
         	number=input.nextInt();	
    	}else {
    		if(numberOfGuessing<10)
    		System.out.print("Congratulations !You Guessed The correct Number ..You know the secret \n");
    		else
    			System.out.print("Congratulations !You Guessed The correct Number.. but You should be able to do it better next time \n");
    		System.out.print("If you wanna play again enter another guessing or -1 to end : ");
        	number=input.nextInt();	
        	rNumber=1+randomNumber.nextInt(1000);
        	numberOfGuessing=0;    	}
    	}
    	
    	
     }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GuessingTheNumber obj= new GuessingTheNumber();
		 System.out.print("Enter Your First Guessing Number : ");
		 int firstGuessingNumber=input.nextInt();
		obj.guessTheNumber(firstGuessingNumber);
		

	}

}
