package com.ashish.mycalculator.temp;
import java.util.*;
public class BinarySearch {
    public static int Binary(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (key == arr[mid])
            {
                return mid;
            }
            else if (key > arr[mid])
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
    public static void main(String[] args)
    {
        int arr[] = {4,-1,3,7,10,11};
        int key = 7;
        System.out.println("Key of Element at Index "+Binary(arr,key));
    }
}
