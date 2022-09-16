package com.ashish.mycalculator.temp;
import java.util.*;
public class DiametereOfLL {
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
    public static int Height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return Math.max(Height(root.left),Height(root.right)) + 1;
    }
    public static int Diameter(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        int dl = Diameter(root.left);
        int dr = Diameter(root.right);
        int curr = Height(root.left) + Height(root.right)+1;
        return Math.max(curr,Math.max(dl,dr));
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(5);
        System.out.println(Diameter(root));
    }
}
