package CollectionFramework.SetInterface.HashSetClass;

import java.util.HashSet;

public class containsMethod {

    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<>();

        st.add(5);
        st.add(12);
        st.add(15);
        st.add(10);
        st.add(20);

        System.out.println(st.contains(30));    // false bcoz element is not present

        System.out.println(st.isEmpty());   // false bcoz set is having elements

        st.clear(); // used to clear a set

        System.out.println(st.isEmpty()); // returns true bcoz now set is empty
    }
}
