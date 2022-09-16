package com.ashish.mycalculator;
import java.util.*;
public class SearchAnElement_SortedAnd_Rotated {
    public static int Search(int arr[],int start ,int end, int key)
    {
        start = 0;
        end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[start] <= mid)
            {
                if (key >= arr[start] && key <= arr[mid])
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
    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        int n = arr.length - 1;
        int key = 3;
        int index = Search(arr,0,n,key);
        if (index != -1)
        {
            System.out.println("Array Element Found at Index "+index);
        }
        else
        {
            System.out.println("Array Element Not Found");
        }
    }
}

