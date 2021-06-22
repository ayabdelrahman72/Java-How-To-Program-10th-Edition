package factorial;

public class factorial {
      public long calculateFactorial(int number) {
    	  long result=1;
    	  while(number>1) {
    		  result*=number;
    		  number--;
    	  }
    	  
    	  return result;
      }
	public static void main(String[] args) {
		factorial obj=new factorial();
		System.out.print(obj.calculateFactorial(4));

	}

}
