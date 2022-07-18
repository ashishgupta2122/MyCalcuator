package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Pivot_Number {
    public static int getPivot(int arr[],int n)
    {
        int start = 0;
        int end = n - 1;
        while (start < end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[0])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
    public static void main(String[] args)
    {
        int arr[] = {8,10,17,1,3};
        System.out.println("The Pivot Number of Array "+getPivot(arr,5));
    }
}