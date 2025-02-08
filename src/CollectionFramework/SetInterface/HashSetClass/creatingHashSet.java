package CollectionFramework.SetInterface.HashSetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class creatingHashSet {

    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<>();

        st.add(10);
        st.add(10);
        st.add(5);
        st.add(10);
        st.add(40);
        st.add(20);
        st.add(30);

        Iterator<Integer> it = st.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // 20 5 40 10 30



    }
}
