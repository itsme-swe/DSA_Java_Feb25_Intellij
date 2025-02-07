package CollectionFramework.ListInterface.LinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class descendingIterator {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Java");
        ls.add("Ruby");
        ls.add("C++");
        ls.add("Python");
        ls.add("GoLang");

        Iterator<String> it = ls.descendingIterator();  // Used to iterate over a linked list in reverse order

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}

// GoLang Python C++ Ruby Java
