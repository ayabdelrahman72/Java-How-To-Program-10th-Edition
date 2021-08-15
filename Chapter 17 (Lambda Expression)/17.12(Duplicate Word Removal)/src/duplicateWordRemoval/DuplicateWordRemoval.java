package duplicateWordRemoval;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateWordRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String [] sentance= {"my","Ball","is","white","but","your","ball","is","red"};
             List<String> list=Arrays.asList(sentance);
             list.stream().map(String::toLowerCase).distinct().sorted().forEach(value->System.out.println(value));
             
             
             
             
	}

}
