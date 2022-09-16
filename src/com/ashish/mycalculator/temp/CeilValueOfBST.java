package com.ashish.mycalculator.temp;
import java.util.*;
public class CeilValueOfBST {
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
    public static int Ceil(Node root,int key)
    {
        int ans = Integer.MIN_VALUE;
        while (root != null)
        {
            if (root.data == key)
            {
                return root.data;
            }
            if (root.data > key)
            {
                ans = root.data;
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        System.out.println("Ceil Value of BST "+Ceil(root,22));
    }
}
