package com.ashish.mycalculator;
import java.util.*;
public class Diameter_Of_Binary_Tree {
    public static class Node
    {
        int data;
        Node left,right;

        public Node (int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public static int diameter(Node root)
    {
        int ans = 0;
        if (root == null)
        {
            return 0;
        }
        int leftdiametr = diameter(root.left);
        int rightdiameter = diameter(root.right);
        ans = Math.max(ans, 1+leftdiametr+rightdiameter);
        return 1+Math.max(leftdiametr,rightdiameter);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println(diameter(root)+" ");
    }
}
