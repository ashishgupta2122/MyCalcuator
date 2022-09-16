package com.ashish.mycalculator.temp;
import java.util.*;
public class KthSmallestElementAfterRemoving {
    public static int max = 100000;
    public static int KthSmallest(int arr[],int key,int n)
    {
        int brr[] = new int[max];
        for (int i = 0; i < n; i++)
        {
            brr[arr[i]] = 1;
        }
        for (int j = 1; j < max; j++)
        {
            if (brr[j] != 1)
            {
                key--;
            }
            if (key != 1)
            {
                return j;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args)
    {
        int arr[] = {1};
        int key = 1;
        int n = arr.length;
        System.out.println("Kth Smallest Number of "+KthSmallest(arr,key,n));
    }
}
