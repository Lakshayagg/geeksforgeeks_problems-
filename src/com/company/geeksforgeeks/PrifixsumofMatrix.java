package com.company.geeksforgeeks;

public class PrifixsumofMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};
        sum(a);
    }

    public static void sum(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum+=a[i][j];
                if(i>0){
                    a[i][j]=sum+a[i-1][j];
                }

                if(i==0&&j>0){
                    a[i][j]+=a[i][j-1];
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
