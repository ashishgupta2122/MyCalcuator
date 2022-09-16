package com.ashish.mycalculator;
import java.util.*;
public class Common_AncestorBT {
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
    Node root;

    public  Node findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }

    // This function returns pointer to LCA of two given
    // values n1 and n2. This function assumes that n1 and
    // n2 are present in Binary Tree
    Node findLCA(Node root, int n1, int n2)
    {
        // Base case
        if (root == null)
            return null;

        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
        if (root.data == n1 || root.data == n2)
            return root;

        // Look for keys in left and right subtrees
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left == null)
            return right;

        // Otherwise check if left subtree or right subtree is LCA
        if (right == null)
        {
            return left;
        }
        return root;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        Common_AncestorBT tree = new Common_AncestorBT();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(8);
        tree.root.left.left.right = new Node(1);
        tree.root.left.left.right.left = new Node(7);
        tree.root.left.left.right.right = new Node(8);
        System.out.println("LCA(7, 6) = " +
                tree.findLCA(7, 6).data);
        System.out.println("LCA(6, 4) = " +
                tree.findLCA(6, 4).data);
        System.out.println("LCA(1, 3) = " +
                tree.findLCA(1, 3).data);
    }
}
