package com.ashish.mycalculator.temp;
import java.util.*;
public class NextSmallerNumber {
    public static void Smaller(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            int next = -1;
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    next = arr[j];
                }
            }
            System.out.println(arr[i]+" "+next);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {11, 13, 21, 3};
        int n = arr.length;
        Smaller(arr,n);
    }
}