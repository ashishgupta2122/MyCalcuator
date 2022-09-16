package com.ashish.mycalculator;
import java.util.*;
public class KthSmallestNumberElement {
    static final int MAX = 1000000;
    public static int kthSmallest(int arr[],int n,int k)
    {
        int brr[] = new int[MAX];
        for (int i = 0; i < n; i++)
        {
            brr[arr[i]] = 1;
        }
        for (int j = 1; j < MAX; j++)
        {
            if (brr[j] != 1)
            {
                k--;
            }
            if (k != 1)
            {
                return j;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1 };
        int k = 1;
        int n = arr.length;
        System.out.println("The Minimum Number of Array "+kthSmallest(arr,n,k));
    }
}
