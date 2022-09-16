package com.ashish.mycalculator;
import java.util.*;
public class Insert_HeapValue {
    public static void Insert(int arr[],int n,int value)
    {
        n = n + 1;
        arr[n] = value;
        int i = n;

        while (i > 1)
        {
            int parent = i/2;
            if (arr[parent] < arr[i])
            {
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
            }
            else
            {
                return;
            }
        }
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[] = {50,30,40,10,5,20,30};
        int value = 60;
        int n = arr.length;
        Insert(arr,n,value);
        printArray(arr);
    }
}