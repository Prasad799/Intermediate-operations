package Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Distinctymethoddemo {
	    public static void main(String[] args) {
	        // Create a list with duplicate elements
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(2);
	        numbers.add(4);
	        numbers.add(1);
	        numbers.add(5);
	        
	        // Use the distinct method to remove duplicates
	        List<Integer> distinctNumbers = numbers.stream()
	                .distinct()
	                .collect(Collectors.toList());

	        System.out.println("Original list: " + numbers);
	        System.out.println("List with duplicates removed: " + distinctNumbers);
	    }
	}


