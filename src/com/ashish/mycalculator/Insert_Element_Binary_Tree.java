package com.ashish.mycalculator;
import com.sun.source.tree.BinaryTree;

import java.util.*;
import java.util.Collections;
import java.util.Arrays;
public class Insert_Element_Binary_Tree {
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
    public static void Insert(int arr[],int n,int value)
    {
        n = n + 1;
        value = arr[n];
        int i = n;

        while (i > 1)
        {
            int parent = i/2;
            if (parent < arr[i])
            {
                Collections.swap(Collections.singletonList(arr),parent,i);
                i = parent;
            }
            else
            {
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {60,50,40};
    }
}
