package CollectionFramework.QueueInterface.DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class offerMethod {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(20);
        dq.offer(10);
        dq.offer(30);

        System.out.println(dq); // [20, 10, 30]

        dq.offerLast(40);   // add an element at the last in queue
        dq.offerFirst(5);   // add an element at the first in queue

        System.out.println(dq); // [5, 20, 10, 30, 40]




    }
}
