package com.ashish.mycalculator;
import java.util.*;
public class Diameter_Of_BT {
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
    public static int Diameter(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        int dl = Diameter(root.left);
        int dr = Diameter(root.right);
        int curr = height(root.left) + height(root.right)+1;
        return Math.max(curr,Math.max(dl,dr));
    }
    public static int height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return (1+Math.max(height(root.left),height(root.right)));
    }
    //public static void Print
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(
                "The diameter of given binary tree is : "
                        + height(root));
    }
}
