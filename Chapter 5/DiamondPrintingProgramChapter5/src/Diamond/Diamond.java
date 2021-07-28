package Diamond;

public class Diamond {
          public static void printDiamond(int number) {
        	  int half=number/2;
        	  int flag=1;
        	 
        	      for(int x=1;x<=5;x++) {
        	    	  for(int y=half;y>0;y--) {
        	    		  System.out.print(" ");
        	    	  }
        	    	 for(int z=1;z<=flag;z++) {
        	    		  System.out.print("*");
        	    	  }
        	    	 
        	    	  System.out.print("\n");
        	    	  half--;
        	    	  flag+=2;
        	      }
        	      
        	    /*  flag=number-2;
        	      for(int x=0;x<=4;x++) {
        	    	  for(int y=half;y>0;y--) {
        	    		  System.out.print("");
        	    	  }
        	    	 for(int z=flag;z>=0;z++) {
        	    		  System.out.print("*");
        	    	  }
        	    	 
        	    	  System.out.print("\n");
        	    	  half++;
        	    	  flag-=2;
        	    	  
        	      }
        	      */
        	  
        	  
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond.printDiamond(9);

	}

}
