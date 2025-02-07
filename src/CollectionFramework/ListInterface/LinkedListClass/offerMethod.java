package CollectionFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;
import java.util.List;

public class offerMethod {

    public static void main(String[] args) {

        LinkedList<Integer> ls = new LinkedList<>();

        ls.offer(10);
        ls.offer(20);
        ls.offer(30);

        System.out.println(ls); // [10, 20, 30]

        ls.offerFirst(5);   // insert element in first

        ls.offerLast(40);   // insert element from last

        System.out.println(ls); // [5, 10, 20, 30, 40]



    }
}
