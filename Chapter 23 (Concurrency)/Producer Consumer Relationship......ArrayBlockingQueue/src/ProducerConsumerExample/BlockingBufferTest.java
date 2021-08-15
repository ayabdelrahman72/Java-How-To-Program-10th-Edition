package ProducerConsumerExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ExecutorService executorservice= Executors.newCachedThreadPool();
		Buffer sharedLocation= new BlockingBuffer();
		
		executorservice.execute(new Producer(sharedLocation));
		executorservice.execute(new Consumer(sharedLocation));
		
		executorservice.shutdown();
		executorservice.awaitTermination(1, TimeUnit.MINUTES);

	}

}
