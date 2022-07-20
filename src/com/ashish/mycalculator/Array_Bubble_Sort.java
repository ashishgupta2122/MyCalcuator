package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Bubble_Sort {
    public static void main(String[] args)
    {
        int arr[] = {10,1,7,6,14,9};
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
