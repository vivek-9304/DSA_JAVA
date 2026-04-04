package StackList;

import java.util.Stack;

public class Transversing_stack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i =1; i<=10; i++){
            st.push(i);
        }  // Print stack of 10 Natural numbers
        System.out.println("Normal : "+st);
        // Make a dummy variable to fill the stack
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        System.out.println("Transverse : "+st2);

        // To bring stack back to st variable
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
