package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueExample {
    static void main(String[] args) {
        // creating a priority queue
        // By default, Java's PriorityQueue is a min-heap, meaning the smallest element has the highest priority.
        Queue<Integer> pq = new PriorityQueue<>();
        // adding elements to the priority queue
        pq.add(30);
        pq.add(10);
        pq.add(1);
        pq.add(20);
        pq.add(5);
        System.out.println("Priority Queue after adds: " + pq);


        // peeking the top element
        System.out.println("Priority Queue peek: " + pq.peek()); // 5

        // polling (removing) the top element
        System.out.println("Priority Queue poll: " + pq.poll()); // removes 5
        System.out.println("Priority Queue after poll: " + pq);

        // polling all elements to show the order
        System.out.println("Polling all elements in order:");
        while (!pq.isEmpty()) {
            if (pq.size() == 2) break;
            System.out.println(pq.poll());
        }

        // Final Priority Queue
        System.out.println("Final Priority Queue: " + pq);

    }
}
