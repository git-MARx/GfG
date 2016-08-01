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
public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n2 = sc.nextInt();
            int n1 = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int result[][] = new int [n2+1][n1+1];
            for (int j = 0; j < n1+1; j++) {
                result[0][j]=0;
            }
            for (int j = 0; j < n2+1; j++) {
                result[j][0]=0;
            }
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    System.out.println(s1.charAt(j)+"=="+s2.charAt(k));
                    if (s1.charAt(j)==s2.charAt(k)) {
                    result[j+1][k+1]=result[j][k]+1;
                }
                else{
                    result[j+1][k+1]=Math.max(result[j+1][k], result[j][k+1]);
                }
                }
            }
            
            
            
            System.out.println(result[n2][n1]);
        }
    }
}
