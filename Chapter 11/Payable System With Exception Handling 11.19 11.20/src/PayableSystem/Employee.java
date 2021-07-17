package PayableSystem;

public abstract class Employee implements Payable {
	private final String firstName;
	private final String lastName;
	private final String socialSecuirtyNumber;
 public Employee(String firstName,String lastName,String socialSecurityNumber)  {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.socialSecuirtyNumber=socialSecurityNumber;
 }
 public String getFirsttName() {
	  return firstName;
 }
 public String getLastName() {
	  return lastName;
}
 public String getSocialSecurityNumber() {
	  return socialSecuirtyNumber;
}
  @Override
  public String toString() {
	  return String.format("%s %s %n Social Security Number : %s",firstName,lastName,socialSecuirtyNumber);
  }
 
 
 
}
