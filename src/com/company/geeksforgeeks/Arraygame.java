package com.company.geeksforgeeks;

import java.util.Scanner;

public class Arraygame {
    public static boolean canWin(int leap, int[] game) {
        int i = 0;
        int n = game.length;
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (game[i + 1] == 0 && i < n - 1) {
                i++;
                count++;
            }
            if (i + leap < n) {
                if (game[i + leap] == 0) {
                    i = i + leap;
                    count += leap;
                }
            }
            if (game[i - 1] == 0 && i >= 1) {
                i--;
                count--;
            }
        }
        if (count == n - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
