package CollectionFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class toArrayMethod {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(5);
        ls.add(20);
        ls.add(15);
        ls.add(10);

        Object[] arr = ls.toArray();    // Convert a list into an array but we need to use ref. Of Object class

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
