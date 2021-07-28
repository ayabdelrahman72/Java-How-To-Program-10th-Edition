package perfectNumber;

public class PerfectNumber {
       public static void perfectNumber(int number) {
    	   //i started from 1 cause cause all the numbers can be divided by one
    	   int sum=1;
       
    		     for(int i=2;i<=number/2;i++) {
    		    	 if(number%i==0)
    		    		 sum+=i;
    		    	 //cause if sum is larger than the number of this number not perfect number so making more iteration is useless
    		    	 if(sum>number)
    		    		 break;
    		     }
    		     if(sum==number)
    		    	 System.out.print(number+" is perfecr number and sum is : "+sum+"\n");
    		    
    	   
    	   
       }
	public static void main(String[] args) {
		int numbers=2;
	
	     while(numbers<1000) {
	    	 PerfectNumber.perfectNumber(numbers);
	    	 numbers++;
	     }

	}

}
