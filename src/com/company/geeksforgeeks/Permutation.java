package com.company.geeksforgeeks;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        System.out.println(permu(n,k));
    }
    public static int permute(int n,int k){
        if(k==0||k==n){
            return 1;
        }
        return k*permute(n-1,k-1)+permute(n-1,k);
    }
    public static int permu(int n,int k){
        int[] mem=new int[n+1];
        mem[0]=1;
        for (int i = 1; i <=n ; i++) {
            mem[i]=mem[i-1]*(i);
        }

        return mem[n]/mem[n-k];
    }
}
