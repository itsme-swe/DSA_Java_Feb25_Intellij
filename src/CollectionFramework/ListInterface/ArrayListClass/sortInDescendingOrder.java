package CollectionFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortInDescendingOrder {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(1);
        ls.add(15);
        ls.add(5);
        ls.add(10);
        ls.add(35);

        Collections.sort(ls, Collections.reverseOrder());

        System.out.println("List in descending order: " + ls);
    }
}

// List in descending order: [35, 15, 10, 5, 1]
