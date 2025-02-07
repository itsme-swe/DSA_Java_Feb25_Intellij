package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class toCopyElements_Method3 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

       ls.add("Harsh");
       ls.add("Mukul");
       ls.add("Juhu");

       List<String> ls2 = new ArrayList<>();

       ls2.add("Vandana");
       ls2.add("Gaurav");
       ls2.add("Megha");

       ls.addAll(ls2);  // Copy all elements of ls2 inside ls.

        System.out.println(ls); // [Harsh, Mukul, Juhu, Vandana, Gaurav, Megha]

        ls.removeAll(ls2);  // removes all ls2 elements from ls.

        System.out.println(ls); // [Harsh, Mukul, Juhu]


    }
}
