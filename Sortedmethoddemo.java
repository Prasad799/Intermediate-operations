package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Sortedmethoddemo {
	    public static void main(String[] args) {
	        // Create a list of strings
	        List<String> names = new ArrayList<>();
	        names.add("Prasad");
	        names.add("mathew");
	        names.add("Bharath");
	        names.add("Raju");

	        // Sort the names in ascending order
	        List<String> ascendingOrder = names.stream()
	                .sorted()
	                .collect(Collectors.toList());

	        // Sort the names in descending order
	        List<String> descendingOrder = names.stream()
	                .sorted((s1, s2) -> s2.compareTo(s1))
	                .collect(Collectors.toList());

	        System.out.println("Original list of names: " + names);
	        System.out.println("Names sorted in ascending order: " + ascendingOrder);
	        System.out.println("Names sorted in descending order: " + descendingOrder);
	    }
	
}
