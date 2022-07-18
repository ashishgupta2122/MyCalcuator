package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Binary_Search {
    public static int binary_Search(int[] arr,int n,int key)
    {
        int start = 0;
        int end = n - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {2,4,6,8,12,18};
        int index = binary_Search(arr,5,12);
        System.out.println("Index of 12 is " +index);
    }
}
