package com.ashish.mycalculator.temp;
import java.util.*;
public class ConvertBinaryTreeDLL {
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
    static Node prev,head = null;
    public static void ConvertDLL(Node root)
    {
        if (root == null)
        {
            return;
        }
        ConvertDLL(root.left);
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        ConvertDLL(root.right);
    }
    public static void Print(Node root)
    {
        while (root != null)
        {
            System.out.println(root.data+" ");
            root = root.right;
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);
        System.out.println("Double Linklist of Binary Tree ");
        ConvertDLL(root);
        Print(root);
    }
}
