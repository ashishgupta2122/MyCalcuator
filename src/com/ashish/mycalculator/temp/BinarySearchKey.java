package com.ashish.mycalculator.temp;
import java.util.*;
public class BinarySearchKey {
    public static int Search(int arr[],int key)
    {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end)
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
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {-4,-1,3,7,10,11};
        int n = arr.length;
        int key = 7;
        System.out.println("Key is Available at index "+Search(arr,key));
    }
}
