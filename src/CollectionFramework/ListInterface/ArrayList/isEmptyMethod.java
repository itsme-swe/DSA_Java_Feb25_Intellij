package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class isEmptyMethod {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        System.out.println(ls.isEmpty());   // Returns "true" if the list is empty

        ls.add(20);
        ls.add(10);

        System.out.println(ls.isEmpty());   // Now returning "false" bcoz, we added elements in a list
    }
}
