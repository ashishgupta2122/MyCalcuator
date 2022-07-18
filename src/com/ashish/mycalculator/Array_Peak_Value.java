package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Peak_Value {
    public static int Peak_Value(int arr[],int n)
    {
        int start = 0;
        int end = n - 1;
        while (start < end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid+1])
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
        int arr[] = {0,1,3};
        int index = Peak_Value(arr,3);
        System.out.println("Peak Value of Array Element "+index);
    }
}
