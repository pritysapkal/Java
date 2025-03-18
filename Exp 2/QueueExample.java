import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding Elements to Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after additions: " + queue);

        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after removal: " + queue);

        System.out.println("Peeked element: " + queue.peek());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
