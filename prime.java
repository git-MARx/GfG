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
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 0 to stop....\n"
                    + "enter key to be check...");
        while(true){
            
            int x = sc.nextInt();
            ArrayList <Integer> prime = new ArrayList <>();
            if (x==0||x==1) {
                return;
            }
            prime.add(2);
            for (int i = 2; i <= Math.pow(x, 0.5); i++) {
//                System.out.println(i +"--");
                for (int j = 0; j < prime.size(); j++) {
                    if (i%prime.get(j)!=0&&!prime.contains(i)) {
                        prime.add(i);
                    }
                }
            }
            boolean p =false;
            for (int i = 0; i < prime.size(); i++) {
                if (x%prime.get(i)==0) {
                    p=true;
                }
                
            }
            System.out.println(p? "not prime":"prime");
            
        }
    }
}
