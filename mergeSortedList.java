/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

import GfG.node;

/**
 *
 * @author Rahul
 */
public class mergeSortedList extends LnkedList {
//    node head1;
//    node head2;

    public static void main(String[] args) {
        mergeSortedList l1 = new mergeSortedList();
        mergeSortedList l2 = new mergeSortedList();
//        mergeSortedList finalList = new mergeSortedList();

        l1.head = new node(13);
        l1.push(11);
        l1.push(7);
        l1.push(2);
        l1.push(1);
        l2.head = new node(14);
        l2.push(12);
        l2.push(8);
        l2.push(4);
        l2.push(3);
        l1.prntList();
        System.out.println("");
        l2.prntList();
        System.out.println("");

        l1.MergeLists(l1.head, l2.head);
        l1.prntList();
        System.out.println("");
        l2.prntList();
    }

    node MergeLists(node list1, node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        node head;
        if (list1.data < list2.data) {
            head = list1;
        } else {
            head = list2;
            list2 = list1;
            list1 = head;
        }
        while (list1.next != null) {
            if (list1.next.data > list2.data) {
                node tmp = list1.next;
                list1.next = list2;
                list2 = tmp;
            }
            list1 = list1.next;
        }
        if (list1.next == null) {
            list1.next = list2;
        }
        return head;
    }

}
