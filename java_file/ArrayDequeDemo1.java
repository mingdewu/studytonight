import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo1 {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<Integer>();
        deck.addFirst(5);
        deck.addFirst(10);
        System.out.println("Deque After Inserting using addFirst(): " + deck);

        deck.offerFirst(15);
        deck.offerFirst(20);
        System.out.println("Deque After Inserting using offerFirst(): " + deck);
    }
}