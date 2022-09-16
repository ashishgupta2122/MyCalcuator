package com.ashish.mycalculator;
import java.util.*;
public class Size_Of_Binary_Tree {
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
    public static int Size(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return Size(root.left)+Size(root.right)+1;
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        System.out.println("Size of Binary Tree "+Size(root));
    }
}