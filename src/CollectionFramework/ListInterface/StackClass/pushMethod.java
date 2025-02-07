package CollectionFramework.ListInterface.StackClass;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class pushMethod {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Harsh");   // adding element in stack
        st.push("Mukul");
        st.push("Kapil");
        st.push("Max");

        Collections.sort(st);

        Iterator<String> it = st.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
