package com.ashish.mycalculator.temp;
import java.util.*;
public class PrintLeftViewOfBT {
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
    private static void printLeftView(Node root)
    {
        if (root == null)
            return;

        Queue<Node> s1 = new LinkedList<>();
        s1.add(root);

        while (!s1.isEmpty()) {
            int n = s1.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node curr = s1.poll();

                // Print the left most element at
                // the level
                if (i == 1)
                    System.out.print(curr.data + " ");

                // Add left node to queue
                if (curr.left != null)
                    s1.add(curr.left);

                // Add right node to queue
                if (curr.right != null)
                    s1.add(curr.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(15);
        root.right.right.left = new Node(14);
        System.out.println("Left View of Binary Tree ");
        printLeftView(root);
    }
}