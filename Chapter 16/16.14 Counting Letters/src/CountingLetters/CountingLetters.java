package CountingLetters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
public class CountingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Map<String,Integer> myMap= new HashMap<>();
          createMap(myMap);
          displayMap(myMap);
          
         
          
	}

	private static void createMap(Map<String, Integer> myMap) {
		
		// TODO Auto-generated method stub
		int counterFortokens=0;
		System.out.println("Enter String");
		String string="aya abdelrahman mahmoud";
		String [] tokens=string.split(" ");
	
		for(String token : tokens) {
			while(counterFortokens<token.length()) {
				//counterForCharacters+=1;
			   
			    if(myMap.containsKey(String.valueOf(token.toLowerCase().charAt(counterFortokens))))
				{
			            int count=myMap.get(String.valueOf(token.toLowerCase().charAt(counterFortokens)));
			            myMap.put(String.valueOf(token.toLowerCase().charAt(counterFortokens)),count+1);
				}
		else
			 myMap.put(String.valueOf(token.toLowerCase().charAt(counterFortokens)),1);
			    counterFortokens+=1;
		
	}//ending while
			counterFortokens=0;
			}
			
			
		
		
	}
	public static void displayMap(Map<String,Integer> myMap) {
		Set<String> keys= myMap.keySet();
		TreeSet<String> sortedKey=new TreeSet<>(keys);
		for(String key: sortedKey)
			System.out.println(key + " : "+myMap.get(key));
	}

}
