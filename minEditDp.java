/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class minEditDp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
        String str1 = "sunday";
        String str2 = "saturday";
        int res = edit(str1, str2, str1.length(), str2.length());
        System.out.println(res);

    }

    static int min(int a, int b, int c) {
        
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
        
    }

    static int edit(String str1, String str2, int m, int n) {
//        System.out.println(str1 + " " + str2 + " " + m + " " + n);
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
//                    System.out.println(i + " " + j + " " + dp[i][j] + " " + dp[i - 1][j - 1]);
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = min(dp[i][j - 1], dp[i - 1][j - 1], dp[i - 1][j]) + 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println("");
        }
        return dp[m][n];

    }
}
