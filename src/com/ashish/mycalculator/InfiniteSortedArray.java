package com.ashish.mycalculator;
import java.util.*;
public class InfiniteSortedArray {
    public static int Search(int arr[],int key)
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
            else if(key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int Infinie(int arr[],int key)
    {
        int start = 0;
        int high = 1;

        while (arr[high] < key)
        {
            start = high;
            high = 2 * high;
        }
        return Search(arr,key);
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
        int ans = Infinie(arr,10);
        if (ans != -1)
        {
            System.out.println("Array Element are Found at Index "+ans);
        }
        else
        {
            System.out.println("Array Element are Not Found");
        }
    }
}
