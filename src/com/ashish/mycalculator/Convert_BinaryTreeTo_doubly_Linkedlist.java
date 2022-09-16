package com.ashish.mycalculator;
import java.util.*;
public class Convert_BinaryTreeTo_doubly_Linkedlist {
    public static class Node
    {
        int data;
        Node left,right;
        
        public  Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public static void convertToDLL(Node root)
    {
        Node prev = null;
        Node head = null;
        if (root == null)
        {
            return;
        }
        convertToDLL(root.left);
        if (prev == null)
        {
            head = root;
        }
        else
        {
            root.left = prev;
            root.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        convertToDLL(root);
    }
}
