package com.ashish.mycalculator.temp;
import java.util.*;
public class BinartTreePostOrder {
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
    public static void PostOrder(Node root)
    {
        if (root == null)
        {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        PostOrder(root);
    }
}
