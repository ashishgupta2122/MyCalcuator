package com.ashish.mycalculator;
import java.util.*;
public class MaxSubArray_Product {
    public static int MaxSub(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                 max = Math.max(max,arr[i]);
                 arr[i] *= arr[j];
            }
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("The Maximum Number of Array "+MaxSub(arr));
    }
}
