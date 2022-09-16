package com.ashish.mycalculator;
import java.util.*;
public class BubbleSort {
    public static void Sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j + 1] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,3,5,7};
        Sort(arr);
        PrintArray(arr);
    }
}