package CollectionFramework.QueueInterface.DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class creatingDeque {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(20);
        dq.offer(10);
        dq.offer(30);
        dq.offer(15);

        Iterator<Integer> it = dq.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
