package com.ashish.mycalculator;
import java.util.*;
public class CountingAnd_SortingArrays {
    public static void Sort(int arr[])
    {
        Arrays.sort(arr);
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { -5, -10, 0, -3, 8, 5, -1, 10 };
        Sort(arr);
        print(arr);
    }
    //output -10 -5 -3 -1 0 5 8 10
}
