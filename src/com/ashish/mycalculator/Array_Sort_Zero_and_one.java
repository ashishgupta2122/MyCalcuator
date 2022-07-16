package com.ashish.mycalculator;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Array_Sort_Zero_and_one {
    public static void main(String[] args)
    {
        int arr[] = {0,1,0,0,1,1,0,1,1};
        Arrays.sort(arr);
        System.out.println("The Sorted Array is");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}