package CollectionFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;

public class peekSeriesMethods {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.offer("I am");   // Inserting elements in a linked list
        ls.offer("Harsh");
        ls.offer("Mehra");

        System.out.println(ls);

        System.out.println(ls.peek());  // retrieves the head of the linked list

        System.out.println(ls.peekLast());  // retrieves the tail of the linked list
    }
}
