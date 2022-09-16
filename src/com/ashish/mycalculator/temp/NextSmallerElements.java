package com.ashish.mycalculator.temp;
import java.util.*;
public class NextSmallerElements {
    public static void PrintNSE(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            int next = -1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" "+ next);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {3,10,5,1,15,10,7,6};
        int n = arr.length;
        PrintNSE(arr,n);
    }
}