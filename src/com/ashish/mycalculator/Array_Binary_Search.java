package com.ashish.mycalculator;
import java.util.*;
public class Array_Binary_Search {
    public static int BinarySearch(int arr[],int n,int key)
    {
        int start = 0;
        int end = n - 1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (key < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {12,34,56,42,57};
        int n = arr.length;
        int key = 56;
        int index = BinarySearch(arr,n,key);
        if(index != -1)
        {
            System.out.println("Key is Present in Array at index "+index);
        }
    }
}