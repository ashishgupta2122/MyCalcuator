package com.ashish.mycalculator.temp;
import java.util.*;
public class PrintLevelOrderTraversal {
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
    public static void PrintLevelOrder(Node root,int level)
    {
        if (root == null)
        {
            return;
        }
        if (level == 1)
        {
            System.out.println(root.data+" ");
        }
        else if (level > 1)
        {
            PrintLevelOrder(root.left,level-1);
            PrintLevelOrder(root.right,level-1);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(1);
        root.left = new Node(6);
        root.left.right = new Node(9);
        root.right = new Node(7);
        System.out.println("Print Level Order Traversal");
        PrintLevelOrder(root,3);
    }
}
