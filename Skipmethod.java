package Tasks;
import java.util.stream.Stream;
public class Skipmethod {
	    public static void main(String[] args) {
	        // Create a stream of integers from 1 to 10
	        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(100);

	        // Use the skip method to skip the first 5 elements
	        Stream<Integer> skippedStream = numbers.skip(8);

	        // Print the remaining elements
	        skippedStream.forEach(System.out::println);
	    }
	}


