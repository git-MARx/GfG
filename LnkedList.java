/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

/**
 *
 * @author Rahul
 */
class node {

    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

public class LnkedList {

    node head;

    public static void main(String[] args) {
        LnkedList ll = new LnkedList();
        ll.head = new node(1);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        ll.push(0);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.insertAfter(ll.head, 8);
        
        ll.insertAfterNodeNo(1, 0);
        ll.prntList();
        System.out.println("");
        ll.deleteByKey(5);
        ll.prntList();
        System.out.println("");
        ll.deleteByPosition(3);
        ll.prntList();
        System.out.print("\nlength = "+ll.getLength() +"\n");
        ll.reverseList();
        ll.prntList();
        
    }
    void reverseList(){
        node current = head,prev=null,nxt=null;
        while(current!=null){
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
        head=prev;
    }
    void push(int data) {
        node new_node = new node(data);
        new_node.next = head;
        head = new_node;
    }
    int getLength(){
        int count =0;
        node temp = head;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        return count;
    }
    // head is position 1, head.next is 2 .......
    
    void deleteByPosition(int count){
        if (head == null)
            return;
        node temp=head,prev=null;
        int c=0;
        while(c<count-1){
            prev=temp;
            temp=temp.next;
            c++;
        }
        if (temp==null) {
            return;
        }
        prev.next=temp.next;
    }
    
    // head is position 1, head.next is 2 .......
    
    void insertAfterNodeNo(int count, int data) {
        int c = 0;
        node new_node = new node(data);
        node tnode = head;
        while (tnode != null) {
//            System.out.println(c +"=" + tnode.data);
            if (c==count-1) {
                insertAfter(tnode, data);
            }
            c++;
            tnode = tnode.next;
            
        }
    }
    void deleteByKey(int data){
        node temp=head,prev=null;
        if (temp!=null&&temp.data==data) {
            head=head.next;
            return;
        }
        while(temp!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }
        if (temp==null) {
            return;
        }
        prev.next=temp.next;
    }
    void append(int data) {
        node new_node = new node(data);
        if (head == null) {
            head = new_node;
            head.next = null;
        } else {
            node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;

        }

    }

    void insertAfter(node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("Previous node can't be null");
            return;
        }
        node new_node = new node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void prntList() {
        node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
}
