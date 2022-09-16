package com.ashish.mycalculator;
import java.util.*;
public class DeleteNodeBST {
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
    public static Node Delete(Node root,int key)
    {
        if (root == null)
        {
            return root;
        }
        else if(key < root.data)
        {
            root.left = Delete(root.left,key);
        }
        else if(key > root.data)
        {
            root.right = Delete(root.right,key);
        }
        else if (root.left == null)
        {
            return root.right;
        }
        else if (root.right == null)
        {
            return root.left;
        }
        root.data = minValue(root.left);
        root.right = Delete(root.right, root.data);
        return root;
    }
    public static int minValue(Node root)
    {
        int min = root.data;
        while (root.left != null)
        {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    public static void Print(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data+" ");
            root = root.right;
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(30);
        root.left = new Node(28);
        root.right = new Node(40);
        root.left.left = new Node(20);
        root.left.left.right = new Node(25);
        root.left.left.right.left = new Node(22);
        root.left.left.right.right = new Node(27);

        Delete(root,20);
        Print(root);
    }
}
