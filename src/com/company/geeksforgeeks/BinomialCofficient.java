package com.company.geeksforgeeks;

import java.util.Scanner;

public class BinomialCofficient {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        System.out.println(binomial(n,k));
        System.out.println(geeks(n,k));
//        System.out.println(binomialDP(n,k));
    }
    public static int binomial(int n,int k){
        int[] mem=new int[n];
        mem[0]=1;
        for (int i = 1; i <n ; i++) {
            mem[i]=mem[i-1]*(i+1);
        }
        int res=mem[n-1]/(mem[k-1]*mem[n-k-1]);
        return res;
    }
    public static int geeks(int n,int k){
        if(k==0||k==n){
            return 1;
        }
        return geeks(n-1,k-1)+geeks(n-1,k);
    }
//    public static int binomialDP(int n, int k){
//        int[][] c=new int[n][k];
//        for (int i = 0; i <=n ; i++) {
//            for (int j = 0; j <=Math.min(i,j); j++) {
//                if(j==0||j==n){
//                    c[i][j]=1;
//                }else{
//                    c[i][j] = c[i-1][j-1] + c[i-1][j];
//                }
//            }
//        }
//        return c[n][k];
//    }
}
