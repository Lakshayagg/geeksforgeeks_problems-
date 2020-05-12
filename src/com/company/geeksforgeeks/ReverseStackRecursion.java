package com.company.geeksforgeeks;

import java.util.Stack;

public class ReverseStackRecursion {
    private static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {

        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");

        System.out.println(st);
        reverse();

        System.out.println("Reverse Stack");

        System.out.println(st);
    }

    public static void reverse() {
        if (st.size() > 0) {
            char ch = st.peek();
            st.pop();
            reverse();
            insertAtBottam(ch);
        }
    }

    private static void insertAtBottam(char ch) {
        if (st.isEmpty()) {
            st.push(ch);
        } else {
            char a = st.peek();
            st.pop();
            insertAtBottam(ch);
            st.push(a);
        }
    }
}
