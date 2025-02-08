package CollectionFramework.QueueInterface.PriorityQueueClass;

import java.util.PriorityQueue;

public class creatingPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);    // inserting elements in priority queue
        pq.offer(25);
        pq.offer(12);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq.poll());  // 5 -- a min value element has the highest priority
    }
}
