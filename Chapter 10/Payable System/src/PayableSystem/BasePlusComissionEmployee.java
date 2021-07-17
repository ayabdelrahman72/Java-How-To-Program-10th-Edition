package PayableSystem;

public class BasePlusComissionEmployee extends ComissionEmployee {
private double baseSalary;
public BasePlusComissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double comissionRate,double baseSalary) {
	super(firstName,lastName,socialSecurityNumber,grossSale,comissionRate);
	this.baseSalary=baseSalary;
}
public void increaseBaseSalary(int percent) {
	baseSalary+=(baseSalary*percent/100);
}
@Override 
public double getPaymentAmount(){
	return baseSalary +super.getPaymentAmount();
}
@Override
public String toString() {
	return String.format("base salaried : %s %n base salary : %,.2f",super.toString(),baseSalary);
}
}
