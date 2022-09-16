package com.ashish.mycalculator.temp;
import java.util.*;
public class BubbleSort {
    public static void Sort(int arr[],int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j+1] < arr[j])
                {
                    swap(arr,j+1,j);
                }
            }
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
    {
        int arr[] = {4,3,7,1,5};
        int n = arr.length;
        Sort(arr,n);
    }
}
