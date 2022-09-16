package com.ashish.mycalculator.temp;
import java.util.*;
public class PairOfBST {
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
    public static boolean utill(Node root,int sum,HashSet<Integer> set)
    {
        if (root == null)
        {
            return false;
        }
        if (utill(root.left, sum, set) == true)
        {
            return true;
        }
        if (set.contains(sum - root.data))
        {
            return true;
        }
        set.add(root.data);
        return utill(root.right,sum,set);
    }
    public static int isPairPresent(Node root,int target)
    {
        Set<Integer> set = new HashSet<>();
        boolean ans = utill(root,target, (HashSet<Integer>) set);
        return ans ? 1 : 0;

    }
    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(12);
        root.right.left = new Node(10);
        System.out.println(isPairPresent(root,22));
    }
}
