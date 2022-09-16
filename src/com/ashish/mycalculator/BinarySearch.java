package com.ashish.mycalculator;
import java.util.*;
public class BinarySearch {
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
    public static void main(String[] args) {
        int arr[] = {-4,-1,3,7,10,11};
        int key = 7;

        int index = Search(arr,key);
        if (index != -1)
        {
            System.out.println("Element Found in Array at index "+index);
        }
        else
        {
            System.out.println("Element is not Found in Array");
        }

    }
}
