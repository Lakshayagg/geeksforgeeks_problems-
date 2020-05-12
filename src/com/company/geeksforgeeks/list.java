package com.company.geeksforgeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String str = s.next();
            if (str.equals("Insert")) {
                int index = s.nextInt();
                int value = s.nextInt();
                list.add(index,value);
            }
            if(str.equals("Delete")){
                int index = s.nextInt();
                list.remove(index);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
    }
}
