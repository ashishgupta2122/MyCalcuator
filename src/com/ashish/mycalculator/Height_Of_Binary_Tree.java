package com.ashish.mycalculator;
import java.util.*;
public class Height_Of_Binary_Tree {
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
    public static int height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
       return Math.max(height(root.left),height(root.right)) + 1;
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right = new Node(3);
        System.out.println("Height of Binary Tree "+height(root));
    }
}