package PayableSystem;

import java.util.InputMismatchException;

public class ComissionEmployee extends Employee{
  private double grossSale;
  private double comissionRate;
  public ComissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double comissionRate)throws InputMismatchException
  {
	  super(firstName, lastName, socialSecurityNumber);
	  if(comissionRate < 0.0)
		  throw new InputMismatchException("ComissionRate Must be greater than 0"); //generate Exception
	  if(grossSale < 0.0)
		  throw new InputMismatchException("GrossSale Must be greater than 0"); //generate Exception
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
