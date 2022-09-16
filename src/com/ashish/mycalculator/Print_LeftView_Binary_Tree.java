package com.ashish.mycalculator;
import java.util.*;
public class Print_LeftView_Binary_Tree {
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
    public static void printleftviewutil(Node root,ArrayList list,int level)
    {
        if (root == null)
        {
            return;
        }
        if (list.get(level) == null)
        {
            list.add(root);
        }
        printleftviewutil(root.left,list,level+1);
        printleftviewutil(root.right,list,level+1);
    }
    public static void printLeftview(Node root)
    {
        ArrayList<Node>list = new ArrayList<>();
        printleftviewutil(root,list,0);
        for (Node curr : list)
        {
            System.out.print(curr.data+" ");
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
        printLeftview(root);
    }

}
