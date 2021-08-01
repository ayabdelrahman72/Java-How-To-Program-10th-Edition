package CreatingThreeFromFive;

public class CreatingThreeFromFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="bathe";
      for(int x=0;x<3;x++) {
    	  for(int y=x+1;y<4;y++) {
    		  for(int z=y+1;z<5;z++)
    		  System.out.println(text.charAt(x)+""+text.charAt(y)+""+text.charAt(z));
    	  }
      }
	}

}
