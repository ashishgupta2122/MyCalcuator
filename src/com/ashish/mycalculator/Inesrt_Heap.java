package com.ashish.mycalculator;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;
public class Inesrt_Heap {
    public static void insert(int arr[],int n,int value)
    {
        n = n + 1;
        arr[n] = value;
        int i = n;
        while (i > 1)
        {
            int parent = i / 2;
            if (arr[parent] < arr[i])
            {
               // Collections.swap(arr,parent,i);
                i = parent;
            }
            else
            {
                return;
            }
        }
    }
     public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {50,30,40,10,5,20,30,60};
        int n = arr.length;
        insert(arr,n,10);
        printArray(arr);

    }
}
