package collection.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicQueue {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.add("F");
        System.out.println(queue);

        System.out.printf("Peek: %s\n", queue.peek());
        System.out.printf("Poll: %s\n", queue.poll());
        System.out.printf("Offer: %s\n", queue.offer("1000"));
        System.out.println(queue);
    }
}
