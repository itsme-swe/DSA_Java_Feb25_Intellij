package CollectionFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class indexOfMethod {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(4);
        ls.add(12);
        ls.add(5);
        ls.add(10);
        ls.add(12);

        System.out.println(ls.indexOf(12));

        System.out.println(ls.lastIndexOf(12));
    }
}
