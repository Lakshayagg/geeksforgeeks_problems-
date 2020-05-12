package com.company.geeksforgeeks;

import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int[][] arr= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        rotateMatrix(arr,n);
        display(arr);
    }

    public static void rotateMatrix(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][n - i - 1];
                mat[j][n - i - 1] = mat[n - i - 1][n - j - 1];
                mat[n - 1 - i][n - j - 1] = mat[n - j - 1][i];
                mat[n - 1 - j][i] = temp;
            }
        }
    }
    public static void display(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
