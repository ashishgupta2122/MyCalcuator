package com.ashish.mycalculator.temp;
import java.util.*;
public class LowestCommonAncestor {
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
    public static Node Ancestor(Node root,int n1,int n2)
    {
        if (root == null)
        {
            return null;
        }
        if (root.data == n1 && root.data == n2)
        {
            return root;
        }
        Node left = Ancestor(root.left,n1,n2);
        Node right = Ancestor(root.right,n1,n2);
        if (left == null)
        {
            return right;
        }
        if (right == null)
        {
            return left;
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
