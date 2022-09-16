package com.ashish.mycalculator.temp;
import java.util.*;
public class BinaryTreeInorder {
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
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args)
    {
        Node root = new Node(2);
        root.left = new Node(4);
        root.left.left = new Node(7);
        root.right = new Node(1);
        root.right.left = new Node(8);
        root.right.right = new Node(3);
        Inorder(root);
    }
}