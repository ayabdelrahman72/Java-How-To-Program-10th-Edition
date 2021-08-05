package ProducerConsumerExample;

import java.security.SecureRandom;

public class Producer implements Runnable {
  private final  Buffer sharedlocation;
  private final SecureRandom randomNumber= new SecureRandom();
  
  Producer(Buffer sharedLocation){
	  this.sharedlocation=sharedLocation;
  }
	
	public void  run(){
		int sum=0;
		for(int count=1;count<=10;count++) {
			try {
				Thread.sleep(randomNumber.nextInt(5000));
				sharedlocation.blockingPut(count);
				sum+=count;
				System.out.println(" sum is : "+sum);
				
			}catch(InterruptedException exp) {
				Thread.currentThread().interrupt();
			}
			
		}
		System.out.println("Producer done producing terminating producing");
		
	}
}
