package com.ashish.mycalculator.temp;
import java.util.*;
public class FindSurpasserCountOfElement {
    public static void Count(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] > arr[i])
                {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
    public static void printArray(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {2,7,5,3,0,8,1};
        int n = arr.length;
        System.out.println("Given Array");
        printArray(arr,n);
        System.out.println("Surpasser Count of" + " array is ");
        Count(arr,n);
    }
}
