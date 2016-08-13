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
        ll.head = new node(10);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(20);
        ll.push(2);
        ll.push(1);
        ll.push(0);
//        ll.append(2);
//        ll.append(3);
//        ll.append(4);
//        ll.append(5);
//        ll.append(6);
//        ll.insertAfter(ll.head, 8);
//        
//        ll.insertAfterNodeNo(1, 0);
//        ll.prntList();
//        System.out.println("");
//        ll.deleteByKey(5);
//        ll.prntList();
//        System.out.println("");
//        ll.deleteByPosition(3);
        ll.prntList(ll.head);
        System.out.print("length = " + ll.getLength() + "\n");
//        ll.head = ll.reverseList(ll.head);
//        ll.prntList();
        ll.mrgesort(ll.head);
        ll.prntList(ll.head);
    }

    node reverseList(node head) {
        node current = head, prev = null, nxt = null;
        int count = 0;
        while (count < 3 && current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
//            count++;                        // uncomment for interval reversal of interval 3
        }
//        if (nxt!=null) {                    // uncomment for interval reversal of interval 3
//            head.next=reverseList(nxt);
//        }
        return prev;
    }
    public node mrgesort(node head){
        System.out.println("Sorted List by Merge sort :");
        head=MergeSort(head);
        return head;
    }
    public node MergeSort(node headOriginal) {
        if (headOriginal == null || headOriginal.next == null) {
            return headOriginal;
        }
        node a = headOriginal;
        node b = headOriginal.next;
        while ((b != null) && (b.next != null)) {
            headOriginal = headOriginal.next;
            b = (b.next).next;
        }
        b = headOriginal.next;
        headOriginal.next = null;
//        prntList(a);
//        System.out.println("b:"); prntList(b);
        return merge(MergeSort(a), MergeSort(b));

    }

    public node merge(node a, node b) {
        node temp = new node(0);
        node head = temp;
        node c = head;
        while ((a != null) && (b != null)) {
            if (a.data <= b.data) {
                c.next = a;
                c = a;
                a = a.next;
            } else {
                c.next = b;
                c = b;
                b = b.next;
            }
        }
        c.next = (a == null) ? b : a;
        return head.next;
    }

    void push(int data) {
        node new_node = new node(data);
        new_node.next = head;
        head = new_node;
    }

    int getLength() {
        int count = 0;
        node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    // head is position 1, head.next is 2 .......

    void deleteByPosition(int count) {
        if (head == null) {
            return;
        }
        node temp = head, prev = null;
        int c = 0;
        while (c < count - 1) {
            prev = temp;
            temp = temp.next;
            c++;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    // head is position 1, head.next is 2 .......
    void insertAfterNodeNo(int count, int data) {
        int c = 0;
        node new_node = new node(data);
        node tnode = head;
        while (tnode != null) {
//            System.out.println(c +"=" + tnode.data);
            if (c == count - 1) {
                insertAfter(tnode, data);
            }
            c++;
            tnode = tnode.next;

        }
    }

    void deleteByKey(int data) {
        node temp = head, prev = null;
        if (temp != null && temp.data == data) {
            head = head.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
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

    void prntList(node head) {
        node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println("");
    }
}
