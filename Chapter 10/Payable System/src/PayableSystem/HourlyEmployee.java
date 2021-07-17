package PayableSystem;

public class HourlyEmployee extends Employee {
 private double wage;
 private double hours;
 public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours) {
	 super(firstName,lastName,socialSecurityNumber);
	 this.wage=wage;
	 this.hours=hours;
 }
 @Override
 public double getPaymentAmount() {
	 if(hours <=40)
		 return hours *wage;
	 else
		 return 40*wage+(hours-40)*wage*1.5;
 }
 @Override
 public String toString()
 {
	 return String.format("Hourly Employee : %s %n Hourly wage : %,.2f %n Hourly worked : %,.2f",
			                                      super.toString(),wage,hours);
 }
}
