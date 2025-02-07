package CollectionFramework.ListInterface.StackClass;

import java.util.Stack;

public class searchMethod {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Lexus");
        st.push("Camry");
        st.push("Fortuner");
        st.push("Scorpio N");

        System.out.println(st.search("Camry")); // 3 -- Return the index value if an element present

        System.out.println(st.search("Honda")); // And, return -1 if an element is not present
    }
}
