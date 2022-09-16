package com.ashish.mycalculator.temp;
import java.util.*;
public class CommonAncestorOfBT {
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
    public static Node Lca(Node root,int n1,int n2)
    {
        if (root == null)
        {
            return null;
        }
        if (root.data == n1 && root.data == n2)
        {
            return root;
        }
        Node left = Lca(root.left,n1,n2);
        Node right = Lca(root.right,n1,n2);
        if (left == null)
        {
            return right;
        }
        if (right == null)
        {
            return left;
        }
        return root;
    }
    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(8);
        root.left.left.right = new Node(1);
        root.left.left.right.left = new Node(7);
        root.left.left.right.right = new Node(6);
        System.out.println("Largest Common Ancestor of Binary Tree "+Lca(root,6,4));
    }
}