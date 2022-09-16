package com.ashish.mycalculator.temp;
import java.util.*;
public class BinaryTreeInsert {
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
    public static Node Insert(Node root,int key)
    {
        if (root == null)
        {
            return new Node(key);
        }
        if (key < root.data)
        {
            root.left = Insert(root.left,key);
        }
        else {
            root.right = Insert(root.right,key);
        }
        return root;
    }
    public static void main(String[] args)
    {
        Node root = new Node(21);
        root.left = new Node(14);
        root.right = new Node(25);
        root.left.left = new Node(8);
        System.out.println(Insert(root,2));
    }
}
