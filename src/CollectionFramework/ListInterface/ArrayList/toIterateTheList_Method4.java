package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class toIterateTheList_Method4 {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(10);
        ls.add(1);
        ls.add(30);
        ls.add(5);
        ls.add(12);
        ls.add(25);

        Iterator<Integer> it = ls.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}

// 10 1 30 5 12 25
