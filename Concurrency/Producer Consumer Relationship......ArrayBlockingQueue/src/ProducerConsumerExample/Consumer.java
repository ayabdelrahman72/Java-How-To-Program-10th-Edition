package ProducerConsumerExample;

import java.security.SecureRandom;

public class Consumer implements Runnable {
  private final SecureRandom randomNumber= new SecureRandom();
  private final Buffer sharedLocation;
  
     Consumer(Buffer sharedLocation){
    	 this.sharedLocation=sharedLocation;
     }
     
     public void run() {
    	 int sum=0;
    	 for(int count=1;count<=10;count++) {
    		 try {
    			 Thread.sleep(randomNumber.nextInt(5000));
    			 sum+=sharedLocation.blockingGet();
    			 System.out.println("sum is "+sum);
    			 
    		 }catch(InterruptedException exp)
    		 {
    			 Thread.currentThread().interrupt();
    		 }
    		 
    	 }
    	 
     }
}
