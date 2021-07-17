package PayableSystem;

public class ComissionEmployee extends Employee{
  private double grossSale;
  private double comissionRate;
  public ComissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double comissionRate)
  {
	  super(firstName, lastName, socialSecurityNumber);
	  this.comissionRate=comissionRate;
	  this.grossSale=grossSale;
  }
  @Override
  public double getPaymentAmount(){
	  return comissionRate*grossSale;
  }
  @Override
  public String toString() {
	  return String.format("Comission Employee: %s %n gorss sales: %,.2f %n commission rate : %,.2f",
			                                               super.toString(),grossSale,comissionRate);
  }
}
