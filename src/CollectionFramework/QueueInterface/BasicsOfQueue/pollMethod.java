package CollectionFramework.QueueInterface.BasicsOfQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class pollMethod {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.offer("Mahindra");
        q.offer("Lexus");
        q.offer("Toyota");
        q.offer("Suzuki");
        q.offer("Honda");

        System.out.println(q.peek());   // Mahindra first element

        System.out.println(q.poll());   // Removes the first element

        System.out.println(q);  // [Lexus, Toyota, Suzuki, Honda]

    }
}
