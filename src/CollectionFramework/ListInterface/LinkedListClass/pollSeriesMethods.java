package CollectionFramework.ListInterface.LinkedListClass;

import java.util.Collections;
import java.util.LinkedList;

public class pollSeriesMethods {

    public static void main(String[] args) {

        LinkedList<Integer> ls = new LinkedList<>();

        ls.add(10);
        ls.add(18);
        ls.add(11);
        ls.add(12);
        ls.add(15);

        System.out.println("Before sorting: " + ls);    // Before sorting: [10, 18, 11, 12, 15]

        Collections.sort(ls);

        System.out.println("After sorting: " + ls); // After sorting: [10, 11, 12, 15, 18]

        System.out.println(ls.poll());  // retrieves and remove the first element from a list

        System.out.println(ls); // [11, 12, 15, 18]

        System.out.println(ls.pollLast());

        System.out.println(ls); // [11, 12, 15]






    }
}
