package Queue;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class DequeExample {
    static void main(String[] args) {
        // Queue example (FIFO) using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue after adds: " + queue);
        System.out.println("Queue peek: " + queue.peek()); // 1
        System.out.println("Queue poll: " + queue.poll()); // removes 1
        System.out.println("Queue after poll: " + queue);

        System.out.println();

        // Deque example (double-ended) using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);
        System.out.println("Deque after adds: " + deque);
        System.out.println("Deque peekFirst: " + deque.peekFirst()); // 5
        System.out.println("Deque peekLast: " + deque.peekLast());   // 20
        System.out.println("Deque removeFirst: " + deque.removeFirst()); // removes 5
        System.out.println("Deque removeLast: " + deque.removeLast());   // removes 20
        System.out.println("Deque after removes: " + deque);
    }
}
