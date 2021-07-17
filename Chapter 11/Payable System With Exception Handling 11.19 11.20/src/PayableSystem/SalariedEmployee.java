package PayableSystem;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	public SalariedEmployee(String firstName,String lastName,String socoilSecurityNumber,double weeklySalary) {
		super(firstName,lastName,socoilSecurityNumber);
		if(weeklySalary >0.0)
		this.weeklySalary=weeklySalary;
		else
			throw new IllegalArgumentException("weekly salary must be greatar than or equal 0.0");
	}
	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary >0.0)
			this.weeklySalary=weeklySalary;
			else
				throw new IllegalArgumentException("weekly salary must be greatar than or equal 0.0");
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	@Override 
	public double getPaymentAmount(){
		return getWeeklySalary();
	}
	@Override
	public String toString() {
		return String.format("Salaried Employee : %s %n Weekly Salary : %.2f", super.toString(),getWeeklySalary());
	}
	
}
