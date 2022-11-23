import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapSortingDemo {
    public static void main(String args[]) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("one", 1);
        unsortedMap.put("two", 2);
        unsortedMap.put("three", 3);
        unsortedMap.put("four", 4);
        unsortedMap.put("five", 5);
        System.out.println("Printing the Unsorted HashMap");
        for (Entry<String, Integer> e : unsortedMap.entrySet()) {
            System.out.println(e.getKey() + "-->" + e.getValue());
        }
        // Creating an ArrayList with the HashMap keys
        ArrayList<String> sortedList = new ArrayList<>(unsortedMap.keySet());
        Collections.sort(sortedList);// Sorting the ArrayList
        System.out.println("\nPrinting the Alphabetically Sorted Keys");
        for (String s : sortedList) {
            System.out.println(s + "-->" + unsortedMap.get(s));
        }
    }
}
