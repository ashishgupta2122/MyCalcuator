package com.ashish.mycalculator;
import java.util.*;
public class Find_TheFloor_BST {
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
            else if (root.data > key)
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
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        System.out.println(floor(root,22));
    }
}
