package com.ashish.mycalculator.temp;
import java.util.*;
public class BinaryTreePrintOrder {
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
    public static void Inorder(Node root)
    {
        if (root == null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }
    public static void Preorder(Node root)
    {
        if (root == null)
        {
            return;
        }
        System.out.print(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(Node root)
    {
        if (root == null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data);
    }
    public static void main(String[] args)
    {
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(1);
        root.left.left = new Node(7);
        root.right.left = new Node(8);
        root.right.right = new Node(3);
        System.out.println("Inorder Traversal");
        Inorder(root);
        System.out.println("Preorder Traversal");
        Preorder(root);
        System.out.println("Postorder Traversal");
        Postorder(root);
    }
}
