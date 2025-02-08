package CollectionFramework.SetInterface.LinkedHashSetClass;

import java.util.LinkedHashSet;

public class getElements {

    public static void main(String[] args) {

        LinkedHashSet<String> st1 = new LinkedHashSet<>();

        st1.add("Harsh");
        st1.add("Gaurav");
        st1.add("Vandana");

        LinkedHashSet<String> st2 = new LinkedHashSet<>();

        st2.add("5");
        st2.add("15");
        st2.add("10");

        System.out.println(st1.addAll(st2));

        System.out.println(st1);    // [Harsh, Gaurav, Vandana, 5, 15, 10]

        System.out.println(st1.getFirst()); // Harsh

        System.out.println(st1.getLast());  // 10




    }
}
