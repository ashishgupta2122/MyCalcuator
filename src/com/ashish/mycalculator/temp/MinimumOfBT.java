package com.ashish.mycalculator.temp;
import java.util.*;
public class MinimumOfBT {
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
    public static int Minimum(Node root)
    {
        if (root == null)
        {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(Minimum(root.left),Minimum(root.left)));
    }
    public static void main(String[] args)
    {
       Node root = new Node(5);
       root.left = new Node(1);
       root.left.left = new Node(6);
       root.left.right = new Node(9);
       root.right = new Node(7);
        System.out.println("Minimum Number of Binary Tree "+Minimum(root));
    }
}
