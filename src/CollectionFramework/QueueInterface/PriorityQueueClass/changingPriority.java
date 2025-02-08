package CollectionFramework.QueueInterface.PriorityQueueClass;

import java.util.PriorityQueue;

public class changingPriority {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        pq.offer(20);
        pq.offer(5);
        pq.offer(10);
        pq.offer(15);
        pq.offer(30);

        System.out.println(pq); // [30, 20, 10, 5, 15]

        System.out.println(pq.peek());  // 30 -- now here highest element has the highest priority

    }
}
