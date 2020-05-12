package com.company.geeksforgeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n=s.nextInt();
        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i=0; i < n; i++){
            int t=s.nextInt();
            list[i]= new ArrayList<>();
            for(int j =0; j < t; j++){
                int m=s.nextInt();
                list[i].add(m);
            }
        }

        int q=s.nextInt();
        for( int i=0; i<q; i++){
            int y =s.nextInt();
            int x = s.nextInt();
            try{
                System.out.println(list[y-1].get(x-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
