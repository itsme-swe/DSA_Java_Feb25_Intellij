package CollectionFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;
import java.util.List;

public class addElementInLinkedList {

    public static void main(String[] args) {

        List<Integer> ls = new LinkedList<>();

        ls.add(10);
        ls.add(30);
        ls.add(20);

        System.out.print(ls);   // [10, 30, 20]


        System.out.println();

        ls.addFirst(5);
        ls.addLast(15);

        System.out.println(ls); // [5, 10, 30, 20, 15]

    }
}
