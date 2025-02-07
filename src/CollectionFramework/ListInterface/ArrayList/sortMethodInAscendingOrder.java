package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortMethodInAscendingOrder {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(19);
        ls.add(17);
        ls.add(5);
        ls.add(12);
        ls.add(10);

        System.out.println("List before sorting: " + ls); // List before sorting: [19, 17, 5, 12, 10]

        Collections.sort(ls);

        System.out.println("List after sorting: " + ls); // List after sorting: [5, 10, 12, 17, 19]




    }
}
