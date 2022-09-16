package com.ashish.mycalculator;
import java.util.*;
public class Ceiling_in_aSortedArrays {
    public static int ceilSearch(int arr[],int n,int key)
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
                end = mid -1;
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
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int key = 8;
        int n = arr.length;
        int index = ceilSearch(arr,n,key);
        if (index == -1)
        {
            System.out.println("Ceiling Does Not Exist in Array");
        }
        else
        {
            System.out.println("Ceiling Exist in Array at index "+arr[index]);
        }

    }
}
