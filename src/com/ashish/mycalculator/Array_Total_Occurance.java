package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Total_Occurance {
    public static int First_Occurance(int arr[],int n,int key)
    {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                ans = mid;
                end = mid - 1;
            }
            else if (key > arr[mid])
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
    public static int Last_Occurance(int arr[],int n,int key)
    {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end)
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
        int index1 = First_Occurance(arr,5,3);
        int  index2 = Last_Occurance(arr,5,3);
        System.out.println("First Occuranve is "+index1);
        System.out.println("Last Occurance is "+index2);
        int index3 = (index2 - index1)+1;
        System.out.println("Total Occurance is "+index3);
    }
}
