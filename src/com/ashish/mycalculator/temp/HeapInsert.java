package com.ashish.mycalculator.temp;

import java.util.HashMap;

public class HeapInsert {
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
    public static void Insert(int[] arr, int n, int value)
    {
        n = n + 1;
        arr[n] = value;
        int i = n;

        while (i > 1)
        {
            int parent = i/2;
            if (arr[parent] < arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                i = parent;
            }
        }
        return;
    }
    public static void main(String[] args)
    {
    }
}
