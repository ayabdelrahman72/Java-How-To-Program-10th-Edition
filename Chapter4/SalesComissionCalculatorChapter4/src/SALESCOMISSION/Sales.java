package SALESCOMISSION;

import java.util.Scanner;


public class Sales {
	private double totalSales=0;
	private double totalSalaryPerWeek;
	public void addItems(int itemNumber) {
		   if(itemNumber==1)
			   totalSales+=239.99;
		   else
		   if(itemNumber==2)
			   totalSales+=129.75;
		   else
		   if(itemNumber==3)
			   totalSales+=99.95;
		   else
		   if(itemNumber==4)
			   totalSales+=350.89;
		   else
		   {
			   System.out.print("Please enter a correct item number \n");
			   
		   }
			   
	}
	public double getSalary() {
		totalSalaryPerWeek=200+(totalSales*9/100);
		return totalSalaryPerWeek;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sales person1= new Sales();
		int itemNumber;
		System.out.print("Please enter the item number to calculate the salary and -1 to end");
		itemNumber=input.nextInt();
		while(itemNumber != -1) {
			person1.addItems(itemNumber);
			itemNumber=input.nextInt();
		}
		System.out.printf("The total Salary per week is %.2f",person1.getSalary());
		
	}
	
	

}
