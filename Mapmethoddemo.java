package Tasks;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Mapmethoddemo {
	
	    public static void main(String[] args) {
	        // Sample list of strings
	        List<String> names = Arrays.asList("Prasad", "ravi", "Bharath", "ramu");

	        // Use the map method to convert names to uppercase
	        List<String> uppercaseNames = names.stream()
	                .map(name -> name.toUpperCase())
	                .collect(Collectors.toList());

	        System.out.println("Original names list: " + names);
	        System.out.println("Uppercase names: " + uppercaseNames);
	    }
	
}
