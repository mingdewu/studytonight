import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo3 {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<Integer>();
        deck.addLast(5);
        deck.addLast(10);
        deck.addLast(15);
        deck.addLast(20);
        System.out.println("Deque After Insertion: " + deck);

        Integer i1 = deck.removeFirst();
        System.out.println("Deleted Element: " + i1);
        System.out.println("Deque after Deletion: " + deck);

        Integer i2 = deck.pollFirst();
        System.out.println("Deleted Element: " + i2);
        System.out.println("Deque after Deletion: " + deck);
    }
}