package com.ashish.mycalculator;
import java.util.*;
public class Print_Left_ViewOfBT {
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
    public static void PrintLeftView(Node root,ArrayList list,int level)
    {
        if (root == null)
        {
            return;
        }
        if (list.get(level) == null)
        {
            list.add(root);
        }
        PrintLeftView(root.left,list,level+1);
        PrintLeftView(root.right,list,level+1);
    }
    public static void PrintLeft(Node root)
    {
        ArrayList<Node> list = new ArrayList<>();
        PrintLeftView(root,list,0);
        for (Node Curr : list)
        {
            System.out.print(Curr.data+" ");
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
        PrintLeft(root);

    }
}
