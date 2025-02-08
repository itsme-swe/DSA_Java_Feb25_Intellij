package CollectionFramework.SetInterface.LinkedHashSetClass;

import java.util.LinkedHashSet;

public class creatingLinkedHshSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();

        lh.add(20);
        lh.add(12);
        lh.add(25);

        System.out.println(lh); // [20, 12, 25]

        lh.addFirst(10);

        lh.addLast(30);

        System.out.println(lh); // [10, 20, 12, 25, 30]



    }
}
