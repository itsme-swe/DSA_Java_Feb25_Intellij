package CollectionFramework.ListInterface.StackClass;

import java.util.Stack;

public class peekAndPopMethod {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(2);
        st.push(10);
        st.push(8);
        st.push(15);

        System.out.println(st); // [5, 2, 10, 8, 15]


        System.out.println(st.peek());  // 15 -- Used to fetch the top element of stack

        System.out.println(st.pop());   // 15 -- Method return the top element and then removes it.

        System.out.println(st); // [5, 2, 10, 8]

    }
}
