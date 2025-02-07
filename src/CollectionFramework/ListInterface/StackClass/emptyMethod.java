package CollectionFramework.ListInterface.StackClass;

import java.util.Stack;

public class emptyMethod {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Harsh");   // adding element in stack
        st.push("Mukul");

        System.out.println(st.empty()); // method return true is stack is empty, else false
    }
}
