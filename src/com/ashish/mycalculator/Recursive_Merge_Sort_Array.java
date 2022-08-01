package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursive_Merge_Sort_Array {
    public static void Sort(int arr[])
    {
        if (arr.length <= 1)
        {
            return;
        }
        int mid = arr.length/2;
        int arr1[] = new int[mid];
        int arr2[] = new int[arr.length - 1];
        for (int i = 0; i < mid; i++)
        {
            arr1[i] = arr[i];
        }
        int k = 0;
        for (int i = mid; i < arr.length; i++)
        {
            arr2[k] = arr[i];
            k++;
        }
        Sort(arr1);
        Sort(arr2);
        merge(arr1,arr2,arr);
    }
    public static void  merge(int arr1[],int arr2[],int output[])
    {
        int i = 0,j = 0,k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                output[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                output[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length)
        {
            output[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length)
        {
            output[k] = arr2[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,5,7,4,2,4};
    }
}
