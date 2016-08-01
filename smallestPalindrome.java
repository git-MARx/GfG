/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.*;

/**
 *
 * @author Rahul
 */
public class smallestPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
            for (int p = 0; p < t; p++) {
            
        
            String in = sc.next();
            int[] inp = new int[in.length()];
            boolean a = false;
            for (int i = 0; i < in.length() / 2; i++) {
                if (in.charAt(i)!=in.charAt(in.length()-1-i)) {
                    a = true;
                }
            }
            if (!a) {
                int f = Integer.parseInt(in);
                f=f+1;
                in = f+"";
            }
            for (int i = 0; i < in.length(); i++) {
                inp[i] = Integer.parseInt(in.charAt(i) + "");
            }

//            for (int i = 0; i < in.length(); i++) {
//                System.out.print(inp[i]);
//            }
            if (in.length() % 2 == 0) {
                for (int i = 0; i < in.length() / 2; i++) {
                    if (inp[(in.length() / 2) - (i + 1)] < inp[(in.length() / 2) + (i)]) {
                        inp[(in.length() / 2) - (i + 1)] = inp[(in.length() / 2) - (i + 1)] + 1;
                        for (int j = 0; j < in.length() / 2; j++) {
                            inp[(in.length() / 2) + (j)] = inp[(in.length() / 2) - (j + 1)];
                        }

                    } else {
                        for (int j = 0; j < in.length() / 2; j++) {
                            inp[(in.length() / 2) + (j)] = inp[(in.length() / 2) - (j + 1)];
                        }
                    }
                }
                for (int i = 0; i < in.length(); i++) {
                    System.out.print(inp[i]);
                }
                System.out.println("");
            } else {
                for (int i = 0; i < in.length() / 2; i++) {
                    if (inp[(in.length() / 2) - (i + 1)] < inp[(in.length() / 2) + (i + 1)]) {
                        inp[(in.length() / 2) - (i)] = inp[(in.length() / 2) - (i)] + 1;
                        for (int j = 0; j < in.length() / 2; j++) {
                            inp[(in.length() / 2) + (j + 1)] = inp[(in.length() / 2) - (j + 1)];
                        }

                    } else {
                        for (int j = 0; j < in.length() / 2; j++) {
                            inp[(in.length() / 2) + (j + 1)] = inp[(in.length() / 2) - (j + 1)];
                        }
                    }
                }
                for (int i = 0; i < in.length(); i++) {
                    System.out.print(inp[i]);
                }
                System.out.println("");
            }
//        for (int i = 0; i < in.length()/2; i++) {
//                    System.out.println(inp[(in.length()/2)+(i)]);
//
//        }

        }
    }
}
