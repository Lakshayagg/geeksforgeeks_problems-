package com.company.geeksforgeeks;

import java.util.Scanner;

public class geekprintparctice {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n;
        n=s.nextInt();
        int l=2*n-1;
        int[][] a= new int[l][l];
        int k=n;
        int top=0;
        int left=0;
        int bot=2*n-2;
        int right=2*n-2;
        while(top<=bot&&left<=right){
            for (int i = left; i <=right ; i++) {
                a[top][i]=k;
            }
            top++;
            for (int i = top; i <=bot ; i++) {
                a[i][right]=k;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                a[bot][i]=k;
            }
            bot--;
            for (int i = bot; i >=top ; i--) {
                a[i][left]=k;
            }
            left++;
            k--;
        }
        display(a);
    }
    public static void display(int[][] nums){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
