package com.company.geeksforgeeks;

import java.lang.String;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateParanthesies {
    public static void main(String[] args) {
        String str;
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for (int i = 0; i < n; i++) {
            str = s.nextLine();
            System.out.println();
            if (duplicateParan(str)) {
                System.out.println("Duplicates Found");
            } else {
                System.out.println("No Duplicates Found");
            }
        }
    }

    private static boolean duplicateParan(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                char top = stack.peek();

                stack.pop();
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = stack.peek();
                    stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        return false;
    }
}
