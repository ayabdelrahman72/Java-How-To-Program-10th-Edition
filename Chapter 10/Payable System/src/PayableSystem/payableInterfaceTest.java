package PayableSystem;

public class payableInterfaceTest {

	public static void main(String[] args) {
	    Employee [] employees = new Employee[4];
	    
		employees[0]=new SalariedEmployee("aya", "abdelrahman", "a123", 2000);
		employees[1]=new SalariedEmployee("hussein", "mahmoud", "a123", 2000);
		//System.out.printf("%s",payable[0].toString());
		employees[2]= new ComissionEmployee("ali", "ahmed", "ali292", 200.6, 200);
	  
		employees[3]=new BasePlusComissionEmployee("hoda","mohamed", "h1937", 202.2, 150.23, 4000);
		for(Employee currentEmployee : employees) {
			if (currentEmployee instanceof BasePlusComissionEmployee){
				BasePlusComissionEmployee basePlusComEmp=(BasePlusComissionEmployee) currentEmployee;
			     basePlusComEmp.increaseBaseSalary(10);
			}
			System.out.printf("%s %n PaymentAmount %,.2f %n %n",currentEmployee,currentEmployee .getPaymentAmount());
		}
	    		
		
	

}
}
