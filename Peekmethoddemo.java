package Tasks;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Peekmethoddemo {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> doubledNumbers = numbers.stream()
	                .map(number -> number * 2)
	                .peek(doubledNumber -> System.out.println("Doubling: " + doubledNumber))
	                .collect(Collectors.toList());

	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Doubled numbers: " + doubledNumbers);
	    }
	}


