package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Last_Occurance {
    public static int Last_Occurance(int arr[],int n,int key)
    {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                ans = mid;
                start = mid + 1;
            }
            else if(key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,3,5};
        int index = Last_Occurance(arr,5,3);
        System.out.println("Index of Last Occurance "+index);
    }
}
