package ParkingCharge;

public class ParkingCharge {
    private static double fees=2.00;
   
     public static double caclculateCharges(double hours) {
    	
    	   if(hours>3.00) {
    		   //here i subtracted 3 from hours cause the first 3 hours is already calculated for 2.00 fees
    		     hours-=3;
    		     double temp=fees+(hours*.5);
    		     fees=temp>10.00 ?10.00:temp;
    	   }
    	 
    	 return fees;
     }
	public static void main(String[] args) {
	           System.out.print( ParkingCharge.caclculateCharges(22)); 
	}

}
