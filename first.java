/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Find the first non-repeating character of the string.


package GfG;
import java.util.*;

/**
 *
 * @author Rahul
 */
public class first {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "geeksforgeeks";
        ArrayList <Character> alc = new ArrayList<>();
        ArrayList <Integer> aln = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(i);
            if (alc.contains(str.charAt(i))) {
//                System.out.println(str.charAt(i));
//                System.out.println(aln.get(str.charAt(i)));
                aln.set(alc.indexOf(str.charAt(i)), (aln.get(alc.indexOf(str.charAt(i)))+1));
            }
            else{
                alc.add(str.charAt(i));
                aln.add(1);
                
            }
        }
        System.out.println(aln);
        System.out.println(alc);
    }
}
