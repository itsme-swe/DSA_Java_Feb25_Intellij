package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class toAddInList_Method1 {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        // add() elements in list
        ls.add(20);
        ls.add(10);
        ls.add(5);
        ls.add(2);
        ls.add(30);

        // Enhanced Each loop to iterate over the list
        for(Integer ele : ls) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
