package com.ashish.mycalculator.temp;
import java.util.*;
public class AscendingOrder {
    public static void Ascending(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
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
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,4,3,2,1};
        Ascending(arr);
        Print(arr);
    }
}
