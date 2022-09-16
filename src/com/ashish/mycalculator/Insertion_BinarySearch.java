package com.ashish.mycalculator;
import java.util.*;
public class Insertion_BinarySearch {
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
    public static Node Inset(Node root,int key)
    {
        if (root == null || root.data == key)
        {
            return root;
        }
        else if(key < root.data)
        {
            root.left = Inset(root.left,key);
        }
        else
        {
            root.right = Inset(root.right,key);
        }
        return root;
    }
    public static void main(String[] args)
    {
        //Insertion_BinarySearch s1 = new Insertion_BinarySearch();
        int arr[] = {50,30,20,40,70,60,80};
        //Inset(root,)
    }
}
