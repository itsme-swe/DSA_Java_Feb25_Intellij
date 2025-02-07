package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class containsMethod {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(2);
        ls.add(5);
        ls.add(1);
        ls.add(8);
        ls.add(10);

        System.out.println(ls.contains(10));    // returns true if an element is present otherwise returns false
    }
}
