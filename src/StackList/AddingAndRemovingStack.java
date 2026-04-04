package StackList;

import java.util.Stack;

public class AddingAndRemovingStack {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();
        // Adding five elements in stack
        st.push("H");st.push("E");st.push("L");st.push("L");st.push("O");
        System.out.println(st+" and size : "+st.size());
        // deleting two elements from stack
        st.pop(); st.pop();
        System.out.println(st+" and size : "+st.size());
        // see the last element
        System.out.print(st.peek());
    }
}
