/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;
import java.util.*;
/**
 *
 * @author Rahul
 */
 class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            int[]ar = new int[n];
            int []size = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j]=sc.nextInt();
                size[j] =1;
            }
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (ar[k]<ar[j] && (size[k]+1)>=size[j]) {
                        size[j]=size[k]+1;
                    }
                }
            }
            Arrays.sort(size);
            System.out.println(size[n-1]);
        }
    }
}
