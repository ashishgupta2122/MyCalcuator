package com.ashish.mycalculator.temp;
import java.util.*;
public class MinimumNumberofArray {
    public static int Minimum(int arr[])
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int arr[] = {12,34,56,78};
        System.out.println("Minimum Number of Array "+Minimum(arr));
    }
}
