package com.ashish.mycalculator.temp;
import java.util.*;
public class SlidingWindowOfMinimum {
    public static void Minimum(int arr[],int n,int k)
    {
        for (int i = 0; i <= n-k; i++)
        {
            int min = arr[i];
            for (int j = 1; j < k; j++)
            {
                if (arr[i+j] < min)
                {
                    min = arr[i+j];
                }
            }
            System.out.println(min+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4,1,3,5,1,2,3,2,1,1,5};
        int n = arr.length;
        int k = 3;
        Minimum(arr,n,k);
    }
}
