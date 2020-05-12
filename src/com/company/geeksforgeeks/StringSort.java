package com.company.geeksforgeeks;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delims = "[ .',?!@]+";
        String[] items = s.split(delims);
        if(s == ""){
            System.out.println("0");
        }else{
            System.out.println(items.length);
        }
        for(int i=0; i< items.length;i++){
            System.out.println(items[i]);
        }
        scan.close();
    }
}
