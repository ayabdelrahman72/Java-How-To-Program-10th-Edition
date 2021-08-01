package SearchingStrings;

public class SearchingStrings {

	public static void main(String[] args) {
		
		//Solution 1 without using indexOf method
             String s1= new String("my name is aya");
             int occurrency=0;
             char searchCharacter='a';
             for(int counter =0;counter<s1.length();counter++) {
                 if(s1.charAt(counter)==searchCharacter)
                	 occurrency+=1;
             }
             System.out.println(occurrency);
             
        //Solution 2 using indexOf method 
             String s2= new String("my name is aya");
             int occurrency2=0;
             int lastOccuracy;
             char searchCharacter2='a';
             for(int counter =0;counter<s1.length();counter++) {
            	 lastOccuracy=s2.indexOf(searchCharacter2, counter);
            	  if(lastOccuracy!=-1)
            	  {     counter=lastOccuracy;
                        occurrency2+=1;
                         
            	  }else
            		  break;
             }
             System.out.print(occurrency2);
	}

}
