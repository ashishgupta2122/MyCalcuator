package com.ashish.mycalculator;
import java.util.*;
public class Check_For_BST {
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
    static Node prev = null;
    public static boolean BST(Node root)
    {
        if (root != null)
        {
            if (!BST(root.left))
            {
                return false;
            }
            if (prev != null && root.data <= prev.data)
            {
                return false;
            }
            prev = root;
        }
        return true;
    }
    static boolean isBST(Node root)
    {
        return BST(root);
    }
    public static void main(String[] args)
    {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        if(isBST(root))
        {
            System.out.println("Is BST");
        }
        else
        {
            System.out.println("Not a BST");
        }
    }
}
