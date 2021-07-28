package randomSentances;

import java.util.Random;

public class RandomSentances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance;
		String [] articles= {"the","a","one","some","any"};
		String [] nouns= {"boy","girl","dog","town","car"};
		String [] verbs= {"drove","jumped","ran","walked","skipped"};
		String [] prepositions= {"to","from","over","under","on"};
		int counter=20;
		Random rand = new Random(); //instance of random class
	      int randomIndex;
		while(counter>=0) {
		randomIndex=rand.nextInt(5);
		sentance=articles[randomIndex].substring(0,1).toUpperCase()+articles[randomIndex].substring(1)
		         +" "+nouns[randomIndex]+" "+verbs[randomIndex]+" "+prepositions[randomIndex];
		System.out.println(sentance);
		counter--;
		}

	}

}
