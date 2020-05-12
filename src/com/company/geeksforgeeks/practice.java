package com.company.geeksforgeeks;

import java.util.Scanner;

public class practice {
//    public static void main(String[] args) {
////        int n = 6;
////        int sum = 0;
////        int[][] a= new int[n][n];
////        Scanner s = new Scanner(System.in);
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                a[i][j]=s.nextInt();
////            }
////        }
////        int max=0;
////        for (int i = 0; i < n - 2; i++) {
////            for (int j = 0; j < n - 2; j++) {
////
////                for (int k = i; k < i+3; k++) {
////                    for (int l = j; l < j+3; l++) {
////                        if (i!=i+1){
////                            sum += a[k][l];
////                        }
////
////                        if()
////                    }
////                }
////                if(sum>max){
////                    max=sum;
////                }
////                sum=0;
////            }
////        }
////        System.out.println(sum);
////    }
//
//
////        Scanner s = new Scanner(System.in);
////        int n;
////        n = s.nextInt();
////        int m;
////        int t1=0;
////        int s1=0;
////        for (int i = 0; i < n; i++) {
////            m=s.nextInt();
////            t1=2*m+(m+1)*(m+1)-m*m-4;
////             s1 +=t1;
////            System.out.println(s1);
////        }
//
//        Scanner scan = new Scanner(System.in);
//
//
//        int i = scan.nextInt();
//
//        double d = scan.nextDouble();
//
//
//        String s = scan.nextLine();
//
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//
//    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str;
        str= s.nextLine();
        System.out.println(subseq("",str,0));
    }
    public static int subseq(String processed, String unprocessed,int count) {
        if (unprocessed.isEmpty()) {
            if(checkCB(processed)){
                count++;
            }
            return count;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subseq(processed, unprocessed,count);
        subseq(processed + ch, unprocessed,count);
         return count;
    }
    public static boolean checkCB(String processed){
        int ch=0;
        int flag =0;
        for (int i =2; i<ch ;i++ ){
            if(ch%i==0){
                flag=1;
                break;
            }else{
                flag=0;
            }
        }
        if(flag==0){
            return true;
        }else{
            return false;
        }
    }


}
