package com.ashish.mycalculator.temp;
import java.util.*;
public class DescendingNumberofArray {
    public static void Descending(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void Print(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        Descending(arr);
        Print(arr);
    }
}
