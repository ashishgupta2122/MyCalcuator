package com.ashish.mycalculator.temp;
import java.util.*;
public class SlidingWindow {
    public static void Sliding(int arr[],int n,int k)
    {
        for (int i = 0; i <= n - k; i++)
        {
            int max = arr[i];
            for (int j = 1; j < k; j++)
            {
                if (arr[i+j] > max)
                {
                    max = arr[i+j];
                }
            }
            System.out.println(max+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4,1,3,5,1,2,3,2,1,1,5};
        int n = arr.length;
        int k = 3;
        Sliding(arr,n,k);
    }
}