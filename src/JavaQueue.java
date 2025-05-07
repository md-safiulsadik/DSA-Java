import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {

        // Queue = FIFO data structure. First-In First-Out
        //         A collection designed for holding elements prior to processing
        //         Linear data structure
        //      enqueue = offer()
        //      dequeue = poll()

        Queue<String> queue = new LinkedList<>();

        queue.offer("MD");
        queue.offer("Safiul");
        queue.offer("Kafi");
        queue.offer("Sadik");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Ali"));
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}
