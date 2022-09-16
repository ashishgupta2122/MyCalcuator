package com.ashish.mycalculator;
import java.util.*;
public class KthSmallestNumber {
    public static int kthSmallest(Integer arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int kthLargest(Integer arr[])
    {
        int min = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > min)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Integer arr[] = {7,10,4,3,20,15};
        int k = 3;
        System.out.println("Kth Smallest Number of Array "+kthSmallest(arr,k));
        System.out.println("Kth Largest Number of Array "+kthLargest(arr));
    }
}
