package com.ashish.mycalculator.temp;
import java.util.*;
public class SortedAndRotatedArray {
    public static int Sorted(int arr[],int key)
    {
        int n = arr.length;
        int start = 0;
        int end  = n - 1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (key < arr[mid])
            {
                if (key >= arr[start] && key < arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if (key >= arr[mid] && key <= arr[end])
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
    public static void main(String[] args) {
        int arr[] = {50,60,90,100,20,30,40};
        int key = 60;
        System.out.println("Element is Available at Index "+Sorted(arr,key));
    }
}