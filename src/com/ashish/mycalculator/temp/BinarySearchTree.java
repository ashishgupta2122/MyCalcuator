package com.ashish.mycalculator.temp;
import java.util.*;
public class BinarySearchTree {
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
    public static boolean BST(Node root,int key)
    {
        if (root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        if (root.data > key)
        {
            return BST(root.left,key);
        }
        else
        {
            return BST(root.right,key);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(18);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        System.out.println(BST(root,30));
    }
}
