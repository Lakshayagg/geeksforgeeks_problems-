package com.company.geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial100 {
    public static void main(String[] args) {
        int  n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        System.out.println(fact(n));
    }
    static BigInteger fact(int n){
        BigInteger bt = new BigInteger("1");
        for (int i = 2; i <= n ; i++) {
            bt=bt.multiply(BigInteger.valueOf(i));
        }
        return bt;
    }
}
