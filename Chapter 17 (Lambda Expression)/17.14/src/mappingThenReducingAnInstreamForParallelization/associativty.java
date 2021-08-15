package mappingThenReducingAnInstreamForParallelization;
import java.util.stream.IntStream;
public class associativty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] values= {1,2,3,4};
           
           System.out.printf("%d",IntStream.of(values).map(value->value*value).sum());
	}

}
