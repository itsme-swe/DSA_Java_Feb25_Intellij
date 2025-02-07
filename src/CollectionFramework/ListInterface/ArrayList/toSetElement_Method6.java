package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class toSetElement_Method6 {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(20);
        ls.add(10);
        ls.add(5);
        ls.add(25);
        ls.add(10);

        ls.set(1,35);   // set an particular element at specified index value

        System.out.println(ls); // [20, 35, 5, 25, 10]

    }
}
