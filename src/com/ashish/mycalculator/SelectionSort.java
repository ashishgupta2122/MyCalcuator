package com.ashish.mycalculator;
import java.util.*;
public class SelectionSort {
    public static void Selection(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        SelectionSort s1 = new SelectionSort();
        int arr[] = {4,1,9,2,3,6};
        s1.Selection(arr);
        s1.printArray(arr);
    }
}
