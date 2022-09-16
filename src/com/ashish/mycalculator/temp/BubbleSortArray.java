package com.ashish.mycalculator.temp;
import java.util.*;
public class BubbleSortArray {
    public static void Sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j+1] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        BubbleSortArray s1 = new BubbleSortArray();
        int arr[] = {5,1,4,2,8};
        s1.Sort(arr);
        s1.PrintArray(arr);
    }
}