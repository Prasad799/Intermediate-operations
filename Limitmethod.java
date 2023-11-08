package Tasks;
import java.util.stream.Stream;
public class Limitmethod {
	    public static void main(String[] args) {
	        // Create a stream of integers from 1 to 10
	        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(10);

	        // Use the limit method to restrict the stream to the first 5 elements
	        Stream<Integer> limitedStream = numbers.limit(20);

	        // Print the limited elements
	        limitedStream.forEach(System.out::println);
	    }
	}

