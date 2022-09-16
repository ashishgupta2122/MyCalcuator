package com.ashish.mycalculator.temp;
import java.util.*;
public class FloorValueofBST {
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
    public static int floor(Node root,int key)
    {
        int ans = Integer.MAX_VALUE;
        while (root != null)
        {
            if (root.data == key)
            {
                return root.data;
            }
            if (root.data > key)
            {
                root = root.left;
            }
            else
            {
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(21);
        root.right.left = new Node(15);
        root.right.right = new Node(26);
        root.right.left.left = new Node(13);
        System.out.println("Floor Value of BST "+floor(root,25));
    }
}