package ProducerConsumerExample;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {

	private final ArrayBlockingQueue<Integer> buffer;
	
	public BlockingBuffer() {
		buffer=new ArrayBlockingQueue<Integer>(1);
	}
	
	public void blockingPut(int value) throws InterruptedException{
		buffer.put(value);
		System.out.print("Producer writes : "+value+" Buffer cells occupied : "+buffer.size());
		
	}
	
	public int blockingGet() throws InterruptedException{
	    int returnedValue=buffer.take();
	    System.out.print("Consumer reades : "+returnedValue+" Buffer cells occupied : "+buffer.size());
	    
	    return returnedValue;
		
	}
	
	
}
