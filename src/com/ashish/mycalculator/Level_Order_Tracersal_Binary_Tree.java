package com.ashish.mycalculator;
import java.util.*;
public class Level_Order_Tracersal_Binary_Tree {
    public static class Node
    {
        int data;
        Node left,right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public static void traversal(Node root)
    {
        Queue<Node> l1 = new LinkedList<>();
        l1.add(root);

        while (!l1.isEmpty())
        {
            Node curr = l1.poll();
            System.out.println(curr.data);

            if (curr.left != null)
            {
                l1.add(curr.left);
            }
            if (curr.right != null)
            {
                l1.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(6);

        traversal(root);
    }
}
