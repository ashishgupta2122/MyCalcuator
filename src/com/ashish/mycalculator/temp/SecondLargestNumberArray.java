package com.ashish.mycalculator.temp;
import java.util.*;
public class SecondLargestNumberArray {
    public static void Largest(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Second Biggest Number of Array "+arr[2]);
    }

    public static void main(String[] args)
    {
        int arr[] = {12,13,16,15};
        Largest(arr);
    }
}
