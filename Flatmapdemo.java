package Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Flatmapdemo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Create a list of lists to simulate a multi-level collection
	        List<List<Integer>> listOfLists = new ArrayList<>();

	        // Read input from the user and populate the list of lists
	        for (int i = 0; i < 3; i++) {
	            List<Integer> innerList = new ArrayList<>();
	            System.out.println("Enter numbers for inner list " + (i + 1) + " (separate by spaces):");
	            String inputLine = scanner.nextLine();
	            String[] numbers = inputLine.split(" ");
	            
	            for (String number : numbers) {
	                innerList.add(Integer.parseInt(number));
	            }
	            listOfLists.add(innerList);
	        }

	        // Use flatMap to flatten the list of lists into a single list
	        List<Integer> flattenedList = listOfLists.stream()
	                .flatMap(List::stream)
	                .collect(Collectors.toList());

	        System.out.println("Original list of lists: " + listOfLists);
	        System.out.println("Flattened list: " + flattenedList);

	        scanner.close();
	    }
	
}
