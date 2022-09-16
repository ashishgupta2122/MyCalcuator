package com.ashish.mycalculator;
import java.util.*;
public class BinaryTreeToDLL {
    public static Node root;

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
    public static void ConvertDLL(Node root)
    {
        Node prev = null;
        Node head = null;

        if (root == null)
        {
            return;
        }
        ConvertDLL(root.left);
        if (prev == null)
        {
            head = root;
        }
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        ConvertDLL(root.right);
    }
    public static void PrintBT(Node root)
    {
        while (root != null)
        {
            System.out.print(root.data+" ");
            root = root.right;
        }
    }
    public static void main(String[] args)
    {
        BinaryTreeToDLL tree = new BinaryTreeToDLL();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        ConvertDLL(root);
        PrintBT(root);
    }
}
