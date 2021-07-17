package PayableSystem;

public class Date {
 private int month,day,year;
 private final int [] daysPerMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
 public Date(int day,int month,int year) {
	 
	 if(month <=0 || month>12)
		 throw new IllegalArgumentException("month ("+ month +"must be 1-12");
	 
	  if(day <=0 || (day >daysPerMonth[month]&& !(day==29 && month ==2)))
		  new IllegalArgumentException("day ("+day+"( out of range for the specified month and year");
	  
	  if(month==2 && day ==29 && !(year%400==0 || (year%4 ==0 && year%100!=0 )))
         throw new IllegalArgumentException("day ("+day+"( out of range for the specified month and year");
	  this.month=month;
	  this.day=day;
	  this.year=year;
 }
 @Override
 public String toString() {
	 return String.format("%n day : %d month: %d year: %d %n",day,month,year);
 }
 
}
