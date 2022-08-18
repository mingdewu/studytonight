import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo2 {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<Integer>();
        deck.addLast(5);
        deck.addLast(10);
        System.out.println("Deque After Inserting using addLast(): " + deck);

        deck.offerLast(15);
        deck.offerLast(20);
        System.out.println("Deque After Inserting using offerLast(): " + deck);
    }
}