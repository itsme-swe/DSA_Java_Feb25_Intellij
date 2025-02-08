package CollectionFramework.QueueInterface.PriorityQueueClass;

import java.util.PriorityQueue;

public class peekAndPollMethod {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(5);
        pq.offer(10);
        pq.offer(15);
        pq.offer(30);

        for (Integer ele : pq) {
            System.out.print(ele + " ");
        }
        System.out.println();   // 5 15 10 20 30

        System.out.println(pq.peek()); // 5 -- returns the high priority element

        System.out.println(pq.poll());  // 5 -- returns the high priority element and then removes from the queue

        System.out.println(pq); // [10, 15, 30, 20]

    }
}
