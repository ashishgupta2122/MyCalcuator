package com.ashish.mycalculator;
import java.util.*;
import java.io.*;
public class BST {
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
    public static boolean search(Node root,int key)
    {
        if (root == null)
        {
            return false;
        }
        if (root.data == key)
        {
            return true;
        }
        if (root.data > key)
        {
            return search(root.left,key);
        }
        else
        {
            return search(root.right,key);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(40);

        System.out.println(search(root,90));
    }
}
