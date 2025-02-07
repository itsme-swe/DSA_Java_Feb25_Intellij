package CollectionFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;
import java.util.List;

public class elementMethod {

    public static void main(String[] args) {

        LinkedList<Integer> ls = new LinkedList<>();

        ls.add(50);
        ls.add(10);
        ls.add(25);
        ls.add(2);
        ls.add(15);

        for (Integer ele : ls) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println("Head of list: " + ls.element());    // Returns the first element of Linked List


    }
}
