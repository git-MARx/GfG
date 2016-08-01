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
public class minEdit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.length() > str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;

            }
            char st1[] = new char[str2.length()];
            char st2[] = new char[str2.length()];
            for (int i = 0; i < str2.length(); i++) {
                st1[i] = str2.charAt(i);
                st2[i] = '1';
            }
            int j=0;
            for (int i = 0; i < str1.length(); i++) {
                for (; j < str2.length(); j++) {
                System.out.println("i= "+i+" j="+j);
                    if (str1.charAt(i) == st1[j]) {
                        st2[j] = st1[j];
                    System.out.println(st2[j]);
                    j++;
                        break;
                    }
                }
            }
        System.out.println(st2.length);
            int cnt = 0;
            for (int i = 0; i < st2.length; i++) {
                if (st2[i] == '1') {
                    cnt++;
                }
                System.out.println(st2[i]);
            }
            System.out.println(cnt);
        }
    }
}
