package com.ashish.mycalculator.temp;
import java.util.*;
public class CheckBST {
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
    public static Node prev = null;
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
            BST(root.right);
        }
        return true;
    }
    public static void main(String[] args)
    {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        if (BST(root))
        {
            System.out.println("Is BST");
        }
        else
        {
            System.out.println("Is not BST");
        }
    }
}