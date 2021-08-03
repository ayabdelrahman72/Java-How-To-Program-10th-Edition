package CountingDuplicateWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;


public class CountingDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="my banana is yellow but my ball is red";
		
		String []tokens=text.split(" ");
		List<String> myList= Arrays.asList(tokens);
		Set<String> hashSet= new HashSet<>(myList);
		System.out.print(tokens.length-hashSet.size());
	}

}
