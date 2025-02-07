package CollectionFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class toGetElement_Method5 {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(2);
        ls.add(5);
        ls.add(1);
        ls.add(8);
        ls.add(10);

        System.out.println(ls.get(3));  // Returns an element present at index

        System.out.println(ls.getFirst());  // Returns first element of a list

        System.out.println(ls.getLast());   // Returns last element of a list

    }
}
