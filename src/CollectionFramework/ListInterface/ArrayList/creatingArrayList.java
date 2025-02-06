package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class creatingArrayList {

    public static void main(String[] args) {

        // Ref. Of List interface and object of concrete class ArrayList
        List<Integer> ls = new ArrayList<>();

        ls.add(20);
        ls.add(10);
        ls.add(40);
        ls.add(50);
        ls.add(60);

        System.out.println(ls);


    }
}
