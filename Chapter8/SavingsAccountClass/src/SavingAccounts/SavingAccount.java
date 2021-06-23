package SavingAccounts;

public class SavingAccount {
     public static double annualInterestRate;
     private double savingBalance;
     public  void calculateMonthlyInterest() {
    	 savingBalance+=((savingBalance*annualInterestRate)/100)/12;
     }
     public static void modifyInterestRate(double annualIterest) {
    	 annualInterestRate=annualIterest;
     }
     public double getSavingBalance() {
    	 return savingBalance;
    	 
     }
     public void  setSavingBalance(double savingBalance) {
    	if(savingBalance >=0) {
    		this.savingBalance=savingBalance;
    	}
    	else {
    		this.savingBalance=0;
    		throw new IllegalArgumentException("You can't entered the balance in negative value your balance now is ZERO \n");
    	}
     }
   

	public static void main(String[] args) {
		SavingAccount saver1= new SavingAccount();
		SavingAccount saver2= new SavingAccount();
		try {
			saver1.setSavingBalance(2000);
			
		}catch(Exception e) {
			System.out.printf("An Exception has accurred in Saver1 : %n %s",e.getMessage());
		}
		try {
			saver2.setSavingBalance(-392);
		}
		catch(Exception e) {
		System.out.printf("An Exception has accurred in Saver2 : %n %s",e.getMessage());
		}
		modifyInterestRate(5);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf(" Saver 1 : %.2f \n",saver1.getSavingBalance());
		System.out.printf(" Saver 2 : %.2f",saver2.getSavingBalance());

	}


}
