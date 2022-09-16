package com.ashish.mycalculator.temp;
import java.util.*;
public class LevelOrderTraversalBTUsingQueue {
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
    public static void PrintLevelOrder(Node root)
    {
        Queue<Node> s1 = new LinkedList<>();
        s1.add(root);
        while (!s1.isEmpty())
        {
            Node curr = s1.poll();
            System.out.println(curr.data+" ");
            if (curr.left != null)
            {
                s1.add(curr.left);
            }
            if (curr.right != null)
            {
                s1.add(curr.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(6);
        System.out.println("Level Order Traversal ");
        PrintLevelOrder(root);
    }
}
