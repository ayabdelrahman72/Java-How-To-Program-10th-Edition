package AirlineReservationSystem;

import java.util.Scanner;

public class ReservationSystem {
	 private static int totalseatsNumber=10;
	private static boolean [] firstClass=new boolean [totalseatsNumber];
	private static boolean [] economyClass= new boolean[totalseatsNumber];
	 static Scanner input = new Scanner(System.in);
	  private static int userChoice;
	 private static  int availableSeatFirst=0;
	  private static int availableSeatEconomy=0;
	  
	public static void reservation() {
		
		if(availableSeatEconomy <totalseatsNumber && availableSeatFirst <totalseatsNumber)
		System.out.print("For choosing first Class please press 1 for Economy Class press 2");
		else
			if(availableSeatEconomy <totalseatsNumber) 
				System.out.print("We only have seats in Economy class for reserving press 2");
			else
				if(availableSeatFirst<totalseatsNumber)
				System.out.print("We only have seats in Economy class for reserving press 1");
				else
					System.out.print("All the seats are FULL ! next flight leaves in 3 hours ");
				
		userChoice=input.nextInt();
		switch(userChoice) {
		case 1:
			
				firstClass[availableSeatFirst]=true;
				availableSeatFirst+=1;
			
			break;
		case 2:
			
				economyClass[availableSeatEconomy++]=true;
			
			break;
		default:
			
			
		}
		if(userChoice==1)
		System.out.printf("Your seat is number : %d at First Class",availableSeatFirst);
		else
			System.out.printf("Your seat is number : %d at Economy Class",availableSeatEconomy);
			
			
		
	}
	public static void Snapshoot() {
		System.out.print("First Class seats : \n");
		for(int seatNumber=0;seatNumber<totalseatsNumber;seatNumber++) {
			System.out.printf("%2d : ",seatNumber+1);
			   if(firstClass[seatNumber]==true)
				   System.out.print("Reserved");
			   System.out.print("\n");
			
		}
		System.out.print("Economy Class seats : \n");
		for(int seatNumber=0;seatNumber<totalseatsNumber;seatNumber++) {
			System.out.printf("%2d : ",seatNumber+1);
			   if(economyClass[seatNumber]==true)
				   System.out.print("Reserved");
			   System.out.print("\n");
			
		}
	}

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		int userInput=1;
		
		while(userInput !=-1) {
			 ReservationSystem.reservation();
			
			System.out.print(" \n For reserving another seat press 1 or -1 to end ");
			 userInput=input.nextInt();
		}
		ReservationSystem.Snapshoot();
		input.close();
		 

	}

}
