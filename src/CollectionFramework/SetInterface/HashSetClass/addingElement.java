package CollectionFramework.SetInterface.HashSetClass;

import java.util.HashSet;

public class addingElement {

    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<>();

        st.add(5);
        st.add(12);
        st.add(15);
        st.add(10);
        st.add(20);

        System.out.println(st); // [20, 5, 10, 12, 15]

        System.out.println(st.remove(10));  // returns true if element has been removed from a set

        System.out.println(st); // [20, 5, 12, 15]


    }
}
