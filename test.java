package GfG;

import GfG.node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rahul
 */
public class test extends LnkedList {

    public static void main(String[] args) {
        test x = new test();
        x.head = new node(6);
        x.push(5);
        x.push(4);
        x.push(3);
        x.push(2);
        x.push(1);
//        x.fun(x.head);
        x.treverse(x.head);
    }

    void fun(node c) {
        if (c == null) {
            return;
        }
        System.out.println(c.data);
        if (c != null) {
            fun(c.next.next);
        }
        System.out.println("-" + c.data);

    }

    void treverse(node x){
        if(x.next==null){
            System.out.println(x.data);
//            x=x.next;
        }
        while(x.next!=null){
            System.out.println(x.data);
            x=x.next;
        }
        
    }
}
