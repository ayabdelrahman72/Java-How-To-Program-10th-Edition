package PayableSystem;

import java.util.InputMismatchException;

public class payableInterfaceTest {
      
	public static void main(String[] args) {
		
	    Employee [] employees = new Employee[4];
	    
		employees[0]=new SalariedEmployee("aya", "abdelrahman", "a123", 2000);
		employees[3]=new HourlyEmployee("hussein", "mahmoud","h928",98.67,200.34);
		
		
		try {
		employees[2]= new ComissionEmployee("ali", "ahmed", "ali292", 9, 10);
		

		}
		//catching InputMisMatchException
		catch(InputMismatchException misMatchException) {
			System.out.print("Comission Employee Object is not created cause "+misMatchException);
		}
		//this is for catching any other exceptions that might occur and printing PrintStackTrace to know what happened in details
		catch(Exception exception) {
			exception.printStackTrace();
		}
		try {
			employees[1]=new BasePlusComissionEmployee("hoda","mohamed", "h1937", 202.2, -1,29);
			
		
			}
			catch(InputMismatchException misMatchException) {
				System.out.print("Base Plus Comission Employee Object is not created cause "+misMatchException);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		
		
	  
		
		for(Employee currentEmployee : employees) {
			if(currentEmployee !=null) {
			if (currentEmployee instanceof BasePlusComissionEmployee){
				BasePlusComissionEmployee basePlusComEmp=(BasePlusComissionEmployee) currentEmployee;
			     basePlusComEmp.increaseBaseSalary(10);  
				}
			System.out.printf("%n %s %n PaymentAmount %,.2f %n %n",currentEmployee,currentEmployee .getPaymentAmount());
		}}
	
	    		
		
	

}
}
