package com.ashish.mycalculator.temp;
import java.util.*;
public class MaximumNumberOfArray {
    public static int Maximum(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[] = {12,34,56,75};
        System.out.println("Maximum Number of Array "+Maximum(arr));
    }
}
