package com.ashish.mycalculator.temp;
import java.util.*;
public class LevelOrderTraversalBinaryTree {
    public static class Node
    {
        int data,level;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public static void LevelOrder(Node root,int level)
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
            LevelOrder(root.left,level-1);
            LevelOrder(root.right,level-1);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        int level = 0;
        System.out.println("Level Order Traversal ");
        LevelOrder(root,level);
    }
}
