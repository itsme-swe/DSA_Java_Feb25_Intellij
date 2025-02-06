package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeMethod {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(20);
        ls.add(10);
        ls.add(5);
        ls.add(2);
        ls.add(30);

        // Traversing a list using iterator
        Iterator<Integer> it = ls.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 20 10 5 2 30

        System.out.println();

        ls.remove(3);

        System.out.print(ls);   // [20, 10, 5, 30]

    }
}
