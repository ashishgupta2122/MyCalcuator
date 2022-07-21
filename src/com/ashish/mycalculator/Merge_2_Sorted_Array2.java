package com.ashish.mycalculator;
import java.util.Scanner;
public class Merge_2_Sorted_Array2 {
    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] merge2SortedArrays(int arr1[],int arr2[])
    {
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && i < n)
        {
            if (arr1[i] <= arr2[j])
            {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int arr3[] = merge2SortedArrays(arr1,arr2);
        printArray(arr3);
    }
}