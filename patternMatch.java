/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rahul
 */
public class patternMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "{'fastitle':'Tfafitle', {'data':'Data', {'foo': 'Bar'}}}";
        String pat="\\{\"[a-zA-Z0-9]+\":\\[[a-zA-Z0-9]*";
        Pattern p=Pattern.compile(pat);
        Matcher m=p.matcher(text);
        if (m.find()) {
            System.out.println(m.group(0));
        }
        if(text.matches(pat))
            System.out.println("yo");
    }
}
