package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Selection_Sort {
    public static void main(String[] args)
    {
        int arr[] = {7,1,4,3,9};
        for (int i = 0; i < arr.length; i++)
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
        System.out.println("Swap Array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
