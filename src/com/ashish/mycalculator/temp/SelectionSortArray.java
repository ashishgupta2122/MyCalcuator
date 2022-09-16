package com.ashish.mycalculator.temp;
import java.util.*;
public class SelectionSortArray {
    public static void Sort(int arr[])
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
    public static void PrintArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        SelectionSortArray s1 = new SelectionSortArray();
        int arr[] = {4,1,9,2,3,6};
        s1.Sort(arr);
        s1.PrintArray(arr);
    }
}
