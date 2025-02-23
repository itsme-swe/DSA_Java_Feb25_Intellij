package Arrays.TwoDimensional.BasicsOfTwoDimensionalArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class twoDimensionalArrayList {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();   // 1D ArrayList

        l1.add(10);
        l1.add(20);
        l1.add(30);

        List<Integer> l2 = new ArrayList<>();

        l2.add(40);
        l2.add(50);
        l2.add(60);

        List<Integer> l3 = new ArrayList<>();

        l3.add(5);
        l3.add(25);
        l3.add(15);

        List<List<Integer>> al = new ArrayList<>(); // 2D ArrayList

        al.add(l1);
        al.add(l2);
        al.add(l3);

        // Iterator to traverse an 2D ArrayList
        Iterator<List<Integer>> it = al.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }

        // [10, 20, 30][40, 50, 60][5, 25, 15]

        System.out.println();

        System.out.println(al.get(1).get(1));   // 50
    }
}
