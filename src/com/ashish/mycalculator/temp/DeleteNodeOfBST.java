package com.ashish.mycalculator.temp;
import java.util.*;
public class DeleteNodeOfBST {
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
    public static int Min(Node root)
    {
        int minvalue = root.data;
        while (root.left != null)
        {
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;
    }
    public static Node delete(Node root,int key)
    {
        if (root == null)
        {
            return root;
        }
        if (key < root.data)
        {
            root.left = delete(root.left,key);
        }
        else if (key > root.data)
        {
            root.right = delete(root.right,key);
        }
        else
        {
            if (root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }
            root.data = Min(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }
    public static void main(String[] args)
    {
        Node root = new Node(30);
        root.left = new Node(28);
        root.right = new Node(40);
        root.left.left = new Node(20);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(25);
        root.left.left.left.left = new Node(5);
        root.left.left.right.left = new Node(22);
        root.left.left.right.right = new Node(27);
        System.out.println(delete(root,20));
    }
}
