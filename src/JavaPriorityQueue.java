import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                with the highest priorities first
        //				  before elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        

    }
}