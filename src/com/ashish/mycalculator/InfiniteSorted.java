package com.ashish.mycalculator;
import java.util.*;
public class InfiniteSorted {
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
    public static int Infinte(int arr[],int key)
    {
        int start = 0;
        int high = 1;

        if (arr[high] < key)
        {
            start = high;
            high = 2 * high;
        }
        return Infinte(arr,key);
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,7,9,10,90,100};
        int ans = Infinte(arr,10);
        if(ans != -1)
        {
            System.out.println("Key is Present in Array at i");
        }
    }
}
