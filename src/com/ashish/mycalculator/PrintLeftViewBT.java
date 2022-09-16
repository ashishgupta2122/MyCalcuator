package com.ashish.mycalculator;
import java.util.*;
public class PrintLeftViewBT {
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
    public static void PrintLeftViewUtil(Node root,ArrayList list,int level)
    {
        if (root == null)
        {
            return;
        }
        if (list.get(level) == null)
        {
            list.add(root);
        }
        PrintLeftViewUtil(root.left,list,level+1);
        PrintLeftViewUtil(root.right,list,level+1);
    }
    public static void PrintLeftView(Node root)
    {
        ArrayList<Node> list = new ArrayList<>();
        PrintLeftViewUtil(root,list,0);
        for (Node curr : list)
        {
            System.out.println(curr.data+" ");
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Left View of Binary Tree ");
        PrintLeftView(root);
    }
}
