package com.ashish.mycalculator;
import java.util.*;
public class Search_and_Rotated_Sorted_Array {
    public static int BinarySearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[start] < arr[mid])
            {
                if (key >= arr[start] && key < arr[mid])
                {
                    start = mid - 1;
                }
                else
                {
                    end = mid + 1;
                }
            }
            else
            {
                if (key > arr[mid] && key <= arr[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        int index = BinarySearch(arr,3);
        if (index != -1)
        {
            System.out.println("Element Are Present in Array at Index "+index);
        }
        else
        {
            System.out.println("Element Are Not Found");
        }
    }
}