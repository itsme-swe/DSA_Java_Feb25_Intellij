package CollectionFramework.SetInterface.LinkedHashSetClass;

import java.util.LinkedHashSet;

public class removeElements {

    public static void main(String[] args) {

        LinkedHashSet<String> st1 = new LinkedHashSet<>();

        st1.add("Harsh");
        st1.add("Gaurav");
        st1.add("Vandana");

        st1.addFirst("Megha");

        System.out.println(st1);    // [Megha, Harsh, Gaurav, Vandana]

        System.out.println(st1.remove("Vandana"));  // returns true if an element removed from LinkedHash Set






    }
}
