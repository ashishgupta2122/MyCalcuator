package com.ashish.mycalculator.temp;
import java.util.*;
public class InsertionSortArray {
    public static void Sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void PrintArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        InsertionSortArray s1 = new InsertionSortArray();
        int arr[] = {8,4,1,5,9,2};
        s1.Sort(arr);
        s1.PrintArray(arr);
    }
}
