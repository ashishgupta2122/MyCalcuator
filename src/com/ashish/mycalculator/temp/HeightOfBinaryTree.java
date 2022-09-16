package com.ashish.mycalculator.temp;
import java.util.*;
public class HeightOfBinaryTree {
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
    public static int Height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return Math.max(Height(root.left),Height(root.right))+1;
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("The Height of Binary tree "+Height(root));
    }
}