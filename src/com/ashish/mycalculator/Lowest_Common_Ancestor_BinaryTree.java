package com.ashish.mycalculator;
import java.util.LinkedList;
public class Lowest_Common_Ancestor_BinaryTree {
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
    public static Node lca(Node root,int n1,int n2)
    {
        if(root == null)
        {
            return null;
        }
        if (root.data == n1 || root.data == n2)
        {
            return root;
        }
        Node left = lca(root.left,n1,n2);
        Node right = lca(root.right,n1,n2);
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //System.out.println("LCA(4, 5) = " +lca("LCA(4, 5): " + lca(4,5)));
    }
}
