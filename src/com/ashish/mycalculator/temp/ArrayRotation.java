package com.ashish.mycalculator.temp;
import java.util.*;
public class ArrayRotation {
    public static void Rotate(int arr[],int k)
    {
        int n = arr.length;
        int j = 0;
        int temp[] = new int[n];
        for (int i = k; i < n; i++)
        {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++)
        {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++)
        {
            arr[i] = temp[i];
        }
    }
    public static void PrintArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 2;
        Rotate(arr,k);
        PrintArray(arr);
    }
}
