package CollectionFramework.QueueInterface.BasicsOfQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class offerMethod {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);    // used to add an element inside queue
        q.offer(1);
        q.offer(5);
        q.offer(20);

        System.out.println(q);
    }
}
