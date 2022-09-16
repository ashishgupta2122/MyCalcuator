package com.ashish.mycalculator.temp;
import java.util.*;
public class LeftViewOfBT {
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
    public static void PrintLeftViewUtill(Node root,ArrayList list,int level)
    {
        if (root == null)
        {
            return;
        }
        if (list.get(level) == null)
        {
            list.add(root);
        }
        PrintLeftViewUtill(root.left,list,level+1);
        PrintLeftViewUtill(root.right,list,level+1);
    }
    public static void PrintLeftView(Node root)
    {
        ArrayList<Node> list = new ArrayList<>();
        PrintLeftViewUtill(root,list,0);
        for (Node curr : list)
        {
            System.out.println(curr.data+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(6);
        root.right.right = new Node(2);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);
        root.right.right.right.left = new Node(3);
        PrintLeftView(root);

    }
}
