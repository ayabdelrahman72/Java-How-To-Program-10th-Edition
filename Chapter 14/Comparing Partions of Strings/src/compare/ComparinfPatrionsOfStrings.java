package compare;

import java.util.Scanner;

public class ComparinfPatrionsOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1,s2;
            int start,end;
            Scanner input = new Scanner(System.in);
            s1=input.next();
            s2=input.next();
            System.out.println("Input the number of characters to be compared and the starting point");
            end=input.nextInt();
            start=input.nextInt();
            end+=(start-1);
            if(s1.regionMatches(true,start,s2,start,end))
            	System.out.print("True");
            else
            	System.out.print("false");
            input.close();
            
	}

}
