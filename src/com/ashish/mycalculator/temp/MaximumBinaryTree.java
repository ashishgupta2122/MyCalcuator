package com.ashish.mycalculator.temp;
import java.util.*;
public class MaximumBinaryTree {
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
    public static int Maximum(Node root)
    {
        if (root == null)
        {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(Maximum(root.left),Maximum(root.right)));
    }
    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
        root.left.left.left = new Node(1);
        System.out.println("Maximum Number of Binary Tree "+Maximum(root));
    }
}
