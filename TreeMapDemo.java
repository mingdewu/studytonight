import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "Harry");
        map.put(3, "Simon");
        map.put(2, "Jessica");
        map.put(5, "Victor");
        map.put(1, "Justin");

        // Printing the TreeMap
        for (Entry<Integer, String> e : map.entrySet())
            System.out.println(e.getKey() + "-->" + e.getValue());
    }
}