package DuplicateElimination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;



public class DuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> firstNames= new ArrayList<String>();
		int noOfNames;
		String searchValue;
		Scanner input = new Scanner(System.in);
		
		//storing in the arraylist
		System.out.println("Enter the number of names you will add");
		 noOfNames=input.nextInt();
		 while(noOfNames>0) {
			firstNames.add(input.next());
			noOfNames--;
		 }
		 
		 //eliminate duplicate value by putting the values in hashset
		Set<String> values= new HashSet<String>(firstNames);
		
		//printing the unique values
		for(String value : values)
			System.out.println(value);
		
		 //searching for specific value
		System.out.println("Enter the value that you are looking for ");
		 searchValue=input.next();
		 if(values.contains(searchValue))
			 System.out.println("YES");
		 else
			 System.out.print("NO");
		
		 
		
			

	}

}
