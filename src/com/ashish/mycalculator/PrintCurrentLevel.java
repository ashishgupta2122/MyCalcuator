package com.ashish.mycalculator;
import java.util.*;
public class PrintCurrentLevel {
    public static class Node
    {
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    void printCurrentLevel(Node root, int level)
    {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    public static int print(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return root.data;
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

    }
}
