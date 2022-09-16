package com.ashish.mycalculator;
import java.util.*;
public class BST_insert {
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
    public static Node inesrt(Node root,int key)
    {
        if (root == null)
        {
            return new Node(key);
        }
        if (root.data > key)
        {
            root.left = inesrt(root.left,key);
        }
        else
        {
            root.right = inesrt(root.right,key);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println(inesrt(root,23));
    }
}
