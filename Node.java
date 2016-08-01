/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GfG;

import java.util.Stack;

/**
 *
 * @author Rahul
 */
public class Node {

    int key;
    Node left, right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.key);
        printInorder(root.right);
    }

    void printPostorder(Node root) {
        if (root == null) {
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.key);

    }

    void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }
    
    void printPreorder() {
        printPreorder(root);
    }
    void hieght(){
        int x = hieght(root);
        System.out.println(x);
    }
    int hieght(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lhieght = hieght(root.left);
            int rhieght = hieght(root.right);
            if (lhieght > rhieght) {
                return lhieght + 1;
            } else {
                return rhieght + 1;
            }
        }

    }

    void printLevel(Node root, int hieght) {
        if (root == null) {
            return;
        }
        if (hieght == 1) {
            System.out.print(root.key);
        } else if (hieght > 1) {
            printLevel(root.left, hieght - 1);
            printLevel(root.right, hieght - 1);
        }
    }

    void printLevelorder() {
        int hieght = hieght(root);
        for (int i = 0; i <= hieght; i++) {
            printLevel(root, i);
        }
    }
    int getMaxWidth(Node root){
        int width = 0,maxWidth=0,h = hieght(root);
        for (int i = 0; i <= h; i++) {
            width = getWidth(root,i);
            if (width>maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }
    int getWidth(Node root, int hieght){
        if (root == null) {
            return 0;
        }
        if (hieght==1) {
            return 1;
        }
        else if (hieght>1) {
            return getWidth(root.left, hieght-1)+getWidth(root.right, hieght-1);
        }
        return 0;
    }
    void getMaxWidth(){
        System.out.println(getMaxWidth(root));
    }
    void inorder_stack() {
        if (root == null) {
            return;
        }
        Node node = root;
        Stack<Node> st = new Stack<>();
        while(node!=null){
            st.push(node);
            node=node.left;
        }
        while (!st.isEmpty()) {
            node =st.pop();
            System.out.print(node.key);
            if (node.right!=null) {
                node = node.right;
                
                while(node!=null){
                    st.push(node);
                    node=node.left;
                }
            }
        }
    }
    void printKDistant(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.print(node.key + " ");
            return;
        } else {
            printKDistant(node.left, k - 1);
            printKDistant(node.right, k - 1);
        }
    }
    void printKDistant(){
        printKDistant(root,2);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

        System.out.println("\nLevelorder traversal of binary tree is ");
        tree.printLevelorder();

        System.out.println("\nInorder with stack traversal of binary tree is ");
        tree.inorder_stack();
        System.out.println("");
        System.out.println("Hieght Of tree is");
        tree.hieght();
        System.out.println("Width of tree is");
        tree.getMaxWidth();
        System.out.println("Leaf at K-th distance from root");
        tree.printKDistant();
    }

}
