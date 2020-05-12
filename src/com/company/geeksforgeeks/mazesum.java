package com.company.geeksforgeeks;

import java.util.Scanner;

public class mazesum {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int tar;
            tar=s.nextInt();
            int m;
            m=s.nextInt();
            int[][] num = new int[m][m];

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    num[i][j]=s.nextInt();
                }
            }
            System.out.println(count(num,m-1,m-1,tar));
        }
    }
    public static int count(int[][] nums,int i,int j,int tar){
        if(i==0&&j==0&&tar==0){
            return 1;
        }
        int con=0;
        if(i>1){
            tar-=nums[i][j];
            con+=count(nums,i-1,j,tar);
        }
        if(j>1){
            tar-=nums[i][j];
            con+=count(nums,i,j-1,tar);
        }

         return con;
    }
}
