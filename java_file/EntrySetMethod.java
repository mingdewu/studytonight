import java.util.*;

public class EntrySetMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Justin");
        map.put(102, "Jessica");
        map.put(103, "Simon");
        map.put(104, "Harry");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Map.Entry<Integer, String> e : entrySet)
            System.out.println(e.getKey() + "--->" + e.getValue());
    }
}
