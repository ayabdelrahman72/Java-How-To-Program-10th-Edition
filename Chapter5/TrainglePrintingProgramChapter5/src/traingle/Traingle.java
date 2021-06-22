package traingle;

public class Traingle {
    public static void traingleA() {
    	for(int i=0;i<6;i++) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.print("\n");
    	}
    }
    public static void traingleB() {
    	for(int i=6;i>=0;i--) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.print("\n");
    	}
    }
    public static void traingleC() {
    	for(int i=6;i>=0;i--) {
    		System.out.print(" ");
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.print("\n");
    	}
    }
    public static void traingleD() {
    	for(int i=0;i<6;i++) {
    	
    		for(int j=6;j>i;j--) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.print("\n");
    	}
    }
	public static void main(String[] args) {
		Traingle.traingleA();
		System.out.print("\n");
		Traingle.traingleB();
		System.out.print("\n");
		Traingle.traingleC();
		System.out.print("\n");
		Traingle.traingleD();
		
		
		

	}

}
